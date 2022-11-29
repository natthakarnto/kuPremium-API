package th.ac.ku.cakeAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.cakeAPI.model.Cakes;
import th.ac.ku.cakeAPI.service.CakesService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cakes")
public class CakesController {

    @Autowired
    private CakesService service;

    @GetMapping
    public List<Cakes> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Cakes create(@RequestBody Cakes cakes){
        return service.create(cakes);
    }

    @GetMapping("/{id}")
    public Cakes getCakes(@PathVariable UUID id){
        return service.getCakes(id);
    }

    @PutMapping("/{id}")
    public Cakes update(@PathVariable UUID id, @RequestBody Cakes cakes){
        return service.update(id, cakes);
    }

    @DeleteMapping("/{id}")
    public Cakes delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
