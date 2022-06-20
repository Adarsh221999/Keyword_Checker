package Assignments;


import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



      public class First {



             public static void main(String[] args) throws IOException {

             String filepath = "C:\\Users\\ADARUNCH\\OneDrive - Capgemini\\Desktop\\Resume";



                  File input = new File(filepath);

                    

                 File[] fp = input.listFiles();



               for (File file : fp) {
                 PDDocument pdd = new PDDocument();
                 PDFTextStripper stripper = new PDFTextStripper();
                 String resume = stripper.getText(pdd.load(file));
                 String Resume = resume.toLowerCase();
                 pdd.load(file).close();
                 System.out.println(Resume);

       Set <String>  keywords = new HashSet<String>();
           System.out.print("Enter no of skills to be matched :");
             Scanner s = new Scanner(System.in);
                int num_skill = s.nextInt();

    for(int i=0;i< num_skill;i++)
      {
         keywords.add(s.next());
      }
//System.out.println(keywords) ;
    

           int count = 0;
           for (String ele : keywords) {
           if (Resume.contains(ele)) {
//System.out.println("yes");
          count++;
           }
         }
             if (count < 1) {
               System.out.println("0%");
             }
             else if (count == 1) {
                 System.out.println("YES, 30% Match");
             }        
                  else if (count == 2) 
                  {
                System.out.println("YES, 60% Match");
                 }

                  else if(count==3)
                     {
               System.out.println("YES, 80% Match");
                      }
              
                  else if(count>3)
                    {
               System.out.println("YES, 100% Match");
                   }

                }

     }
}