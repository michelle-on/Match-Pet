package com.example.matchpet.screen.register

import android.util.Patterns
import android.view.LayoutInflater
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.matchpet.R
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentRegisterBinding
import com.example.matchpet.util.ImageUtils
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : BaseFragment<FragmentRegisterBinding, RegisterViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentRegisterBinding {
        return FragmentRegisterBinding.inflate(inflater!!)
    }

    override val viewModel: RegisterViewModel by viewModels()

    private var auth = Firebase.auth

    override fun onInitViews() {
        activity?.supportFragmentManager?.popBackStack()

        ImageUtils.setImageGlide(binding.icDog, R.drawable.ic_dog)

        binding.tvLogin.setOnClickListener {
            findNavController().navigate(RegisterFragmentDirections.actionRegisterFragmentToLoginFragment())
        }

        binding.btRegister.setOnClickListener {
            val userEmail = binding.etEmail.text.toString()
            val userPassword = binding.etPassword.text.toString()
            val userConfirmPassword = binding.etConfirmPassword.text.toString()
            val userLastName = binding.etLastName.text.toString()
            val userName = binding.etName.text.toString()

            onValidator(userEmail, userPassword, userConfirmPassword, userName, userLastName)
        }
    }

    private fun onValidator(
        email: String,
        password: String,
        confirmPassword: String,
        name: String,
        lastName: String
    ) {
        if (email.isEmpty() ||
            password.isEmpty() ||
            confirmPassword.isEmpty() ||
            name.isEmpty() ||
            lastName.isEmpty()
        ) {
            Snackbar.make(binding.icDog, "Preencha todos os campos", Snackbar.LENGTH_SHORT).show()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Snackbar.make(
                binding.icDog,
                "Email invalido, utilize um email valido!",
                Snackbar.LENGTH_SHORT
            ).show()
            return
        }

        if (password.length < 8 || password.length < 8) {
            Snackbar.make(
                binding.icDog,
                "Senha invalida. A senha deve conter no minimo 8 caracteres",
                Snackbar.LENGTH_SHORT
            ).show()
            return
        }

        if (password != confirmPassword) {
            Snackbar.make(
                binding.icDog,
                "Senha invalida, as duas senhas devem ser iguais",
                Snackbar.LENGTH_SHORT
            ).show()
            return
        }

        viewModel.registerUser(email, password)
    }

    override fun onInitObservers() {
        viewModel.isSuccessful.observe(this) {
            if (it.equals(true)) {
                Toast.makeText(context, "Usuario criado com sucesso!", Toast.LENGTH_SHORT).show()
                findNavController().navigate(RegisterFragmentDirections.actionRegisterFragmentToLoginFragment())
            } else {
                Toast.makeText(
                    context,
                    "Falha ao criar usuario, tente novamente mais tarde",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}