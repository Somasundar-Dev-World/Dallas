package com.social.mstech.needs.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.mstech.needs.common.Constants;
import com.social.mstech.needs.dto.request.Group;
import com.social.mstech.needs.dto.response.CreateGroupResponse;
import com.social.mstech.needs.service.GroupService;

/**
 * Controller class.
 * 
 * @author Somasundaram Munirathnam
 *
 */
@RestController
@RequestMapping("/groups/action")
public class GroupController {

	@Autowired
	private GroupService groupService;

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
	public @ResponseBody CreateGroupResponse createGroup(@RequestBody Group group) {

		System.out.println("Received the request...");

		groupService.addGroup(group);
		CreateGroupResponse response = new CreateGroupResponse();
		response.setStatusCode(Constants.HTTP_STATUS_OK);
		response.setStatusMessage(Constants.HTTP_STATUS_SUCCESS + " Soma...!");
		System.out.println("Completed the request.");

		return response;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
	public @ResponseBody CreateGroupResponse updateGroup() {

		CreateGroupResponse response = new CreateGroupResponse();
		// response.setStatus(CommonUtils.createSuccessStatus());
		return response;
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
	public @ResponseBody CreateGroupResponse getGroup() {

		CreateGroupResponse response = new CreateGroupResponse();
		// response.setStatus(CommonUtils.createSuccessStatus());
		return response;
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
	public @ResponseBody CreateGroupResponse getAlGroups() {

		CreateGroupResponse response = new CreateGroupResponse();
		// response.setStatus(CommonUtils.createSuccessStatus());
		return response;
	}
}
