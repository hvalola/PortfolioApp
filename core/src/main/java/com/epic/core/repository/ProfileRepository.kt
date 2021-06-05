package com.epic.core.repository

import com.epic.core.data.Profile

class ProfileRepository(private val profileDataSource: ProfileDataSource) {
    suspend fun addProfile(profile: Profile)=profileDataSource.add(profile)

    suspend fun  getProfile(id : Long) = profileDataSource.get(id)

    suspend fun removeProfile(profile: Profile) = profileDataSource.remove(profile)
}