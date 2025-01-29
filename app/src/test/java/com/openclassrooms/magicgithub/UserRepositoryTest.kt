package com.openclassrooms.magicgithub

import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator
import com.openclassrooms.magicgithub.di.Injection
import com.openclassrooms.magicgithub.model.User
import com.openclassrooms.magicgithub.repository.UserRepository
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class UserRepositoryTest {
    private lateinit var userRepository: UserRepository

    @Before
    fun setup() {
        userRepository = Injection.getRepository()
    }

    @Test
    fun getUsersWithSuccess() {
        val usersActual = userRepository.getUsers()
        val usersExpected = FakeApiServiceGenerator.FAKE_USERS
        assertEquals(usersExpected, usersActual)
    }

    @Test
    fun generateRandomUserWithSuccess() {
        val initialSize = userRepository.getUsers().size
        userRepository.addRandomUser()
        assertEquals(initialSize + 1, userRepository.getUsers().size)
    }

    @Test
    fun deleteUserWithSuccess() {
        val userToDelete = userRepository.getUsers().first()
        userRepository.deleteUser(userToDelete)
        assertFalse(userRepository.getUsers().contains(userToDelete))
    }
}
