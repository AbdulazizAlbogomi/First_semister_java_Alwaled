import javax.swing.*;
public class student_sys {
    public static void main(String[] args) {
        int n= Integer.parseInt(JOptionPane.showInputDialog("أدخل عدد المتدربين"));
                int m= Integer.parseInt(JOptionPane.showInputDialog("أدخل عدد المواد لكل متدرب"));
                int sum=0,high=0,sumall=0,highall=0;
                double avg;
                int a [][] = new int [n][m];
                
                for (int i=0;i<a.length;i++){
                    JOptionPane.showMessageDialog(null, "أدخل درجات المتدرب رقم: "+(i+1));
        
                    for (int j=0 ; j< a[i].length;j++){
                        a[i][j] =Integer.parseInt(JOptionPane.showInputDialog("أدخل درجة المادة رقم: "+(j+1)));
                        sum+=a[i][j];
                        // if(a[i][j]<60) JOptionPane.showMessageDialog(null,"لقد رسبت في المادة رقم "+(j+1));
                        if (a[i][j]>high)high=a[i][j];}
        
                        avg=sum/m;
                        JOptionPane.showMessageDialog(null, "مجموع درجات الطالب رقم: "+(i+1)+" "+sum+" ومتوسط درجاته هي: "+avg
                        +" أعلى درجة هي: "+high+"\n"+"معدل الطالب هو: "+(float)(sum/m)/100*5+" /5");
                        
                        if (high>highall) highall=high;
                        sumall+=sum;
                        avg=0;
                        sum=0;
                        high=0;
                      }
                avg=sumall/(n*m);
                  JOptionPane.showMessageDialog(null,"متوسط درجة جميع المواد: "+avg + "أعلى درجة من بين كل المواد هي: "+highall);      
                for (int i=0;i<a.length;i++){
                    System.out.println("درجات المتدرب رقم: "+(i+1));
                    for (int j=0 ; j< a[i].length;j++)
                    System.out.print(a[i][j]+"\n");}
            }
        
        
        
    
}
