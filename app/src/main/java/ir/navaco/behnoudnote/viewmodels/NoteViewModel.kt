package ir.navaco.behnoudnote.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ir.navaco.behnoudnote.data.AppDataBase
import ir.navaco.behnoudnote.data.Note
import ir.navaco.behnoudnote.data.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

public class NoteViewModel(application: Application) : AndroidViewModel(application) {

    val noteRepository: NoteRepository


    init {
        val notesDao = AppDataBase.getDatabase(application).noteDao()
        noteRepository = NoteRepository(notesDao)
    }

    fun getAllNotes(): LiveData<List<Note>>? {
        return noteRepository.getNotes()
    }

//    fun insertNote(note: Note) {
//        noteRepository.addNote(note)
//    }

    fun insertNote(note: Note) = viewModelScope.launch(Dispatchers.IO) {
        noteRepository.addNote(note)
    }

}