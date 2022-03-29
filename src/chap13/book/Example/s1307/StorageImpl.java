package chap13.book.Example.s1307;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		array[index]=item;
	}

	@Override
	public T get(int index) {
		
		return array[index];
	}
	
}
