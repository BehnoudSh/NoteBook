package ir.navaco.behnoudnote.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "Id")
    val noteId: Int,
    val title: String,
    val description: String,
    val dateCreated: Long
)