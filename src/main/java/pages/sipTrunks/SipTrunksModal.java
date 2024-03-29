package pages.sipTrunks;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SipTrunksModal {
    private String description = "autotestdesc";
    private String spinnerXPATH = "//div[@class='formLoaderContent']";
    private String modalPopupCSS = "#modalPopup > div > div";

    public SipTrunksModal() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "trunkform-name")
    private WebElement nameField;

    public WebElement getNameField(){
        return this.nameField;
    }

    @FindBy(id = "trunkform-description")
    private WebElement descriptionField;

    public WebElement getDescriptionField(){
        return this.descriptionField;
    }

    @FindBy(css = "#trunk-form > div.box-footer > button.btn.btn-success")
    private WebElement addButton;

    public WebElement getAddButton(){
        return this.addButton;
    }

    public String getDescription () {
        return this.description;
    }

    public String getSpinnerXPATH () {
        return this.spinnerXPATH;
    }

    public String getModalPopupCSS () {
        return this.modalPopupCSS;
    }

}
