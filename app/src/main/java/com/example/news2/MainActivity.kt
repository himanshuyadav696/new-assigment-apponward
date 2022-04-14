package com.example.news2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecycler: RecyclerView
    private lateinit var newRecycler2: RecyclerView
    private lateinit var newarraylist:ArrayList<neww>
    lateinit var imageId:Array<Int>
    lateinit var textid:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId= arrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image4,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5
        )
        textid= arrayOf(

            "Russia-Ukraine crisis Live: Explosions heard in Kyiv as Russia presses Ukraine assault",
            "Russia Ukraine war News LIVE: Ukraine President says Russian forces also targeting civilian areas",
            "Russia Ukraine News LIVE Updates | Ukraine Foreign Minister Dmytro Kuleba",
            "Russia-Ukraine war LIVE updates: 13 soldiers on island refuse to surrender, killed by Russian warship ",
            "Russia-Ukraine crisis Live: Explosions heard in Kyiv as Russia presses Ukraine assault",
            "Russia Ukraine war News LIVE: Ukraine President says Russian forces also targeting civilian areas",
            "Russia Ukraine News LIVE Updates | Ukraine Foreign Minister Dmytro Kuleba",
            "Russia-Ukraine war LIVE updates: 13 soldiers on island refuse to surrender, killed by Russian warship ",
            "Russia-Ukraine crisis Live: Explosions heard in Kyiv as Russia presses Ukraine assault",
            "Russia Ukraine war News LIVE: Ukraine President says Russian forces also targeting civilian areas",
            "Russia Ukraine News LIVE Updates | Ukraine Foreign Minister Dmytro Kuleba",
            "Russia-Ukraine war LIVE updates: 13 soldiers on island refuse to surrender, killed by Russian warship ",
            "Russia-Ukraine crisis Live: Explosions heard in Kyiv as Russia presses Ukraine assault",
            "Russia Ukraine war News LIVE: Ukraine President says Russian forces also targeting civilian areas",
            "Russia Ukraine News LIVE Updates | Ukraine Foreign Minister Dmytro Kuleba",
            "Russia-Ukraine war LIVE updates: 13 soldiers on island refuse to surrender, killed by Russian warship ",
            "Russia-Ukraine crisis Live: Explosions heard in Kyiv as Russia presses Ukraine assault",
            "Russia Ukraine war News LIVE: Ukraine President says Russian forces also targeting civilian areas",
            "Russia Ukraine News LIVE Updates | Ukraine Foreign Minister Dmytro Kuleba",
            "Russia-Ukraine war LIVE updates: 13 soldiers on island refuse to surrender, killed by Russian warship ",
            "Not Resolved Fully: Biden On Talks With India In Russia-Ukraine Conflict"
        )
        newRecycler=findViewById(R.id.recyclerview)
        newRecycler2=findViewById(R.id.recyclerview2)
        newRecycler.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        newRecycler2.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        newRecycler.setHasFixedSize(true)
        newarraylist= arrayListOf<neww>()
        getUserData()
    }
    private fun getUserData() {
        for(i in imageId.indices){
            val news=neww(imageId[i],textid[i])
            newarraylist.add(news)
        }
        newRecycler.adapter=MyAdaptor(newarraylist)
        newRecycler2.adapter=MyAdaptor(newarraylist)
    }
}