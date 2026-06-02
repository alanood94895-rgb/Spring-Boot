package om.tra.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

        @GetMapping
        public String greeting(){
            return "Hi Alanoud";
        }

    @GetMapping ("books / names")
public List<String> books (){
    return Arrays.asList(
            "Old man",
            "The Little Prince",
            "The Book Thief",
            "Secret Garden"
    );
    }

    @GetMapping ("book / data")
public List<Book> bookData(){
    return Arrays.asList(
            new Book("Old man", "1111"),
            new Book("The Little Prince", "2222"),
            new Book("The Book Thief", "3333"),
            new Book("ecret Garden", "4444")

            );
    }
}

