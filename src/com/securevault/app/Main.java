package com.securevault.app;
import com.securevault.core.VaultItem;
import com.securevault.specialty.FragileItem;

public class Main {
    static void main() {
		try{
			FragileItem vase = new FragileItem("vase",12.0, true);
			VaultItem sword = new VaultItem("Sword",50.50);
			System.out.println("Hello World!");
			System.out.println(sword.toString());
			System.out.println(vase.toString());
			FragileItem broken = new FragileItem("broken",0, false);
		}
		catch(Exception e){
			System.out.println(e);
		}
    }
}
