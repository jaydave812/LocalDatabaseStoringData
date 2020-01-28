package com.example.assignment1.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.assignment1.model.User

@Dao
interface UserDatabaseDao {

    @Insert
    fun insertList(user: List<User>)

    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User)

    @Query("Select * from user_table")
    fun getAllUser(): LiveData<List<User>>

    @Delete
    fun deleteUser(user: User)
}