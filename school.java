import javax.swing.*;
public class school {
    public static void main(String[] args) {
        
            int x=Integer.parseInt(JOptionPane.showInputDialog("أدخل عدد الطلاب"));
            String [ ] names=new String [x];
            double [ ] marks=new double [x];
            String [ ] id=new String [x];
            double sum=0,avg,t;
            int k=0,counter=0;
            String name="البيانات المطلوبة هي:\n",stop=" ";
            for (int i=0; i<names.length; i++) {
                names[i]=JOptionPane.showInputDialog("أدخل اسم الطالب رقم "+(i+1));
                id[i]=JOptionPane.showInputDialog("أدخل الرقم الأكاديمي للطالب رقم "+(i+1));
                do {
                     t=Double.parseDouble(JOptionPane.showInputDialog("أدخل درجة الطالب  رقم "+(i+1)));
                if (t>=0 && t<=100){ marks[i]=t; k=1;}
                else JOptionPane.showMessageDialog(null, "أدخل درجة صحيحة");
                } while (k==0);
               
                sum+=marks[i];k=0;
            }
            avg=sum/names.length;
           
           do {
               int option=Integer.parseInt(JOptionPane.showInputDialog("قم بإختيار أحد الخيارات التالية\n1-لاستعراض بيانات كل الطلاب\n2-استعراض بيانات الطلاب الناجحين\n"
                    + "3-استعراض بيانات الطلاب الراسبين\n4-طباعة بيانات طالب محدد بناءً على رقمة الأكاديمي\n5-عمليات على الدرجات\n"
                    + "6-البحث بواسطة اسم الطالب\n7-بحث مخصص"));
            switch (option) {
                case 1: for (int i=0; i<names.length;i++) 
                            name+=names[i]+" "+id[i]+" "+marks[i]+"\n";
                JOptionPane.showMessageDialog(null, name);
                break;
                
                case 2: for (int i=0; i<names.length;i++) {
                    if (marks[i]>=60){
                          name+=names[i]+" "+id[i]+" "+marks[i]+"\n";
                          counter++;
                    } }
                    if(counter==0)  JOptionPane.showMessageDialog(null, "لا توجد نتائج تطابق بحثك");
                    else  JOptionPane.showMessageDialog(null, name);
                        break;
                        
                case 3:  for (int i=0; i<names.length;i++) {
                    if (marks[i]<60){
                          name+=names[i]+" "+id[i]+" "+marks[i]+"\n";
                          counter++;
                    } }
                    if(counter==0)  JOptionPane.showMessageDialog(null, "لا توجد نتائج تطابق بحثك");
                    else  JOptionPane.showMessageDialog(null, name); break;
                    
                case 4: String search=JOptionPane.showInputDialog("أدخل الرقم الأكاديمي للطالب");
                 for (int i=0; i<names.length;i++) 
                    if (id[i].equals(search)) {counter++;
                    name+=names[i]+" "+id[i]+" "+marks[i]+"\n";}
               
      if(counter==0)  JOptionPane.showMessageDialog(null, "لا توجد نتائج تطابق بحثك");
                    else  JOptionPane.showMessageDialog(null, name); break;
                 
                case 5:  int op=Integer.parseInt(JOptionPane.showInputDialog("قم بإختيار أحد الخيارات التالية:\n1-لطباعة مجموع الدرجات"
                        + "\n2-لطباعة متوسط الدرجات"));
                switch (op) {
                    case 1:  JOptionPane.showMessageDialog(null, "مجموع الدرجات هي:\n"+sum); break;
                    case 2:  JOptionPane.showMessageDialog(null, "مجموع الدرجات هي:\n"+avg); break;
                } break;
                
                case 6: String search2=JOptionPane.showInputDialog("أدخل اسم الطالب");
                        for (int i=0; i<names.length;i++) 
                    if (names[i].equals(search2)) { counter++;
                    name+=names[i]+" "+id[i]+" "+marks[i]+"\n";}
                       if(counter==0)  JOptionPane.showMessageDialog(null, "لا توجد نتائج تطابق بحثك");
                    else  JOptionPane.showMessageDialog(null, name); break;
                    
                case 7:  op=Integer.parseInt(JOptionPane.showInputDialog("قم بإختيار أحد الخيارات التالية:\n1-استعراض بيانات الطلاب أقل من درجة محددة\n"
                        + "2- استعراض بيانات الطلاب أعلى من او تساوي درجة محددة\n3-استعراض بيانات الطلاب التي تقع درجاتهم داخل نطاق محدد"));
                        switch (op) {
                            case 1: double min=Double.parseDouble(JOptionPane.showInputDialog("ادخل الدرجة"));
                                    for (int i=0; i<names.length;i++) 
                                    if (marks[i]<min) {counter++;
                    name+=names[i]+" "+id[i]+" "+marks[i]+"\n";}
                        if(counter==0)  JOptionPane.showMessageDialog(null, "لا توجد نتائج تطابق بحثك");
                    else  JOptionPane.showMessageDialog(null, name); break;
                    
                            case 2: min=Double.parseDouble(JOptionPane.showInputDialog("ادخل الدرجة"));
                                    for (int i=0; i<names.length;i++) 
                                    if (marks[i]>=min) { counter++;
                    name+=names[i]+" "+id[i]+" "+marks[i]+"\n";}
                        if(counter==0)  JOptionPane.showMessageDialog(null, "لا توجد نتائج تطابق بحثك");
                    else  JOptionPane.showMessageDialog(null, name); break;
                    
                            case 3: min=Double.parseDouble(JOptionPane.showInputDialog("أدخل الدرجة من: "));
                                    double max =Double.parseDouble(JOptionPane.showInputDialog("أدخل الردجة إلى:"));
                                    if (min>max) {
                                        double temp=min;
                                        min=max;
                                        max=temp;
                                    }
                                    for (int i=0; i<names.length;i++) 
                                    if (marks[i]>=min && marks[i]<=max) { counter++;
                                        name+=names[i]+" "+id[i]+" "+marks[i]+"\n";}
                                        if(counter==0)  JOptionPane.showMessageDialog(null, "لا توجد نتائج تطابق بحثك");
                    else  JOptionPane.showMessageDialog(null, name);
                                        break;} break;
                        }
                    stop=JOptionPane.showInputDialog("Enter 0 to STOP or ENTER to continue");
                     name="البيانات المطلوبة هي:\n";
                     counter=0;
                    
            } while (!"0".equals(stop));
        }
    
    
    }

