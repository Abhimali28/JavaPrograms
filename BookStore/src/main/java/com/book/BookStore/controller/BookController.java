package com.book.BookStore.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.book.BookStore.entity.Book;
//import com.book.BookStore.service.BookService;
         
@Controller
public class BookController {
	
//	@Autowired
//	private BookService service;
	
@GetMapping("/")
public String home()
{
	return "home";
}
@GetMapping("/book_register")
public String bookregister()
{
	return "bookRegister";
}
@GetMapping("/available_books")
public String getAllBook()
{
	return "booklist";
}
//@PostMapping("/save")
//public String Addbook(@ModelAttribute Book b)
//{
//	service.save(b);
//	return "redirect:/available_books";
//			
//}
}

