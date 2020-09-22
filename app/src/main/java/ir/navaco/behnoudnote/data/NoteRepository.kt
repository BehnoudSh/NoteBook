package ir.navaco.behnoudnote.data

class NoteRepository(val noteDao: NoteDao) {

    fun getNotes() = noteDao.getNotes()

    fun addNote(note: Note) = noteDao.insertNote(note)

}