package dao;

import model.Note;

import java.util.List;

public interface NoteDao {
    public void addNote(Note book);

    public void updateNote(Note book);

    public void removeNote(int id);

    public Note getNoteById(int id);

    public List<Note> listNotes();


    public void NoteIsRead(int id);

}