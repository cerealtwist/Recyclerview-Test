package com.example.recyclerview1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = listOf<Items>(
            Items(
                R.drawable.bladerunner,
                "Blade Runner",
                "Rick Deckard, an ex-policeman, becomes a special agent with a mission to exterminate a group of violent androids."
            ),
            Items(
                R.drawable.mulhollanddrive,
                "Mulholland Drive",
                "Rita & Betty team up to find clues related to Rita's accident and ascertain her true identity."
            ),
            Items(
                R.drawable.spacyeodyssey,
                "2001: A Space Odyssey",
                "After discovering a monolith on the lunar surface, the Discovery One set out to unravel its mysterious origin."
            ),
            Items(
                R.drawable.fightclub,
                "Fight Club",
                "Discontented with his capitalistic lifestyle, a white-collared insomniac forms an underground fight club."
            ),
            Items(
                R.drawable.dps,
                "Dead Poets Society",
                "John Keating, a progressive English teacher, encourage his students to go against the status quo and live life unapologetically. "
            ),
            Items(
                R.drawable.parasite,
                "Parasite",
                "The struggling Kim family sees an opportunity when the son starts working for the wealthy Park family."
            ),
            Items(
                R.drawable.tpfwwm,
                "Twin Peaks : Fire Walk With Me",
                "A Prequel of Twin Peaks. Stories revolves around the murderers of Teresa Banks and a week before the death of Laura Palmer."
            ),
            Items(
                R.drawable.trainspotting,
                "Trainspotting",
                "Renton is a drug addict who tries to mend his ways by moving to London and starting life afresh."
            ),
            Items(
                R.drawable.lostintranslation,
                "Lost In Translation",
                "An American actor Bob, lands in Tokyo for film ad and ends up meeting Charlotte, who's left behind by her husband."
            ),
            Items(
                R.drawable.silenceofthelambs,
                "Silence Of The Lambs",
                "Clarice Starling, an FBI agent, seeks help from Hannibal Lecter, a psychopathic serial killer and former psychiatrist."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.list_item)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ItemAdapter(this, itemList){
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}