# Paired Programming interview foundation

This challenge is technically simple. What we really want to evaluate here is a potential partner's **current** 
abilities in the layout of the solution, ability in the following areas : 

 - Java Knowledge
 - Solution layout - Well defined controllers, services, etc.
 - Test Driven Development
 - Pairing to find a solution.

## The problem we need to solve
We need an API which will reverse a string. We want to be able to send a request in Postman and receive a response
which will contain both the original string AND the reversed string as separate fields, along with a HTTP status of 200.

In addition to this - The characters 'H', 'E' and 'B' (only uppercase - lowercase should be accepted) are banned.
If these characters are sent as any part of the request - We want to throw a custom exception, and the http status will
be a 4xx bad request.

## Testing
We strive to practice Test driven development. This means at every stage of application development, the partners solving
this problem must always be trying to fix a test, regardless of how redundant it may seem in the moment.

## Pairing
Unlike many software engineering interviews, the potential partner is not expected 



