package randomdata;
import java.util.Random;

public class RandomTool {
	Random rd=new Random(System.currentTimeMillis());
	private String[] fuhao={",","��","!","?"};
	private String[] chenghu={
			"�ֵ�","�ҵ���","�ǰ�","��","����","����","����","�߹�ȥ","��������","¥��",
			"��","��","������","������","�Ҳ�","��������","�ǺǺ�","������","����","����",
			"�ҷ���","�Ҿ���","����˵","����Ϊ","����","����","лл","�Բ���","������","��л��",
			"������","����ing","��ô��","��һ��","��","��","�Ǻ�","��ȥ","�ȿ�","������",
	};

	// private String chenshuju={};
	public String Randomfuhao() {
		int haha = Randomnum(1, 4);
		String result = fuhao[haha-1];

		return result;
	}
	public String Randomchenghu() {
		int haha = Randomnum(1, 40);
		String result = chenghu[haha-1];

		return result;
	}	
	public int Randomnum(int a,int b){
		int result=a;
		
		result=a+rd.nextInt(b-a+1);;
		return result;
		
	}
	public String Randomname(int seed){
		
		char tmp='a';
		int length=Randomnum(3,8);
		String result="";
		for(int i=0;i<length;i++){
		tmp=(char)('a'+(seed+i+Randomnum(3,8))%26);
			result+=tmp;
			
		}
		return result;
		
		
	}
	/*public String Randomsentence(){}*/
	public int RandomDate(){
		int y=Randomnum(90,99),m=Randomnum(1,12),d=Randomnum(1,28);
		
		
		return y*10000+m*100+d;
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		RandomTool rdt=new RandomTool();
		/*for(int i=0;i<=100;i++){
			System.out.print(rdt.Randomnum(4, 9)+"  ");
			
		}*/
		
		/*
		for(int i=0;i<=10;i++){
			System.out.println(rdt.RandomDate());
		}*/
		

		/*for(int i=0;i<=10;i++){
			System.out.println(rdt.Randomname(i));
		}*/
	}

}
