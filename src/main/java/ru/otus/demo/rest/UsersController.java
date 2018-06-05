package ru.otus.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class UsersController {

    @GetMapping("/users")
    public List<UserDto> allUsers() {
        return Collections.singletonList(new UserDto() {{
            setId("01");
            setName("Ivan");
        }});
    }
}
