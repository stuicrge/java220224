package chap08.book.Exercise.exercise04;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		String sql = "MySql DB";
		System.out.println(sql+"에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		String sql = "MySql DB";
		System.out.println(sql+"에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		String sql = "MySql DB";
		System.out.println(sql+"를 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		String sql = "MySql DB";
		System.out.println(sql+"에서 삭제");
	}
	
}
