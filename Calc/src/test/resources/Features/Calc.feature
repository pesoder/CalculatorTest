Feature: Cal
I need an calculatior so I do not do silly misstake
Background:
Given I have entered page www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php

@add
Scenario: Add two numbers
Given I have entered 70
And I have also entered 51
When I press add 
Then the result should be 121





















@add
Scenario: Clear value
Given I have entered 34
And I clear value
When I press add 
Then the result should be 0


Scenario Outline: Add two numbers
Given I have entered <num1>
And I have also entered <num2>
When I press add 
Then the result should be <result>
Examples:
|num1|num2|result|
|1|-1|0|
|2|-1|1|
|3|-1|2|
|4|-1|3|
|5|-1|4|
|6|-1|5|
|7|-1|6|
|8|-1|7|
