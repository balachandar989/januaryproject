import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

module summa {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MOTHEE\\eclipse-workspace\\.metadata\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.whatsapp.com/download");
		
		
		
}