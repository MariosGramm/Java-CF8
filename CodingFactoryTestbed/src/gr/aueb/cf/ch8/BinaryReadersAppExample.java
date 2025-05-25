package gr.aueb.cf.ch8;

import java.io.*;

public class BinaryReadersAppExample {

    public static void main(String[] args) {

                File inputfile  = new File("C:\\JavaPracticeFiles\\aueb1.png");
                File outputfile = new File("C:\\JavaPracticeFiles\\output.png");

                try {
                    binaryWriteReadfiles(inputfile, outputfile);
                } catch (IOException e) {
                    e.printStackTrace();
                }

    }

    public static void binaryWriteReadfiles(File inFile,File outFile) throws IOException {
        final int BUFFER_SIZE = 1024;
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

       try(FileInputStream ifs = new FileInputStream(inFile);
            BufferedInputStream bifs = new BufferedInputStream(ifs);
            FileOutputStream ofs = new FileOutputStream(outFile);
            BufferedOutputStream bofs = new BufferedOutputStream(ofs);) {

           while ((bytesRead = bifs.read()) != -1) {
               bofs.write(buffer, 0, bytesRead);
           }

           bofs.flush();
           System.out.println("Η αντιγραφή του αρχείου ολοκληρώθηκε");
       }catch (IOException e){
           System.out.println("Η αντιγραφή του αρχείου απέτυχε");
           e.printStackTrace();
           throw e;
       }



    }

    /**
     * Γράψτε μία μέθοδο που δοσμένου ενός string s,
     * ενός χαρακτήρα ch και ενός αριθμού n βρίσκει το πλήθος των φορών που εμφανίζεται ο χαρακτήρας ch,
     * στους πρώτους n χαρακτήρες του string s.
     */

    public static class Challenge3 {

        public static void main(String[] args) {

            String s = "abcabcabc";
            int n = 4 ;
            char ch = 'a';

            int count =  stringMethod1(s,n,ch);

            System.out.println(count);


        }

        public static int stringMethod1(String s , int n , char ch){
            if (n>s.length()) return 0 ;

            int count = 0 ;

            for (int i = 0 ; i < n ; i ++ ){
                if (s.charAt(i) == ch){
                    count +=1 ;
                }
            }
            return count ;
        }
    }
}
