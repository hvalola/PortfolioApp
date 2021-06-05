package com.epic.portfolioapp.framework

import android.content.Context
import com.epic.core.data.Profile
import com.epic.core.repository.ProfileDataSource
import com.epic.portfolioapp.framework.db.DatabaseService
import com.epic.portfolioapp.framework.db.ProfileEntity

class RoomProfileDataSource(context: Context): ProfileDataSource  {
    val profileDao = DatabaseService.getInstance(context).profieDao()

    override suspend fun add(profile: Profile) = profileDao.addProfileEntity(ProfileEntity.fromProfile(profile))

    override suspend fun get(id: Long): Profile? = profileDao.getProfileEntity(id)?.toProfile()

    override suspend fun remove(profile: Profile) {
        TODO("Not yet implemented")
    }
}