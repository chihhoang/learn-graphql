Learn GraphQL with examples  
[GraphQL with Java](https://www.howtographql.com/graphql-java/0-introduction/)  
Queries used to test  
```
# mutation createLink {
#   createLink(url: "https://www.graphql.cool/", description: "Serverless GraphQL Backend with Java") {
#     url
#     description
#   }
# }

# {
#   allLinks {
#     id
#     url
#     description
#   }
# }

# mutation createUser {
#   createUser(
#     name: "Chi Hoang"
#     authProvider: {
#       email: "choang@example.com"
#       password: "secret"
      
#     }) {
#   	id
#   	name
#   }
# }

# mutation signIn {
#   signinUser(auth: {email: "choang@example.com", password: "secret"}) {
#     token
#     user {
#       id
#       name
#     }
#   }
# }

# id for above: 5caa6b0f881dddf8a5b29508

# mutation createLink {
#   createLink(
#       url: "https://en.wikipedia.org/wiki/Intuit"
#       description: "Intuit's Wiki") {
#     url
#   }
# }

# id for above 5caa843c881ddd4d344961f9

# query all {
#   allLinks {
#     id
#     url
#     description
#     postedBy {
#       name
#     }
#   }
# }

# mutation vote {
#   createVote(
#   		linkId: "5caa843c881ddd4d344961f9"
#     	userId: "5caa6b0f881dddf8a5b29508") {
#     createdAt
#     link {
#       url
#     }
#     user {
#       name
#     }
#   }
# }

# query links {
#   allLinks(filter: {description_contains: "Java", url_contains: "cool"}) {
#     description
#     url
#   }
# }

query links {
  allLinks(skip: 1, first: 1) {
    description
    url
  }
}
```
