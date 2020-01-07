package google;
import java.io.IOException;
import java.util.ArrayList;

public class originalResult 
{
	public ArrayList<WebTree> resultTrees;
	public ArrayList<Keyword> lst=new ArrayList<Keyword>();
	public originalResult(String[][] s)
	{
		createKeywordList();
		createEachTree(s);
		setEachTreeScore();
	}
	
	public void createKeywordList()
	{
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
	
	public void createEachTree(String[][] s)
	{
		resultTrees=new ArrayList<WebTree>();
		for(String[] s1:s)
		{
			WebTree t= new WebTree(new WebPage(s1[1],s1[0]));			
			resultTrees.add(t);
			try
			{
				t.root.findChildren();
			}
			catch(Exception e)
			{
				
//				e.printStackTrace();
				continue;
			}
		}
		
	}
	
	public void setEachTreeScore()
	{
		System.out.println("tree有"+resultTrees.size()+"棵");
		for(WebTree tree : resultTrees)
		{
			
			try
			{
				tree.setPostOrderScore(lst);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("root: "+tree.root.webPage.name+" score: "+tree.root.nodeScore+"\ndone");
		}
	}
	
	
}
