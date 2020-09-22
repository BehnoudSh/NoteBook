package ir.navaco.behnoudnote.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ir.navaco.behnoudnote.R
import ir.navaco.behnoudnote.databinding.ActivityNoteDetailBinding
import ir.navaco.behnoudnote.viewmodels.NoteViewModel

class NoteDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_detail)

    }
}