package com.example.intellektaunittests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {TestConfig.class})
public class MyClassTest {

    @Test
    public void givenCorrectPath_whenImportUsersToList_thenDoesNotReturnException() {
        String path = "src/main/test_resources/users.txt";
        assertDoesNotThrow(() -> MyClass.importUsersToList(path));
    }

    @Test
    public void givenEmptyPath_whenImportUsersToList_thenDoesNotReturnException() {
        String path = "";
        assertDoesNotThrow(() -> MyClass.importUsersToList(path));
    }

    @Test
    public void givenNull_whenImportUsersToList_thenDoesNotReturnException() {
        assertDoesNotThrow(() -> MyClass.importUsersToList(null));
    }

    @Test
    public void givenIncorrectPath_whenImportUsersToList_thenDoesNotReturnException() {
        String path = "src/main/test_resources/users.txtt";
        assertDoesNotThrow(() -> MyClass.importUsersToList(path));
    }

    @Test
    public void givenIncorrectFile_whenImportUsersToList_thenDoesNotReturnException() {
        String path = "src/main/test_resources/users.js";
        assertDoesNotThrow(() -> MyClass.importUsersToList(path));
    }

    @Test
    public void givenEmptyFile_whenImportUsersToList_thenDoesNotReturnException() {
        String path = "src/main/test_resources/empty.txt";
        assertDoesNotThrow(() -> MyClass.importUsersToList(path));
    }

}
