package fr.elph.oplayner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.content.Context.TELEPHONY_SERVICE
import androidx.core.content.ContextCompat.getSystemService
import android.telephony.TelephonyManager
import android.content.Context


class JoinParty : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join_party)
    }
    private lateinit var goParty:Button

    //goParty.setOnClickListener // event on party

    
}