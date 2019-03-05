package pl.ideas.ideastorage;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IdeaController {
    private IdeaRepository repository;
    public IdeaController(IdeaRepository repository) {this.repository = repository;}


    @GetMapping("/cool-cars")
    public Collection<Idea> coolIdea() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}
