package day_05_07_2019Recap;

public class amazonTest {
	
	public static void main (String[] args) {
		
		amazon.navigate(testData.url);
		amazon.login(testData.userName,testData.password);
		amazon.search(testData.item);
	}
}
