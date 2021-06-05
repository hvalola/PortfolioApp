package com.epic.core.usecase

import com.epic.core.data.Profile
import com.epic.core.repository.ProfileRepository

class AddProfile(private val profileRepository: ProfileRepository) {
    suspend operator fun invoke(profile: Profile)=profileRepository.addProfile(profile)
}