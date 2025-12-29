package com.project.fitness.service;

import com.project.fitness.dto.RegisterRequest;
import com.project.fitness.dto.UserResponse;
import com.project.fitness.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import com.project.fitness.model.User;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

        private final UserRepository userRepository;

        public UserResponse register (RegisterRequest request){
            User user = User.builder()
                    .email(request.getEmail())
                    .firstName(request.getFirstName())
                    .lastName(request.getLastName())
                    .password(request.getPassword())
                    .build();

//           User user = new User(
//                   null,
//                   request.getEmail(),
//                   request.getPassword(),
//                   request.getFirstName(),
//                   request.getLastName(),
//                   Instant.parse("2025-12-28T14:49:41.208Z").atZone(ZoneOffset.UTC).toLocalDateTime(),
//                   Instant.parse("2025-12-28T14:49:41.208Z").atZone(ZoneOffset.UTC).toLocalDateTime(),
//                   List.of(),
//                   List.of()
//           );
           User savedUser = userRepository.save(user);
            return mapToResponse(savedUser);
        }

    private UserResponse mapToResponse(User savedUser) {
            UserResponse response = new UserResponse();
            response.setId(savedUser.getId());
            response.setEmail(savedUser.getEmail());
            response.setPassword(savedUser.getPassword());
            response.setFirstName(savedUser.getFirstName());
            response.setLastName(savedUser.getLastName());
            response.setCreatedAt(savedUser.getCreatedAt());
            response.setUpdatedAt(savedUser.getUpdateAt());
            return response;
    }
}
