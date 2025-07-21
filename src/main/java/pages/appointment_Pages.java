package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.restassured.response.Response;

public class appointment_Pages extends StartupPage {

//	Please write the required Locators here
	
	private static final String BASE_URL = "https://healthapp.yaksha.com/api";	

	String pageName = this.getClass().getSimpleName();
	public appointment_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1.1
	 * Method: loginToHealthAppByGivenValidCredetial
	 * 
	 * @param expectedData A Map containing login credentials with keys "username" and "password"
	 * @description This method automates the login process by:
	 *              - Waiting for the username textbox and entering the provided username
	 *              - Waiting for the password textbox and entering the provided password
	 *              - Waiting for and clicking the Sign In button using JavaScript
	 *              - Verifying if the appointment module is displayed after login
	 * @return true if the appointment module is visible after login, false otherwise
	 * @throws Exception if any step in the login process fails
	 * @author YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
//		Write your logic here
		return false;
	}

	/**@Test1.2
	 * 
	 * @param none
	 * @description Retrieves and returns the current page title.
	 * @return The title of the current web page as a String
	 * @throws Exception if unable to retrieve the title
	 * @author YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
//		Write your logic here		
		return null;
	}

	/**@Test1.3
	 * 
	 * @param none
	 * @description Waits for a few seconds, retrieves, and returns the current page URL.
	 *              Logs the URL to the console for verification.
	 * @return The current URL of the web page as a String
	 * @throws Exception if unable to retrieve the URL or if any error occurs during execution
	 * @author YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
//		Write your logic here		
		return null;
	}
	
	/**@Test2
	 * 
	 * @param none
	 * @description Checks if the Appointment module is present and interacts with it.
	 *              If present, it clicks the module and verifies if the counter title popup page is displayed.
	 *              Returns the title of the popup page.
	 * @return The text of the "Select Counter" title.
	 * @throws Exception if any element interaction fails during the process
	 * @author YAKSHA
	 */
	public String verifyAppointmentModuleIsPresent() throws Exception {
//		Write your logic here		
		return null;
	}

	/**@Test3
	 * 
	 * @param none
	 * @description Checks if the "Select Counter New One" link is present and clicks it.
	 *              Then waits for the "New Patient" button, clicks it, and retrieves the title
	 *              of the "Patient Information" section.
	 * @return The text from the "Patient Information" section if present, otherwise an empty string
	 * @throws Exception if any element is not found or an interaction fails during execution
	 * @author YAKSHA
	 */
	public String verifyButtonAndTextIsPresent() throws Exception {
//		Write your logic here		
		return null;
	}

	/**@Test4
	 * 
	 * @param none
	 * @description Scrolls to the bottom of the page after ensuring the "Patient Information" section is visible.
	 *              Then waits for the "Care Of Person Contact" textbox to be located, verifies its visibility,
	 *              clicks it, highlights the element, and confirms its presence.
	 * @return true if the "Care Of Person Contact" textbox is displayed and highlighted successfully, false otherwise
	 * @throws Exception if any interaction with elements fails during execution
	 * author YAKSHA
	 */
	public Boolean scrollToBottomVerifyFieldAndHighlight() throws Exception {
//		Write your logic here		
		return false;
	}

	/**@Test5
	 * 
	 * @param none
	 * @description Waits for the "Care Of Person" textbox to be located and verifies its visibility.
	 *              Clicks on the textbox and retrieves the value of its "placeholder" attribute.
	 * @return The placeholder text of the "Care Of Person" textbox if available, otherwise an empty string
	 * @throws Exception if the element is not found or any interaction fails during execution
	 * @author YAKSHA
	 */
	public String verifyPlaceholderNameOfTexbox() throws Exception {
//		Write your logic here		
		return null;
	}

	/**@Test6
	 * 
	 * @param none
	 * @description Clicks on the "Print Invoice" and "Confirm" buttons, 
	 *              then waits for and retrieves the error message displayed for the "Last Name" textbox.
	 * @return The error message text if present, otherwise an empty string
	 * @throws Exception if any element interaction or retrieval fails during execution
	 * author YAKSHA
	 */
	public String verifyErrorMessage() throws Exception {
//		Write your logic here		
		return null;
	}
	
	
	/**
	 * @Test7 This method creates a new appointment with authorization.
	 * 
	 * @param endpoint - The API endpoint to which the request is sent.
	 * @param body     - A JSON string containing the appointment details.
	 * @description This method sends a POST request to the specified endpoint with
	 *              the authorization header and the provided JSON payload, and
	 *              returns the response.
	 * @return CustomResponse - The API response includes HTTP status code, status
	 *         message, and appointment details (AppointmentId, etc.).
	 */
	public CustomResponse createAppointmentWithAuth(String endpoint, String body) {
		Response response = null;

		// Extract required data from the response
		int statusCode = 0;
		String status = "";
		Integer appointmentId = 0;

		// Return a CustomResponse object
		return new CustomResponse(response, statusCode, status, appointmentId);
	}

	/**
	 * @Test8 This method cancels an existing appointment with authorization.
	 * 
	 * @param endpoint - The API endpoint to which the request is sent for canceling
	 *                 the appointment.
	 * @param body     - An optional object representing the request body. This
	 *                 parameter can be null since the cancelation does not require
	 *                 a body payload.
	 * @description This method builds a PUT request with the authorization header
	 *              and specified endpoint. If a body is provided, it includes that
	 *              in the request; otherwise, it sends the request without a body.
	 * @return CustomResponse - The response from the API after attempting to cancel
	 *         the appointment, including status and result details.
	 */
	public CustomResponse cancelAppointmentWithAuth(String endpoint, Object body) {
		Response response = null;

		// Extract the necessary details from the response
		int statusCode = 0;
		String status = "";
		String resultMessage = "";

		// Return a CustomResponse object
		return new CustomResponse(response, statusCode, status, resultMessage);
	}

	/**
	 * @Test9 This method searches for a patient using specified query parameters.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @description This method sends a GET request to the specified endpoint with
	 *              the necessary authorization header and query parameters to
	 *              search for a patient in the system. The API returns details of
	 *              patients matching the search criteria, including fields like
	 *              `PatientId`, `ShortName`, `FirstName`, `LastName`, `Age`, and
	 *              others.
	 *
	 * @return CustomResponse - The API's response after attempting to search for
	 *         patients, which includes the HTTP status code, status message, and
	 *         the list of matching patients in the "Results" field.
	 */
	public CustomResponse searchPatientWithAuth(String endpoint, Object body) {
		Response response = null;

		// Extract the necessary details from the response
		int statusCode = 0;
		String status = "";
		List<Map<String, Object>> results = null;

		// Return a CustomResponse object with the necessary information
		return new CustomResponse(response, statusCode, status, results);
	}

	
}
