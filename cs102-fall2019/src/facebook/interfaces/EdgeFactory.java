package facebook.interfaces;

public interface EdgeFactory <E,V>{
    E create(V source, V target);
}
