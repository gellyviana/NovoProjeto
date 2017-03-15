import java.util.HashMap;
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Main
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * COnstrutor para objetos da classe Main
     */
    public static void main(String[] args)
    {
        DiasSemana var = new DiasSemana();
        var.guardaDias("Segunda");
        var.guardaDias("Terça");
        var.guardaDias("Quarta");
	var.guardaDias("Quinta");
	var.guardaDias("Sexta");
	var.guardaDias("Sabado");
	var.guardaDias("Domingo");
	var.guardaDias("segunda");
        
        var.mostraDias();
	
	System.out.println("================");
	HashMap<String, String> phoneBook = new HashMap<String, String>();
	phoneBook.put("Gelly Viana", "99977-7417");
	phoneBook.put("Marciel Manoel", "3672-1796");
	phoneBook.put("Assis", "98888-8888");
	String phoneNumber = phoneBook.get("Assis");
	System.out.println(phoneNumber);

	for( String x: phoneBook.values())
	{
		System.out.println(x);
	}        
    }
}
