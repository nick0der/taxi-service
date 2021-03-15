package com.example.taxiservice.controller;

        import com.example.taxiservice.dto.ChiefRequest;
        import com.example.taxiservice.entity.Chief;
        import com.example.taxiservice.services.ChiefService;
        import lombok.RequiredArgsConstructor;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/chiefs")
public class V1ChiefController {

    private final ChiefService service;

    @GetMapping
    public List<Chief> getAll(@RequestParam Integer size,
                              @RequestParam(required = false, defaultValue = "1") Integer page){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Chief get(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Chief create(@RequestBody ChiefRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public Chief update(@PathVariable Long id, @RequestBody ChiefRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
