package DZ_1;

public abstract class Man {
    public String name;
    public String surname;
    public int age;

    public Man(String name, String surname, int age) {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +" "+ surname+" мне "+ age +" лет";
    }
    public void Say() {
        System.out.println("Я говорю");
    }
    public void Go() {
        System.out.println("Я иду");
    }
    public void Drink() {
        System.out.println("Я пью");
    }
    public void Eat() {
        System.out.println("Я ем");
    }

}
