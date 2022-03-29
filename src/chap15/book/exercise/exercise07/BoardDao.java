package chap15.book.exercise.exercise07;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList() {
		List<Board> set = new ArrayList<>();
		
		Board b1 = new Board("제목1","내용1"); 
		Board b2 = new Board("제목1","내용1"); 
		Board b3 = new Board("제목1","내용1"); 
		
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		return set;
		
	}
	
}
