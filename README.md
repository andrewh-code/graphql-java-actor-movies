#GraphQL - Actor, Movie

The following graphql project wasd created using the spring framework and the associated Java graphql libraries that are supported
by the official graphql foundation.

The graphql project goes through the creation of the following models: Actor and Film (Movie) 
And the creation of query and mutations for the graphql server to implement. 
The solution has been created using the top down (schema based) approach and the .graphqls schema file 
can be found in the resources/graphl/ director (where typically all graphql files should be located)

### The project includes the following concepts/implementations:
- graphql schema based design
- actor/movie models 
- service directory where the query and the mutation resolvers are implemented
- loading data on startup to the in memeory database
- creating new data based off of mutations and querying data, all in graphql

### To use:
The project was created in IntelliJ, so fire that up if you have it. Run the ActorServer.java file (it's the main class)
Port is on the default apache tomcat port 8080
to execute the graphql queries/mutations, go to the graphiql endpoint:
http://localhost:8080/graphiql


### example graphql endpoints
http://localhost:8080/graphiql

getAllActors
```
getAllActors{
    actorId
    firstName
    lastName
    address
}
```
getActorByFirstName
```
getActorByFirstName(firstName: String){
    id
    name
}
```
retrieveActor
```
retrieveActor{
      id
      name
      dob
      film {
          id
          name
      }
}
```

updateAddress
```
mutation{
    updateAddress(id:2, address: "125 faker street"){
    actorId
    firstName
    lastName
    address
    }
}
```

