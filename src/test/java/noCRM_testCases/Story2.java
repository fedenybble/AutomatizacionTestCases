package noCRM_testCases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Story2 extends Team1_TCs
{
    @Test
    public void login()
    {
        driver.findElement(By.id("email")).sendKeys("federico.roman@nybblegroup.com");
        driver.findElement(By.id("password")).sendKeys("123456789");
        driver.findElement(By.cssSelector("body > div.flex-grow-1.d-flex.flex-column.justify-content-center > div:nth-child(3) > div > div > div > form > input.btn.btn-c2a.w-100.px-3.py-2.text-white.border-0")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("body > nav > div > ul > li.nav-item.nav-main.nav-home > a")).isDisplayed(),"Error, login unsuccesful.");
    }

    @Test
    public void createCustomLead() throws InterruptedException {
        login();
        //Assertions.assertTrue(driver.findElement(By.xpath("/html/body/nav/div/div[3]/span/span[1]/a/span")).isDisplayed(),"Error, login required.");

        driver.findElement(By.id("new-lead-btn")).click();
        //ASSERT LEAD MODAL OPENS?
        //driver.findElement(By.id("lead_lead_content_attributes_title")).sendKeys("PEPE");
        //driver.findElement(By.cssSelector("#lead_lead_content_attributes_title")).sendKeys("PEPE");
        //driver.findElement(By.className("form-control lead-title-field")).sendKeys("PEPE");
        driver.findElement(By.xpath("//*[@id=\"lead_lead_content_attributes_title\"]")).sendKeys("PEPE");
        driver.findElement(By.cssSelector("#lead-form-side > div:nth-child(1) > div > button > div > div > div")).click();
        driver.findElement(By.cssSelector("#lead-form-side > div:nth-child(1) > div > div > div > ul > li:nth-child(2) > a > span.texta")).click();
        driver.findElement(By.cssSelector("#lead-form-bottom > input")).click();
        driver.findElement(By.cssSelector("#full-modal-close > i")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("#leads-list > div:nth-child(2) > ul > li > div > div.lead-card-body.text-decoration-none > div > div > a.lead-title.d-inline-block.text-gray-700.text-truncate.w-100")).isDisplayed(),"Error, lead was not created.");


    }
}
