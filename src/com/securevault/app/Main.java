package com.securevault.app;
import com.securevault.core.VaultItem;
import com.securevault.specialty.FragileItem;
import com.securevault.core.VaultManager;

public class Main {
    static void main() {
		try{
			VaultManager vault = new VaultManager();
			vault.printItems();
			vault.sortItems();
			vault.printItems();
		}
		catch(Exception e){
			System.out.println(e);
		}
    }
}
