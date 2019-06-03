package fr.elph.oplayner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent

//viewholder import
/*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.IItem
import com.mikepenz.fastadapter.adapters.ItemAdapter
import fr.elph.oplayner.viewholder.charcterItem
import fr.elph.oplayner.viewholder.characterViewHolder
import kotlinx.android.synthetic.main.activity_main.*
*/

class CreateParty : AppCompatActivity(){
    
    private lateinit var buttonCreate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_party)

        buttonCreate = findViewById(R.id.create_party)

        buttonCreate.setOnClickListener { view ->
            val intent = Intent(this, link::class.java)
            startActivity(intent)
            /*
            val intent = Intent(this, JoinParty::class.java)
            intent.putExtra("plop ", "value")
            startActivity(intent)
            */
        }


        // viewholder part
        /*
        private lateinit var recyclerView: FastAdapter<charcterItem>

        val layout = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerView.layoutView = layout


        val itemAdapter = ItemAdapter<IItem<*,*>>()
        val fastAdapter = FastAdapter<charcterItem, ItemAdapter<IItem<*,*> > >(itemAdapter)
        recyclerView.adapter = fastAdapter

        fastAdapter.withOnClickListener{ view, adapter, item, position ->
            Toast.makeText(this, "$position", Toast.LENGTH_SHORT).show()
            true
        }
        */
    }


}