package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo(); // Single Inheritance 
		birds.animalInfo(); 
		
		System.out.println("\n----------------------------------------------------\n");
		Bulldog bulldog = new Bulldog();
		bulldog.bulldogInfo(); 
		bulldog.dogInfo();
		bulldog.mammalInfo(); // Multi-Level Inheritance
		bulldog.animalInfo(); //Hierarchical Inheritance
		
		System.out.println("\n----------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo(); 
		cobra.snakeInfo();
		cobra.reptileInfo(); // Multi-Level Inheritance 
		cobra.animalInfo(); //Hierarchical Inheritance 
		
		
		System.out.println("\n----------------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo(); // Multi-Level Inheritance
		dog.animalInfo(); // Hierarchical Inheritance
		
		System.out.println("\n----------------------------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo(); // child class
		mammal.animalInfo(); // parent class
		
		System.out.println("\n----------------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo(); // Single Inheritance 
		reptile.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();  // Multi-Level Inheritance
		robin.animalInfo(); //Hierarchical Inheritance
		
		System.out.println("\n----------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo(); // Multi-Level Inheritance
		snake.animalInfo(); //Hierarchical Inheritance
		
		
		
	
		
		
		
		
	}
}
