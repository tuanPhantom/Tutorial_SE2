package ex1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException{
        if (name.length() > 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }

        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }

        this.name = name;
        this.age = age;
    }

    /**
     * @effects return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name.length() > 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    /**
     * @effects return age
     */
    public int getAge() {
        return age;
    }

    protected void setAge(int age) throws IllegalArgumentException {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append("{").append(String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge())).append("}");
        return sb.toString();
    }
}
