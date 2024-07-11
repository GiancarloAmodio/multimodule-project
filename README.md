# My Multimodule Project

Questo repository contiene due progetti principali: un'applicazione Spring Boot chiamata `CasinoGames` e un'applicazione Node.js per testare le API del progetto Spring Boot.

## Struttura del Progetto

```properties
my-multimodule-project/
   ├── CasinoGames/
   │ ├── src/
   │ ├── pom.xml
   ├── nodejs-app/
   │ ├── src/
   │ ├── package.json
   │ └── ... (altri file del progetto Node.js)
   └── README.md
   ├── nodejs-app/
   │ ├── src/
   │ ├── package.json
   │ └── ... (altri file del progetto Node.js)
   └── README.md
```

## CasinoGames (Spring Boot)

### Descrizione

`CasinoGames` è un'applicazione Spring Boot progettata per gestire utenti e giochi di casinò. Utilizza MongoDB come database e include funzionalità di registrazione e autenticazione degli utenti.

### Configurazione

1. **Configurazione del Database MongoDB:**

   Assicurati di avere MongoDB installato e in esecuzione sul tuo sistema. Puoi configurare le proprietà del database nel file `application.properties`:

   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/casinogames
   ```

2. **Esecuzione dell'Applicazione:**

   Clona il repository e naviga nella directory CasinoGames:

   ```properties
   git clone https://github.com/tuo-username/my-multimodule-project.git
   cd my-multimodule-project/CasinoGames
   ```

Costruisci ed esegui l'applicazione utilizzando Maven:

   ```properties
   mvn spring-boot:run
   ```
   
### Endpoint API
   
   Registrazione Utente:

   `POST /api/users/register`

   Corpo richiesta:

   ```properties
   {
   "username": "testuser",
   "password": "testpassword",
   "email": "testuser@example.com"
   }
   ```
   Ottenere Utente per Username:

   `GET /api/users/{username}`

Aggiornare Utente:

   `PUT /api/users/{id}`

Corpo richiesta:

```properties
{
"username": "updateduser",
"password": "updatedpassword",
"email": "updateduser@example.com"
}
```
Eliminare Utente:

`DELETE /api/users/{id}`


## JS (Node.js App)
### Descrizione

`JS` è un'applicazione Node.js utilizzata per testare le API dell'applicazione Spring Boot `CasinoGames`. Utilizza node-fetch per fare richieste HTTP.
