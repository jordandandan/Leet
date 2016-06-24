import java.util.ArrayList;
import java.util.List;

/*As we known:

	Gi = Bi+1 xor Bi
	For example, trans binay '001' to gray code:

	tmp = 001 << 1
	then,

	bin 0 0 0 1
	tmp 0 0 1 0
	-xor------------
	    0 0 1 1
	and the gray code is:
	0 0 1 1 >> 1 (ignore last bit) => 0 0 1
	*/

public class GrayCode {
	public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<(1<<n);i++){
        	list.add(((i<<1)^i)>>1);
        }
		return list;
    }
}
