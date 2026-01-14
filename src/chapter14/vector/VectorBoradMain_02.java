package chapter14.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VectorBoradMain_02 {

	public static void main(String[] args) {

		// List<Board> syncList = new Vector();
		List<Board> syncList = Collections.synchronizedList(new ArrayList<>());
		// 용량이 2배씩 늘어나면 사용하지 않는 공간도 늘어나기 때문에
		// synchronizedList 효율성보좌(사용하는 정보가 들어갈 공간만 만들어줌)
		
		// Board 객체 생성 == 내용
		Board b = new Board("제목1", "내용1", "글쓴이1");
		syncList.add(b);
		
		syncList.add(new Board("제목2", "내용2", "글쓴이2"));
		syncList.add(new Board("제목3", "내용3", "글쓴이3"));
		syncList.add(new Board("제목4", "내용4", "글쓴이4"));
		syncList.add(new Board("제목5", "내용5", "글쓴이5"));
		
		for(int i = 0; i < syncList.size(); i++)
		{
			Board board = syncList.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}// for

		// 내용삭제
		syncList.remove(2);
		System.out.println();
		
		for(int i = 0; i < syncList.size(); i++)
		{
			Board board = syncList.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}// for

		// 내용삭제
		syncList.remove(2);
		System.out.println();
		
		for(int i = 0; i < syncList.size(); i++)
		{
			Board board = syncList.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}// for
	}// main

}
