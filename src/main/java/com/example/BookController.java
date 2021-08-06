package com.example;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Get;

import javax.validation.Valid;
import java.util.UUID;

@Controller("/books")
public class BookController {

    @Post
    public BookSaved save(@Valid @Body Book book) {
        BookSaved bookSaved = new BookSaved();
        bookSaved.setName(book.getName());
        bookSaved.setIsbn(UUID.randomUUID().toString());
        return bookSaved;
    }

    @Get
    public String get() {
        return "{ \"hello\": \"there\" } ";
    }
}
