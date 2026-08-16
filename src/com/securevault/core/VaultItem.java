package com.securevault.core;
import com.securevault.exceptions.InvalidValueException;

public class VaultItem {
    //Attributes
    private String itemName;
    private double itemValue;
    //Methods
    public VaultItem(String name, double value) throws InvalidValueException{
		if(value == 0){
			throw new InvalidValueException("Value cannot be Zero!");
		}
        itemName = name;
        itemValue = value;
    }
    protected double getItemValue(){
        return itemValue;
    }
    protected String getItemName(){
        return itemName;
    }
    @Override
    public String toString(){
        String str = "Item: %s, Value: $%f";
        return String.format(str,itemName,itemValue);
    }
}
