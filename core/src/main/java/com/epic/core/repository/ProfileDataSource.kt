package com.epic.core.repository

import com.epic.core.data.Profile

interface ProfileDataSource {
    suspend fun add(profile: Profile)

    suspend fun get(id: Long):Profile?

    suspend fun remove(profile: Profile)
}