package ir.navaco.behnoudnote.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ir.navaco.behnoudnote.R
import kotlinx.android.synthetic.main.recyclerview_item.view.*

class NotesListAdapter(
    val context: Context,
    val noteList: List<Note>,
    val clickCallback: clickListenerInterface
) : RecyclerView.Adapter<NotesListAdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesListAdapterViewHolder {

        return NotesListAdapterViewHolder(
            LayoutInflater.from(context).inflate(R.layout.recyclerview_item, null)
        )

    }

    override fun getItemCount(): Int {
        return noteList.size
    }

    override fun onBindViewHolder(holder: NotesListAdapterViewHolder, position: Int) {

        val note: Note = noteList.get(position)

        holder.tv_noteTitle.text = note.title

        holder.tv_noteTitle.setOnClickListener({

            clickCallback.onNoteClicked(note.noteId)

        })

    }

}


class NotesListAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val tv_noteTitle: TextView = view.textView

}

interface clickListenerInterface {
    fun onNoteClicked(noteId: Int)
}