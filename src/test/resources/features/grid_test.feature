@grid
Feature: grid_feature


  @chrome
  Scenario: TC01_chrome_test
    Given kullanici "https://techproeducation.com" adresine "chrome" ile gider
    When kullanici basligin "TechPro Education" icerdigin dogrula
    Then kullanici sayfayi kapatir


  @firefox
  Scenario: TC02_firefox_test
    Given kullanici "https://techproeducation.com" adresine "firefox" ile gider
    When kullanici basligin "TechPro Education" icerdigin dogrula
    Then kullanici sayfayi kapatir


  @edge
  Scenario: TC03_edge_test
    Given kullanici "https://techproeducation.com" adresine "edge" ile gider
    When kullanici basligin "TechPro Education" icerdigin dogrula
    Then kullanici sayfayi kapatir