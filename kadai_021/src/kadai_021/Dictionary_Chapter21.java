package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 extends DictionaryExec_Chapter21{
	
	
		HashMap<String,String> dictionary = new HashMap<String,String>();
		String word;
		
		public void wordPut() {
			dictionary.put("apple", "りんご");
			dictionary.put("peach", "桃");
			dictionary.put("banana", "バナナ");
			dictionary.put("lemon", "レモン");
			dictionary.put("pear", "梨");
			dictionary.put("kiwi", "キウイ");
			dictionary.put("strawberry", "いちご");
			dictionary.put("grape", "ぶどう");
			dictionary.put("muscat", "マスカット");
			dictionary.put("cherry", "さくらんぼ");
		 }
		
         public void setSearchWord(String word) {
	     this.word = word;
         } 

         public void search() {
        	 if(dictionary.containsKey(word)) {
        		 System.out.println(word + "は" + dictionary.get(word) + "です");
        	 }
        	 else {
        		 System.out.println(word + "は辞書に存在しません");
        	 }
         }
}