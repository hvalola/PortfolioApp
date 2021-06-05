package com.epic.core.data

data class Profile(
    var name: String,
    var position: String,
    var about: String,
    var skill: String,
    var work : String,
    var mobile : String,
    var email : String,
    var id : Long = 0
)
