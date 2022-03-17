package chap08.book.Exercise.exercise04;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		String oracle="Oracle DB";
		System.out.println(oracle+"에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		String oracle = "Oracle DB";
		System.out.println(oracle+"에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		String oracle = "Oracle DB";
		System.out.println(oracle+"에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		String oracle = "Oracle DB";
		System.out.println(oracle+"에서 삭제");
	}

	
	
}
