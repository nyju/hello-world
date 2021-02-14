package com.example.restfulwebservice.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserDaoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody  User user){
        // Post 메서드, put 과 같은 http 메서드에서 오브젝트형태의 데이터를 받기위해 매개변수 타입에 @RequestBody 선언해야함
        User saveUser = service.save(user);
    }
}
