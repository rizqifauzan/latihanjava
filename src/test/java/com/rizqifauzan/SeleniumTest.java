package com.rizqifauzan;

import com.rizqifauzan.pageobject.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class SeleniumTest extends BaseTest{

    // open web browser
    // open url https://demo.midtrans.com/

    @Test
    public void testMidtrans() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayed());
        String expectedHomeTitle = "Midtrans Pillow";
        Assert.assertEquals(expectedHomeTitle,homePage.getTitle());

        homePage.clickBuyNow();
        Thread.sleep(2000);
        homePage.fillFormCheckout("50000", "Fauzan", "fauzan@mailnesia.com",
                "6287878069499", "Magelang", "Magelang", "56155");



//
//        // Shooping Chart Menu
//        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//input[@class='text-right']")));
//        driver.findElement(By.xpath("//input[@class='text-right']")).clear();
//        int hargaAwal = 50000;
////        hargaAwal.toString();
//        driver.findElement(By.xpath("//input[@class='text-right']")).sendKeys("50000"); // masih hard code karena udah nyoba toString gabisa
//        WebElement clickCheckoiut = w.until(ExpectedConditions.elementToBeClickable (By.xpath("//div[text()='CHECKOUT']")));
//        clickCheckoiut.click();
//
//        //Frame list payment method
//        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//iframe[@id='snap-midtrans']")));
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='snap-midtrans']")));
////        System.out.println("we are switch to the frame List Payment Method");
//
//        // verifikasi frame Payment List Method
//        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@class='merchant-name']"))); // kalo ga di kasih ini gamau exe script di bawah
//        String selectMethodTitleActual = driver.findElement(By.xpath("//div[@class='merchant-name']")).getText();
//        String selectMethodTitleExpected= "COCO STORE";
//        Assert.assertEquals(selectMethodTitleExpected,selectMethodTitleActual);
////        System.out.println("berhasil verifikasi title select method");
//        WebElement creditCardList = w.until(ExpectedConditions.elementToBeClickable (By.xpath("//a[@href='#/credit-card']//div[@class='list-title text-actionable-bold']")));
//        creditCardList.click();
//
//        // Menu debit card
//        String debitCardMenuTitleActual = driver.findElement(By.xpath("//span[@class='title-text text-actionable-bold']")).getText();
//        String debitCardMenuTitleExpected = "Credit/debit card";
//        Assert.assertEquals(debitCardMenuTitleExpected,debitCardMenuTitleActual);
//
//        driver.findElement(By.xpath("//div[@class='card-number-input-container']/input[@class='valid-input-value']")).sendKeys("4811111111111114");
//        driver.findElement(By.xpath("//*[@id='card-expiry']")).sendKeys("0125");
//        driver.findElement(By.xpath("//*[@id='card-cvv']")).sendKeys("123");
//
//        WebElement promoRadioButton10Persen = w.until(ExpectedConditions.elementToBeClickable (By.xpath("//div[@class='promo-block']//span[@class='radioWrap__2LgxN']//span[.='Potongan 10% - Demo Promo Engine']")));
//        promoRadioButton10Persen.click();
//
//        // dapetin angka diskon dan verfify sudha benar belum pengurangan promonya
//        String hargaPromo10Persen = driver.findElement(By.xpath("//div[@class='promo-radio-input'][2]/span")).getText();
//        String hargaPromo10PersenBersih = hargaPromo10Persen.replace("-","").replace("Rp", "").replace(".", "");
//        int hargaSetelahDiskon = hargaAwal - Integer.valueOf(hargaPromo10PersenBersih);
////        System.out.println(hargaSetelahDiskon);
//        String summaryHeaderHarga = driver.findElement(By.xpath(" //div[@class='header-amount']")).getText();
//        String summaryHeaderHargaBersih = summaryHeaderHarga.replace("-","").replace("Rp", "").replace(".", "");
//        int summaryHargaDiskon = Integer.valueOf(summaryHeaderHargaBersih);
//        Assert.assertEquals(hargaSetelahDiskon,summaryHargaDiskon);
//        WebElement payNowActiveButton = w.until(ExpectedConditions.elementToBeClickable (By.xpath("//button[text()='Pay now']")));
//        payNowActiveButton.click();
//
//        // Frame issuing Bank
//        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//iframe[@class='iframe-3ds']")));
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='iframe-3ds']")));
//
//        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//h1[@class='left']")));
//        String titleIssuingBankActual = driver.findElement(By.xpath("//h1[@class='left']")).getText();
//        String titleIssuingBankExpected = "Issuing Bank";
//        Assert.assertEquals(titleIssuingBankExpected,titleIssuingBankActual);
//        driver.findElement(By.xpath("//input[@id='PaRes']")).sendKeys("112233");
//
//        WebElement okConfirmationAuth = w.until(ExpectedConditions.elementToBeClickable (By.xpath("//*[@class = 'btn btn-sm btn-success']")));
//        okConfirmationAuth.click();
//
//        // Pindah Frame PopUP success payment
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='snap-midtrans']")));
//
//        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[.='Payment successful']")));
//        String succesPaymentPopupTextActual = driver.findElement(By.xpath("//div[.='Payment successful']")).getText();
//        String succesPaymentPopupTextExpected = "Payment successful";
//        Assert.assertEquals(succesPaymentPopupTextExpected,succesPaymentPopupTextActual);
//
//        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='text-headline large']")));
//        String successHargaBayar = driver.findElement(By.xpath("//div[@class='text-headline large']")).getText();
//        String successHargaBayarBersih = summaryHeaderHarga.replace("-","").replace("Rp", "").replace(".", "");
//        int successHargaBayarPopup = Integer.valueOf(summaryHeaderHargaBersih);
//        Assert.assertEquals(summaryHargaDiskon,successHargaBayarPopup);
//
//        driver.findElement(By.xpath("//button[@class='btn full primary']")).click();
//
//        // Frame home succcess verification
//        driver.switchTo().defaultContent();
//        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='Thank you for your purchase.']"))); // ini ga berdasrkan element present dinamis nunggu tapi by second juga, kalau waktu abis maka ga kedetect
//        String successbayarHomeActual = driver.findElement(By.xpath("//span[.='Thank you for your purchase.']")).getText();
//        String successbayarHomeExpected = "Thank you for your purchase.";
//        Assert.assertEquals(successbayarHomeExpected,successbayarHomeActual);
//
//        System.out.println("Test Passed");
//
//
    }


}
