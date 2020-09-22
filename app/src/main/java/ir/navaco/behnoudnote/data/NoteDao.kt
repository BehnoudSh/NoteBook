package ir.navaco.behnoudnote.data

import androidx.lifecycle.MutableLiveData
import androidx.room.*


@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getNotes(): MutableLiveData<List<Note>>

    @Insert
    fun insertNote(note: Note)

}