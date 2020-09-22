package ir.navaco.behnoudnote.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import ir.navaco.behnoudnote.R
import ir.navaco.behnoudnote.data.NotesListAdapter
import ir.navaco.behnoudnote.viewmodels.NoteViewModel
import kotlinx.android.synthetic.main.activity_notes.*

class NotesActivity : AppCompatActivity() {

    var viewModel_Note: NoteViewModel? = null;
    var adapter: NotesListAdapter? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        viewModel_Note = ViewModelProviders.of(this).get(NoteViewModel::class.java)

        initRecyclerView()
    }

    fun initRecyclerView() {

        adapter = NotesListAdapter(this)
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true)
        recyclerview.adapter = adapter

    }
}