package com.epic.portfolioapp.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.epic.core.data.Profile
import com.epic.portfolioapp.framework.di.ApplicationModule
import com.epic.portfolioapp.framework.di.DaggerViewModelComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class SkillViewModel(application: Application): AndroidViewModel(application) {
    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    @Inject
    lateinit var useCases: UseCases

    init {

        DaggerViewModelComponent.builder().applicationModule(ApplicationModule(getApplication())).build().inject(this)
    }
    val currentProfile = MutableLiveData<Profile?>()
    fun getProfile(id: Long) {
        coroutineScope.launch {
            val profile = useCases.getProfile(id)
            println(profile?.about)
            currentProfile.postValue(profile)
        }
    }
}