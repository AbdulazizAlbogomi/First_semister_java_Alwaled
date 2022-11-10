import javax.swing.*;
public class Baloot {
    public static void main(String[] args) {
       // الحل يحتاج إلى تعديل
int teamA=0,teamB=0,game,sumA=0,sumB=0, sumAA=0, sumBB=0,sumCC=0,sumDD=0;
       game=Integer.parseInt(JOptionPane.showInputDialog("أختر اللعبة\n1- للبلوت\n2-للمسابقة"));
       switch (game) {
           case 1: for (int i=1;sumA<152 && sumB<152;i++) {
               teamA=Integer.parseInt(JOptionPane.showInputDialog("لنا"));
               sumA=sumA+teamA;
           teamB=Integer.parseInt(JOptionPane.showInputDialog("لهم"));
            sumB=sumB+teamB;
           JOptionPane.showMessageDialog(null, "لنا "+sumA+"\n"+"لهم "+sumB);}
          // if (sumA >=152 || sumB >=152) {
               if (sumA>sumB) JOptionPane.showMessageDialog(null, "مبروووك الفريق الأول هو الفائز : "+
                       sumA+"حظ اوفر للفريق الثاني :"+sumB);
               else if (sumB>sumA)  JOptionPane.showMessageDialog(null, "مبروووك الفريق الثاني هو الفائز : "+
                       sumB+"حظ اوفر للفريق الأول :"+sumA); 
           else  {  for (int i=1;sumA==sumB;i++)  {
                teamA=Integer.parseInt(JOptionPane.showInputDialog("لنا"));
               sumA=sumA+teamA;
           teamB=Integer.parseInt(JOptionPane.showInputDialog("لهم"));
            sumB=sumB+teamB;
           JOptionPane.showMessageDialog(null, "لنا "+sumA+"\n"+"لهم "+sumB);
             if (sumA>sumB) JOptionPane.showMessageDialog(null, "مبروووك الفريق الأول هو الفائز : "+
                       sumA+"حظ اوفر للفريق الثاني :"+sumB);
             else if (sumB>sumA)  JOptionPane.showMessageDialog(null, "مبروووك الفريق الثاني هو الفائز : "+
                       sumB+"حظ اوفر للفريق الأول :"+sumA); } } 
           
    break;
           case 2:
               for (int x=0;x>=0;x++) { 
              
              int a=Integer.parseInt(JOptionPane.showInputDialog("اللاعب الأول"));
               sumAA=sumAA+a;
           int b=Integer.parseInt(JOptionPane.showInputDialog("اللاعب الثاني"));
            sumBB=sumBB+b;
           int c=Integer.parseInt(JOptionPane.showInputDialog("اللاعب الثالث"));
            sumCC=sumCC+c;
           int d=Integer.parseInt(JOptionPane.showInputDialog("اللاعب الرابع"));
            sumDD=sumDD+d;
            JOptionPane.showMessageDialog(null, "اللاعب الأول : "+sumAA+"\n"+"اللاعب الثاني :"+sumBB+"\n"+
                    "اللاعب الثالث : "+sumCC+"\n"+"اللاعب الرابع :"+sumDD);
             int f=Integer.parseInt(JOptionPane.showInputDialog("هل تود الخروج من اللعبة \n للخروج من اللعبة استخدم الرمز:  1"));
               if (f==1) break;
               }
                if (sumAA>sumBB && sumAA > sumCC && sumAA > sumDD) { 
        JOptionPane.showMessageDialog(null, "الفائز هو اللاعب الأول "+sumAA);
        JOptionPane.showMessageDialog(null, "وبقية النتائج\n "+"اللاعب الثاني  "+sumBB+"  \n"+"اللاعب الثالث  "+sumCC+"  \n"+"اللاعب الرابع  "+sumDD);}
            else if  (sumBB > sumCC && sumBB > sumDD) { JOptionPane.showMessageDialog(null, "الفائز هو اللاعب الثاني  "+sumBB);
        JOptionPane.showMessageDialog(null, "وبقية النتائج\n "+"اللاعب الاول  "+sumAA+"  \n"+"اللاعب الثالث  "+sumCC+"  \n"+"اللاعب الرابع  "+sumDD);}
            else if (sumCC>sumDD) { JOptionPane.showMessageDialog(null, "الفائز هو اللاعب الثالث  "+sumCC);
        JOptionPane.showMessageDialog(null, "وبقية النتائج\n "+"اللاعب الاول  "+sumAA+"  \n"+"اللاعب الثاني  "+sumBB+"  \n"+"اللاعب الرابع  "+sumDD);}
               
            else { JOptionPane.showMessageDialog(null, "الفائز هو اللاعب الرابع  "+sumDD);
        JOptionPane.showMessageDialog(null, "وبقية النتائج\n "+"اللاعب الاول  "+sumAA+"  \n"+"اللاعب الثاني  "+sumBB+"  \n"+"اللاعب الثالث  "+sumCC);}
            
            
       }}}


