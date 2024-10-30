package com.friska.klinikapp_mi2a.Model

import com.friska.klinikapp_mi2a.R

data class ModelMenuIcon(
    var namaMenu : String,
    var imgMenu : Int
)
object MockList{
    fun getModel() : List<ModelMenuIcon>{

        val itemModel1 = ModelMenuIcon(
            "Cardiologyst", R.drawable.icon_eye
        )

        val itemModel2 = ModelMenuIcon(
            "Ophthalmologyst", R.drawable.icon_tooth
        )

        val itemModel3 = ModelMenuIcon(
            "Dentist", R.drawable.icon_heart
        )
        val itemList : ArrayList<ModelMenuIcon> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)

        return itemList
    }
}