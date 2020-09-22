package ir.navaco.behnoudnote.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import ir.navaco.behnoudnote.data.AppDataBase
import ir.navaco.behnoudnote.data.Note
import ir.navaco.behnoudnote.data.NoteRepository

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    val noteRepository: NoteRepository

    init {
        val notesDao = AppDataBase.getDatabase(application).noteDao()
        noteRepository = NoteRepository(notesDao)
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return noteRepository.getNotes()
    }

    fun getNote(noteId: String): LiveData<Note> {
        return noteRepository.getNote(noteId)
    }

    fun insertNote(note: Note) {
        noteRepository.addNote(note)
    }

    fun deleteNote(note: Note) {
        noteRepository.deleteNote(note)
    }

    fun updateNote(note: Note) {
        noteRepository.updateNote(note)
    }

}