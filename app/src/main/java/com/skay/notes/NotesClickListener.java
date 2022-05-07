package com.skay.notes;

import androidx.cardview.widget.CardView;

import com.skay.notes.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
