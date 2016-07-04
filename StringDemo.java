package acadgild.bigdata.session.five;

public class StringDemo {

	public static void main(String[] args) {
		String line="Hadoop is open source frame work ,Hadoop is good framework for handling big data";
		String[] items = line.split(" ");
		int c=0;
		int c1=0;
		int c2 =0;
		for (int i=0;i< items.length; i++)
		{
			c+=1;
			System.out.println(c+"."+items[i]);
			if(items[i].contains("Hadoop")){
				c1+=1;
			}
		}
		System.out.println("Hadoop word count in the string : " + c1);
		String line1 = line.replace(",", " ");
		String[] items1 = line1.split(" ");
		for (int j=0; j<items1.length ;j++)
		{
			c2+=1;
			System.out.println(c2+"."+ items1[j]);
		}
	}
	

}
