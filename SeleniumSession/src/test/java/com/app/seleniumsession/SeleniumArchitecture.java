package com.app.seleniumsession;

public class SeleniumArchitecture {
	
/*	
	
	
1.	Selenium Client Library consists of languages like Java, Ruby, Python, C# and so on. After the test cases are triggered,
	entire Selenium code will be converted to Json format.

2.	JSON stands for Javascript Object Notation. It takes up the task of transferring information from the server to the client.
    JSON Wire Protocol is primarily responsible for transfer of data between HTTP servers. Generated Json is made available to browser
    drivers through http Protocol.

3.	Each browser has a specific browser driver. Browser drivers interact with its respective browsers and execute the commands by
 	interpreting Json which they received from the browser. As soon as the browser driver gets any instructions, they run them on the browser.
 	Then the response is given back in the form of HTTP response.
	
	
*/
}
