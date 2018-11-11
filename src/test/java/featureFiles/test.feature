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