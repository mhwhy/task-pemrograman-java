
package PERCOBAAN;

import java.io.*;
public class BufferedInputStreamDemo {

    public static void main(String[] args) {
       String s = "this is a &copy: copyright symbol " + "but this is a &copy not.\n";
       byte buf[] = s.getBytes();
       
       ByteArrayInputStream in = new ByteArrayInputStream(buf);
       int c;
       boolean marked = false;
       
       try ( BufferedInputStream f = new BufferedInputStream(in) )
       {
         while ((c  = f.read()) != -1){
             switch(c){
                 case '&':
                     if(!marked){
                         f.mark(32);
                         marked = true;
                     }else {
                         marked = false;
                     }
                 break;
                 case ';':
                     if(marked){
                         marked = false;
                         System.out.print("()");
                     }else {
                          System.out.print((char) c);
                     }
                 break;
                 case ' ':
                     if(marked){
                         marked = false;
                         f.reset();
                         System.out.print("&");
                     }else {
                          System.out.print((char) c);
                     }
                 break;
                 default:
                  if(!marked)
                      System.out.print((char) c);
                  break;
             }
         }  
       }catch(IOException e){
           System.out.println("i/o error: " + e);
       }
    }
    
}
