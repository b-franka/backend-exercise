package com.codecool.backend.service;

import com.codecool.backend.service.serviceinterface.AvatarService;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class AvatarRandomServiceImpl implements AvatarService {

    private static final String RANDOM_URL = "https://randomuser.me/api/portraits/men/{0}.jpg";

    @Override
    public String getUrlByUser(Long userId) {
        return MessageFormat.format(RANDOM_URL, userId);
    }
}
