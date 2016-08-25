public class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        char temp;
        while(left < right)
        {
        	if(!vowels.contains(arr[left]))
        	{
        		left++;
        		continue;
        	}
        	if(!vowels.contains(arr[right]))
        	{
        		right--;
        		continue;
        	}
        	temp = arr[left];
        	arr[left] = arr[right];
        	arr[right] = temp;
        	left++;
        	right--;
        }
        return new String(arr);
    }
}