Feature: Reqres Endpoint test automation

Scenario: Verify GET Reponse for Single User
Given url 'https://reqres.in/api/users?page=2'
When method GET
Then status 200
And match $ contains {page:2}
And match $ contains {per_page:6}