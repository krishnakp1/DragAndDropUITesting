# DragAndDropUITesting
Drag and drop UI using Selenium and TestNG

This is created using a maven build tool and using testng annotations.

To run the project pass your chromedriver.exe local file path as parameter to System.setProperty function in setUp().

setup() is assigned with @BeforeTest annotation so that it runs before the test case. It contains code to initialize chromedriver and to initialize the page object class. Also it opens the specified url.

tearDown() is assinged with @AfterTest annotation so that it runs after the test case. It contains code to close the created webdriver.

test_dragAndDrop() is assinged with @Test annotation. It contains actuall code to perform the required actions. 

PlumfuseWebpage under src/main/java is a page object class that stores all the required WebElement and intializes accordingly.

dragByElement() accepts two parameters ie., source element and destination element that needs to be dragged and dropped. This method is used to drop the components from the left pane under MODULES to the other components which are in the drawing page. This method is also used to draw the connector line from one component to the other.

dragByCoordinates() accepts three parameters ie., source element and destination X offset and Y offset values that needs to be dragged and dropped. Once after dropping the components on the drawing page from left pane using dragByElement(), the dragByCoordinates() is used to properly position the dropped elements using X and Y coordinates.
For example: If the dropped element has to be moved towards left then, X value becomes negative. If the dropped element has to be moved towards right then, X value becomes negative.
Here for Y coodinate, things are working in reverse order as of X coodinates ie., If the element has to move towards down, then the Y value has to be a postive value instead of negative. So i'm little confused on this, suggestions would be greately appreciated :). In all the scenarios, i'm moving the components and connector lines towards down so i've assigned a positive Y values and it works as expected.
