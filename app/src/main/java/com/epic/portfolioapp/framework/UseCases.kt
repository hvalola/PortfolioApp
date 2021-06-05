package com.epic.portfolioapp.framework

import com.epic.core.usecase.AddProfile
import com.epic.core.usecase.GetProfile

data class UseCases(
    val addProfile: AddProfile,
    val getProfile: GetProfile
)
