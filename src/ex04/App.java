package ex04;

import ex04.teacher.HtmlTeacher;
import ex04.teacher.PythonTeacher;
import ex04.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher jt = new HtmlTeacher();
        jt.수업하기();
    }
}
