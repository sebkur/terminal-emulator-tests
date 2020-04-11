package de.topobyte.terminalemulation.tests;

public class TestPalette
{

	public static void main(String[] args)
	{
		for (int c = 40; c <= 47; c++) {
			print(c, String.format("test %d\n", c));
			print(0, " ");
		}
		for (int c = 30; c <= 37; c++) {
			print(c, String.format("test %d\n", c));
			print(0, " ");
		}
	}

	private static void print(int color, String text)
	{
		System.out.printf("\033[%dm%s", color, text);
	}

}
