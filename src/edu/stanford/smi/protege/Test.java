package edu.stanford.smi.protege;

/**
 * Created by hru066 on 23.02.2017.
 */
public class Test {
    public static final char SEPARATOR = ' ';
    public static void main(String[] args){
        String raw = "     a marianne     ali";
          String rawValue = raw.trim();

        int index = rawValue.indexOf(SEPARATOR);

        if (index == -1) { // no separator - should not be the case
            System.out.println("No seperator");
        }
        else {
            String[] tokens = rawValue.split(Character.toString(SEPARATOR));
            String datatypeName;
            if(tokens[0].length() == 1) {
                datatypeName = rawValue.substring(1, index);
            }
            else{
                datatypeName =  rawValue.substring(2, index);
            }
            System.out.println("========\n Datatype name: " + datatypeName);
        }
    }
}
