# Modulith Example

The goal of this project is to present a way to write a multi-module monolith.

## Why multi-module monolith?

Because after I had the experience of developing in a big monolith ~400K LoC using the default technical layered architecture (controllers, service, mappers, model, repositories) I had some issues. 
The **main issue** was that I had to run the full app everytime, even when I only wanted to test 1 feature of a very small domain. This results in a slower startup.
Another issues was **I had no clear division between domains**

Don't get me wrong, I don't want to decouple domain and framework here (because I think it's not that worth it), I'm just saying I couldn't see if a Banking domain affected Contract domain because **in the whole ball of mud everything was together**.



## Architecture 

I will use Maven module feature for this project and add some alternatives I considered in this README.md. 
If you don't know the basics of POM configuration, read my blogpost here: [Using Maven](https://www.joseiedo.com/blog/maven_in_a_nutshell)

- Quarkus and other common libraries will be in a module we call BOM (Bill of Materials), so modules don't need to update the versions.
- Each module will have their own jar (we can merge all jar later)
