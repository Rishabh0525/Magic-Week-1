import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String CouFre(String str){
        int n=str.length();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        int[] frq=new int[256];

        for(int i=0;i<n;i++){
            frq[str.charAt(i)]++;
        }
        for(int i=0,j=0;i<256;i++){
            if(frq[i]!=0){
                arr1.add(frq[i]);
            }
        }
        String result=Arrays.toString(new ArrayList[]{arr1});
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the desired string");
        String str=sc.nextLine();
        String res=CouFre(str);
        String newStr= "";
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(newStr.indexOf(a)<0){
                newStr +=a;
            }
        }
        int  l=newStr.length();
        char[] ch=newStr.toCharArray();
        Arrays.sort(ch);
        System.out.println("Frequency will be");
        System.out.println(Arrays.toString(ch));
        System.out.println(res);

    }
}