package com.example.restfulwebservice.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public User retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);

        if (user == null) {
            throw new UserNotFoundException(String.format("ID[%s] not found", id));
        }
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        // Post 메서드, put 과 같은 http 메서드에서 오브젝트형태의 데이터를 받기위해 매개변수 타입에 @RequestBody 선언해야함
        User saveUser = service.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest() // 현재 요청되어진 request 값 사용
                .path("/{id}") // 반환시켜주고자 하는 path
                .buildAndExpand(saveUser.getId()) // 가변번수 id에 새롭게 만들어진 id값 지정
                .toUri(); // uri 형태로 변경

        return ResponseEntity.created(location).build();
    }
}
