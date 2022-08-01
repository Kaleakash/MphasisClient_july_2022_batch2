package com;

public class SortingExamples {

	//{4,1,6,9,7,3,2,5};
	public static void selectionSort(int num[], int leng) {
		for(int i=0;i<leng-1;i++) {
			int min = i;
			for(int j=i+1;j<leng;j++) {
					if(num[j]<num[min]) {
						min = j;
					}
			}
					int temp = num[i];
					num[i]=num[min];
					num[min]=temp;
		}
	}
	public static void bubbleSort(int num[], int leng) {
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}
	// {4,1,6,9,7,3,2,5};
	public static void insertionSort(int num[], int leng) {
		for(int i=1;i<leng;i++) {
			int key = num[i];
			int j=i-1;					// 0, key = 1
			while(j >= 0 && key < num[j]) {
				num[j+1] = num[j];
				--j;
			}
			num[j+1]=key;
		}
	}
	public static void merge(int num[], int start, int mid, int end) {
			// coding to do sorting 
			int leftSize  = mid - start +1; 
			int rightSize = end - mid;
			int leftArray[]=new int[leftSize];					// 4 
			int rightArray[]=new int[rightSize];				// 4
		
			for(int i=0;i<leftArray.length;i++) {
						leftArray[i]= num[start+i];			// assign or store right half element from left array 
			}
			
			for(int j=0;j<rightArray.length;j++) {
					rightArray[j]=num[mid+1+j];				// assing or store right side half element from right array 
			}
			
			int i=0,j=0,k=start;
			
			while(i < leftSize && j< rightSize) {
				if(leftArray[i] <= rightArray[j]) {
					num[k]=leftArray[i];
					i++;
				}else {
					num[k]=rightArray[j];
					j++;
				}
				k++;
			}
			
			while(i < leftSize) {
				num[k] = leftArray[i];
				i++;
				k++;
			}
			while(j < rightSize) {
				num[k] = rightArray[j];
				j++;
				k++;
			}
			
	}
	public static void mergeSort(int num[], int start, int end) {
				if(start<end) {
					int mid= (start+end)/2;
					mergeSort(num, start,mid);
					mergeSort(num, mid+1, end);
					merge(num,start,mid,end);
				}
	}
	public static void main(String[] args) {
		int num[]={4,1,6,9,7,3,2,5};
		System.out.println("Before Sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
		//selectionSort(num, num.length);
		//bubbleSort(num, num.length);
		//insertionSort(num, num.length);
		mergeSort(num, 0, num.length-1);
		System.out.println("After Sort");
		for(int n:num) {
			System.out.print(n +" ");
		}
	}

}
