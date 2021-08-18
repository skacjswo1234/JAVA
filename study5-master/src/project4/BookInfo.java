package project4;

import java.util.ArrayList;
import java.util.List;

public class BookInfo {
	public static List<BookInfo> bookInfoList;
	static {
		bookInfoList = new ArrayList<>();
	}
	private String bookName;
	private String companyName;
	private int price;

	public BookInfo(String bookName, String companyName, int price) {
		this.bookName = bookName;
		this.companyName = companyName;
		this.price = price;
	}
	
	public static BookInfo get(String bookName) {
		BookInfo result = null;
		
		for(BookInfo bookInfo : BookInfo.bookInfoList) {
			boolean nameSame = bookInfo.getBookName().equals(bookName);
			
			if(nameSame) {
				result = bookInfo;
			}  // end if
			} // end for
		 
		return result;
		}
	
	public static boolean delete(String bookName) {
		boolean result = false;
		
		int index = 0;
		
		for(BookInfo bookInfo : BookInfo.bookInfoList) {
			boolean nameSame = bookInfo.getBookName().equals(bookName);
			
			if(nameSame) {
				BookInfo.bookInfoList.remove(0);
				result = true;
				break;
			}  // end if
			
			index++;
			} // end for
		BookInfo.bookInfoList.remove(index);
		return result;
		
	}

	public boolean add() {
		boolean same = false;
		// 도서의 정보 저장
		for(BookInfo bookInfo : BookInfo.bookInfoList) {
			boolean nameSame = bookInfo.getBookName().equals(bookName);
			boolean companySame = bookInfo.getCompanyName().equals(companyName);
			boolean priceSame = bookInfo.getPrice() == price;
			
			// n번째 도서의 정보와 현재 추가하려는 도서의 정보가 같은지 체크
			// 같다면 true, 다르다면 false
			same = nameSame && companySame && priceSame;
			if(same) break;
		}
		
		if(!same) {
			BookInfo.bookInfoList.add(this);
		}
		

		// true -> 정보를 성공적으로 저장했음
		// false -> 정보를 성공적으로 저장하지 못했음
		return !same;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override 
	public String toString() {
		return "bookName=" + bookName+", companyName=" + companyName+", price="+price;
	}
}
