package com.group7Project.pages;

import com.group7Project.utilities.BrowserUtils;
import com.group7Project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;


public class PreferencesPage extends BasePage{

    @FindBy(xpath = "(//input[@type='file'])[3]")
    public WebElement editButtonOnTheAvatar;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButtonOnPreferences;


    DashboardPage dashboard = new DashboardPage();

    public void navigateToPreferences(String usertype){
        Assert.assertTrue(dashboard.username.getText(),usertype.toLowerCase(Locale.ROOT).contains(usertype));
        dashboard.username.click();
        dashboard.preferences.click();
    }

    public void changeTheAvatar(String newImageName) {
        String newImagePath = "/Users/mac/IdeaProjects/Group7_Project_New/src/test/resources/image/" + newImageName + ".jpg";
        BrowserUtils.waitFor(1);
        System.out.println(newImagePath);
        editButtonOnTheAvatar.sendKeys(newImagePath);
        BrowserUtils.waitFor(1);
        saveButtonOnPreferences.click();
    }

    public void takeScreenshotOfAvatar(String avatar) throws IOException {
        BrowserUtils.waitFor(8);
        Screenshot screenshot = new AShot().takeScreenshot(Driver.get(),avatarImage);
        String path = "/Users/mac/IdeaProjects/Group7_Project_New/src/test/resources/image/" + avatar + ".png";
        File file = new File(path);
        if (!file.canWrite()) file.setWritable(true);
        if (!file.canRead()) file.setReadable(true);
        ImageIO.write(screenshot.getImage(),"PNG", file);
    }

    public void verifyTheAvatarHasChanged() throws IOException {
        BrowserUtils.waitFor(1);
        String oldImagePath = "/Users/mac/IdeaProjects/Group7_Project_New/src/test/resources/image/old.png";
        String newImagePath = "/Users/mac/IdeaProjects/Group7_Project_New/src/test/resources/image/new.png";
        BufferedImage oldImage = ImageIO.read(new File(oldImagePath));
        BufferedImage newImage = ImageIO.read(new File(newImagePath));
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(oldImage, newImage);
        Assert.assertTrue(diff.hasDiff());
    }



}
