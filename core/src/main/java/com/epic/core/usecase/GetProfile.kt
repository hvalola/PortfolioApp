package com.epic.core.usecase

import com.epic.core.repository.ProfileRepository

class GetProfile(private val profileRepository: ProfileRepository) {

    suspend operator fun invoke(id:Long)=profileRepository.getProfile(id)
}