package ex1;

public class Child extends Person{
    public Child(String name, int age){
        super(name, age);
    }

    @Override
    protected void setAge(int age) throws IllegalArgumentException {
        //TODO: Validate the age
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must\n" +
                    "be lesser than 15!\"");
        }
        super.setAge(age);
    }
}
