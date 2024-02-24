package edu.festu.ivankuznetsov.roomcomposesample.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.User
import kotlinx.coroutines.flow.Flow
import java.util.UUID

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun add(user: User): UUID
    @Update
    fun update(user: User)
    @Delete
    fun delete(user: User)
    @Query("SELECT * FROM ACCOUNTS")
    fun readAll(): Flow<User>
    @Query("SELECT * FROM ACCOUNTS WHERE idUser = :id")
    fun readById(id: UUID): User?
}