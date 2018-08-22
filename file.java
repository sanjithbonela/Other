package file;

import java.io.*;

public class file {
	public static void main(String[] args) throws Exception{
		int i;
		File f = new File("./Training");
		boolean b=f.mkdir();
		//System.out.println(b);
		Employee e1=new Employee(1,"san",50000,"CIB");
		Employee e2=new Employee(2,"freeze",100000,"CIB");
		FileOutputStream fis=new FileOutputStream("./Training/Emp.txt");
		int ch;
		String s1 = Integer.toString(e1.getId())+" "+e1.getName()+" "+Double.toString(e1.getSalary())+" "+e1.getDomain();
		String s2 = Integer.toString(e2.getId())+" "+e2.getName()+" "+Double.toString(e2.getSalary())+" "+e2.getDomain();
		byte[] bt =s1.getBytes();
		fis.write(bt);
		fis.write(System.getProperty("line.separator").getBytes());
		byte[] bt2=s2.getBytes();
		fis.write(bt2);
		fis.close();
		fis=new FileOutputStream("./Training/EmpCopy.txt");
		FileInputStream fos=new FileInputStream("./Training/Emp.txt");
		while((ch=fos.read())!=-1){
			String s=Character.toString((char)ch);
			fis.write(s.getBytes());
		}
		fis.close();
		fos.close();
	}
}
