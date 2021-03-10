package com.sunbae.recyclerview_test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*


class HeroAdapter(val superHero:List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>(){
//  HeroAdapter Class에 List<> Data형을 받음.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    // List의 개수를 저장 해둔다. 아직 어디에 사용할지 모름
    override fun getItemCount(): Int = superHero.size


    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superHero[position])
    }

    class HeroHolder(val  view:View):RecyclerView.ViewHolder(view){
        fun  render(superhero: SuperHero){
            // 받아온 List<>의 값들을 실제 Control에 넣어준다.
            // ImageView에는 Img Path를, TextBox에는 Text를
            view.tvRealName.text = superhero.realName
            view.tvSuperHeroName.text = superhero.superHeroName
            view.tvPublisher.text = superhero.publisher
            Picasso.get().load(superhero.image).into(view.ivHero)
        }
    }




}

