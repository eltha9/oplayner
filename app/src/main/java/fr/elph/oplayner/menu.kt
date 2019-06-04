package fr.elph.oplayner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter

class menu : AppCompatActivity() {

    //private lateinit var episodesItemAdapter: FastItemAdapter<EpisodeItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        /*
        // Créer le LayoutManager
        val linearLayoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL, false)
        // Lier le LayoutManager à la RecyclerView
        episodesRecyclerView.setLayoutManager(linearLayoutManager)
        // Adapter = la classe qui retournera les cellules à la RecyclerView
        episodesItemAdapter = FastItemAdapter()
        // episodes = List<Episode> reçu suite à un call WS (API JSON)
        for (episode in episodes) {
            episodesItemAdapter.add(EpisodeItem(episode))
        }
        // Lier l'adaptateur à la RecyclerView
        episodesRecyclerView.setAdapter(episodesItemAdapter)
        */
    }
}
