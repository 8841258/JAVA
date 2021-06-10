package co.memo.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.memo.model.Memo;
import co.memo.util.ScannerUtil;

public class MemoList implements MemoAccess {
	ArrayList<Memo> memos; //ArrayList도 가능.
	String path = "d:/temp/memo.txt";
	
	public MemoList () {
		memos = new ArrayList<Memo>();
		open();
	}
	
	public void save() {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path));
			for (Memo f : memos) {
				fw.write(String.format("%s,%s\n", f.getDate(), f.getContent()));
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while(true) {
				String str = scanner.next();
				if (str == null) break;
				String[] arr = str.split(",");
				memos.add(new Memo(arr[0], arr[1]));
				
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void insert(Memo memo) {
		memos.add(memo);
		save();
		
	}

	@Override
	public void update(Memo memo) {
		 for (Memo f : memos) {
		 if (f.getDate().equals(memo.getDate())) {
		 f.setContent(memo.getContent());
		 save();
		 break;
		 }
		 }
		 
		
	}
		
	

	@Override
	public void delete(String Date) {
		for (Memo f : memos) {
			if (f.getDate().equals(Date)) {   
			memos.remove(f);
			save();
			break;
			}
		}
		}
		
		

	@Override
	public ArrayList<Memo> selectAll() {
		return memos;
	}

	@Override
	public ArrayList<Memo> selectDate(String Date) {
		for (Memo f : memos) {
			if (f.getDate().equals(Date)) {   
				//equal은 완전 일치. contains는 포함. startWith ~로 시작하는 endWith ~로 끝나는
				return null;
			}
		}
		return null;
		
		
		
	}

	@Override
	public ArrayList<Memo> selectContent(String Content) {
		for (Memo f : memos) {
			if (f.getContent().contains(Content)) {   
				//equal은 완전 일치. contains는 포함. startWith ~로 시작하는 endWith ~로 끝나는
				return null;
			}
		}
		return null;
		
	}
	
}
