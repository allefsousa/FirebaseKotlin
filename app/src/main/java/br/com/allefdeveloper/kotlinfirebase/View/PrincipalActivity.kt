package br.com.allefdeveloper.kotlinfirebase.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.allefdeveloper.kotlinfirebase.R
import com.google.firebase.auth.FirebaseAuth

class PrincipalActivity : AppCompatActivity() {
    // instancia de autenticacao do firebase
     var firebaseAuth = FirebaseAuth.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        loginAnonimo()
    }

    /**
     * metodo responsavel pelo login anonymo do firebase
     */
    private fun loginAnonimo() {
        firebaseAuth.signInAnonymously()
    }
}
