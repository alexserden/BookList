package controller;

import model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.NoteService;

import java.util.List;

@Controller
public class NoteController {

    NoteService noteService;

    @Autowired(required = true)
    @Qualifier(value = "noteService")
    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping(value = "/note/add", method = RequestMethod.POST)
    public String addNote(@ModelAttribute("addNote") Note note) {
        if (note.getId() == 0) {
            noteService.addNote(note);
        } else {
            noteService.updateNote(note);
        }
        return "redirect:/note";
    }

    @RequestMapping("remove/{id}")
    public String removeNote(@PathVariable("id") int id) {
        noteService.removeNote(id);
        return "redirect:/note";
    }

    @RequestMapping("/edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        model.addAttribute("note", noteService.getNoteId(id));

        return "notes";
    }
    @RequestMapping("/list")
    public String listNotes(Model model){
        List<Note> list = noteService.listNotes();
        model.addAttribute("list", list);
        return "notes";

    }

}
