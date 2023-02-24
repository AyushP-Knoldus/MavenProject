package com.knoldus;

public class StringManipulating
{ String userinput="";
    StringManipulating(String userinput){
        this.userinput=userinput;
    }
   String reverseString()
    {
        String reversed_String="";
        int index=0,lengthofstring=getStringLength();
        for(index=0;index<lengthofstring;index++){
            reversed_String=userinput.charAt(index)+reversed_String;
        }
        return reversed_String;

    }
    int getStringLength(){
        int index=0,lengthOfString=0;
       userinput=userinput+" ";
        while(userinput.charAt(index) != ' ')
        {
            ++lengthOfString;
            ++index;
        }
                return lengthOfString;
    }
}
