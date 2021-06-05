package com.epic.portfolioapp.framework.db


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.epic.core.data.Profile

@Entity(tableName = "profile")
data class ProfileEntity(
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "position")
    var position: String,
    @ColumnInfo(name = "about")
    var about: String,
    @ColumnInfo(name = "skill")
    var skill: String,
    @ColumnInfo(name = "work")
    var work : String,
    @ColumnInfo(name = "mobile")
    var mobile : String,
    @ColumnInfo(name = "email")
    var email : String,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Long = 0
){
    companion object {
        fun fromProfile(profile: Profile) = ProfileEntity(profile.name,profile.position,profile.about,profile.skill,profile.work,profile.mobile,profile.email,profile.id)
    }

    fun toProfile() = Profile(name,position,about,skill,work,mobile, email, id)
}
