package facebook.interfaces;


public interface VertexFactory <V extends IVertex>
{
    V create();
    V create(int id, String data);
}
