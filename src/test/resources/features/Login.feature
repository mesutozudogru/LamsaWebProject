
Feature: Lamsa Login Scenarios

  Scenario:Premium user should be able to login with valid credentials_EN
    Given User navigate to login page_EN
    When Premium user enters valid username and password
    And User selects kid as "Adam"
    Then Kid name should be displayed on the page as "Adam"

  Scenario:Free user should be able to login with valid credentials_EN
    Given User navigate to login page_EN
    When Free user enters valid username and password
    And User selects kid as "And"
    Then Kid name should be displayed on the page as "And"

  Scenario:Premium user should be able to login with valid credentials_AR
    Given User navigate to login page_AR
    When Premium user enters valid username and password
    And User selects kid as "Adam"
    Then Kid name should be displayed on the page as "Adam"

  Scenario:Free user should be able to login with valid credentials_AR
    Given User navigate to login page_AR
    When Free user enters valid username and password
    And User selects kid as "And"
    Then Kid name should be displayed on the page as "And"

  Scenario: User is not able to login with a valid username and invalid password_EN
    Given User navigate to login page_EN
    When User enters valid username and invalid password "1234"
    And User clicks Sign In button
    Then User should see "Please enter valid password." messages

  Scenario: User is not able to login with a invalid username and valid password_EN
    Given User navigate to login page_EN
    When User enters invalid username "invalid@mail.com" and valid password
    And User clicks Sign In button
    Then User should see "E-mail address is not registered." messages
  @wip
  Scenario: User is not able to login with a valid username and invalid password_AR
    Given User navigate to login page_AR
    When User enters valid username and invalid password "1234"
    And User clicks Sign In button
    Then User should see "الرجاء إدخال كلمة سر صحيحة" messages

  Scenario: User is not able to login with a invalid username and valid password_AR
    Given User navigate to login page_AR
    When User enters invalid username "invalid@mail.com" and valid password
    And User clicks Sign In button
    Then User should see "البريد الإلكتروني الذي أدخلته غير مستخدم." messages


  Scenario: User is not able to login when username field is blank_EN
    Given User navigate to login page_EN
    When User enters valid password and leaves the username field as blank
    And User clicks Sign In button
    Then User should see "This field is required" validation message


  Scenario: User is not able to login when password field is blank_EN
    Given User navigate to login page_EN
    When User enters valid username and leaves the password field as blank
    And User clicks Sign In button
    Then User should see "This field is required" validation message


  Scenario: User is not able to login when username field is blank_AR
    Given User navigate to login page_AR
    When User enters valid password and leaves the username field as blank
    And User clicks Sign In button
    Then User should see "هذا الحقل مطلوب" validation message


  Scenario: User is not able to login when password field is blank_AR
    Given User navigate to login page_AR
    When User enters valid username and leaves the password field as blank
    And User clicks Sign In button
    Then User should see "هذا الحقل مطلوب" validation message