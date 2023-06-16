// lv.1 ���� ���� �� �����ϱ�
package Test06.Test0616_P;

import java.util.Arrays;

public class Ayoung {
	public static class Solution {
	    public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length-1]; // �Է¹��� ũ�⺸�� �� ĭ �۰� �迭 ���� (���� �� �ϳ� ������ϱ�)
	        int minNum = arr[0]; // ���� ���� �� �ʱ갪 ����
	        int j =0; // answer �迭�� ���� ����
	                
	        if (arr.length <= 1){ // �迭 ���̰� 1ĭ ������ ���
	            return new int[] {-1}; // ���� -1�� �迭 ����
	        }else{ // �ƴ� ���
	            for (int i=0; i<arr.length ; i++){ // �ּڰ� ���ϱ�
	                if(minNum > arr[i]){
	                    minNum = arr[i];
	                }
	            }
	            
	            for(int i=0; i<arr.length; i++){ // �������� ������ �迭 ����
	                if(arr[i] != minNum){ // ���� ���� ���ڰ� �ƴ� ��쿡��
	                    answer[j] = arr[i]; // ���� �迭�� �� ����
	                     j++;
	                }
	            }                  
	        return answer;
	        }
	    	}
	    }
	    
	    public static void main(String args[]) {
	    	Solution solution = new Solution();
	    	// �׽�Ʈ ���̽���
	    	int [] arr1 = {1,2,3,4};
	    	int [] arr2 = {3,7,4,8};
	    	int[] arr3 = {10};
	    	
	    	// �׽�Ʈ ���̽��� ���ڿ��� �ٲ� ���
	    	System.out.println(Arrays.toString(solution.solution(arr1)));
	    	System.out.println(Arrays.toString(solution.solution(arr2)));
	    	System.out.println(Arrays.toString(solution.solution(arr3)));
	    }
}
