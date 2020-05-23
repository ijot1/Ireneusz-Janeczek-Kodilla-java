package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_INPUT = "//a[@role=\"button\"]";

    public static final String XPATH_SELECT_DAY = "//select[@name=\"birthday_day\"]";
    public static final String XPATH_SELECT_MONTH = "//select[@name=\"birthday_month\"]";
    public static final String XPATH_SELECT_YEAR = "//select[@name=\"birthday_year\"]";

    public static final String XPATH_WAIT_FOR_DAY = "//select[1]";
    public static final String XPATH_WAIT_FOR_MONTH = "//select[2]";
    public static final String XPATH_WAIT_FOR_YEAR = "//select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement buttonCreateNewAcc = driver.findElement(By.xpath(XPATH_INPUT));
        buttonCreateNewAcc.click();

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_DAY)).isDisplayed());

        WebElement comboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(comboDay);
        selectDay.selectByIndex(20);

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH)).isDisplayed());

        WebElement comboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(comboMonth);
        selectMonth.selectByIndex(11);

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR)).isDisplayed());

        WebElement combotYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(combotYear);
        selectYear.selectByIndex(35);
    }
}
