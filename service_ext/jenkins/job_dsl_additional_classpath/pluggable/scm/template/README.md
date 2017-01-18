# SCM Provider
Defining your SCM provider is a matter of creating some Groovy classes to implement the required functionality. You will have a Factory method which parses the properties objects, and returns them to your instance of SCMProvider. You will then have the main implementation which, at the minimum, needs to be able to do the following:
* Create the repositories defined in urls.txt inside your SCM provider under the correct namespace chosen via Load_Cartridge
* Return the DSL closure block for doing an SCM clone based on correct input parameters
* Return the DSL closure block for doing a trigger on a push based on correct input parameters
