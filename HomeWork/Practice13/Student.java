package HomeWork.Practice13;

public class Student {
    private String name;
    private int age;
    private float fraction;

    public Student() {
    }

    public Student(String name, int age, float fraction) {
        this.name = name;
        this.age = age;
        this.fraction = fraction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFraction(float fraction) {
        this.fraction = fraction;
    }

    public float getFraction() {
        return fraction;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fraction=" + fraction +
                '}';
    }





    }

