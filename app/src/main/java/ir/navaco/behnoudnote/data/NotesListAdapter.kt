package ir.navaco.behnoudnote.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ir.navaco.behnoudnote.R
import kotlinx.android.synthetic.main.recyclerview_item.view.*

class NotesListAdapter(val context: Context) : RecyclerView.Adapter<NotesListAdapterViewHolder>() {

    var notes = emptyList<Note>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesListAdapterViewHolder {

        return NotesListAdapterViewHolder(
            LayoutInflater.from(context).inflate(R.layout.recyclerview_item, null)
        )
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    override fun onBindViewHolder(holder: NotesListAdapterViewHolder, position: Int) {
        val note: Note = notes.get(position)
        holder.tv_noteTitle.text = note.title
    }

    internal fun setNotes(notes: List<Note>) {
        this.notes = notes
        notifyDataSetChanged()
    }

}

class NotesListAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val tv_noteTitle: TextView = view.textView

}