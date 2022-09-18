package pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class A101Page {
    public A101Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement cookiesKabulEtme;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/'])[1]")
    public WebElement giyimAksesuar;

    @FindBy(xpath = "//a[@title='Dizaltı Çorap']")
    public WebElement dizAltiCorap;
    @FindBy(id = "attributes_integration_colourSİYAH")
    public WebElement renkSecimCheckBox;

    @FindBy(xpath = "(//h3[@class='name'])[1]")
    public WebElement urunBasligi;
    @FindBy(xpath = "//em[@class='icon-sepetekle']")
    public WebElement sepeteEkleme;

    @FindBy(xpath = "//span[text()='SİYAH']")
    public WebElement sepeteEklenenUrununRengi;

    @FindBy(xpath = "//a[@title='SİYAH']")
    public WebElement siyahRenkUrunSecme;

    @FindBy(xpath = "//h1[contains(text(),'Siyah')]")
    public WebElement secilenUrunDogrumu;
    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement urunSepeteEkleButonu;

    @FindBy(xpath = "//a[@class='go-to-shop']")
public WebElement urunSepetiGoruntule;
@FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
public WebElement urunlerSepetiOnayla;

@FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamEtButonu;
@FindBy(xpath = "//input[@name='user_email']")
public WebElement mailAdresiGirilir;

@FindBy(xpath = "(//a[@class='new-address js-new-address'])[1]")
public WebElement yeniAdresOlusturButonu;
@FindBy(xpath = "//input[@placeholder='Ev adresim, iş adresim vb.']")
public WebElement adresBasligiBilgisiGirme;
@FindBy(xpath = "//input[@name='first_name']")
public WebElement adresisimBilgisi;

@FindBy(xpath = "(//div[@class='radio'])[3]")
public WebElement mngKargoSecim;
@FindBy(xpath = "//input[@name='last_name']")
public WebElement adresSoyIsimBilgisi;
    @FindBy(xpath = "//input[@name='phone_number']")
    public WebElement adresTelefonBilgisi;
    @FindBy(xpath = "//select[@class='js-cities']")
    public WebElement adresIlBilgisi;

    @FindBy(xpath = "//select[@name='township']")
    public WebElement adresIlceBilgisi;

    @FindBy(xpath = "//select[@name='district']")
    public WebElement adresMahalleBilgisi;
    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public WebElement adresAdresBilgisi;
    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement adresPostaKoduBilgisi;

@FindBy(xpath = "//button[@class='button green js-set-country js-prevent-emoji']")
    public WebElement adresKaydetButonu;
@FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public WebElement adresKargoKaydetVeDevamEtButonu;

@FindBy(xpath = "//div[@class='payment-tab payment-tab-gpay js-payment-tab ']")
public WebElement odemeSayfasiKontrol;
@FindBy(xpath = "(//a[@class='new-address js-new-address'])[1]")
public WebElement adresKaydettiginiDogrular;

}