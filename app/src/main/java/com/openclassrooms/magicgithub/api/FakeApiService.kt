package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User

class FakeApiService : ApiService {


    private val users = mutableSetOf<User>().apply {
        addAll(FakeApiServiceGenerator.FAKE_USERS)
    }

    override fun getUsers(): List<User> {
        return users.toList()
    }

    override fun addRandomUser() {
        val randomUser = FakeApiServiceGenerator.getRandomUser()
        users.add(randomUser)
    }

    override fun deleteUser(user: User) {
        users.remove(user)
    }
}
