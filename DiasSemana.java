import java.util.HashSet;
/**
 * Escreva a descrição da classe DiasSemana aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class DiasSemana
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private HashSet<String> dias;

    /**
     * COnstrutor para objetos da classe DiasSemana
     */
    public DiasSemana()
    {
        // inicializa variáveis de instância
        dias = new HashSet<String> ();
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void guardaDias(String str)
    {
        // ponha seu código aqui
        dias.add(str);
    }
    
    public void mostraDias()
    {
        for(String element: dias)
        {
            System.out.println(element + " ;");
        }
    }
}
