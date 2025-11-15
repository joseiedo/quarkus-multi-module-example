# Modulith Example (testing)

The goal of this project is to present a way to write a multi-module monolith.

## Why multi-module monolith?

Because after I had the experience of developing in a big monolith ~400K LoC using the default technical layered architecture (controllers, service, mappers, model, repositories) I had some issues. 
The **main issue** was that I had to run the full app everytime, even when I only wanted to test 1 feature of a very small domain. This results in a slower startup.
Another issue was **I had no clear division between domains**

Don't get me wrong, I don't want to decouple domain and framework here (because I don't think it's worth it), I'm just saying that with a monolith I can't even see if a Banking domain change affects Contract domain because **in the whole ball of mud, everything was together**.


## Architecture 

I will use Maven module feature for this project and add some alternatives I considered in this README.md. 
If you don't know the basics of POM configuration, read my blogpost here: [Using Maven](https://www.joseiedo.com/blog/maven_in_a_nutshell)

- **billing**: depends on user, example module.
- **streaming**: depends on user, example module.
- **user**: depends on nothing.
- **application**: centralize all modules in a single server.

With this project, you can run a **single module** or just **run everything all at once**. Just use maven commands

```bash
mvn -pl <module>

# e.g.
mvn -pl billing
mvn -pl application 
```

### Database-per-module approach

Thanks to the beautiful Quarkus/Hibernate integration, it's a matter of updating the application.properties of each module and use Persistence Units:

```properties
# just follow the pattern
quarkus.datasource."module".property=

# e.g.
quarkus.datasource."billing".jdbc.url=source...
quarkus.datasource."billing".db-kind=postgresql
quarkus.hibernate-orm."billing".schema-management.strategy=update
quarkus.hibernate-orm."billing".datasource=billing
quarkus.hibernate-orm."billing".packages=com.joseiedo.billing
```

The app will even break if someone try to use entities of another persistence unit. Read more [here](https://pt.quarkus.io/guides/hibernate-orm#multiple-persistence-units)