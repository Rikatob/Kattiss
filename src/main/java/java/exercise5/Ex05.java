package java.exercise5;

public class Ex05 {

    // NOTES : In the course code for CyberSecurity it says SC in the exam, i assume its suppose to be CS and use this.
    //         the placeholder for <assassment> is the unique-id in the examples inputs, i assume its suppose to be A-F as the task explains and use this.
    //         i assume they have a better compress algorithm by the year 4096 :).
    //          <program>-<course-code>:<assessment> / <date-of-completion>. File: <filename>;
    //          I assume the input will be a String with newline after each entry, add 1 bit at the end of compress() and add \n at the end of decompress().


    /** Programming-PG4200:456987 / 2022-JUN-06. File: feedback-PG4200-456987.pdf;
     *  Program    : 5 values -> 8 = 2^3 -> 3 bits to write 8 different values.
     *  CourseCode :
     *              Programletters : 5 values -> 3 bits -> 8 combinations.
     *              programnumber  : 9899 values -> 14 bits -> 16384 combinations.
     *              -> REMEMBER "-" before courseCode when decompressing.
     *  Assesment  : 6 values(A-F) -> 8 = 2^3 -> 3 bits to write 8 different values.
     *              -> REMEMBER ":" before grade when decompressing.
     *  Date       :
     *              YEAR  : Max value 2022 -> 4096 = 2^12 -> 12 bits to write 4096 different values.
     *              MONTH : Max value 12 -> 16 = 2^4 -> 4 bits to write 16 combinations.
     *              DAY   : Max value 31 -> 32 = 2^5 -> 5 bits to write 32 combinations.
     *              -> REMEMBER / in the beginning and "-" between YYYY-MMM-DD.
     *  File       : File: feedback-<CourseCode>-<ID 800 000 values -> 20bits -> 1 048 576 combinations>.pdf
     */

    public byte[] compress(String input) {

        BitWriter writer = new BitWriter();

        for (int i = 0; i < input.length(); i++) {

            // === Program ===
            String program = "";
            String tempChar = input.charAt(i) + "";

            while (!tempChar.equals("-")) {
                program += input.charAt(i);
                i++;
                tempChar = input.charAt(i) + "";
            }
            program = program.toLowerCase();            // make the string to lowercase to avoid problems with uppper/lower casing in input.

            switch (program) {
                case "programming" -> writer.write(0, 3);
                case "artificialintelligence" -> writer.write(1, 3);
                case "frontendprogramming" -> writer.write(2, 3);
                case "cybersecurity" -> writer.write(3, 3);
                case "datascience" -> writer.write(4, 3);
            }

            i++;                // to jump over the '-'

            // === CourseCode ===
            String programLetters = "";
            programLetters += input.charAt(i);
            programLetters += input.charAt(i + 1);

            switch (programLetters) {
                case "PG" -> writer.write(0, 3);
                case "AI" -> writer.write(1, 3);
                case "FP" -> writer.write(2, 3);
                case "CS" -> writer.write(3, 3);     // changed fro SC to CS (CyberSecurity)
                case "DS" -> writer.write(4, 3);
            }

            i += 2;

            String programNumber = "";
            programNumber += input.charAt(i);
            programNumber += input.charAt(i + 1);
            programNumber += input.charAt(i + 2);
            programNumber += input.charAt(i + 3);

            writer.write(Integer.parseInt(programNumber), 14);

            i += 5;  // courseCode + ':' .


            System.out.println(programLetters);                                                                           ////
            System.out.println(programNumber);
            System.out.println(input.charAt(i));

            // Assessment
            char grade = input.charAt(i);
            switch (grade) {
                case 'A' -> writer.write(0, 3);
                case 'B' -> writer.write(1, 3);
                case 'C' -> writer.write(2, 3);
                case 'D' -> writer.write(3, 3);
                case 'E' -> writer.write(4, 3);
                case 'F' -> writer.write(5, 3);
            }
            i += 4;     // Assassment + ' / ' .


            // Date of completion

            // === YEAR ===
            String year = "";

            for (int j = 0; j < 4; j++) {
                year += input.charAt(i + j);
            }

            writer.write(Integer.parseInt(year), 12);

            i += 5;       // year + '-'

            System.out.println(year);                                                                           ////

            // === MONTH ===
            String month = "";

            month += input.charAt(i);
            month += input.charAt(i + 1);
            month += input.charAt(i + 2);

            switch (month) {
                case "JAN" -> writer.write(0, 4);
                case "FEB" -> writer.write(1, 4);
                case "MAR" -> writer.write(2, 4);
                case "APR" -> writer.write(3, 4);
                case "MAY" -> writer.write(4, 4);
                case "JUN" -> writer.write(5, 4);
                case "JUL" -> writer.write(6, 4);
                case "AUG" -> writer.write(7, 4);
                case "SEP" -> writer.write(8, 4);
                case "OCT" -> writer.write(9, 4);
                case "NOV" -> writer.write(10, 4);
                case "DEC" -> writer.write(11, 4);
            }

            i += 4;      // Month + '-'

            System.out.println(month);                                                                           ////

            // === DAY ===
            String day = "";
            day += input.charAt(i);
            day += input.charAt(i + 1);

            writer.write(Integer.parseInt(day), 5);
            System.out.println(day);                                                                           ////

            i += 4;      // day + '. '


            // === JUMP TO UNIQUE ID ==
            // Jumps to the end of the string and go back to the first number of unique id.

            tempChar = input.charAt(i) + "";     // +"" to force the char to a String.
            while (!tempChar.equals(";")) {
                i++;
                tempChar = input.charAt(i) + "";
            }

            i -= 10;

            // === UNIQUE ID ===
            String uniqueId = "";
            uniqueId += input.charAt(i);
            uniqueId += input.charAt(i + 1);
            uniqueId += input.charAt(i + 2);
            uniqueId += input.charAt(i + 3);
            uniqueId += input.charAt(i + 4);
            uniqueId += input.charAt(i + 5);

            writer.write(Integer.parseInt(uniqueId), 20);

            i += 11;        // unique id + ";" and \n .
        }

        // TOTAL 64 bits.
        return writer.extract();
    }


    public String deCompress(byte[] input) {
        BitReader reader = new BitReader(input);

        int numberOfInputs = (input.length * 8) / 64;   // length = bytes , multiply with 8 to get bits and divide with amount of bits in one compression (64bit).

        String output = "";

        for (int i = 0; i < numberOfInputs; i++) {

            // === PROGRAM ===
            int tempNumber = reader.readInt(3);
            String program = "";

            switch (tempNumber) {
                case 0 -> program = "Programming-";
                case 1 -> program = "ArtificialIntelligence-";
                case 2 -> program = "FrontendProgramming-";
                case 3 -> program = "Cybersecurity-";
                case 4 -> program = "DataScience-";
            }


            // === COURSE CODE ===
            //Letters->
            tempNumber = reader.readInt(3);

            String programLetters = "";

            switch (tempNumber) {
                case 0 -> programLetters = "PG";
                case 1 -> programLetters = "AI";
                case 2 -> programLetters = "FP";
                case 3 -> programLetters = "CS";      // changed fro SC to CS (CyberSecurity)
                case 4 -> programLetters = "DS";
            }
            //Number->
            int programNumber = reader.readInt(14);


            // === ASSESSMENT ===
            tempNumber = reader.readInt(3);
            String assessment = "";

            switch (tempNumber) {
                case 0 -> assessment = ":A / ";
                case 1 -> assessment = ":B / ";
                case 2 -> assessment = ":C / ";
                case 3 -> assessment = ":D / ";
                case 4 -> assessment = ":E / ";
                case 5 -> assessment = ":F / ";
            }

            // === YEAR ===
            int year = reader.readInt(12);


            // === MONTH ===
            tempNumber = reader.readInt(4);
            String month = "";

            switch (tempNumber) {
                case 0 -> month = "-JAN-";
                case 1 -> month = "-FEB-";
                case 2 -> month = "-MAR-";
                case 3 -> month = "-APR-";
                case 4 -> month = "-MAY-";
                case 5 -> month = "-JUN-";
                case 6 -> month = "-JUL-";
                case 7 -> month = "-AUG-";
                case 8 -> month = "-SEP-";
                case 9 -> month = "-OCT-";
                case 10 -> month = "-NOV-";
                case 11 -> month = "-DEC-";

            }
            ;
            // === DAY ===
            tempNumber = reader.readInt(5);
            String day = String.format("%02d", tempNumber);// STRING.FORMAT (%02d) to get atleast 2 digits and fill the "notUsed" with 0.

            // === JUMP FILL ===
            String jumpFill = ". File: feedback-" + programLetters + programNumber + "-";

            // === UNIQUE ID ===
            String uniqueID = reader.readInt(20) + ".pdf;";

            output += program;
            output += programLetters;
            output += programNumber;
            output += assessment;
            output += year;
            output += month;
            output += day;
            output += jumpFill;
            output += uniqueID;
            output += "\n";
        }


        return output;
    }

}
