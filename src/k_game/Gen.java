package k_game;

// Точка входа
public class Gen 
{

	public static void main(String[] args)
	{
        Items[] item = new Items[5];
        Location[] locat = new Location[3];

        CreateLocation(locat);
        CreateItems(item);

        Person gg = new Person(0);
        gg.setIdLocation(0); // устанавливаем ГГ id локациии
        locat[gg.getIdLocation()].setLocation(locat[gg.getIdLocation()]);  // передаем в клас Location объект с нашим местоположение

        PrintLocation(gg, locat );
	}

    public static void CreateItems(Items[] item)
    {
        for(int i=0; i<item.length; i++){item[i] = new Items();}

        item[0].setItems("Ведро", "Гостинная");
        item[1].setItems("Виски", "Выпить", "Гостинная");
        item[2].setItems("Цепь", "Сад");
        item[3].setItems("Лягушки", "Сад");
        item[4].setItems("Сварка", "Мансандра");
    }

    public static void CreateLocation(Location[] locat)
    {

        for(int i=0; i<locat.length; i++){locat[i] = new Location();}

        locat[0].setLocation("Гостинная", "Вы проснулись в гостинной. \nВ углу храпит волшебник");
        locat[1].setLocation("Сад", "Вы оказались в саду. \nоколо забора стоит колодец. Чем-то пахнет и квакают лягушки.");
    }

    public static void PrintLocation(Person gg, Location[] locat)
    {
        locat[gg.getIdLocation()].getDescriptionLocation();
    }

}
