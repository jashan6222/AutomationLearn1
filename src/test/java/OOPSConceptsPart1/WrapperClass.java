package OOPSConceptsPart1;

import org.apache.xpath.operations.Bool;

import javax.sound.midi.Soundbank;

public class WrapperClass {
    public static void main(String[] args) {
        String x="100";
        System.out.println(Integer.parseInt(x)+20);
        System.out.println(Double.parseDouble(x)+20);
        String k= "true";
        if(Boolean.parseBoolean(k))
        {
            System.out.println("Boolean converted");
        };
        int j = 200;
        System.out.println(String.valueOf(200)+200);
        //Convert unpure numeric value to String --> NumberFormatException
        String y="100A";
        Integer.parseInt(y);

    }
}

//Wrapper Classes Integer, Char, Boolean, Double

