package fr.elph.oplayner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.util.Log
import fr.elph.oplayner.service.oplaynerRepo
import fr.elph.oplayner.service.post
import kotlinx.android.synthetic.main.create_party.*
import kotlinx.android.synthetic.main.join_party.*
import retrofit2.Call
import retrofit2.Response

import retrofit2.Callback


class JoinParty : AppCompatActivity(){
    private lateinit var goParty:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join_party)

        goParty = findViewById(R.id.go_party)
        goParty.setOnClickListener { view ->
            val title = party_id.text.toString()
            val password = join_psw.text.toString()
            val pseudo = join_pseudo.text.toString()

            Log.i("","title= $title, psw= $password, pseudo= $pseudo",Throwable())
            //avatar
            //val avatar =
            val intent = Intent(this, menu::class.java)

            startActivity(intent)

        }
    }


    
}