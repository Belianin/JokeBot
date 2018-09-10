import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JokeBot {

	public static void main(String[] args) throws IOException {
		int jokeCounter = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] jokes = new String[] {"Kolobok hanged himself! :)", "Buratino is drown. :(",
				"�������� \"��� �������� ������ �����?\". ������� 48500 ������������� ����.",
				"����� ������ ����������� � ���� - ��� ������, � ��� ����� ���� ����."};
		
		System.out.println("Hello, my name is JokeBot.\nI am a chat-bot. I live to serve humans and tell hilarious jokes!\nWanna some?");
		loop1 : while (true)
		{			
			switch (br.readLine().toLowerCase().replaceAll("\\s",""))
			{
			case "yes":
			{
				System.out.println(jokes[jokeCounter++ % jokes.length]);
				System.out.println("Another one?");
				break;
			}
			case "no":
			{
				System.out.println("Well, you can say \"stop\" to end our conversation\nOr may be you DO want a joke?");
				break;
			}
			case "stop":
			{
				System.out.println("Okay, goodbye!");
				break loop1;
			}
			default:
			{
				System.out.println("Sorry, i can't understand you.\nIf you wanna joke, just say \"yes\".\nOr if i bother you say \"stop\".");
				break;
			}
			}
		}

	}

}
