# Coopeuch service
## Manual
### clone service
#### git clone https://github.com/ocardenasmartinez/coopeuch-service.git
### start service
#### ./gradlew bootRun
### Add user endpoint
### http://localhost:8080/coopeuch/add
{
    "description": "description",
    "current": true
}

### Edit user endpoint
### http://localhost:8080/coopeuch/edit
{
    "id": 1,
    "description": "description_6",
    "current": false
}
