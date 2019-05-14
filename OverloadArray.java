public class OverloadArray
{
public static void print(int[] a)
{
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
}

public static void print(float[] a)
{
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
}
public static void print(char[] a)
{
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
}
public static void print(Integer[] a)
{
for(Integer e:a)
System.out.println(e);
}



public static void print(Double[] a)
{
for(Double e:a)
System.out.println(e);
}
public static void main(String[] args)
{
int[] a={1,2,3,4,5};
float[] b={1.1f,1.2f,1.3f,1.4f,1.5f};
char[] c={'a','b','c','d','e'};

Integer[] a1={32,35,46,54};
Double[] d={2.1,35.8,677.9,90.0};

System.out.println("Integer value");
print(a);
System.out.println("float value");
print(b);
System.out.println("character value");
print(c);
System.out.println("Integer value");
print(a1);
System.out.println("Double value");
print(d);

}
}