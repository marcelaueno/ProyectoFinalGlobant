package com.Book.projectBook.Service;

import com.Book.projectBook.Model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserServiceInterface userServiceInterface;
    //    private AutoCloseable autoCloseable;
    private UserService underTest;

    @BeforeEach
    void setUp() {
//        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new UserService(userServiceInterface);
    }

    @Test
    void canCreateUser() {
        //given
        User user = new User(
                1L,
                "Federico",
                "Ueno",
                "federico@gmail.com",
                21212121
        );

        //when
        underTest.createUser(user);

        //then
        ArgumentCaptor<User> userArgumentCaptor =
                ArgumentCaptor.forClass(User.class);
        verify(userServiceInterface).save(userArgumentCaptor.capture());

        User captureUser = userArgumentCaptor.getValue();

        assertThat(captureUser).isEqualTo(user);
    }

    @Test
    void canUpdateUser() {
        //given

        //when

        //then

    }
}