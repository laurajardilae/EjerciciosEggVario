Feature: prueba
I am an user at the Wikipedia WebPage requesting SW character <number>
I search the requested character name on Wikipedia search page

Scenario Outline : Check wikipedia article displayed for Star Wars Characters
    Given I am an user at the Wikipedia WebPage requesting SW character <number>
    When I search the requested character name on Wikipedia search page
    Then I should be able to see the article page correctly displayed for the requested character.
    Examples:
    |number|
    |1|