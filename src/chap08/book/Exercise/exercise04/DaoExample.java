package chap08.book.Exercise.exercise04;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
