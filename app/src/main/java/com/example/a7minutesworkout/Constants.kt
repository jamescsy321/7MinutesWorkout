package com.example.a7minutesworkout

object Constants {

    fun defaultExerciseList():ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)
        val plank = ExerciseModel(
            2,
            "Plank",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(plank)
        val pushUp = ExerciseModel(
            3,
            "push up and Rotation",
            R.drawable.ic_push_up,
            false,
            false
        )
        exerciseList.add(pushUp)
        return exerciseList
    }
}