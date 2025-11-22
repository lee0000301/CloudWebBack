package org.example.community.controller;

import org.example.community.model.User;
import org.example.community.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 로그인 상태 확인용 (프론트에서 사용자 ID만 필요)
    @GetMapping("/current")
    public User getCurrentUser() {
        // 임시: 인증 시스템 연동 전까지는 첫 번째 사용자 반환
        Optional<User> user = userService.getFirstUser();
        return user.orElse(null);
    }
}
