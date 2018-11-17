Feature: This is the Test Feature File

#Scenario: This is the test Sceanrio
#
#Given this is the test given statement
#When this is the test when statement
#Then this is the test then statement

@smoke
Scenario Outline: This is the test Sceanrio

Given this is the "<username>" and "<password>" given statement
When this is the test when statement
Then this is the test then statement

Examples:
	| username | password |
	| ashish   | ash123   |
	| anisha   | ani123   |

@sanity
Scenario: This is the test scenario for data tables
Given We have the data tables 
	| testCase1 | Data1 |
	| testCase2 | Data2 |
	| testCase3 | Data3 |
	| testCase4 | Data1 |
When we have a test when for the data tables scenario
Then we have the test data table then 

