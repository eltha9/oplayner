package fr.elph.oplayner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent


import androidx.core.app.ShareCompat


class link : AppCompatActivity() {

    private lateinit var buttonShare:Button
    private lateinit var buttonContinue:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link)


        buttonContinue = findViewById(R.id.persue)
        buttonShare = findViewById(R.id.share)

        buttonContinue.setOnClickListener{ view ->

            val intent = Intent(this, menu::class.java)
            startActivity(intent)
        }

        buttonShare.setOnClickListener{view->


            val textShare:String = intent.getStringExtra("link")

            ShareCompat.IntentBuilder.from(this)
                .setType("text/plain")
                .setChooserTitle("share url")
                .setText(textShare)
                .startChooser()
        }

    }
}
