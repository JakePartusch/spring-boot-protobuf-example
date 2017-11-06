# spring-boot-protobuf-example

##Usage

```
./gradlew bootRun
```

```
curl http://localhost:8080/person/json
curl http://localhost:8080/person/protoBuf
```

### JSON response
```json
{
    "firstName": "Jake",
    "lastName": "Partusch",
    "emailAddress": "jakepartusch@abc.com",
    "homeAddress": "123 Seasame Street",
    "phoneNumbers": [
        {
            "areaCode": 123,
            "phoneNumber": 1234567
        }
    ]
}
```

### ProtoBuf response
```protobuf
JakePartuschjakepartusch@abc.com"123 Seasame Street*{��K
```