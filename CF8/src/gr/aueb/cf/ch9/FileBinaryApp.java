package gr.aueb.cf.ch9;

import java.io.*;
import java.time.LocalDateTime;
import java.util.UUID;

public class FileBinaryApp {

    public static void main(String[] args) {
        String inputFile = "C:/tmp/dummy.pdf";
        String outputFile = "C:/tmp/dummy-out.pdf";

         try {
             binaryInputReadWrite(inputFile, outputFile);
         }catch (IOException e){
             System.out.println("Failed");
         }

    }

    public static void binaryInputReadWrite(String inputFile , String outputFile) throws IOException {
        final int BUFFER_SIZE = 2048 ;  //2KB buffer
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;
        long start ;
        long end;
        double elapsedTime ;
        int counter = 0 ;

        start = System.currentTimeMillis();
        try(FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile)){

            while ((bytesRead = fis.read(buffer)) != -1){
                fos.write(buffer , 0 , bytesRead);
                counter += bytesRead;

            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0 ;
            System.out.printf("Το αρχείο με μέγεθος %.2f (%d bytes) αντιγράφηκε ο επιτυχώς\n " , (counter / 1024.0),counter);
            System.out.println("Elapsed time : " + elapsedTime + " seconds");

            File inFd = new File(inputFile);
            File outFd = new File(outputFile);

            System.out.println("Input File Absolute Path: " + inFd.getAbsolutePath());
            System.out.println("Output File Absolute Path : " + outFd.getAbsolutePath());

            String outputRandomPath = outputFile + UUID.randomUUID().toString().replaceAll("-","");     //random naming of files 
            File randomFile = new File(outputRandomPath);
            FileOutputStream fos2 = new FileOutputStream(randomFile);
        }catch (IOException e ){
            System.err.println(LocalDateTime.now() + "\n" + e );
            throw e ;
        }
    }

    public static void binarybufferedInputReadWrite(String inputFile , String outputFile) throws IOException {
        final int BUFFER_SIZE = 2048 ;  //2KB buffer
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;


        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile) , BUFFER_SIZE);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile),BUFFER_SIZE)) {

            while ((bytesRead = bis.read(buffer)) != -1){
                bos.write(buffer , 0 , bytesRead);

            }

            System.out.println("File copied successfully");

        }catch (IOException e ){
            System.err.println(LocalDateTime.now() + "\n" + e );
            throw e ;
        }
    }
}
