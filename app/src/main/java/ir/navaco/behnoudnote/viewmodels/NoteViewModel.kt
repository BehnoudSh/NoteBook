package ir.navaco.behnoudnote.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ir.navaco.behnoudnote.data.AppDataBase
import ir.navaco.behnoudnote.data.Note
import ir.navaco.behnoudnote.data.NoteRepository

class NoteViewModel(application: Application) : ViewModel() {

    val noteRepository: NoteRepository

    init {
        val notesDao = AppDataBase.getDatabase(application).noteDao()
        noteRepository = NoteRepository(notesDao)
    }

    fun getAllNotes(): LiveData<List<Note>>? {
        return noteRepository.getNotes()
    }

    fun insertNote(note: Note) {
        noteRepository.addNote(note)
    }

}