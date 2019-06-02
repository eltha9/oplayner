package fr.elph.oplayner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import java.io.File

class MainActivity : AppCompatActivity(), View.OnClickListener {

/*
    var fileExists = false

    val fileName = "data.json"

    var file = File(fileName)

    fileExists = file.exists()

    if( fileExists ){
        val intent = Intent(this,CreateParty::class.java)
        startActivity(intent)
        finish()

    } else {

    }
*/

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    private lateinit var buttonJoin:Button
    private lateinit var buttonCreate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


/*   skip part if we have a first connection
        val isConnected = false
        if (isConnected) {
            val intent = Intentqhdgqjhsgdhjqsgdhjqgsd
            startActivity(intent)
            finish()
            return
        }
*/


        setContentView(R.layout.activity_main)

        buttonJoin = findViewById(R.id.join_button)
        buttonCreate = findViewById(R.id.create_button)

        buttonJoin.setOnClickListener { view ->

            val intent = Intent(this, JoinParty::class.java)
            //intent.putExtra("plop ", "value")
            startActivity(intent)
        }
        buttonCreate.setOnClickListener { view ->

            val intent = Intent(this, CreateParty::class.java)
            startActivity(intent)
        }

    }



}
