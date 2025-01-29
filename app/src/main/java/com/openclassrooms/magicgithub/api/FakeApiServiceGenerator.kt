package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import kotlin.random.Random

object FakeApiServiceGenerator {

    val FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://avatars.dicebear.com/api/human/1.svg"),
        User("002", "Paul", "https://avatars.dicebear.com/api/human/2.svg"),
        User("003", "Phil", "https://avatars.dicebear.com/api/human/3.svg"),
        User("004", "Guillaume", "https://avatars.dicebear.com/api/human/4.svg"),
        User("005", "Francis", "https://avatars.dicebear.com/api/human/5.svg"),
        User("006", "George", "https://avatars.dicebear.com/api/human/6.svg"),
        User("007", "Louis", "https://avatars.dicebear.com/api/human/7.svg"),
        User("008", "Mateo", "https://avatars.dicebear.com/api/human/8.svg"),
        User("009", "April", "https://avatars.dicebear.com/api/human/9.svg"),
        User("010", "Louise", "https://avatars.dicebear.com/api/human/10.svg"),
        User("011", "Elodie", "https://avatars.dicebear.com/api/human/11.svg"),
        User("012", "Helene", "https://avatars.dicebear.com/api/human/12.svg"),
        User("013", "Fanny", "https://avatars.dicebear.com/api/human/13.svg"),
        User("014", "Laura", "https://avatars.dicebear.com/api/human/14.svg"),
        User("015", "Gertrude", "https://avatars.dicebear.com/api/human/15.svg"),
        User("016", "Chloé", "https://avatars.dicebear.com/api/human/16.svg"),
        User("017", "April", "https://avatars.dicebear.com/api/human/17.svg"),
        User("018", "Marie", "https://avatars.dicebear.com/api/human/18.svg"),
        User("019", "Henri", "https://avatars.dicebear.com/api/human/19.svg"),
        User("020", "Rémi", "https://avatars.dicebear.com/api/human/20.svg")
    )

    private val FAKE_USERS_RANDOM = listOf(
        User("021", "Lea", "https://avatars.dicebear.com/api/human/21.svg"),
        User("022", "Geoffrey", "https://avatars.dicebear.com/api/human/22.svg"),
        User("023", "Simon", "https://avatars.dicebear.com/api/human/23.svg"),
        User("024", "André", "https://avatars.dicebear.com/api/human/24.svg"),
        User("025", "Leopold", "https://avatars.dicebear.com/api/human/25.svg")
    )

    fun getRandomUser(): User {
        return FAKE_USERS_RANDOM.random()
    }
}
