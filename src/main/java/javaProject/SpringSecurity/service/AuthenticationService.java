package javaProject.SpringSecurity.service;


import javaProject.SpringSecurity.dao.request.SignInRequest;
import javaProject.SpringSecurity.dao.request.SignUpRequest;
import javaProject.SpringSecurity.dao.request.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
