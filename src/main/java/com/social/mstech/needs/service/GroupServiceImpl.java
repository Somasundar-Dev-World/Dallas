package com.social.mstech.needs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.mstech.needs.dto.request.Group;
import com.social.mstech.needs.repository.GroupRepositoryService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	GroupRepositoryService groupRepository;

	@Override
	public void addGroup(Group group) {

		Group save = groupRepository.save(group);

	}

}
