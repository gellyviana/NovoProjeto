public class Data{
	private static final int FORMATO_12 = 12;
	private static final int FORMATO_24 = 24;
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;

	public Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void setDia(int dia)
	{
		this.dia = dia;
	}

	public int getDia()
	{
		return this.dia;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}

	public int getMes()
	{
		return this.mes;
	}

	public void setAno(int ano)
	{
		this.ano = ano;
	}

	public int getAno()
	{
		return this.ano;
	}

	public void setHora(int hora)
	{
		this.hora = hora;
	}

	public int getHora()
	{
		return this.hora;
	}

	public void setMinuto(int minuto)
	{
		this.minuto = minuto;
	}

	public int getMinuto()
	{
		return this.minuto;
	}

	public void setSegundo(int segundo)
	{
		this.segundo = segundo;
	}

	public int getSegundo()
	{
		return this.segundo;
	}


	public String analisaHora()
	{	
		String formatoHora;
		if(this.getHora() >= 0 || this.getHora() <= 11)
		{
			formatoHora = new String("AM");
			return formatoHora;
		}
		else
		{
			formatoHora = new String("PM");
			return formatoHora;
		}

	}

	public void imprimir(int formato)
	{
		/*if(formato != 24 || formato != 12)
		{
			System.out.println("Formato incorreto!");
		}*/
		if(formato == 24)
		{
			System.out.println(this.dia +"/"+this.mes+ "/"+ this.ano+ " " + this.hora + ":" + this.minuto +":" + this.segundo);
		}
		else 
		{
			System.out.println(this.dia +"/"+this.mes+ "/"+ this.ano+ " " + this.hora + ":" + this.minuto +":" + this.segundo + this.analisaHora());

		}

	}
}