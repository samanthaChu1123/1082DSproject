package google;
import java.util.LinkedList;

public class KeywordList  
{
	private LinkedList<Keyword> lst;
	
	public KeywordList()
	{
		
		this.lst = new LinkedList<Keyword>();
		  lst.add(new Keyword("旅遊",5));
		  lst.add(new Keyword("旅行",5));
		  lst.add(new Keyword("跟團",4));
		  lst.add(new Keyword("自由行",4));
		  lst.add(new Keyword("機票",4));
		  lst.add(new Keyword("訂房",4));
		  lst.add(new Keyword("住宿",4));
		  lst.add(new Keyword("景點",4));
		  lst.add(new Keyword("交通",4));
		  lst.add(new Keyword("必買",4));
		  lst.add(new Keyword("飯店",3));
		  lst.add(new Keyword("民宿",3));
		  lst.add(new Keyword("青旅",3));
		  lst.add(new Keyword("伴手禮",2));
		  lst.add(new Keyword("簽證",2));
		  lst.add(new Keyword("匯率",1));
    }
	
}