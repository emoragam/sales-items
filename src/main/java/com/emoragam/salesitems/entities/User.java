package com.emoragam.salesitems.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "users")
@Setter
@Getter
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String username;
    private String password;
}
