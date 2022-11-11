# strict-firewall-block-request-minimal-reproducible-example

1. Start Spring boot application
2. Send a curl to the rest api
3. curl http://localhost:8080/headers -H "name: Preuß" <-- error
4. curl http://localhost:8080/headers -H "name: PreuÄ" <-- error
5. curl http://localhost:8080/headers -H "name: Preuä" <-- ok ! But Ä not?
7. curl http://localhost:8080/headers -H "name: PreuÖ" <-- error
8. curl http://localhost:8080/headers -H "name: Preuö" <-- ok ! But Ö not?

