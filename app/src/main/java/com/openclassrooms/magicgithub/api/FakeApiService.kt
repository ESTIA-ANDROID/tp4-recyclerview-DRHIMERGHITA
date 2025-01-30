package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User

class FakeApiService : ApiService {

    // Référence à la liste mutable d'utilisateurs fictifs
    private val _users = FakeApiServiceGenerator.FAKE_USERS

    override fun getUsers(): List<User> {
        return _users // Retourne la liste des utilisateurs
    }

    override fun addRandomUser() {
        // Ajout d'un utilisateur aléatoire à partir de la liste prédéfinie
        _users.add(FakeApiServiceGenerator.FAKE_USERS_RANDOM.random())
    }

    override fun deleteUser(user: User) {
        // Suppression d'un utilisateur de la liste
        _users.remove(user)
    }
}
