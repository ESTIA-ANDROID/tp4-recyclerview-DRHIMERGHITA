package com.openclassrooms.magicgithub.repository

import com.openclassrooms.magicgithub.api.ApiService
import com.openclassrooms.magicgithub.model.User

class UserRepository(private val apiService: ApiService) {

    // Utilisation d'une variable intermédiaire
    fun getUsers(): List<User> = apiService.getUsers()

    // Ajout d'un utilisateur aléatoire via une méthode qui ne fait que déléguer
    fun addRandomUser() {
        apiService.addRandomUser()
    }

    // Suppression d'un utilisateur de façon directe
    fun deleteUser(user: User) {
        apiService.deleteUser(user)
    }
}
