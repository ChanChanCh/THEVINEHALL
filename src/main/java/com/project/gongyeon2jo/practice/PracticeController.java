package com.project.gongyeon2jo.practice;


import com.project.gongyeon2jo.performance.model.PerformanceInput;
import com.project.gongyeon2jo.performance.service.PerformanceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Slf4j /*에러 화면에 띄우기 위해*/
@RequiredArgsConstructor
@Controller
public class PracticeController {

    private final PracticeService practiceService;

    @GetMapping("/practice")
    public String ticketing() {
        return "practice/practice";
    }

    @PostMapping("/practice")
    public String showAddSubmit(Model model,
                                PracticeInput parameter) {

        boolean result = practiceService.add(parameter);
        model.addAttribute("result", result);

        return "practice/practice";
    }

    @GetMapping("/practice/list")
    public String list(Model model) {

        List<Practice> lists = practiceService.listAll();

        model.addAttribute("lists", lists);

        return "practice/list";
    }

    @GetMapping("/practice/detail") // localhost:8080/board/detail?id=1
    public String detail(Model model, int id) { //=> list.html에서 name = id로 넘겨줌

        Practice detail = practiceService.detail(id);
        model.addAttribute("detail", detail);

        return "/practice/detail";
    }





    @GetMapping("/practice2")
    public String ticketing2() {
        return "practice/practice2";
    }

    @PostMapping("/practice2")
    public String showAddSubmit2(Model model,
                                PracticeInput2 parameter, int id
    /*Practice practice*/) {

        boolean result = practiceService.add2(parameter, id);
        model.addAttribute("result", result);

        return "practice/practice2";
    }

}
