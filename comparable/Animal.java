package Comparable;

public class Animal implements Comparable<Animal> {

	public String name;
    public long yearDiscovered;
    public String population;

    public Animal(String name, long yearDiscovered, String population){
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.population = population; 
        }

    public String toString(){
        String s = "Animal name: "+ name+"\nYear Discovered: "+yearDiscovered+"\nPopulation: "+population;
        return s;
    }

	@Override
	public int compareTo(Animal anam) {
		return (int) (this.yearDiscovered - anam.yearDiscovered);
	}
}
