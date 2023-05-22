package Misc;

import java.util.Scanner;

public class VerifyWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full url of the website");
        String url = sc.next();
        sc.close();
        String protocol = url.substring(0,url.indexOf(":"));
        String domain_name = url.substring(url.indexOf("//")+2,url.indexOf('/',12));
        String top_domain = url.substring(url.indexOf('.',13),url.indexOf('/',12));
        String path = url.substring(url.indexOf('/',16)+1);
        System.out.println("The url is of"+" "+protocol+" "+"protocol"+" "+"having"+" "+domain_name+" "+" "+"as domain name"+" "+"with top level domain as"+
                " "+top_domain);
        System.out.println("This url has the path"+" "+path);
    
    }
}
