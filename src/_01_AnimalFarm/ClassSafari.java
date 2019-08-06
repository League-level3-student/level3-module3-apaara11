package _01_AnimalFarm;

import java.util.ArrayList;

public class ClassSafari {
	
	public static void main(String[] args) {
		ArrayList <Animal> Safari = new ArrayList <Animal>();
		Safari.add(new Elephant());
		Safari.add(new Zebra());
		Safari.add(new Giraffe());
		Safari.add(new Rhino());
		
		for(int i=0; i<Safari.size(); i++) {
			Safari.get(i).makeNoise();
		}
	}
}
