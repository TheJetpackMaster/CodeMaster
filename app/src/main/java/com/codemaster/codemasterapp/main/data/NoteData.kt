package com.codemaster.codemasterapp.main.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
data class Note(
    var id: String = "", // Unique Note ID
    val title: String, // Note title
    val description: String // Note description
)
