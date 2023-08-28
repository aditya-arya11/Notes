package com.example.notes.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// table name
@Entity(tableName = "notesTable")
class Note(
    // table column info
    @ColumnInfo(name = "title") val noteTitle: String,
    @ColumnInfo(name = "description") val noteDescription: String,
    @ColumnInfo(name = "timestamp") val timestamp: String,
    @PrimaryKey(autoGenerate = true) var id: Int = 0
)