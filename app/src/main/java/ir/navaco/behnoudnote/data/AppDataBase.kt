package ir.navaco.behnoudnote.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {

    abstract fun noteDao(): NoteDao

}