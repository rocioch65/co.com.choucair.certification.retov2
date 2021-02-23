#Autor: Rocío Chilito
@stories
Feature: uTest
  As an user, I want to create a new user at the page uTest
  Scenario: Create a new user
    Given than John want to created a new user at the uTest
    When he register your personal information at the uTest
      | strFirstName  | strLastName | strEmail                | strPassword | strConfPassword |
      | John          | Cifuentes   | jcifuentes23@gmail.com  | -Test2021.* | -Test2021.*     |
    Then he is welcome at the platform uTest
      | strWelcomeMess                                                          |
      | Welcome to the world's largest community of freelance software testers! |