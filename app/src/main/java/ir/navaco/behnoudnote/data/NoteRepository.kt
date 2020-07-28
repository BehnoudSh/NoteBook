package ir.navaco.behnoudnote.data

class NoteRepository(val noteDao: NoteDao) {

    fun getNotes() = noteDao.getNotes()

    fun getNote(noteId: String) = noteDao.getNote(noteId)

}