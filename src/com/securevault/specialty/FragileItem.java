package com.securevault.specialty;
import com.securevault.core.VaultItem;

public class FragileItem extends VaultItem{
    //attributes
    private boolean isWrapped;
    //methods
    public FragileItem(String name,double value, boolean wrapped){
        super(name,value);
        isWrapped = wrapped;
    }
    @Override
    public String toString(){
		String str = "Item: %s, Value: $%f, Wrapped: %B";
		return String.format(str, this.getItemName(), this.getItemValue(), isWrapped);
	}
}
