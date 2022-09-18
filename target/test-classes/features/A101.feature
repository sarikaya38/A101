@A101AnaSayfa
Feature: US1001 A101 sitesine gider


  Scenario: TC01 A101 sitesine gider

    When kullanici "A101Url" sayfasina gider

    And "A101Title" sayfasinda oldugunu kontrol eder

    Then cookies kabul eder

  Scenario: TC02 Giyim-Aksesuar_Kadın İç Giyim_Dizaltı Çorap bölümüne gider

    When Kadın İç Giyim kismini secer
    Then Dizaltı Çorapi secer
    Then sayfa Title indan dogru sayfada oldugunu kontol eder

  Scenario: TC03 siyah renk secilir ve gelen sonuclarin siyah oldugu dogrulanir ve herhangi biri sepete eklenir
    When Renk olarak "renkSecim" secilir
    Then gelen sonuclarin siyah icerdigi kontol edilir
    Then "secilecekUrunIndex" secilir ve sepete eklenir

  Scenario: sepete eklenen urun kotrol edilir odeme ekranina gitme

    When siyah renk secilir
    Then siyah renk secildigi kontrol edilir
    Then sepete ekleme yapilir
    Then alis sepeti goruntuleye tiklanir
    Then sepeti onayla tiklanir

  Scenario: uye olmadan mail girilir ve adres bilgileri girilir
    When uye olmadan devam et tiklanir
    Then "mail" adresi girilir
    Then yeni adres olustur tiklanir
    Then "adres" basligi girilir
    Then "isim" bilgisi girer
    Then "soyisim" girilir
    Then "ceptelefonu" numarasi girilir
    Then il bilgisi girilir
    Then ilce ile girilir
    Then mahalle adi girilir
    Then "adresbasligi"  bilgisi girilir
    Then "posta" kodu girilir
    Then kaydet butonuna tiklanir
    When adresi kaydettigini dogrular
    Then Mng kargo secilir

    Then adres kargo kaydet ve devam et
    When odeme sayfasina geldini kontrol eder
    Then chromu kapatır