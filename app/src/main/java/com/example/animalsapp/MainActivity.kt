package com.example.animalsapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.animal_ticket.view.*

class MainActivity : AppCompatActivity() {

    var listOfAniamls = ArrayList<Animal>()
    var adapter:AnimalsAdapter?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // load animals

        listOfAniamls.add(Animal("Caboon","Baboon lives in tree",R.drawable.baboon))
        listOfAniamls.add(Animal("Bulldog","Bulldog lives in texas",R.drawable.bulldog))
        listOfAniamls.add(Animal("panda","Baboon lives in tree",R.drawable.panda))
        listOfAniamls.add(Animal("swallow_bird","Baboon lives in tree",R.drawable.swallow_bird))
        listOfAniamls.add(Animal("white_tiger","Baboon lives in tree",R.drawable.white_tiger))
        listOfAniamls.add(Animal("zebra","Baboon lives in tree",R.drawable.zebra))

        adapter = AnimalsAdapter(this,listOfAniamls)

        tvListAnimal.adapter = adapter

    }

    class AnimalsAdapter:BaseAdapter{

        var listOfAnimals = ArrayList<Animal>()
        var context:Context?=null

        constructor(context:Context,listOfAnimal:ArrayList<Animal>):super(){
            this.listOfAnimals=listOfAnimals
            this.context=context

        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            val animal = listOfAnimals[position]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var myView = inflator.inflate(R.layout.animal_ticket,null)

            myView.textView2.text = animal.name!!
            myView.textView3.text = animal.descprtion!!
            myView.imageView.setImageResource(animal.image!!)

        }

        override fun getItem(position: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return listOfAnimals[position]
        }

        override fun getItemId(position: Int): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return position.toLong()
        }

        override fun getCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return listOfAnimals.size
        }

    }
}
