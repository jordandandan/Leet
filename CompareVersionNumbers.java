
public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int len = Math.max(v1.length, v2.length);
		for(int i=0;i<len;i++){
			Integer a = i<v1.length?Integer.parseInt(v1[i]):0;
			Integer b = i<v2.length?Integer.parseInt(v2[i]):0;
			int cmp = a.compareTo(b);
			if(cmp!=0)
				return cmp;
		}
		return 0;
    }
}
