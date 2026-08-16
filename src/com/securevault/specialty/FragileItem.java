package com.securevault.specialty;
import com.securevault.core.VaultItem;
import com.securevault.exceptions.InvalidValueException;

public class FragileItem extends VaultItem{
    //attributes
    private boolean isWrapped;
    //methods
    public FragileItem(String name,double value, boolean wrapped)throws InvalidValueException{
        super(name,value);
        isWrapped = wrapped;
    }
    @Override
    public String toString(){
		String str = "Item: %s, Value: $%f, Wrapped: %B";
		return String.format(str, this.getItemName(), this.getItemValue(), isWrapped);
	}
}
