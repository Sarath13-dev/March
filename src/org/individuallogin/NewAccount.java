package org.individuallogin;

public   class NewAccount { 
	
public static void main(String[] args) {
	
	int [] a ={10, 0, -1, 10, 9};
	
	int n = 2;
	
	for(int i=0; i< n; i++) {
		int j =0; int last =0;
		last = a[a.length-1];
		for(j=a.length-1; j>0; j--) {
			a[j]=a[j-1];
		}
		a[0]=last;
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
}
}
