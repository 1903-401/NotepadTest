package p.productivity.notepad.callbacks;

import p.productivity.notepad.model.Note;

public interface NoteEventListener {
    /**
     * call when note clicked.
     *
     * @param note: note item
     */
    void onNoteClick(Note note);

    /**
     * call when long Click to note.
     *
     * @param note : item
     */
    void onNoteLongClick(Note note);
}
