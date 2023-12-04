package tp.ensim.TPINFO2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatabaseController {
    @GetMapping("/database")
    public String showConsole() {
        return "database";
    }
}
