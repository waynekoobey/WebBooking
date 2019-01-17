import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Google {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\Compressed\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        String baseUrl = "http://google.com";
        String ExpectedResult= "Google";
        String Result=" " ;

        driver.get(baseUrl);
        Result= driver.getTitle();
        if (Result.contentEquals(ExpectedResult)){
            System.out.println("Pass");
        }
        else System.out.println("Fail");
        WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        searchbar.sendKeys("hay hay tv");
        WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
        searchbutton.submit();
    }
}
