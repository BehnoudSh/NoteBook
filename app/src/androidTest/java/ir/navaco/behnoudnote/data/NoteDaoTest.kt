package ir.navaco.behnoudnote.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)

class NoteDaoTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var database: AppDataBase
    private lateinit var dao: NoteDao

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
                ApplicationProvider.getApplicationContext(),
                AppDataBase::class.java
        ).allowMainThreadQueries().build()
        dao = database.noteDao()
    }

    @After
    fun tearDown() {
        database.close()
    }


    @Test
    fun insertNote() {
        val note = Note("note title 1")
        dao.insertNote(note)
        val allNotes = dao.getNotes().getOrAwaitValue()
        assertThat(allNotes).contains(note)
    }

    @Test
    fun getNotes() {
        val note1 = Note("note title 1")
        val note2 = Note("note title 2")
        val note3 = Note("note title 3")

        dao.insertNote(note1)
        dao.insertNote(note2)
        dao.insertNote(note3)

        val allNotes = dao.getNotes().getOrAwaitValue()

        assertThat(allNotes.size).isEqualTo(3)

    }

}