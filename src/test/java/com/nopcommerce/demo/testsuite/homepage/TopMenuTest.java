package com.nopcommerce.demo.testsuite.homepage;

import com.nopcommerce.demo.pages.BooksPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();
    @Test
    public void verifyPageNavigation(){
        homePage.selectMenu("Books");
        Assert.assertEquals(homePage.getTitleOfPage(),"Books","Page Navigated Successfully");
    }

}
