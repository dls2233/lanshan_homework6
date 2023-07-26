package com.example.lanshan_homework6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class students {
    private String student_no;//学号
    private String institute;//学院
    private int grade;//年级
    private String class_;//班级
    private String name;//姓名
    private String username;//用户名
    private String password;//密码

    @Override
    public String toString() {
        return "students{" +
                "student_no='" + student_no + '\'' +
                ", institute='" + institute + '\'' +
                ", grade=" + grade +
                ", class_='" + class_ + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
