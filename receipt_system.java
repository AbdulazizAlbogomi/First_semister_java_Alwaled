import javax.swing.*;
public class receipt_system {
    public static void main(String[] args) {

        
        int items,branch;
        String report="تفاصيل الفاتورة"+"\n";
        do {
        branch=Integer.parseInt(JOptionPane.showInputDialog("مرحبا بك في صيدلية العلم الأخضر\nحدد رقم الفرع"));
        items=Integer.parseInt(JOptionPane.showInputDialog("أدخل عدد الأصناف"));
        if (items<=0) JOptionPane.showMessageDialog(null,"يرجى إدخال عدد أصناف أعلى من الصفر");
        else if (branch>3 || branch<1) JOptionPane.showMessageDialog(null,"يرجى إدخال رقم فرع صحيح");
        else
        {
        double sales[]=new double [items];
        String products[]=new String [items];
        double sum=0.0,invoice;
        double temp;
        String temp1;
        for (int i=0; i<items;i++) {
            products[i]=JOptionPane.showInputDialog("أدخل اسم المنتج رقم: "+(i+1));
            sales[i]=Double.parseDouble(JOptionPane.showInputDialog("أدخل سعر المنتج رقم: "+(i+1)));
            sum+=sales[i];
        }
        for (int i=0; i<sales.length;i++) {
            for (int j=i+1; j<sales.length;j++) {
                if (sales[i]<sales[j]) {
                    temp=sales[i];
                    sales[i]=sales[j];
                    sales[j]=temp;
                    
                    temp1=products[i];
                    products[i]=products[j];
                    products[j]=temp1;
                }
            }
        }
        for (int i=0; i<sales.length;i++) {
            report+=products[i]+"   "+sales[i]+"\n";
        }
        temp=VAT(sum);
         report+="إجمالي القيمة المضافة: "+temp+"\n";
        report+="إجمالي مبلغ الفاتورة: "+sum+"\n";
        switch (branch) {
            
            case 1: if (sum>100) { invoice=sum-(sum*0.1); report+="إجمالي قيمة الفاتورة بعد الخصم: "+invoice+"\n";
                                   report+="إجمالي الفاتورة بعد إضافة القيمة المضافة: "+(invoice+temp); }
                                  else report+="إجمالي الفاتورة بعد إضافة القيمة المضافة: "+(sum+VAT(sum));
                    
case 2: break;
           
            case 3: if (sum>500) { invoice=sum-50; report+="إجمالي قيمة الفاتورة بعد الخصم: "+invoice+"\n";
                                   report+="إجمالي الفاتورة بعد إضافة القيمة المضافة: "+(invoice+temp); }
                                 else  report+="إجمالي الفاتورة بعد إضافة القيمة المضافة: "+(sum+VAT(sum));
                    break;
            default: JOptionPane.showMessageDialog(null, "رقم الفرع خاطئ");
        }
    } }while (items<=0 || branch>3 || branch<1);
        JOptionPane.showMessageDialog(null,report);
    
}
static double VAT (double s) {
    double v=s*0.15;
    return v;
}
}




