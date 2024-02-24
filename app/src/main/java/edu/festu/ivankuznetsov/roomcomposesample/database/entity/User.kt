package edu.festu.ivankuznetsov.roomcomposesample.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "accounts")
data class User(@PrimaryKey
                @ColumnInfo(name = "idUser")
                val id: UUID = UUID.randomUUID(),
                @ColumnInfo(name = "email")
                val email: String,
                @ColumnInfo(name = "fistName")
                val fistName: String,
                @ColumnInfo(name = "patronymic", defaultValue = "")
                val patronymic: String = "",
                @ColumnInfo(name = "lastName")
                val lastName: String,
                @ColumnInfo(name = "password")
                val password: String)
