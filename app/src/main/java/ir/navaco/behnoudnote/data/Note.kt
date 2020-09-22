package ir.navaco.behnoudnote.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note  (


    @PrimaryKey  @ColumnInfo(name = "Title")
    val title: String

)