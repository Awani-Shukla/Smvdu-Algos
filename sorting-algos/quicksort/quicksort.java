import java.util.*;
public class Solution {
       
         public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int l=0,j=0,k=0;
              int b[]=new int[n];
              int c[]=new int[n];
              int d[]=new int[n];
             int p,pi,i;
        for(i=0;i<n;i++)
            {
            a[i]=in.nextInt();
        }
             p=a[0];
             for(i=1;i<n;i++)
                 {
                 if(a[i]<p)
                     {
                     b[k]=a[i];
                     k++;
                 }
                 if(a[i]>p)
                     {
                     d[j]=a[i];
                     j++;
                 }
                 if(a[i]==p)
                     {
                     c[l]=a[i];
                     l++;
                 }
                 
             }
             for(i=0;i<k;i++)
                 {
                 System.out.print(+b[i]+" ");
             }
             for(i=0;i<l;i++)
                 {
                 System.out.print(+c[i]+" ");
                
                 
             }
              System.out.print(p+" ");
             for(i=0;i<j;i++)
                 {
                 System.out.print(+d[i]+" ");
             }}}
                
