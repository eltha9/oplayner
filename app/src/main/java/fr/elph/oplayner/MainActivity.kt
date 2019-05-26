package fr.elph.oplayner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    private lateinit var buttonJoin:Button
    private lateinit var buttonCreate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonJoin = findViewById(R.id.join_button)
        buttonCreate = findViewById(R.id.create_button)

        buttonJoin.setOnClickListener { view ->

            val intent = Intent(this, JoinParty::class.java)
            intent.putExtra("plop ", "value")
            startActivity(intent)
        }
        buttonCreate.setOnClickListener { view ->

            val intent = Intent(this, CreateParty::class.java)
            startActivity(intent)
        }

    }



}
