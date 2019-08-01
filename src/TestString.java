
public class TestString {
	public static void main(String[] args) {
//	       System.out.println("Hello Java");
	String standardProductTitle = "123 fdjisfodijsfdsfds rew ruewirewirewireowrewrewrw";
	
//	standardProductTitle = standardProductTitle.substring(0, Math.min(standardProductTitle.length(), 12));
	String[] standardProductTitleArr = standardProductTitle.split("\\s+");
	String a ="";
	for(int i = 0; i< standardProductTitleArr.length; i++){
		standardProductTitleArr[i] = standardProductTitleArr[i].substring(0, Math.min(standardProductTitleArr[i].length(), 12));
		a=standardProductTitleArr[i];
	}
	System.out.println(standardProductTitleArr);
	String standardProductTitleNew=a.toString();
//	productBean.setStandardProductTitle(standardProductTitleNew);
	System.out.println(standardProductTitleNew);
	}
}
