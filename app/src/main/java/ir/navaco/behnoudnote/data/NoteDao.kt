package ir.navaco.behnoudnote.data

import androidx.lifecycle.MutableLiveData
import androidx.room.*


@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getNotes(): MutableLiveData<List<Note>>

    @Query("SELECT * FROM notes WHERE Id = :noteId")
    fun getNote(noteId: String): MutableLiveData<Note>

    @Insert
    fun insertNote(note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Update
    fun update(note: Note)

}