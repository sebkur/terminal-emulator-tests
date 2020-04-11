package de.topobyte.terminalemulation.tests;

public class TestPalette
{

	public static void main(String[] args)
	{
		for (int c = 40; c <= 47; c++) {
			print(c, String.format("test %d", c));
			print(0, "\n");
		}
		for (int c = 30; c <= 37; c++) {
			print(c, String.format("test %d", c));
			print(0, "\n");
		}
		for (int c : new int[] { 39, 49 }) {
			print(c, String.format("test %d", c));
			print(0, "\n");
		}
		System.out.printf("\033[0;1;39;40mtest");
		print(0, "\n");
	}

	private static void print(int color, String text)
	{
		System.out.printf("\033[%dm%s", color, text);
	}

}
