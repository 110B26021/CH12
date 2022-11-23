 // CStyle.java,此檔案置於 pack6\subpack1\subsubpack 資料夾內
 package pack6.subpack1.subsubpack;
 public class CStyle
 {
 public int style;

 public CStyle(int n)
 {
 style=n;
 System.out.println("style"+style);
 }
 }
 // CCircle.java, 此檔案置於 pack6\subpack1 資料夾內
 package pack6.subpack1;
 public class CCircle
 {
 public void show()
 {
 System.out.println("show() method of class CCircle called");
 }
 }
 // CRectangle.java, 此檔案置於 pack6\subpack2 資料夾內
 package pack6.subpack2;
 public class CRectangle
 {
 public void show()
 {
System.out.println("show() method of class CRectangle called");
}
}
// hw12_8.java, 此檔案置於 pack6 資料夾內


 package pack6;
 import pack6.subpack1.CCircle;
 import pack6.subpack2.CRectangle;
 import pack6.subpack1.subsubpack.CStyle;
 public class hw12_8
 {
 public static void main(String args[])
 {
 CCircle cir=new CCircle();
 CRectangle rect=new CRectangle();
 CStyle sty=new CStyle(1);
 cir.show();
 rect.show();
 }
 }
/* output-----------------------------------------------------
C:\Documents and Settings\Administrator>cd c:\java
C:\Java>cd hw12_8
C:\Java\hw12_8>javac pack6\subpack1\CCircle.java
C:\Java\hw12_8>javac pack6\subpack2\CRectangle.java
C:\Java\hw12_8>javac pack6\subpack1\subsubpack\CStyle.java
C:\Java\hw12_8>javac pack6\hw12_8.java
C:\Java\hw12_8>java pack6.hw12_8
style1
show() method of class CCircle called
show() method of class CRectangle called
-----------------------------------------------------------*/
