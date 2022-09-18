package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;


public class A101StepDefination {
    A101Page a101Page = new A101Page();
    Actions actions = new Actions(Driver.getDriver());
    Select select;
    @When("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String siteUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(siteUrl));


    }

    @When("{string} sayfasinda oldugunu kontrol eder")
    public void sayfasinda_oldugunu_kontrol_eder(String title) {
        String urlTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(urlTitle.contains("A101"));
    }

    @Then("cookies kabul eder")
    public void cookies_kabul_eder() {
        a101Page.cookiesKabulEtme.click();
    }


    @Then("Kadın İç Giyim kismini secer")
    public void kadın_i̇ç_giyim_kismini_secer() {
        actions.moveToElement(a101Page.giyimAksesuar).perform();
    }

    @Then("Dizaltı Çorapi secer")
    public void dizaltı_çorapi_secer() {
        a101Page.dizAltiCorap.click();
    }

    @Then("sayfa Title indan dogru sayfada oldugunu kontol eder")
    public void sayfa_title_indan_dogru_sayfada_oldugunu_kontol_eder() {
        String urlTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(urlTitle.contains("Dizaltı Çorap"));
    }

    @When("Renk olarak {string} secilir")
    public void renk_olarak_secilir(String renkSecim) throws InterruptedException {
        a101Page.renkSecimCheckBox.click();
        Thread.sleep(2000);
    }

    @Then("gelen sonuclarin siyah icerdigi kontol edilir")
    public void gelen_sonuclarin_siyah_icerdigi_kontol_edilir() {

        Assert.assertTrue(a101Page.urunBasligi.getText().contains("Siyah"));

    }

    @Then("{string} secilir ve sepete eklenir")
    public void secilir_ve_sepete_eklenir(String string) {
a101Page.sepeteEkleme.click();
    }
    @When("siyah renk secilir")
    public void siyah_renk_secilir() {
        a101Page.siyahRenkUrunSecme.click();
    }
    @Then("siyah renk secildigi kontrol edilir")
    public void siyah_renk_secildigi_kontrol_edilir() {
Assert.assertTrue(a101Page.secilenUrunDogrumu.getText().contains("Siyah"));
    }
    @Then("sepete ekleme yapilir")
    public void sepete_ekleme_yapilir() {
a101Page.urunSepeteEkleButonu.click();
    }
    @Then("alis sepeti goruntuleye tiklanir")
    public void alis_sepeti_goruntuleye_tiklanir() {
a101Page.urunSepetiGoruntule.click();
    }
    @Then("sepeti onayla tiklanir")
    public void sepeti_onayla_tiklanir() {
a101Page.urunlerSepetiOnayla.click();
    }
    @When("uye olmadan devam et tiklanir")
    public void uye_olmadan_devam_et_tiklanir() {
a101Page.uyeOlmadanDevamEtButonu.click();
    }
    @Then("{string} adresi girilir")
    public void adresi_girilir(String mail) {
a101Page.mailAdresiGirilir.sendKeys(ConfigReader.getProperty(mail)+ Keys.ENTER);
    }
    @Then("yeni adres olustur tiklanir")
    public void yeni_adres_olustur_tiklanir() {
  a101Page.yeniAdresOlusturButonu.click();
   }
   @Then("{string} basligi girilir")
    public void basligi_girilir(String adresbasligi) {
a101Page.adresBasligiBilgisiGirme.sendKeys(ConfigReader.getProperty(adresbasligi));
    }
    @Then("{string} bilgisi girer")
    public void bilgisi_girer(String isim) {
a101Page.adresisimBilgisi.sendKeys(ConfigReader.getProperty(isim));
    }
    @Then("{string} girilir")
    public void girilir(String soyisim) {
        a101Page.adresSoyIsimBilgisi.sendKeys(ConfigReader.getProperty(soyisim));
    }
    @Then("{string} numarasi girilir")
    public void numarasi_girilir(String ceptelefonu)  {
a101Page.adresTelefonBilgisi.sendKeys(ConfigReader.getProperty(ceptelefonu));    }

    @Then("{string}  bilgisi girilir")
    public void bilgisi_girilir(String adresbasligi) {
a101Page.adresAdresBilgisi.sendKeys(ConfigReader.getProperty(adresbasligi));
    }
    @Then("{string} kodu girilir")
    public void kodu_girilir(String posta)  {
a101Page.adresPostaKoduBilgisi.sendKeys(ConfigReader.getProperty(posta));

    }
    @Then("kaydet butonuna tiklanir")
    public void kaydet_butonuna_tiklanir() throws InterruptedException {
a101Page.adresKaydetButonu.click();

    }

    @Then("il bilgisi girilir")
    public void ilBilgisiGirilir() {
       select=new Select(a101Page.adresIlBilgisi);
        select.selectByVisibleText("ANKARA");
    }

    @Then("ilce ile girilir")
    public void ilceIleGirilir() throws InterruptedException {
        select=new Select(a101Page.adresIlceBilgisi);
        select.selectByVisibleText("BALA");
Thread.sleep(1000);

    }


    @Then("mahalle adi girilir")
    public void mahalleAdiGirilir() {
        select=new Select(a101Page.adresMahalleBilgisi);
        select.selectByIndex(4);
    }

    @Then("Mng kargo secilir")
    public void mngKargoSecilir() throws InterruptedException {
        Thread.sleep(2000);
        actions.click(a101Page.mngKargoSecim).perform();
    }

    @Then("adres kargo kaydet ve devam et")
    public void adresKargoKaydetVeDevamEt() {
        a101Page.adresKargoKaydetVeDevamEtButonu.click();
    }

    @Then("chromu kapatır")
    public void chromuKapatır() {
        Driver.closeDriver();
    }

    @When("odeme sayfasina geldini kontrol eder")
    public void odemeSayfasinaGeldiniKontrolEder() {
        Assert.assertTrue(a101Page.odemeSayfasiKontrol.isDisplayed());
    }

    @When("adresi kaydettigini dogrular")
    public void adresiKaydettiginiDogrular() {
        Assert.assertTrue(a101Page.adresKaydettiginiDogrular.isDisplayed());
    }
}
