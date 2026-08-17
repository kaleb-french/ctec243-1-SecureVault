package com.securevault.core;
import com.securevault.core.VaultItem;
import com.securevault.specialty.FragileItem;
import java.util.Random;

public class VaultManager{
	//atributes
	private VaultItem[] items = new VaultItem[10];
	private String[] objects = {"Chair","Lamp","Vase","Laptop","Phone","Poster","Fan"};
	private String[] colors = {"Blue","Red","Green","Yellow","Pink","Purple","Brown"};
	//methods
	public VaultManager()throws Exception{
		Random rand = new Random();
		for(int i = 0; i < 10; i++){
			boolean fragile = rand.nextBoolean();
			if(fragile != true){
				items[i] = new VaultItem(colors[rand.nextInt(colors.length)] + " " + objects[rand.nextInt(objects.length)], rand.nextDouble() * 100.0);
			}
			else{
				items[i] = new FragileItem(colors[rand.nextInt(colors.length)] + " " + objects[rand.nextInt(objects.length)], 0.1 + rand.nextDouble() * 99.99, rand.nextBoolean());
			}
		}
	}
	public void sortItems(){
		//outterloop
		int min;
		for(int i = 0; i < items.length; i++){
			min = i;
			for(int j = 1 + i; j < items.length; j++){
				if(items[min].getItemValue() > items[j].getItemValue()){
					min = j;
				}
			}
			VaultItem temp = items[i];
			items[i] = items[min];
			items[min] = temp;
			
		}
	}
	public void printItems(){
		System.out.println("Vault Items- NAME- VALUE");
		for(int i = 0; i < items.length ; i++){
			System.out.println(String.format(" %d. " + items[i].toString(), i + 1));
		}
		System.out.println("items value in ascending order.");
	}
}
