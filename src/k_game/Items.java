package k_game;

public class Items 
{
    String i_name;                  // �������� ��������
    String i_action;                // �������� ��� ����
    String i_location_by_default;   // ������� ��������

    // �����������
    public Items()
    {
        this.i_action = "�����";
    }

    public void setItems(String name, String action, String location)
    {
        this.i_name = name;
        this.i_action = action;
        this.i_location_by_default = location;
    }

    public void setItems(String name, String location)
    {
        this.i_name = name;
        this.i_location_by_default = location;
    }

    public void setAction(String action)
    {
        this.i_action = action;
    }
}
