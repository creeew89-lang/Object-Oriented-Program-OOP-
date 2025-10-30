package Hospital.interfaces;


import java.util.List;

public interface Manageable {
    boolean add(Object entity);

    boolean remove(String id);

    List<Object> getAll();
}
