package k_game;

// ����� �����
public class Gen 
{

	public static void main(String[] args)
	{
        Items[] item = new Items[5];
        Location[] locat = new Location[3];

        CreateLocation(locat);
        CreateItems(item);

        Person gg = new Person(0);
        gg.setIdLocation(0); // ������������� �� id ��������
        locat[gg.getIdLocation()].setLocation(locat[gg.getIdLocation()]);  // �������� � ���� Location ������ � ����� ��������������

        PrintLocation(gg, locat );
	}

    public static void CreateItems(Items[] item)
    {
        for(int i=0; i<item.length; i++){item[i] = new Items();}

        item[0].setItems("�����", "���������");
        item[1].setItems("�����", "������", "���������");
        item[2].setItems("����", "���");
        item[3].setItems("�������", "���");
        item[4].setItems("������", "���������");
    }

    public static void CreateLocation(Location[] locat)
    {

        for(int i=0; i<locat.length; i++){locat[i] = new Location();}

        locat[0].setLocation("���������", "�� ���������� � ���������. \n� ���� ������ ���������");
        locat[1].setLocation("���", "�� ��������� � ����. \n����� ������ ����� �������. ���-�� ������ � ������� �������.");
    }

    public static void PrintLocation(Person gg, Location[] locat)
    {
        locat[gg.getIdLocation()].getDescriptionLocation();
    }

}
