package k_game;

// ����� ����������� ����������, � �.�. � ��
public class Person
{
	 String p_location; 	    // ������� ������ ���������
     int p_id_location;       // ��� �������
     String[] p_invent;      // �������� ���������

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