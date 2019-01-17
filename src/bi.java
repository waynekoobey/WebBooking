import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;


public class bi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\Compressed\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://wb.beta.qup.vn/booking.html?fleet=testbeta#book-info");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);




        WebElement location = driver.findElement(By.xpath("//*[@id=\"contentStep1\"]/div/div[1]/input"));
        location.sendKeys("Hòa Thuận Tây, Hải Châu, Đà Nẵng");




        WebElement destination = driver.findElement(By.xpath("//*[@id=\"contentStep1\"]/div/div[2]/input" ));
        destination.sendKeys("Phan Thanh, Thạc Gián, Thanh Khê, Đà Nẵng 550000");

        location.sendKeys(Keys.DOWN);
        location.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        destination.sendKeys((Keys.DOWN));
        destination.sendKeys((Keys.ENTER));
        Thread.sleep(2000);
        WebElement book = driver.findElement(By.xpath("//*[@id=\"contentStep1\"]/div/a"));
        book.click();
        Thread.sleep(2000);
        WebElement booknow = driver.findElement(By.xpath("//*[@id=\"CarTypes\"]/div/div[3]/div[3]/a[1]/span"));
        booknow.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[1]/div/div[1]/input"));
        FirstName.sendKeys("Nguyen Phuoc ");
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[1]/div/div[2]/input"));
        LastName.sendKeys("Quy Tuan");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement Country = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div[1]"));
        Country.click();
        WebElement vn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[2]/div/div/ul/li[239]/span[1]"));
        vn.click();
        WebElement no = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[2]/div/input"));
        no.sendKeys("0798050196");

        WebElement fn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[5]/div/div[1]/input"));
        fn.sendKeys("123456987");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[3]/input"));
        email.sendKeys("of.quytuan@gmail.com");

        WebElement charge = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[6]/select"));
        fn.click();
        fn.sendKeys(Keys.DOWN);
        fn.sendKeys(Keys.ENTER);

        WebElement reg = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[7]/div/div/select"));
        reg.click();
        reg.sendKeys(Keys.ENTER);

        WebElement note  = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[8]/input"));
        note.sendKeys("Deo co gi de noi");

        WebElement pc = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[8]/input"));
        pc.sendKeys("12");

        WebElement next = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div/div[10]/a[1]"));
        next.click();

        WebElement CH = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div[2]/div/div[2]/input"));
        CH.sendKeys("Quy Tuan");

        WebElement CN = driver.findElement(By.xpath("//*[@id=\"CardNumber\"]"));
        CN.sendKeys("4111 1111 1111 1111");

        WebElement date = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div[2]/div/div[5]/div/div[1]/input"));
        date.sendKeys("1220");

        WebElement CVV = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div[2]/div/div[5]/div/div[2]/input"));
        CVV.sendKeys("321");

        WebElement next2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div[2]/div/div[9]/a[1]"));
        next2.click();

        WebElement Book4now = driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[1]/div[2]/a[1]"));
        Book4now.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement Bookanother = driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[2]/div[2]/a[2]"));
        Bookanother.click();
        Thread.sleep(2000);

        driver.get("https://cclite.beta.qup.vn/login");

        WebElement us = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[2]/input"));
        us.sendKeys("testbeta");
        WebElement pw = driver.findElement((By.xpath("//*[@id=\"root\"]/div/form/div/div[3]/input")));
        pw.sendKeys("demo@12345");
        WebElement rmb = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[4]/div/div[1]/div"));
        rmb.click();
        WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/button"));
        login.click();

        WebElement Cue = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/ul/li[4]/a/div[2]"));
        Cue.click();

        String LoginUserXpath = "//a[@id=\"basic-nav-dropdown\"]//span[text()='testbeta']";
        boolean isLogin = driver.findElement(By.xpath(LoginUserXpath)).isDisplayed();
       // Assert.assertEquals(true, isLogin);
        Assert.assertEquals(true, isLogin);

        String CheckFlightXpath = "//div[@id=\"tab-pane-0\"]//p[text()='123456987']";
        boolean isCheckFlight = driver.findElement(By.xpath(CheckFlightXpath)).isDisplayed();
        Assert.assertEquals(true,isCheckFlight);
    }
}