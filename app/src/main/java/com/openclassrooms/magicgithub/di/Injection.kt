package com.openclassrooms.magicgithub.di

import com.openclassrooms.magicgithub.api.FakeApiService
import com.openclassrooms.magicgithub.repository.UserRepository

object Injection {

    fun getRepository(): UserRepository {
        return UserRepository(FakeApiService())  // Injection de FakeApiService dans UserRepository
    }
}
