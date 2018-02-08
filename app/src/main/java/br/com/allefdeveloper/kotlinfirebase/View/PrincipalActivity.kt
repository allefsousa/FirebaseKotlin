package br.com.allefdeveloper.kotlinfirebase.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.allefdeveloper.kotlinfirebase.Model.Projetos
import br.com.allefdeveloper.kotlinfirebase.R
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.Logger

class PrincipalActivity : AppCompatActivity() {
    // instancia de autenticacao do firebase
     var firebaseAuth :FirebaseAuth? = null
    var databaseReference: DatabaseReference? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        initFirebase()
        loginAnonimo()



       val projeto = Projetos("Projeto comercial","","","Java, Mobile, Android")
        salvarProjeto(projeto)

    }

    private fun salvarProjeto(projetos: Any) {
        databaseReference?.child("projetos")?.setValue(projetos)
    }

    /**
     * metodo responsavel pelo login anonymo do firebase
     */
    private fun loginAnonimo() {
        firebaseAuth?.signInAnonymously()

    }

    /**
     * Metodo responsavel por inicializar o firebase na aplicação
     */
    private fun initFirebase(){
        FirebaseApp.initializeApp(applicationContext)
        firebaseAuth = FirebaseAuth.getInstance()
        FirebaseDatabase.getInstance().setLogLevel(Logger.Level.DEBUG)
        //get reference to our db
        databaseReference = FirebaseDatabase.getInstance().reference
    }
}
