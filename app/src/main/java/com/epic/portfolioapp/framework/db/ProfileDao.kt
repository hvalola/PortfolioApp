package com.epic.portfolioapp.framework.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface ProfileDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProfileEntity(profileEntity: ProfileEntity)

    @Query("SELECT * FROM profile WHERE id = :profileId")
    suspend fun getProfileEntity(profileId: Long): ProfileEntity?
}