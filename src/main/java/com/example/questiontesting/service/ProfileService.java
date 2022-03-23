package com.example.questiontesting.service;

import com.example.questiontesting.dto.ProfileDto;
import com.example.questiontesting.entity.Profile;
import com.example.questiontesting.exception.NotFoundProfileException;
import com.example.questiontesting.repositories.ProfileRepository;
import com.example.questiontesting.util.Mapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {
    private ProfileRepository profileRepository;

    private Mapper mapper;

    public ProfileService(ProfileRepository profileRepository, Mapper mapper) {
        this.profileRepository = profileRepository;
        this.mapper = mapper;
    }

    public ProfileDto getById(Long id){
        Profile profile = profileRepository.findById(id).orElseThrow(() -> new NotFoundProfileException(id));
        ProfileDto profileDto = mapper.mapper(profile, ProfileDto.class);
        mapper.mapper(profileDto, Profile.class);
        return profileDto;
    }
}
