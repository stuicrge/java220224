package chap13.book.Example.s1307;

public class ChildProduct<T , M , C> extends Product<T,M> {
	private C company;
	public C getcompany(){return this.company;}
	public void setcompany(C company) {this.company = company;}
}
