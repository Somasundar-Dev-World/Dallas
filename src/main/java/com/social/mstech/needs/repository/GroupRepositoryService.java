package com.social.mstech.needs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.social.mstech.needs.dto.request.Group;

@Service
public interface GroupRepositoryService extends MongoRepository<Group, String> {

}
