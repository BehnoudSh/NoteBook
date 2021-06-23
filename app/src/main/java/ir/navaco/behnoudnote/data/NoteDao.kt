package ir.navaco.behnoudnote.data

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getNotes(): LiveData<List<Note>>

    @Insert
      fun insertNote(note: Note)

}