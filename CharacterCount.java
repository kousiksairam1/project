package JavaBasics;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Selenium";
		char a[]= s.toCharArray();
		for(int i=0;i<a.length;i++) {
			int count =1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count+=1;
					a[j]=0;
				}
			}
			if(a[i]!=0) {
				System.out.println(a[i]+"----->"+count);
			}
		}

	}

}
