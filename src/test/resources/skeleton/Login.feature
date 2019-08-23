Feature: Casestudy
@smoke
  Scenario Outline: Registration
    Given TestMe app is launched
    Then click on Signup link
    Then fill username"<username>"
    Then fill firstname"<firstname>"
    Then lastname"<lastname>"
    Then password"<passsword>"
    Then confirm password"<confirm passsword>"
    Then fill gender
    Then fill email "<email>"
    Then fill mobilenumber"<mobile number>"
    Then fill DOB "<DOB>"
    Then fill address"<address>"
    Then fill security question
    Then fill answer "<answer>"
    Then click on registration button
    And verify the registration login

    Examples: 
      | username    | firstname  | lastname  | password    | confirm password | email              | mobile number | DOB        | address  | answer     |
      | meghana5603 | gollachiru | tallupula | trignometry | trignometry      | meghu234@gmail.com |    9876543210 | 03/07/1998 | Medchal  | pavukoda   |
      | pavan345    | pikachu    | Inciya    | panipuri    | panipuri         | pavu87@gmail.com   |    6789054325 | 01/09/1998 | Kakinada | srikakulam |
      | anusri98    | kamineni   | Charan    | mobilephone | mobilephone      | anu756@gmail.com   |    9876542345 | 03/02/1972 | Chennai  | hyderabad  |
@sanity
  Scenario: Login with different usernames
    Given Enter valid credentials in username
    And enter valid credentials in password 
    And click on login page
    Then verify login process
@sanity
  Scenario: add product to cart
  Given search for product
  #Then click on find details
  Then click on add to cart
  Then proceed with payment
  And continue payment process
  
  @sanity
  Scenario: Without proper order
  Given search the headphone
  Then it is not added to cart
  Then try to proceed payment without adding
  And testme app doesnt proceed
