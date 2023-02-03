package com.project.gongyeon2jo.performance.controller;

import com.project.gongyeon2jo.performance.entity.Performance;
import com.project.gongyeon2jo.performance.model.PerformanceInput;
import com.project.gongyeon2jo.performance.service.PerformanceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Slf4j /*에러 화면에 띄우기 위해*/
@RequiredArgsConstructor
@Controller
public class PerformanceController {

    private final PerformanceService performanceService;

    // 공연 목록 띄우기
    @GetMapping("/")
    public String performanceList(Model model) {
        List<Performance> lists = performanceService.listAll();
        model.addAttribute("lists", lists);
        return "/index1";
    }

    // 공연 추가하기
    @GetMapping("/performance/add")
    public String performanceAdd() {
        return "performance/add";
    }

    /*경로*/
    String getNewSaveFile(String basePath, String originalFilename) {

        LocalDate now = LocalDate.now();

        // 경로 생성
        String[] dirs = {
                String.format("%s/%d/", basePath, now.getYear()),
                String.format("%s/%d/%02d/", basePath, now.getYear(), now.getMonthValue()),
                String.format("%s/%d/%02d/%02d/", basePath, now.getYear(), now.getMonthValue(), now.getDayOfMonth())};

        // 파일 생성
        for (String dir : dirs) {
            File file = new File(dir);
            if (!file.isDirectory()) {
                file.mkdir(); // 디렉토리 생성
            }
        }

        // 앞 이름은 날짜로 내가 임의로 파일이름 만들지만 확장자는 정해져 있기 떄문에 가져와서 사용해야 함
        String fileExtension = "";
        if (originalFilename != null) {
            // .을 기준으로 구분
            int dotPosition = originalFilename.lastIndexOf("."); // .에 대한 위치 가져옴
            if (dotPosition > -1) { // 존재하면
                fileExtension = originalFilename.substring(dotPosition + 1); // 파일 확장자
            }
        }

        // 파일 확장자가 없는 경우도 있으므로 파일 확장자가 있는 경우에만 아래를 실행
        String uuid = UUID.randomUUID().toString().replaceAll("-", ""); // 실제 파일명
        String newFilename = String.format("%s%s", dirs[2], uuid);
        if (fileExtension.length() > 0) {
            newFilename += "." + fileExtension;
        }

        return newFilename;
    }

    @PostMapping("/performance/add")
    public String showAddSubmit(Model model,
                                MultipartFile file, /*파일 받기 위해 띄움!! file로 받아야함!!!!*/
                                PerformanceInput parameter) {

        /* poster(첨부 파일) 올리기 */
        String saveFilename = "";

        if (file != null) {

            // 확장자 넘겨주기 위해
            String originalFilename = file.getOriginalFilename();

            String basePath = "C:/Users/김민지/Documents/THEVINEHALL_final/src/main/webapp/posters";
            saveFilename = getNewSaveFile(basePath, originalFilename);

            try {
                File newFile = new File(saveFilename);
                FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(newFile));
            } catch (IOException e) {
                log.info("################## -1 ");
                log.info(e.getMessage());
            }
        }

        parameter.setPoster(saveFilename); // 여기까지는 서버와 db로 파일명 올리는데 까지 했다!!
        // 웹에서 파일을 보이게 하는 건 더 기능이 필요하다!! -> 보통 target 폴더를 이용하지만 이번에는
        // 톰캣을 이용하여 웹에 파일을 띄우겠다!!

        boolean result = performanceService.add(parameter);
        model.addAttribute("result", result);

        return "performance/addComplete";
    }

    // 공연 상세보기
    @GetMapping("/performance/detail") // localhost:8080/performance/detail?id=1
    public String detail(Model model, int id) {

        //*list 가 아니다!! 데이터 딱 한줄이 필요하므로!!*//*
        Performance detail = performanceService.detail(id);
        model.addAttribute("detail", detail);

        return "/performance/detail";
    }
}