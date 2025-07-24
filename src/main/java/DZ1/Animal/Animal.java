package DZ1.Animal;

public abstract class Animal{
    protected String name;

    public Animal(String animalName){
        this.name = animalName;
    }

    protected abstract void info();
    
}
