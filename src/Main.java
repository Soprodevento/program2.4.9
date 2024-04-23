//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JavaStudent student = new JavaStudent();
        student.study();
    }
    public static class Student {
        protected  final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }
    public static class JavaStudent extends Student {
        public JavaStudent(String work){
            super(work);
        }
        public JavaStudent(){
            this("Прохожу курс по Java");
        }

    }

}
