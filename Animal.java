public class Animal {
    private String nombre;
    private int edad;
    private String especie;
    private boolean vacunado;

    // Constructor sin argumentos
    public Animal() {}

    // Constructor con argumentos
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.vacunado = false;
    }

    // Método para vacunar al animal
    public void vacunar() {
        this.vacunado = true;
    }

    // Método para obtener el estado de vacunación
    public boolean isVacunado() {
        return this.vacunado;
    }

    // Método para obtener la información del animal
    public String getInfo() {
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", Especie: " + this.especie + ", Vacunado: " + this.vacunado;
    }
}

class Cria extends Animal {
    private Animal madre;

    // Constructor con argumentos
    public Cria(String nombre, int edad, String especie, Animal madre) {
        super(nombre, edad, especie);
        this.madre = madre;
    }

    // Método para obtener la información de la madre
    public String getMadreInfo() {
        return "Madre: " + this.madre.getInfo();
    }
}

class Zoo {
    private Animal[] animales;

    // Constructor con argumentos
    public Zoo(Animal[] animales) {
        this.animales = animales;
    }

    // Método para vacunar a todos los animales
    public void vacunarTodos() {
        for (Animal animal : this.animales) {
            animal.vacunar();
        }
    }

    // Método para obtener la información de todos los animales
    public String getInfo() {
        String info = "";
        for (Animal animal : this.animales) {
            info += animal.getInfo() + "\n";
        }
        return info;
    }
}

class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("Fido", 3, "Perro");
        Animal gato = new Animal("Mittens", 2, "Gato");
        Cria cria = new Cria("Puppy", 1, "Perro", perro);

        Animal[] animales = {perro, gato, cria};

        Zoo zoo = new Zoo(animales);

        System.out.println(zoo.getInfo());

        zoo.vacunarTodos();

        System.out.println(zoo.getInfo());
    }
}
