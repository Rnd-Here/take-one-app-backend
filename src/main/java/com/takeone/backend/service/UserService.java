package com.takeone.backend.service;

import com.takeone.backend.dto.UserDto;
import com.takeone.backend.entity.User;
import com.takeone.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> findByFirebaseUid(String uid) {
        return userRepository.findByUid(uid);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public UserDto mapUserToDto(User user) {
        if (user == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setUid(user.getUid());
        userDto.setUsername(user.getUsername());
        userDto.setDisplayName(user.getDisplayName());
        userDto.setEmail(user.getEmail());
        userDto.setMobile(user.getMobile());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setProfilePictureUrl(user.getProfilePictureUrl());
        userDto.setAccountType(user.getAccountType());
        userDto.setIsPortfolioCreated(user.getIsPortfolioCreated());
        return userDto;
    }
}
