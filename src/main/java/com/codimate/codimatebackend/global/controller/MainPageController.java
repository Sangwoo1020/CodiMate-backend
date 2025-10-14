package com.codimate.codimatebackend.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MainPageController {

    @GetMapping("/")
    public String mainPage(Model model) {
        // 샘플 코디 데이터 생성 (더미 데이터)
        List<Map<String, Object>> coords = new ArrayList<>();

        coords.add(Map.of(
                "id", 1,
                "title", "봄날 캐주얼 룩",
                "description", "화이트 셔츠 + 데님 팬츠 + 스니커즈",
                "imagePath", "/image/mainpage/sample1.png",
                "weather", "☀️ 22°C",
                "category", "casual",
                "rating", 4.8
        ));

        coords.add(Map.of(
                "id", 2,
                "title", "클래식 오피스 룩",
                "description", "네이비 블레이저 + 화이트 셔츠 + 슬랙스",
                "imagePath", "/image/mainpage/sample2.png",
                "weather", "🌤️ 18°C",
                "category", "business",
                "rating", 4.5
        ));

        coords.add(Map.of(
                "id", 3,
                "title", "로맨틱 데이트 룩",
                "description", "플라워 원피스 + 가디건 + 플랫슈즈",
                "imagePath", "/image/mainpage/sample3.png",
                "weather", "🌸 20°C",
                "category", "date",
                "rating", 4.9
        ));

        coords.add(Map.of(
                "id", 4,
                "title", "미니멀 스트리트 룩",
                "description", "오버사이즈 후드 + 와이드 팬츠 + 운동화",
                "imagePath", "/image/mainpage/sample4.png",
                "weather", "☁️ 16°C",
                "category", "casual",
                "rating", 4.3
        ));

        coords.add(Map.of(
                "id", 5,
                "title", "엘레간트 포멀",
                "description", "블랙 원피스 + 하이힐 + 클러치백",
                "imagePath", "/image/mainpage/sample5.png",
                "weather", "🌙 15°C",
                "category", "formal",
                "rating", 4.7
        ));

        coords.add(Map.of(
                "id", 6,
                "title", "모던 비즈니스",
                "description", "베이지 트렌치 + 블라우스 + 펌프스",
                "imagePath", "/image/mainpage/sample6.png",
                "weather", "🌅 19°C",
                "category", "business",
                "rating", 4.4
        ));

        coords.add(Map.of(
                "id", 7,
                "title", "편안한 주말 룩",
                "description", "니트 탑 + 청바지 + 로퍼",
                "imagePath", "/image/mainpage/sample7.png",
                "weather", "🌤️ 23°C",
                "category", "casual",
                "rating", 4.2
        ));

        coords.add(Map.of(
                "id", 8,
                "title", "캐주얼 데이트 룩",
                "description", "스웨터 + 미니스커트 + 부츠",
                "imagePath", "/image/mainpage/sample8.png",
                "weather", "🌊 21°C",
                "category", "date",
                "rating", 4.6
        ));

        // 모델에 데이터 추가
        model.addAttribute("coords", coords);

        return "mainpage/mainpage";
    }
}