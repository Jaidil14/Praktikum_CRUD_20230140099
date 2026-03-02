### Tampilan Website:
<img width="1920" height="1080" alt="Screenshot 2026-03-02 140653" src="https://github.com/user-attachments/assets/57db5338-56f4-4ada-a1f2-88fac066c6a1" />

#### POST:
```Endpoint``` /api/users

```Response```
```
{
    "status": "success",
    "data": {
        "age": 15,
        "id": "2ec95cb7-7c0b-4449-9e02-f383f17fe1ef",
        "name": "Zhilal"
    }
}
```

### GET:
```Endpoint``` /api/users

```Response```
```
{
  "status": "success",
  "data": [
    {
      "age": 35,
      "id": "e95324d1-3f55-43c4-9911-b8ceefb536f7",
      "name": "Jodi"
    }
  ]
}
```

### GET By Id:
```Endpoint``` /api/users/{id}

```Response```
```
{
    "status": "success",
    "data": {
        "age": 15,
        "id": "2ec95cb7-7c0b-4449-9e02-f383f17fe1ef",
        "name": "Zhilal"
    }
}
```

### PUT:
```Endpoint``` api/users/{id}

```Response```
```
{
    "status": "success",
    "data": {
        "age": 10,
        "id": "2ec95cb7-7c0b-4449-9e02-f383f17fe1ef",
        "name": "Zhilal"
    }
}
```

### DELETE:
```Endpoint``` api/users/{id}

```Response```
```
{
    "status": "success delete user with id 2ec95cb7-7c0b-4449-9e02-f383f17fe1ef"
}
```
