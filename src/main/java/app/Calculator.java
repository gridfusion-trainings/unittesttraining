package app;

/**
 * Created by gridfusion on 14/08/15.
 */
public class Calculator {

        private InputProcessor processor;


        public Calculator() {
            //set default InputProcessor in case no mocking is needed
            this.processor = new InputProcessor();
        }


        public void aMethodThatDoesNothing() {
            System.out.println("doing nothing");

        }

        public void setStripper(InputProcessor stripper) {
            this.processor = stripper;
        }


        public String calculateName (String first, String last) throws InputIsEmptyException
        {
            if(first== "" || last=="") {
                throw new InputIsEmptyException();
            }
            else {
                return first + " " + last;
            }
        }


        public int calculateNumberOfChars(String fullName) {

            String strippedString;

            //call to (external) InputProcessor class
            strippedString = processor.stripWhitespaces(fullName);
            return strippedString.length();
        }
    }
