package br.com.allefdeveloper.kotlinfirebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth

class PrincipalActivity : AppCompatActivity() {
    // instancia de autenticacao do firebase
     var firebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        loginAnonimo();
    }

    private fun loginAnonimo() {
        firebaseAuth.signInAnonymously()

    }
}
