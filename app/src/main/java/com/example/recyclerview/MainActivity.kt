package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songs:List<String> = listOf("Rabba Janda" , "Jhoome Jo Pathan " , "Apna Bana Le" , "Besharam Rang"
                   ,"Tere Pyar Mein" , "Bijli" , "Kesariya" ,"Nacho Nacho" , "Doobey" ,"Heer Ranjha" ,"Fitoor"
                    ,"Bheegi Si Bhaggi Si" , "Tum Se Hi" , "Mehram" , "Maiyaa Mainu" , "Tum Tak" , "Nadan Parinde"
                    ,"Tum Ho" , "Dil Ye Bekarar Kyu Hai" , "Ranjha" , "Raabta")

        val songsObjects:MutableList<song> = mutableListOf<song>()

        songsObjects.add(song("Rabba Janda","Mission Majnu",R.drawable.image1))
        songsObjects.add(song("Jhoome Jo Pathan","Pathan",R.drawable.image2))
        songsObjects.add(song("Apna Bana Le","Bhediya",R.drawable.image3))
        songsObjects.add(song("Besharam Rang","Pathan",R.drawable.image4))
        songsObjects.add(song("Tere Pyar Mein","Tu Joothi Me Makarr",R.drawable.image5))
        songsObjects.add(song("Bijli","Mera Naam Govinda",R.drawable.image6))
        songsObjects.add(song("Kesariya","Bhramastra",R.drawable.image7))
        songsObjects.add(song("Nacho Nacho","RRR",R.drawable.image8))
        songsObjects.add(song("Doobey","Gehraiyaa",R.drawable.image9))
        songsObjects.add(song("Heer Ranjha","Heer Ranjha",R.drawable.image10))
        songsObjects.add(song("Fitoor","Shamsheera",R.drawable.image11))
        songsObjects.add(song("Bheegi Si Bhagi Si ","Rajneeti",R.drawable.image12))
        songsObjects.add(song("Tum Se Hi","Jab We Met",R.drawable.image13))
        songsObjects.add(song("Mehram","Jersey",R.drawable.image14))
        songsObjects.add(song("Tum Tak","Ranjhana",R.drawable.image15))
        songsObjects.add(song("Nadan Parindey","Rockstar",R.drawable.image16))
        songsObjects.add(song("Dil Ye Bekarar Kyu Hai","Players",R.drawable.image17))
        songsObjects.add(song("Maiyaa Mainu","Jersey",R.drawable.image18))
        songsObjects.add(song("Ranjha","Vikram Bhatra",R.drawable.image19))
        songsObjects.add(song("Raabta","Raabta",R.drawable.image20))
        songsObjects.add(song("Tum Ho","Rockstar",R.drawable.image21))


        val songList = findViewById<RecyclerView>(R.id.songList)

        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)

    }
}