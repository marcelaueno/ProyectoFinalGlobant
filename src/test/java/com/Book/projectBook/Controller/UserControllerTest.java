package com.Book.projectBook.Controller;

import com.Book.projectBook.Model.User;
import com.Book.projectBook.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.runner.RunWith;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mvc;
    
    @MockBean
    private UserRepository userRepository;
    private User id;
    
    @Test
    void createUserWhenMethodsPost() throws Exception {

        User userTest = new User(1l,"Federico","Ueno","federico@gmail.com",21212121);

        given(userRepository.save(ArgumentMatchers.any(User.class))).willReturn(userTest);

        String jsonBody = "{\"id\": 1,\"name\": \"Federico\", \"lastname\": \"Ueno\", \"email\": \"federico@gmail.com\", \"documentNumber\": \"21212121\"}";

        mvc.perform(post("/createUser"))
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

    @Test
    void updateUserWhenUserIsPresent() throws  Exception {

        User userTest = new User(1l,"Federico","Ueno","federico@gmail.com",21212121);

        given(userRepository.findById(userTest.getId())).willReturn(Optional.of(userTest);

        String jsonBody = "{\"id\": 1,\"name\": \"Federico\", \"lastname\": \"Ueno\", \"email\": \"federico@gmail.com\", \"documentNumber\": \"21212121\"}";

        mvc.perform(post("/updateUser"))
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().json("{\"id\": 1,\"name\": \"Federico\", \"lastname\": \"Ueno\", \"email\": \"federico@gmail.com\", \"documentNumber\": \"21212121\"}"))
                .andExpect(status().isOk());

    }
}