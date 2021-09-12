![](https://img.shields.io/badge/Status-Page%20in%20construction-orange)
![](https://img.shields.io/badge/release-v01-green)

# API Machine States

Api destinada a gerenciamento de estados e transições.

## Requisitos Técnicos

```bash
  JAVA SDK 11+
  PostgreSQL
```
## Instalação

clonar o repositório, abrir o projeto e configurar o acesso ao PostgreSQL no arquivo "application.properties" com "user" e "senha".
 
```bash
  spring.datasource.url= jdbc:postgresql://localhost:5432/
  spring.datasource.username=user
  spring.datasource.password=senha
```

## API Reference

<details open> 
  <summary>
    Tipos de Requisições
  </summary>
  
#### Get all states
```http
  GET /api/states/
```
#### Get states
```http
  GET /api/states/:id
```
#### Post states
```http
  POST /api/states/
```
#### Put states
```http
  PUT /api/states/:id
```
#### Delete states
```http
  DELETE /api/states/:id
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `status` | `String` | **[ ACORDADO, TRABALHANDO, DESCANSANDO, DORMINDO ]** |
| `times` | `String` | [ OPTIONSONE("8:00"), OPTIONSTWO("12:00"), OPTIONSTHREE("13:00"), OPTIONSFOUR("18:00"), OPTIONSFIVE("22:00") ] |


</details>

## Documentação com Swagger

```http
  http://localhost:8080/swagger-ui.html
```

## Linguagem

  - Java 11

## Dependências / ferramentas utilizadas
  - Swagger
  - Postman
  - Postgresql
  - Spring Boot
  
## Authors

- [Renan Marques](https://www.github.com/re04nan)

