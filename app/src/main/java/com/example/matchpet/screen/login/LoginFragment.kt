package com.example.matchpet.screen.login

import android.content.ContentValues.TAG
import android.content.Intent
import android.content.IntentSender
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.matchpet.R
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentLoginBinding
import com.example.matchpet.util.ImageUtils
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.identity.Identity
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Exception


class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(inflater!!)
    }

    override val viewModel: LoginViewModel by viewModels()

    private val auth = Firebase.auth
    private val REQ_ONE_TAP = 2
    private val serverClientId =
        "1071441662240-rv0nkqums4uep3hrh4cls8r8f3rjtnac.apps.googleusercontent.com"

    private lateinit var oneTapClient: SignInClient
    private lateinit var signInRequest: BeginSignInRequest

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            REQ_ONE_TAP -> {
                try {
                    val credential = oneTapClient.getSignInCredentialFromIntent(data)
                    val idToken = credential.googleIdToken
                    val username = credential.id
                    val password = credential.password

                    when {
                        idToken != null -> {
                            onSignInGoogle(idToken)
                        }
                        else -> {
                            // Shouldn't happen.
                            Log.d(TAG, "No ID token or password!")
                        }
                    }
                } catch (e: Exception) {
                    Log.e(TAG, e.toString())
                }
            }
        }
    }

    override fun onInitViews() {
        ImageUtils.setImageGlide(binding.icWelcome, R.drawable.img_welcome)

        oneTapClient = Identity.getSignInClient(requireActivity())
        signInRequest = BeginSignInRequest.builder()
            .setPasswordRequestOptions(
                BeginSignInRequest.PasswordRequestOptions.builder()
                    .setSupported(true)
                    .build()
            )
            .setGoogleIdTokenRequestOptions(
                BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                    .setSupported(true)
                    .setServerClientId(serverClientId)
                    .setFilterByAuthorizedAccounts(true)
                    .build()
            )
            .setAutoSelectEnabled(true)
            .build()

        binding.tvRegister.setOnClickListener {
            findNavController().navigate(
                LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            )
        }

        binding.btGoogle.setOnClickListener {
            displaySignIn()
//            viewModel.loginUser()
        }
    }

    private fun displaySignIn() {
        oneTapClient.beginSignIn(signInRequest)
            .addOnSuccessListener(requireActivity()) {
                try {
                    startIntentSenderForResult(
                        it.pendingIntent.intentSender,
                        REQ_ONE_TAP,
                        null,
                        0,
                        0,
                        0,
                        null
                    )
                } catch (e: IntentSender.SendIntentException) {
                    Log.e(TAG, "Couldn't start One Tap UI: ${e.localizedMessage}")
                }
            }
            .addOnFailureListener {
                Log.d(TAG, it.localizedMessage)
            }
    }

    private fun onSignInGoogle(token: String) {
        val credential = GoogleAuthProvider.getCredential(token, null)
        auth.signInWithCredential(credential).addOnCompleteListener(this.requireActivity()) {
            if (it.isSuccessful) {
                lifecycleScope.launch {
                    delay(1500)
                    findNavController().navigate(
                        LoginFragmentDirections.actionLoginFragmentToHome()
                    )
                    //login is successful
                }

            } else {
                Toast.makeText(context, "Failed login", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onInitObservers() {}
}