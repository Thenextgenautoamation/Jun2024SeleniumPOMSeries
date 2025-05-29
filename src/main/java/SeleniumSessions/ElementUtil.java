package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author vedastehasangwineza
 * 
 */
public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		driver.findElement(locator).click();
	}
	public void doClick(By locator, int timeout) {
		driver.findElement(locator).click();
	}

	public String doGetText(By locator) {
		return driver.findElement(locator).getText();
	}

	public String getAttributeValue(By locator, String attrName) {
		return driver.findElement(locator).getAttribute(attrName);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	public int getLinksCount(By locator) {
		return getElements(locator).size();

	}

	public int getImageCount(By locator) {
		return getElements(locator).size();

	}

	public boolean isElementDisplayed(By locator) {
		int elementCount = getElements(locator).size();
		if (elementCount == 1) {
			System.out.println("single element is displayed : " + locator);
			return true;
		} else {
			System.out.println("multiple or zero elements are displayed : " + locator);

			return false;
		}
	}

	public boolean isElementDisplayed(By locator, int expectedElementCount) {
		int elementCount = getElements(locator).size();
		if (elementCount == expectedElementCount) {
			System.out.println("element is displayed : " + locator + " with the occurrence of " + elementCount);
			return true;
		} else {
			System.out.println(
					"multiple or zero elements are displayed : " + locator + "with Occurrence " + elementCount);

			return false;
		}

	}

	public boolean doIsDisplayed(By locator) {
		try {
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("element is displayed : " + locator);
			return flag;
		} catch (NoSuchElementException e) {
			System.out.println("element with locator : " + locator + "is not displayed");

			return false;
		}

	}

	public List<String> getLinksTextList(By locator) {

		List<WebElement> linkList = getElements(locator);

		List<String> totalLinks = new ArrayList<String>();

		for (WebElement e : linkList) {

			String text = e.getText();

			if (text.length() != 0) {
				totalLinks.add(text);

			}

		}
		return totalLinks;

	}

	public void getElementAttributeList(By locator, String attrName) {
		List<WebElement> imagesList = getElements(locator);

		for (WebElement e : imagesList) {

			String attrivalue = e.getAttribute(attrName);

			if (attrivalue != null) {

				System.out.println(attrivalue);

			}
		}

	}

	// ***************************** Select element from
	// dropdown******************************

	public void doSelectByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));

		select.selectByIndex(index);
	}

	public void doSelectByValue(By locator, String value) {

		Select select = new Select(getElement(locator));

		select.selectByValue(value);
		;
	}

	public void doSelectByVisibleText(By locator, String visibleText) {

		Select select = new Select(getElement(locator));

		select.selectByVisibleText(visibleText);
	}

	public List<String> getDropDownOptionsTextList(By locator) {

		Select select = new Select(driver.findElement(locator));

		List<WebElement> countryOptions = select.getOptions();

		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement e : countryOptions) {

			String text = e.getText();

			optionsTextList.add(text);

		}
		return optionsTextList;
	}

	public void selectValueFromDropDown(By locator, String optionText) {

		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(optionText.trim())) {

				e.click();

				break;

			}
		}
	}

	public void selectValueFromDropDownWithoutSelectClass(By locator, String optionText) {

		List<WebElement> optionsList = driver.findElements(locator);

		for (WebElement e : optionsList) {
			String text = e.getText();

			if (text.equals(optionText.trim())) {

				e.click();

				break;
			}
		}
	}

	public void doSearch(By searchField, String searchKey, By suggestions, String value) {
		driver.findElement(searchField).sendKeys(searchKey);

		List<WebElement> suggetionsList = driver.findElements(suggestions);

		for (WebElement e : suggetionsList) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(value)) {
				e.click();
				break;
			}
		}

	}

//*************************** Actions  utilities **************************************************//

	public void handleParentSubMenu(By parentLocator, By childLocator) throws InterruptedException {

		Actions act = new Actions(driver);

		act.moveToElement(getElement(parentLocator)).perform();

		Thread.sleep(2000);

		getElement(childLocator).click();

	}

	public void doDragAndDrop(By SourceLocator, By targetLocator) {

		WebElement sourceEle = getElement(By.id("draggable"));
		WebElement targetEle = getElement(By.id("droppable"));

		Actions act = new Actions(driver);

		act.dragAndDrop(sourceEle, targetEle).perform();

	}

	public void doActionsSendKeys(By locator, String value) {

		Actions act = new Actions(driver);

		act.sendKeys(driver.findElement(locator), value).perform();

	}

	public void doActionsClick(By locator) {

		Actions act = new Actions(driver);
		act.click(getElement((locator))).perform();

	}

	public void doActionsSendKeysWithPause(By locator, String value, long pauseTime) {

		Actions act = new Actions(driver);

		char ch[] = value.toCharArray();

		for (char e : ch) {

			act.sendKeys(getElement(locator), String.valueOf(e)).pause(pauseTime).perform();

		}
	}

	public void doActionSendKeysWithPause(By locator, String value) {

		Actions act = new Actions(driver);

		char ch[] = value.toCharArray();

		for (char e : ch) {

			act.sendKeys(getElement(locator), String.valueOf(e)).pause(100).perform();

		}
	}

	// ************************ element
	// Wait******************************************//
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public WebElement wairForElementPresence(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/*
	 * 
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * 
	 */
	public List<WebElement> waitForElementVisible(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}catch(Exception e) {
			return List.of(); // return empty ArrayList
		}

		

	}

	/**
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 * 
	 * @param locator
	 * @param timeout
	 */
	public void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	/**
	 * is page completly Laoded
	 * 
	 * @param timeout
	 */
	public void isPageLoading(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"))
				.toString(); // "true"

		if (Boolean.parseBoolean(flag)) {

			System.out.println("page is completly laoded");
		} else {
			System.out.println("page is not loaded");
		}
	}

	public String waitForTitleContains(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title not correct ");

		}
		return driver.getTitle();
	}

	public String waitForTitleToBe(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.titleIs(titleValue))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title not correct ");

		}
		return driver.getTitle();
	}

	public String waitForURLContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println(" url not correct ");

		}
		return driver.getCurrentUrl();
	}

	public String waitForURLToBe(String urlValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.urlContains(urlValue))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println(" url not correct ");

		}
		return driver.getCurrentUrl();
	}
//******************************* WaitForAlert utils ***********************************//

	public Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public String getAlertText(int timeOut) {

		Alert alert = waitForJSAlert(timeOut);
		String text = alert.getText();

		alert.accept();

		return text;
	}

	public void acceptAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
	}

	public void dismissAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();
	}

	public void alertSendKeys(int timeOut, String value) {
		Alert alert = waitForJSAlert(timeOut);
		alert.sendKeys(value);
		alert.accept();
	}

//********************** Wait for Frame ***************************************//

	/**
	 * An expectation for checking whether the given frame is available to switch
	 * to. If the frame is available it switches the given driver to the specified
	 * frame.
	 * 
	 * @param locator
	 * @param timeOut
	 */
	public void waitForFrameByLocator(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));

	}

	/**
	 * 
	 * @param frameIndex
	 * @param timeOut
	 */

	public void waitForFrameByIndex(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

	}

	/**
	 * 
	 * @param frameIDOrName
	 * @param timeOut
	 */
	public void waitForFrameByIDOrName(String frameIDOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDOrName));

	}

	/**
	 * 
	 * @param frameElement
	 * @param timeOut
	 */
	public void waitForFrameByWebElement(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));

	}

	public void waitForWindowToBe(int totalWindows, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));

	}
	// ************* fluent wait************************//

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @param intervalTime
	 */
	public void waitForElementVisible(By locator, int timeOut, int intervalTime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime)).ignoring(NoSuchElementException.class)
				.withMessage("==== element is not found ====");

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
	}
//	Assignement:
//	  1.Write a program to check if Contiue button is displayed on page
//	  2.Write a program to count occorrence of login button
//	  3.Write a program to print all the link  text available at right side in the login page
//
//	  4.Write a program to find elements on the page i.a password
}
