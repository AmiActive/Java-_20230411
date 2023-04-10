package kenshu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Register {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//会員登録者1人目
		int idOne = 0001;
		String nameOne = "山田太郎";
		
		
		//会員登録者2人目
		int idTwo = 0002;
		String nameTwo = "鈴木花子";
		
		//会員登録者3人目
		int idThree = 0003;
		String nameThree = "佐藤琢磨";
		
		//会員登録情報のインスタンス生成
		ArrayList<Kaiin> kaiinAll = new ArrayList<Kaiin>();
		
		
		
		kaiinAll.add(kaiinAdd(idOne,nameOne));
		kaiinAll.add(kaiinAdd(idTwo,nameTwo));
		kaiinAll.add(kaiinAdd(idThree,nameThree));
		
		//会員登録者だけ、繰り返す。
		for(Kaiin kaiin :kaiinAll){
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
	      
			System.out.println(kaiin.getName() + "さんの会員IDは" + kaiin.getId() + "です。　登録:" +sdf.format(kaiin.getAddDate()) );
		}
		 
		

	}
	
	private static Kaiin kaiinAdd(int id,String name){
		
		Kaiin kaiinA = new Kaiin();
		kaiinA.setId(id);
		kaiinA.setName(name);
		kaiinA.setAddDate(new Date());
		
		return kaiinA;
	     
		
		
	}

}
