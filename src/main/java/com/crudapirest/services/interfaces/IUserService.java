package com.crudapirest.services.interfaces;

import com.crudapirest.controllers.dtos.requests.CreateUserRequest;
import com.crudapirest.controllers.dtos.requests.UpdateUserRequest;
import com.crudapirest.controllers.dtos.responses.GetUserResponse;

import java.util.List;

public interface IUserService {
    GetUserResponse get(Long id);

    List<GetUserResponse> list();

    void delete(Long id);

    GetUserResponse create(CreateUserRequest request);

    GetUserResponse update(Long id, UpdateUserRequest request);
}
