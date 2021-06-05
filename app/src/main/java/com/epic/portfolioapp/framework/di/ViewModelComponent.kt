package com.epic.portfolioapp.framework.di

import com.epic.portfolioapp.framework.*
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(portFolioViewModel: PortFolioViewModel)
    fun inject(aboutViewModel: AboutViewModel)
    fun inject(skillViewModel: SkillViewModel)
    fun inject(workViewModel: WorkViewModel)
    fun inject(contactViewModel: ContactViewModel)
}