package k_game;

// класс описывающий персонажей, в т.ч. и ГГ
public class Person
{
	 String p_location; 	    // текущая локаци¤ персонажа
     int p_id_location;       // код локации
     String[] p_invent;      // элементы инвентаря

    public Person()
    {
       // p_id_location = 1;
    }

    public Person(int id_location)
	{
        this.p_id_location = id_location;
	}

	public void setIdLocation(int id_location)
	{
		this.p_id_location = id_location;
	}

	public int getIdLocation()
	{
       // System.out.println(this.p_location);
		return this.p_id_location;

	}
}