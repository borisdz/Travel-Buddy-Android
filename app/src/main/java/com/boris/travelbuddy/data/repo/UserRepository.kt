package com.boris.travelbuddy.data.repo

import androidx.lifecycle.LiveData
import com.boris.travelbuddy.data.User
import com.boris.travelbuddy.data.dao.UserDao

class UserRepository(private val userDao: UserDao) {
    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }
}