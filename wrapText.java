import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int maxLength=10,i=0,currLine=0;
        String given= "navigate to a live sports event from main page" ;
        String[] arrayStrings = given.split(" ");
        //System.out.println(arrayStrings.length);
        StringBuilder strNew=new StringBuilder("");
        while( i<arrayStrings.length ){
            while( i< arrayStrings.length && (currLine + arrayStrings[i].length()) < maxLength ){
                currLine += arrayStrings[i].length()+1;
                strNew.append(arrayStrings[i++]+ " ");
            }
            currLine = 0;
            strNew.append("\n");
        }
        System.out.println(strNew.toString());   
    }
}
