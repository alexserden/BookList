package dao;

import model.Note;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NoteDaoImpl implements NoteDao {
  //  private static final Logger logger = LoggerFactory.logger(NoteDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addNote(Note note) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(note);
       // logger.info("Note successfully saved. Note details: " + note);
    }

    @Override
    public void updateNote(Note note) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(note);
       // logger.info("Note successfully update. Note details: " + note);
    }

    @Override
    public void removeNote(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Note note =  session.load(Note.class, new Integer(id));

        if(note!=null){
            session.delete(note);
        }
      //  logger.info("Note successfully removed. Note details: " + note);
    }

    @Override
    public Note getNoteById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        Note note = session.load(Note.class, new Integer(id));
     //   logger.info("Note successfully loaded. Note details: " + note);

        return note;
    }

    @Override
    public List<Note> listNotes() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Note> notesList = session.createQuery("from Note").list();

        for(Note note: notesList){

         //   logger.info("Note list: " + note);
        }

        return notesList;
    }

    @Override
    public void NoteIsRead(int id) {

    }
}
