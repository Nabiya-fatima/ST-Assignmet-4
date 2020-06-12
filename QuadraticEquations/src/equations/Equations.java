/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equations;

/**
 *
 * @author Nabiya Fatima
 */
public class Equations {

    public String checkRoots(int a,int b ,int c)
    {
        String str = null;
        int Disc=b*b-4*a*c;
        if(a!=0&&Disc==0&&a>=1)
        {
            str="Equal Roots with shape of parabola open upwards";
        }
        else  if(a!=0&&Disc==0&&a<=1)
        {
            str="Equal Roots with shape of parabola open downwards";
        }
         else  if(a!=0&&Disc>0&&a>=1)
        {
            str="Real Roots with shape of parabola open upwards";
        }
         else  if(a!=0&&Disc>0&&a<=1)
        {
            str="Real Roots with shape of parabola open downwards";
        }
        else  if(a!=0&&Disc<0&&a>=1)
        {
            str="Imaginary Roots with shape of parabola open upwards";
        }
         else  if(a!=0&&Disc<0&&a<=1)
        {
            str="Imaginary Roots with shape of parabola open downwards";
        }
        else
         {
             str="Not a Quadratic Equation";
         }
        return str;
    }
    public static void main(String[] args) {
        Equations e=new Equations();
        System.out.println(e.checkRoots(1,1,1));
    }
    
}
