import java.util.Date;
public class Eto {
	
	
	public static void main(String[] args) {
    	
		//西暦を2023とする。
		int year = 2023;
      
        String jikkan = getJikkan(year);
        String junishi = getJunishi(year);
        System.out.println(year + "年の干支は、" + junishi + jikkan + "です。");
    }
	
	
	 private enum jikkan {
	        KANOE("庚"), KANOTO("辛"), MIZUNOE("壬"), MIZUNOTO("癸"), KINOE("甲"), KINOTO("乙"), HINOE("丙"), HINOTO("丁"), TSUCHINOE("戊"), TSUCHINOTO("己");
	        
	        private final String jikkanNum;
	        
	        jikkan(String jikkanNum) {
	            this.jikkanNum = jikkanNum;
	        }
	        
	         public String getKanji() {
	        	 
	            return  jikkanNum;
	        }
	    }
	    
	    private enum junishi {
	    	SARU("申"), TORI("酉"), INU("戌"), I("亥"), NE("子"), USHI("丑"), TORA("寅"), U("卯"), TATSU("辰"), MI("巳"), UMA("午"), HITSUJI("未");
	        
	        private final String name;
	        
	        junishi(String name) {
	            this.name = name;
	        }
	        
	        public String getName() {
	        	return  name;
	        }
	    }
	    
	    
	    
	    private static String getJikkan(int year) {
	    	
	        int jikkanNum  = year % 10;
	        String result = "";
	        switch (jikkanNum) {
	            case 0: 
	            result =  jikkan.KANOE.getKanji();
	            break;
	            case 1:  
	            result =  jikkan.KANOTO.getKanji();
	            break;
	            case 2: 
	            result =  jikkan.MIZUNOE.getKanji();
	            break;
	            case 3: 
	            result =   jikkan.MIZUNOTO.getKanji();
	            break;
	            case 4: 
	            result =   jikkan.KINOE.getKanji();
	            break;
	            case 5: 
	            result =   jikkan.KINOTO.getKanji();
	            break;
	            case 6: 
	            result =   jikkan.HINOE.getKanji();
	            break;
	            case 7: 
	            result =   jikkan.HINOTO.getKanji();
	            break;
	            case 8: 
	            result =   jikkan.TSUCHINOE.getKanji();
	            break;
	            case 9: 
	            result =   jikkan.TSUCHINOTO.getKanji();
	            break;
	            
	        }
	         return result;
	    }
	    
	    private static String getJunishi(int year) {
	        int remainder = year % 12;
	        String result = "";
	        switch (remainder) {
	            case 0: 
	            result = junishi.SARU.getName();
	            case 1: result =  junishi.TORI.getName();
	            case 2: result =  junishi.INU.getName();
	            case 3: result =  junishi.I.getName();
	            case 4: result =  junishi.NE.getName();
	            case 5: result =  junishi.USHI.getName();
	            case 6: result =  junishi.TORA.getName();
	            case 7: result =  junishi.U.getName();
	            case 8: result =  junishi.TATSU.getName();
	            case 9: result =  junishi.MI.getName();
	            case 10: result =  junishi.UMA.getName();
	            case 11: result =  junishi.HITSUJI.getName();
	            
	        }
	        return result;
	    }
}
