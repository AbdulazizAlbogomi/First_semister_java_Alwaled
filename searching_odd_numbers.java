import javax.swing.*;
public class searching_odd_numbers {
    public static void main(String[] args) {
         {
        
            int a[] = new int [20];
            int c=0; String s= "عناصر المصفوفة الأصلية هي: "; String m= "عناصر المصفوفة الفردية هي: ";
            for (int i=0; i<a.length ; i++)
               a[i] = Integer.parseInt(JOptionPane.showInputDialog("أدخل العدد رقم : "+ (i+1)));
            for (int i=0 ; i< a.length;i++)
                if (a[i]%2==1)  c=c+1;
            int b [] = new int [c];
            for (int i=0 ; i< a.length ; i++)
                if (a[i]%2==1) { b[c-1] = a[i]; c--; }
            for (int i=0 ; i< a.length;i++)
                s+="\n"+a[i];
                JOptionPane.showMessageDialog(null, s + "    ");
            for (int i=0 ; i< b.length;i++)
                m+="\n"+b[i];
                if (b.length==0) JOptionPane.showMessageDialog(null,"لا يوجد أرقام فردية في المصفوفة الأصلية");
                else
                JOptionPane.showMessageDialog(null, m + "    ");
        }
    }}