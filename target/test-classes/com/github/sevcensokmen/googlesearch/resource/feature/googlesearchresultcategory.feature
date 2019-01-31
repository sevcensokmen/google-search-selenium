Feature: Search goole and link search result

Scenario Outline: Search google and get link result
	Given User navigates "<url>" website
	And User enters "<searchvalue>" searchvalue 
	When User enters search button 
	Then Searchresult list is represented on the screen and visit result search category.
	
Examples:
|			url				| 	searchvalue	         |
|	http://www.google.com/	|	java		|
  