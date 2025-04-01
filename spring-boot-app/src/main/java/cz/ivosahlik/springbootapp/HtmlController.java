package cz.ivosahlik.springbootapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class HtmlController {

    @RequestMapping("/{page:^(?!.*[.].*$).*$}")
    public String requestPage(@PathVariable("page") String page) {
        String htmlPage = "/"+page+".html";
        log.info("forwarding request to {}", htmlPage);
        return htmlPage;
    }
}
