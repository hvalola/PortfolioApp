package com.epic.portfolioapp.framework.di

import android.app.Application
import com.epic.core.repository.ProfileRepository
import com.epic.portfolioapp.framework.RoomProfileDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application) = ProfileRepository(RoomProfileDataSource(app))
}