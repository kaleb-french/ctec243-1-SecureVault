package com.securevault.core;

public class VaultItem {
    //Attributes
    private String itemName;
    private double itemValue;
    //Methods
    public VaultItem(String name, double value){
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
