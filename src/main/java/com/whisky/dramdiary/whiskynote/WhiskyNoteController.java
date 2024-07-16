package com.whisky.dramdiary.whiskynote;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class WhiskyNoteController {

    private final WhiskyNoteRepository repository;

    public WhiskyNoteController(WhiskyNoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all-whisky-notes")
    public List<WhiskyNote> retrieveAllWhiskyNotes() {
        return repository.findAll();
    }

    @GetMapping("/whisky-note/{id}")
    public Optional<WhiskyNote> retrieveWhiskyNote(@PathVariable int id) {
        return repository.findById(id);
    }

    @PostMapping("/whisky-note")
    public ResponseEntity<WhiskyNote> addWhiskyNote(@RequestBody WhiskyNote diary) {
        WhiskyNote savedDiary = repository.save(diary);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedDiary.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/whisky-note/{id}")
    public void deleteWhiskyNote(@PathVariable int id) {
        repository.deleteById(id);
    }
}
