package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)
	{
		final Module mainModule = Main.class.getModule();
		try (final var inputStream = mainModule.getResourceAsStream("log/log.txt"))
		{
			final var reader = new BufferedReader(new InputStreamReader(inputStream));
			while (reader.ready())
			{
				System.out.println(reader.readLine());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
