package com.planetj.filehandling;

import java.util.Arrays;

public class HashCodeImpl {

    private boolean aBoolean;
    private byte aByte;
    private char aChar;
    private short aShort;
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private FileDemo fileDemo;
    private int [] oneDArray;
    private int [][] twoDArray;
    private String aString;

    @Override
    public int hashCode(){

        int result = 11, factor = 53;

        result = factor * result + Boolean.hashCode(aBoolean);
        result = factor * result + Byte.hashCode(aByte);
        result = factor * result + Character.hashCode(aChar);
        result = factor * result + Integer.hashCode(anInt);
        result = factor * result + Long.hashCode(aLong);
        result = factor * result + Float.hashCode(aFloat);
        result = factor * result + Double.hashCode(aDouble);
        result = factor * result + fileDemo.hashCode();
        result = factor * result + Arrays.hashCode(oneDArray);
        result = factor * result + Arrays.deepHashCode(twoDArray);
        result = factor * result + aString.hashCode();
        return result;
    }


}
