package com.nichiyos.notes;

import androidx.cardview.widget.CardView;

import com.nichiyos.notes.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
