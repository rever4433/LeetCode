package ValidAnagram.quickSort;
/**
 * 
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018��7��26�� ����10:39:48
 *
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        change(c1,0,c1.length-1);
        change(c2,0,c2.length-1);
        s=String.valueOf(c1);
        t=String.valueOf(c2);
            if(s.equals(t)) return true;
        else return false;  
    }
    public  static void change(char s[], int l, int r)
	{
	    if (l < r)
	    {
			//Swap(s[l], s[(l + r) / 2]); //���м��������͵�һ�������� �μ�ע1
	        int i = l, j = r;
	        char x = s[l];
	        while (i < j)
	        {
	            while(i < j && s[j] >= x) // ���������ҵ�һ��С��x����
					j--;  
	            if(i < j) 
					s[i++] = s[j];
				
	            while(i < j && s[i] < x) // ���������ҵ�һ�����ڵ���x����
					i++;  
	            if(i < j) 
					s[j--] = s[i];
	        }
	        s[i] = x;
	        change(s, l, i - 1); // �ݹ���� 
	        change(s, i + 1, r);
	    }
	}
}