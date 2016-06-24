
public class AddBinary {
	public String addBinary(String a, String b) {
		if(a==null)
			return b;
		if(b==null)
			return a;
		char[] a_Array = a.toCharArray();
		char[] b_Array = b.toCharArray();
		int i = a_Array.length-1;
		int j = b_Array.length-1;
		int carry = 0;
		int a_num = 0;
		int b_num = 0;
		int temp = 0;
		StringBuilder sb = new StringBuilder();
		while(i>=0||j>=0||carry!=0){
			if(i>=0)
				a_num = Character.getNumericValue(a_Array[i]);
			else
				a_num = 0;
			if(j>=0)
				b_num = Character.getNumericValue(b_Array[j]);
			else
				b_num = 0;
			temp = a_num^b_num^carry;
			carry = (a_num+b_num+carry)>=2?1:0;
			i--;j--;
			sb.append(temp);
		}
		return sb.reverse().toString();
    }
}
