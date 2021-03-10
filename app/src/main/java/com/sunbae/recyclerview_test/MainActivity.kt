package com.sunbae.recyclerview_test

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val superheros: List<SuperHero> = listOf(
        SuperHero("Spiderman", publisher = "Marvel", realName = "Peter Parker", image = "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
        SuperHero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
        SuperHero("Wolverine", "Marvel", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
        SuperHero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        SuperHero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"),
        SuperHero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"),
        SuperHero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"),
        SuperHero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()

    }


    fun initRecycler(){
        rvSuperHero.layoutManager = LinearLayoutManager(this)   // layout을 현재 adapter로
        val adapter = HeroAdapter(superheros)
        rvSuperHero.adapter = adapter
        // RecyclerView의 Adapter 옵션에 별도로 만든 HeroAdapter 를 넣는다.
        // DataGridView1.DataSource = datasource 와 비슷한 개념인 것 같다.
    }
}