package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_objects {
    private WebDriver wd;
    private WebDriverWait wait;

    // найти кнопку Смартфоны и ТВ и кликнуть.
    @FindBy(id = "3361")
    WebElement find_smartfon_and_TV_button;

    //найти кнопку Смартфоны и кликнуть.
    @FindBy(linkText = "Смартфоны")
    WebElement find_smartfon_button;

    // найти кнопку Телефоны и кликнуть.
    @FindBy(linkText = "Телефоны")
    WebElement phone_button;

    // найти кнопку Товары для дома и кликнуть
    @FindBy(id = "5300")
    WebElement tovari_dlya_doma_button;

    // найти кнопку Бытовая химия и кликнуть
    @FindBy(linkText = "Бытовая химия")
    WebElement bitovaya_himia;

    // найти кнопку Для стирки и кликнуть
    @FindBy(linkText = "Для стирки")
    WebElement dlya_stirki;

    // найти кнопку Стиральные порошки и кликнуть
    @FindBy(linkText = "Стиральные порошки")
    WebElement stiralnie_poroshki;

    public Page_objects(WebDriver wd){
        this.wd = wd;

        PageFactory.initElements(this.wd, this);

    }

    public  void find_smartfon_and_tv_button(){
        find_smartfon_and_TV_button.click();

    }

    public  void find_smartfon_button(){
        find_smartfon_button.click();

    }

    public  void  find_phone_button() {
        phone_button.click();
    }

    public  void  find_tovari_dlya_doma_button(){
        tovari_dlya_doma_button.click();
    }

    public  void  find_bitovaya_chimia_button(){
        bitovaya_himia.click();
    }

    public  void  find_dlya_stirki_button(){
        dlya_stirki.click();
    }

    public  void find_stiralnie_poroshki_button(){
        stiralnie_poroshki.click();
    }
}

