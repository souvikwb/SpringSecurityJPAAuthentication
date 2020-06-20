# SpringSecurityJPAAuthentication
This is a simple spring JPA authentication example using spring data JPA and H2 DB. Here we extends "WebSecurityConfigurerAdapter" and overrride "configure" method
We implemented "UserDetailsService" and using spring data JPA, fetched the data from H2 DB. We have implemented "UserDetails" and set the 
"User" values in that implemented class. Finally in security configuration class, we have added ROLE based authentication.
