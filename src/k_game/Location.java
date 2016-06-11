package k_game;

// класс описывающий локации
public class Location
{
    String l_name; // название локации
    String l_text;      // описание локации (необезательный)
    String[] l_items;	// предметы на локации
	String[] l_sosed;	// название соседних локаций, нужно для перехода между ними


  /*  public Location()
    {
        l_name="1";
        l_text="2";
    }*/
    public void setLocation(String name, String text, String[] items, String[] sosed)
    {
        this. l_name = name;
        this. l_text = text;
        this. l_items = items;
        this. l_sosed = sosed;
    }

    public void setLocation(String name, String text)
    {
        this. l_name = name;
        this. l_text = text;
    }

    public void setLocation(Location location_object)
    {
        this.l_name = location_object.l_name;
        this.l_text = location_object.l_text;
        this.l_items = location_object.l_items;
        this.l_sosed = location_object.l_sosed;
    }
    public String getLocationName()   // нужен ли он?
    {
        return this.l_name;
    }

    // выводит название и описание локации
    public void getDescriptionLocation()
    {
        System.out.println("\n= = = = Вы находитесь в локации " + this.l_name + " = = = =");
        System.out.println(this.l_text);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =\n");
    }

}