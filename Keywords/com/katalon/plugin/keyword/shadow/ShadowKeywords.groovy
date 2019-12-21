package com.katalon.plugin.keyword.shadow

import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import io.github.sukgu.Shadow



class ShadowKeywords {

	private static Shadow shadow
	private static WebDriver driver

	static {
		driver = DriverFactory.getWebDriver()
		shadow = new Shadow(driver)
	}

	/**
	 * setImplicitWait
	 * @param int seconds.
	 * @return void
	 */
	@Keyword
	public void setImplicitWait(int seconds) {
		shadow.setImplicitWait(seconds)
	}

	/**
	 * setExplicitWait
	 * @param int seconds.
	 * @return void
	 */
	@Keyword
	public void setExplicitWait(int seconds, int pollingTime) {
		shadow.setExplicitWait(seconds, pollingTime)
	}

	/**
	 * findElement
	 * @param cssSelector CSS selector for element to be find.
	 * @return WebElement object
	 */
	@Keyword
	public WebElement findElement(String cssSelector) {
		WebElement element = shadow.findElement(cssSelector)
		if(null!=element) {
			return element
		}
		else {
			throw new Exception("CSS "+cssSelector+" could not find any matching elements.")
		}
	}

	/**
	 * findElements
	 * @param cssSelector CSS selector for element to be find.
	 * @return List of WebElement object
	 */
	@Keyword
	public List<WebElement> findElements(String cssSelector) {
		List<WebElement> elements = shadow.findElements(cssSelector)
		return elements
	}

	/**
	 * findElements
	 * @param parent WebElement object of parent element
	 * @param cssSelector CSS selector for element to be find.
	 * @return WebElement object
	 */
	@Keyword
	public WebElement findElementInsideParent(WebElement parent, String cssSelector) {
		WebElement element = shadow.findElement(parent, cssSelector)
		if(null!=element) {
			return element
		}
		else {
			throw new Exception("CSS "+cssSelector+" could not find any matching elements.")
		}
	}

	/**
	 * findElements
	 * @param parent WebElement object of parent element
	 * @param cssSelector CSS selector for element to be find.
	 * @return List of WebElement object
	 */
	@Keyword
	public List<WebElement> findElementsInsideParent(WebElement parent, String cssSelector) {
		List<WebElement> elements = shadow.findElements(parent, cssSelector)
		return elements
	}

	/**
	 * getShadowElement
	 * @param parent WebElement object of parent element
	 * @param selector CSS selector for element to be find.
	 * @return WebElement object
	 */
	@Keyword
	public WebElement getShadowElement(WebElement parent,String selector) {
		WebElement element = shadow.getShadowElement(parent, selector)
		if(null!=element) {
			return element
		}
		else {
			throw new Exception("CSS "+selector+" could not find any matching elements.")
		}
	}

	/**
	 * getAllShadowElement
	 * @param parent WebElement object of parent element
	 * @param selector CSS selector for element to be find.
	 * @return List of WebElement object
	 */
	@Keyword
	public List<WebElement> getAllShadowElement(WebElement parent,String selector) {
		List<WebElement> elements = shadow.getAllShadowElement(parent, selector)
		return elements
	}

	/**
	 * getParentElement
	 * @param element WebElement object
	 * @return WebElement object
	 */
	@Keyword
	public WebElement getParentElement(WebElement element) {
		WebElement returnedElement = shadow.getParentElement(element)
		if(null!=returnedElement) {
			return returnedElement
		}
		else {
			throw new Exception("Parent of WebElement "+element+" could not be found.")
		}
	}

	/**
	 * getChildElements
	 * @param parent WebElement object of parent element
	 * @return List of WebElement object
	 */
	@Keyword
	public List<WebElement> getChildElements(WebElement parent) {
		List<WebElement> elements = shadow.getChildElements(parent)
		return elements
	}

	/**
	 * getSiblingElements
	 * @param element WebElement object element
	 * @return List of WebElement object
	 */
	@Keyword
	public List<WebElement> getSiblingElements(WebElement element) {
		List<WebElement> elements = shadow.getSiblingElements(element)
		return elements
	}

	/**
	 * getSiblingElement
	 * @param element WebElement object element
	 * @param selector CSS selector 
	 * @return WebElement object
	 */
	@Keyword
	public WebElement getSiblingElement(WebElement element, String selector) {
		WebElement returnedElement = shadow.getSiblingElement(element)
		if(null!=returnedElement) {
			return returnedElement
		}
		else {
			throw new Exception("Sibling of WebElement "+element+" could not be found.")
		}
	}

	/**
	 * getNextSiblingElement
	 * @param element WebElement object element
	 * @return WebElement object
	 */
	@Keyword
	public WebElement getNextSiblingElement(WebElement element) {
		WebElement returnedElement = shadow.getNextSiblingElement(element)
		if(null!=returnedElement) {
			return returnedElement
		}
		else {
			throw new Exception("Next Sibling of WebElement "+element+" could not be found.")
		}
	}

	/**
	 * getPreviousSiblingElement
	 * @param element WebElement object element
	 * @return WebElement object
	 */
	@Keyword
	public WebElement getPreviousSiblingElement(WebElement element) {
		WebElement returnedElement = shadow.getPreviousSiblingElement(element)
		if(null!=returnedElement) {
			return returnedElement
		}
		else {
			throw new Exception("Previous Sibling of WebElement "+element+" could not be found.")
		}
	}

	/**
	 * isVisible
	 * @param element WebElement object element
	 * @return boolean true/false
	 */
	@Keyword
	public boolean isVisible(WebElement element) {
		return shadow.isVisible(element);
	}

	/**
	 * isChecked
	 * @param element WebElement object element
	 * @return boolean true/false
	 */
	@Keyword
	public boolean isChecked(WebElement element) {
		return shadow.isChecked(element);
	}

	/**
	 * isDisabled
	 * @param element WebElement object element
	 * @return boolean true/false
	 */
	@Keyword
	public boolean isDisabled(WebElement element) {
		return shadow.isDisabled(element);
	}

	/**
	 * getAttribute
	 * @param element WebElement object element
	 * @param attribute String attribute name
	 * @return String attribute value
	 */
	@Keyword
	public String getAttribute(WebElement element,String attribute) {
		return shadow.getAttribute(element, attribute);
	}

	/**
	 * selectCheckbox
	 * @param label String label
	 * @return void
	 */
	@Keyword
	public void selectCheckbox(String label) {
		shadow.selectCheckbox(label);
	}

	/**
	 * selectCheckbox
	 * @param parentElement WebElement object
	 * @param label String label
	 * @return void
	 */
	@Keyword
	public void selectCheckbox(WebElement parentElement, String label) {
		shadow.selectCheckbox(parentElement, label);
	}

	/**
	 * selectRadio
	 * @param label String label
	 * @return void
	 */
	@Keyword
	public void selectRadio(String label) {
		shadow.selectRadio(label);
	}

	/**
	 * selectRadio
	 * @param parentElement WebElement object
	 * @param label String label
	 * @return void
	 */
	@Keyword
	public void selectRadio(WebElement parentElement, String label) {
		shadow.selectRadio(parentElement, label);
	}

	/**
	 * selectDropdown
	 * @param label String label
	 * @return void
	 */
	@Keyword
	public void selectDropdown(String label) {
		shadow.selectDropdown(label);
	}

	/**
	 * selectDropdown
	 * @param parentElement WebElement object
	 * @param label String label
	 * @return void
	 */
	@Keyword
	public void selectDropdown(WebElement parentElement, String label) {
		shadow.selectDropdown(parentElement, label);
	}

	/**
	 * scrollTo
	 * @param element WebElement object
	 * @return void
	 */
	@Keyword
	public void scrollTo(WebElement element) {
		shadow.scrollTo(element)
	}
}