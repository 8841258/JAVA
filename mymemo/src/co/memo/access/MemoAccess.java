package co.memo.access;

import java.util.ArrayList;

import co.memo.model.Memo;

public interface MemoAccess {
	
	
	public void insert(Memo memo);
	
	public void update(Memo memo);
	
	public void delete(String date);
	
	public ArrayList<Memo> selectAll();
	
	public Memo selectDate(String Date);
	
	public Memo selectContent(String Content);
	
	
}
