package service;

import dao.NoteDao;
import model.Note;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    private NoteDao noteDao;

    public void setNoteDao(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    @Override
    @Transactional
    public void addNote(Note note) {
        noteDao.addNote(note);
    }
    @Override
    @Transactional
    public void updateNote(Note note) {
        noteDao.updateNote(note);
    }
    @Override
    @Transactional
    public void removeNote(int id) {
        noteDao.removeNote(id);
    }
    @Override
    @Transactional
    public Note getNoteId(int id) {
        return noteDao.getNoteById(id);
    }
    @Override
    @Transactional
    public List<Note> listNotes() {
        return noteDao.listNotes();
    }

}
