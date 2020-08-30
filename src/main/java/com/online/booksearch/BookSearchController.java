package com.online.booksearch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookSearchController {
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchBook(@RequestParam("name") String bookName){
       return bookName+" is Available";
    }
}
