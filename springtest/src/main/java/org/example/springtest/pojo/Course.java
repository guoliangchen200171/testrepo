package org.example.springtest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private Long id;
    private String name;
    private String courseCode;
    private Integer credits;
    private String instructor;

}
