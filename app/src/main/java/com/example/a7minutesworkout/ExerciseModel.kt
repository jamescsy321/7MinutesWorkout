package com.example.a7minutesworkout

class ExerciseModel(
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isCompleted: Boolean,
    private var isSelected: Boolean
){


    fun getImage():Int{
        return image
    }

    fun setImage(Image:Int){
        this.image=image
    }


    fun getName():String{
        return name
    }

    fun setName(name: String){
        this.name=name
    }
}