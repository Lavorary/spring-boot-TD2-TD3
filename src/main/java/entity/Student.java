package entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Student {
    private String reference;
    private String firstName;
    private String lastName;
    private int age;
}
