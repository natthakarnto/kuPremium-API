//package th.ac.ku.cakeAPI.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import th.ac.ku.cakeAPI.service.AdminService;
//
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//@RequestMapping("/admin")
//
//public class AdminController {
//    @Autowired
//    private AdminService service;
//
//    @GetMapping
//    public List<Admin> getAll(){
//        return service.getAll();
//    }
//
//    @PostMapping
//    public Admin create(@RequestBody Admin admin){
//        return service.create(admin);
//    }
//
//    @GetMapping("/{id}")
//    public Admin getUser(@PathVariable UUID id){
//        return service.getAdmin(id);
//    }
//
//    @PutMapping("/{id}")
//    public Admin update(@PathVariable UUID id ,@RequestBody Admin admin){
//        return service.update(id, admin);
//    }
//
//    @DeleteMapping("/{id}")
//    public Admin delete(@PathVariable UUID id){
//        return service.delete(id);
//    }
//}
