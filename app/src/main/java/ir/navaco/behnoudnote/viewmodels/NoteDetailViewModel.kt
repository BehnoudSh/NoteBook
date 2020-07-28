package ir.navaco.behnoudnote.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ir.navaco.behnoudnote.data.Note
import ir.navaco.behnoudnote.data.NoteRepository

class NoteDetailViewModel(
    noteRepository: NoteRepository,
    private val noteId: String
) : ViewModel() {

//    val isNoteAdded: LiveData<Boolean>

    val note: LiveData<Note> = noteRepository.getNote(noteId)

    val notes: LiveData<List<Note>> = noteRepository.getNotes()

}