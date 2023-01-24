package com.example.payroll;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
class BookRepositoryTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    BookRepository bookRepository;


    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        String bookTitle = "Test";
        when(bookRepository.getAllBooks()).thenReturn(List.of(new Book(bookTitle, "", 2022)));
        this.mockMvc.perform(get("/books")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString(bookTitle)));
    }

    @Test
    public void shouldReturnBadRequest() throws Exception {

        this.mockMvc.perform(post("/books")).andDo(print()).andExpect(status().isBadRequest());
    }

    @Test
    public void shouldReturnNotFound() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isNotFound());
    }
}