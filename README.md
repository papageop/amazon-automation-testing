<h1>Amazon Automation Testing using Selenium Webdriver</h1>
<h3>Project Scope</h3>
<p>In this project we  will attempt to implement a simple automation testing task for the website www.amazon.com.
We will implement some basic pages such as homepage, sign in, sign up, cart, product page etc. Afterwards, we will build some basic tests
that will attempt to make some basic user actions like those described in the Goals section.</p>
<h3>First Steps</h3>
<p>Before you run the tests, you need to supply the username and password credentials for login. Then install all dependencies and build the project.</p>
<code>mvn install -DskipTests=true </code>
<h3>Goals</h3>
<p>
<ul>
<li>Go to www.amazon.com</li>
<li>Sign In using a test user</li>
<li>Navigate using main navbar</li>
<li>Visit product page</li>
<li>Add product to cart</li>
<li>Visit cart page</li>
<li>Delete item from cart</li>
<li>Go to checkout page</li>
<li>Sign out</li>
</ul></p>
<h3>Tools</h3>
<ul>
<li>
Java JDK 1.8
</li>
<li>Apache Maven 3.8.4</li>
<li>Selenium Webdriver</li>
</ul>
<h3>Run tests</h3>
<p>To run the tests using the TestNG Suite simply run:</p>
<code>
mvn clean test
</code>
