package com.epic.portfolioapp.framework.di

import com.epic.core.repository.ProfileRepository
import com.epic.core.usecase.AddProfile
import com.epic.core.usecase.GetProfile
import com.epic.portfolioapp.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {
    @Provides
    fun getUseCases(repository: ProfileRepository) = UseCases(
        AddProfile(repository),
        GetProfile(repository)
    )
}