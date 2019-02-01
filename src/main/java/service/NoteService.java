package service;


import model.Note;

import java.util.List;

public interface NoteService{
    public void addNote(Note note);

    public void updateNote(Note note);

    public void removeNote(int id);

    public Note getNoteId(int id);

    public List<Note> listNotes();
}


