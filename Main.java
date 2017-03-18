import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Main{
	public static void main(String[] args)
	{
		HashMap<String, Integer> palavras; 
		Scanner leitor = new Scanner(System.in);
		Set<String> chaves; 
		String frase = "";
		String opcao="";
		boolean valorLogico = true;

		while(valorLogico)
		{
			System.out.println("===============================");
			System.out.println("Digite 1 para escrever texto:  ");
			System.out.println("Digite 2 para imprimir frase:  ");
			System.out.println("Digite 3 para sair ");
			System.out.println("===============================");

			opcao=leitor.nextLine();
			if(opcao.contains("1")){
				System.out.println("Digite o texto:");
				frase = leitor.nextLine();
				
				palavras= new HashMap<String, Integer>();
				for(String word: frase.split(" "))
				{
					if(palavras.get(word)!= null)
					{
						palavras.put(word,palavras.get(word)+1);
					}
					else
					{
						palavras.put(word,1);
					}
				}

				chaves=palavras.keySet();
				for(String chave: chaves )
				{
					if(chave != null)
					{
						System.out.println(chave +"\t"+ palavras.get(chave));
					}
				}

			}
			else if(opcao.contains("2"))
			{
				System.out.println(frase);
			}
			else if(opcao.contains("3"))
			{	
				valorLogico = false;
			}
			else 
			{
				System.out.println("Opção incorreta, digite novamente");
			}
			
		}
		
	}
}
