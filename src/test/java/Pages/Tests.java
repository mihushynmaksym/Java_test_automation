package Pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tests {
    // Будет использован GoogleChrome
    WebDriver wd = new ChromeDriver();
    Page_objects page_objects;


    @Before
    public void option(){
        // открыть https://rozetka.com.ua/
        wd.get("https://rozetka.com.ua/");
        // таймер 10 сек для прогрузки сайта.
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page_objects = new Page_objects(wd);

    }

    @Test
    public void  test_scenario_1(){
        page_objects.find_smartfon_and_tv_button();
        page_objects.find_phone_button();
        page_objects.find_smartfon_button();
    }

    @Test
    public void test_scenario_2(){
        page_objects.find_tovari_dlya_doma_button();
        page_objects.find_bitovaya_chimia_button();
        page_objects.find_dlya_stirki_button();
        page_objects.find_stiralnie_poroshki_button();
    }

    @Test
    public void test_scenario_3(){
        page_objects.find_smartfon_and_tv_button();
        page_objects.find_phone_button();
        page_objects.find_smartfon_button();
    }

    @After
    public void tearDown(){
        // проверка на краш браузера
        if (wd != null)
            wd.quit();
    }

}
