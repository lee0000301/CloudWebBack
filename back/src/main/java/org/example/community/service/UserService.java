package org.example.community.service;

import org.example.community.model.User;
import org.example.community.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 회원가입
    public User register(User user) {
        return userRepository.save(user);
    }

    // 현재 로그인 사용자 반환 (예제용: DB 첫 번째 사용자)
    public Optional<User> getFirstUser() {
        return userRepository.findAll().stream().findFirst();
    }
}
