package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/pencils")
public class PencilController {

    @Autowired
    private PencilRepo pencilRepo;

    @GetMapping
    public ResponseEntity<List<String>> retrieveAllPencils() {

        List<String> pencils = pencilRepo.getPencils();

        return new ResponseEntity<>(pencils, HttpStatus.OK);
    }
}
