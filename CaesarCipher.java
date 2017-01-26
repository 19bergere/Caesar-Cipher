
public class MyProgram extends ConsoleProgram
{
    public void run()
    {
     
        String mySentence = readLine("What is your sentence? ");
            
        for(int the = 0; the < 26; the++)
        {
            System.out.println(shiftMethod(mySentence, the));
            String please = shiftMethod(mySentence, the);
            if(isWords(please))
            {
                System.out.println("This is a match!");
                System.out.println(please);
                System.out.println(the);
            }
        }
        
        
        }
    
    
    //Encrypt the sentence
    public String shiftMethod(String sentence, int shift)
    {
        //Declare length
        int length = sentence.length();
        //Make a place holder to put the characters in after the for loop
        String placeHolder = "";
        //Mae a place holder for the char in the for loop
        char placeHolderChar = ' ';
        
        //begin the for loop that loops throught the characters and encrypts one 
        //at a time
        for(int i = 0; i < length; i++)
        {
            char current = sentence.charAt(i);
            //turns the character into the integer ASCII value
            int charInt = (int) current;
            
            //Special case (if the shift is greater than 26, then it can not 
            //be encrypted regularly)
            if(shift >= 27)
            {
                /* in this if statement, we have to take the shift above 26 and
                 * and convert it to one that is the equivilent shift between 1 and 26
                 * We know that if we start of 'a' for example, a shift of 1 will be
                 * a 'b'. If we start with 'a' and have a shift of 27, logically we 
                 * know that thiss will loop back to b, but the computer knows that.
                 * This means that we have to teach the computer how to convert 
                 * 1, 27, 79, 105..... all to 1. We do this by dividing the number by
                 * 26. 1 / 26 and 27 / 26 and 79 / 26 ... will always give you the same
                 * digits AFTER THE DECIMAl. In this case it always ends up being
                 * .038...
                */
                if(shift % 26 == 1 % 26)
                {
                    shift = 1;
                }
                else if(shift % 26 == 2 % 26)
                {
                    shift = 2;
                }
                else if(shift % 26 == 3 % 26)
                {
                    shift = 3;
                }
                else if(shift % 26 == 4 % 26)
                {
                    shift = 4;
                }
                else if(shift % 26 == 5 % 26)
                {
                    shift = 5;
                }
                else if(shift % 26 == 6 % 26)
                {
                    shift = 6;
                }
                else if(shift % 26 == 7 % 26)
                {
                    shift = 7;
                }
                else if(shift % 26 == 8 % 26)
                {
                    shift = 8;
                }
                else if(shift % 26 == 9 % 26)
                {
                    shift = 9;
                }
                else if(shift % 26 == 10 % 26)
                {
                    shift = 10;
                }
                else if(shift % 26 == 11 % 26)
                {
                    shift = 11;
                }
                else if(shift % 26 == 12 % 26)
                {
                    shift = 12;
                }
                else if(shift % 26 == 13 % 26)
                {
                    shift = 13;
                }
                else if(shift % 26 == 14 % 26)
                {
                    shift = 14;
                }
                else if(shift % 26 == 15 % 26)
                {
                    shift = 15;
                }
                else if(shift % 26 == 16 % 26)
                {
                    shift = 16;
                }
                else if(shift % 26 == 17 % 26)
                {
                    shift = 17;
                }
                else if(shift % 26 == 18 % 26)
                {
                    shift = 18;
                }
                else if(shift % 26 == 19 % 26)
                {
                    shift = 19;
                }
                else if(shift % 26 == 20 % 26)
                {
                    shift = 20;
                }
                else if(shift % 26 == 21 % 26)
                {
                    shift = 21;
                }
                else if(shift % 26 == 22 % 26)
                {
                    shift = 22;
                }
                else if(shift % 26 == 23 % 26)
                {
                    shift = 23;
                }
                else if(shift % 26 == 24 % 26)
                {
                    shift = 24;
                }
                else if(shift % 26 == 25 % 26)
                {
                    shift = 25;
                }
                else if(shift % 26 == 26 % 26)
                {
                    shift = 26;
                }
                else
                {
                    shift = 6666;
                }
            }
            //This if statement is for shifts between 1 & 26
            if(charInt > 64 && charInt < 91)
            {
                if(charInt + shift >= 91)
                {
                    int finalChar = (((charInt + shift) - 91) + 65);
                    placeHolderChar = (char) finalChar;
                }
                else
                {
                    int finalChar = charInt + shift;
                    placeHolderChar = (char) finalChar;
                }
            }
            else if(charInt > 96 && charInt < 123)
            {
                if(charInt + shift >= 123)
                {
                    int finalChar = (((charInt + shift) - 123) + 97);
                    placeHolderChar = (char) finalChar;
                }
                else
                {
                    int finalChar = charInt + shift;
                    placeHolderChar = (char) finalChar;
                }   
            }
            else
            {
                placeHolderChar = (char) charInt;
            }
            placeHolder += placeHolderChar;
        }
        return placeHolder;
    }
    
    public boolean isWords(String theString)
    {
        String[] theWords = theString.split(" ");
        
        boolean theTrue = true;
        for(int aa = 0; aa < theWords.length; aa++)
        {
            if(theWords[aa].equals("the") || theWords[aa].equals("and"))
            {
                theTrue = true;
                break;
            }
            else
            {
                theTrue = false;
            }
        }
        return theTrue;
        
    }
}