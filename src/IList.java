public interface IList {

    int size();

    void add(final Object element);

    void set(final int index, final Object object);

    void removeLast();

    Object get(final int index);

}
