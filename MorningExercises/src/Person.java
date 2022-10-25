public class Person {

    //fields
    private String name;
    private int age;



    //constructors

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //business methods
    public String getPersonInfo(){
        return name;
    }

    //access methods

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


    //toString methods


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
