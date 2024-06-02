package com.jwt.example.JwtExample.models;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JwtResponse {


    private String jwtToken;

    private String userName;
}
