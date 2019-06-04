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
import retrofit2.Call
import retrofit2.Response

import retrofit2.Callback
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
            // chope les varriable
            val title = create_title.text.toString()
            val phone = create_phone.text.toString()
            val date = create_date.text.toString()
            val adress = create_adress.text.toString()
            val message = create_message.text.toString()
            val password = create_password.text.toString()
            // besoin d'une autre variable pour le choix de l'avatar
            val linkValue = "oplayner.albandelachaume.fr/$title"

            val isValid = title.isNotBlank() && phone.isNotBlank() && date.isNotBlank() && adress.isNotBlank() && message.isNotBlank() && password.isNotBlank()

            if(isValid){
                val intent = Intent(this, link::class.java)

                val repo = oplaynerRepo()
                    //mettre le lien
                    repo.api.postData(
                        "true",
                        "$title",
                        "$date",
                        "party",
                        "$password",
                        "$message",
                        "$adress",
                        "$phone"
                    )
                        .enqueue(object : Callback<post> {
                            override fun onFailure( call: Call<post>, t: Throwable){
                                t.printStackTrace()
                                Toast.makeText(this@CreateParty, "error", Toast.LENGTH_SHORT).show()
                                // is that forcing because i don't know why i have a bug in parsing the respesonse ? YES :'(
                                intent.putExtra("link", linkValue)
                                startActivity(intent)
                            }
                            override fun onResponse(call: Call<post>, response: Response<post>){
                                val res = response.body()
                                Log.e("retofit ","response : $response")
                                if(res != null){

                                    if(response.code() == 200){

                                        intent.putExtra("link", linkValue)
                                        startActivity(intent)
                                    }

                                }
                            }
                        })



            }else{
                Toast.makeText(this, "Complete all the form !!", Toast.LENGTH_SHORT).show()
            }
        }

        val TAG = "createParty"
        Log.i(TAG,"Entering CreateParty")





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

