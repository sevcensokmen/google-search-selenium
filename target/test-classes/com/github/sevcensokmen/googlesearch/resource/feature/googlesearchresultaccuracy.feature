Feature: Search google and seacrh result content is compared accurancy value

Scenario Outline: Search google and result content is compared accurancy
	Given User navigates to the  website
	And User enters "<search>" search 
	When User enters searchbutton 
	Then Searchresult is compared "<accurancy>"
	
Examples:
|	search			| 	accurancy |
|	java			|	language  |
  