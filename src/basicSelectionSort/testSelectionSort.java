package basicSelectionSort;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class testSelectionSort {
	
	private SelectionSort mySort;

	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public testSelectionSort() {
	}
	@Test
	public void testPositive(){
		mySort = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		System.out.println(Arrays.toString(mySort.basicSelectionSort(arr)));
		assertArrayEquals(Sortedarr, mySort.basicSelectionSort(arr));
	}
	@Test
	public void testNegative(){
		mySort = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[4] = -2;
		Sortedarr[3] = -7;
		Sortedarr[2] = -8;
		Sortedarr[1] = -9;
		Sortedarr[0] = -10;
		System.out.println(Arrays.toString(mySort.basicSelectionSort(arr)));
		assertArrayEquals(Sortedarr, mySort.basicSelectionSort(arr));
	}

	@Test
	public void testMixed(){
		mySort = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 0;
		arr[3] = -10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = 0;
		Sortedarr[3] = 2;
		Sortedarr[4] = 8;
		System.out.println(Arrays.toString(mySort.basicSelectionSort(arr)));
		assertArrayEquals(Sortedarr, mySort.basicSelectionSort(arr));
	}
	@Test
	public void testDuplicates(){
		mySort = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -9;
		Sortedarr[1] = 2;
		Sortedarr[2] = 7;
		Sortedarr[3] = 8;
		Sortedarr[4] = 8;
		System.out.println(Arrays.toString(mySort.basicSelectionSort(arr)));
		assertArrayEquals(Sortedarr, mySort.basicSelectionSort(arr));
	}

}
