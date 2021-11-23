import java.util.Random;


public class MakeNickName{
	String name;
	int num;
	String nickname;

	void SetName(String name,int num){
			this.name = name;
			this.num = num;

	}

	String GetName(){
		int namenum = this.num;

		switch(namenum){
		case 0:
			this.nickname = Mix(name);
			System.out.print(namenum + "\n");
			break;
		case 1:
			this.nickname = PP(name);
			System.out.print(namenum + "\n");
			break;
		case 2:
			this.nickname = Ti(name);
			System.out.print(namenum + "\n");
			break;
		case 3:
			this.nickname = Re(name);
			System.out.print(namenum + "\n");
			break;
		case 4:
			this.nickname = Ky(name);
			System.out.print(namenum + "\n");
			break;
		case 5:
			this.nickname = Ds(name);
			System.out.print(namenum + "\n");
			break;
		case 6:
			this.nickname = Pi(name);
			System.out.print(namenum + "\n");
			break;
		case 7:
			this.nickname = Pn(name);
			System.out.print(namenum + "\n");
			break;
		case 8:
			this.nickname = Hi(name);
			System.out.print(namenum + "\n");
			break;
		case 9:
			this.nickname = Dom(name);
			System.out.print(namenum + "\n");
			break;
		case 10:
			this.nickname = Ww(name);
			System.out.print(namenum + "\n");
			break;
		default:
			/*this.nickname = "あだ名無し";
			System.out.print("over the scope \n");*/
			break;
		}

		return(nickname);
	}
		String Mix(String f){
			Random rnd2 = new Random();
			String run1 = "";

			for(int i = 0; i < f.length();i++){
				int ran1 = rnd2.nextInt(f.length());
				run1 = run1 + f.charAt(ran1);
			}
			return run1;
		}
		String PP(String f){
			String pip = "ぴっぴ";
			String f2 = "";
			if(f.length() > 2){
				for(int i = 0; i < f.length() - 1 ;i++){
					f2 = f2 + f.charAt(i);
				}
				f2 += pip;
			}else {
				f2 = f +  pip;
			}
			return(f2);
		}
		String Ti(String f){
			String ti = "っち";
			f += ti;
			return(f);
		}
		String Re(String f){
			String fr = "";
			for(int i = f.length() -1; i >= 0  ;i--){
				fr = fr + f.charAt(i);
			}
			return(fr);
		}
		String Ky(String f){
			String ky = "きゅん";
				f += ky;
			return(f);
		}
		String Ds(String f) {
			String ds = "ドス";
			ds += f;
			return (ds);
		}
		String Pi(String f) {
			String pi = "ぴー";
			String f2 = "";
			if (f.length() > 2) {
				for (int i = 0; i < f.length() - 1; i++) {
					f2 = f2 + f.charAt(i);
				}
				f2 += pi;
			} else {
				f2 = f + pi;
			}
			return(f2);
		}
		String Pn(String f) {
			String pn = "ぽん";
			String f2 = "";
			if (f.length() > 2) {
				for (int i = 0; i < f.length() - 1; i++) {
					f2 = f2 + f.charAt(i);
				}
				f2 += pn;
			} else {
				f2 = f + pn;
			}
			return (f2);
		}
		String Hi(String f) {
			String hi = "姫";
			f+=hi;
			return (f);
		}
		String Dom(String f) {
			f = "どみの";
			return (f);
		}
		String Ww(String f) {
			String ww = "（笑）";
			f+=ww;
			return (f);
		}

}
