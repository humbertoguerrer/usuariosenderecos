# Projeto para o Orange Talents da ZUP

Este projeto foi desenvolvido para o desafio da Orange Talents da ZUP.

## Objetivo

Implementar uma API REST para o cadastro de usuários e seus respectivos endereços.

## Tecnologias

- Java 11
- Spring Boot
- Hibernate e Spring Data JPA
- MySQL
- Spring Tool Suite
- Swagger

## Visão Geral

Inicialmente foram disponibilizados 3 endpoints:
- Cadastro de usuários;
- Cadastro de endereços;
- Listagem dos endereços de um usuário específico.

Como desafio foi implementado mais um endpoint: a busca de endereços através do consumo da API da VIACEP.

## Executar a aplicação

Para executar a aplicação, faça um clone do projeto.

Tenha instalado o JDK 11 e uma instância do MySQL. Execute o projeto através da classe principal.

As configurações de acesso ao banco de dados MySQL estão em ```resources/application.properties```

## Utilizando os endpoints

**Todos os endpoints estão documentados através de Swagger e podem ser visualizados em `http://localhost:8080/swagger-ui/index.html` após a aplicação inicializar.**

- Cadastrando novo usuário:
`http://localhost:8080/usuarios/`

Json body:
```
{
  "nome": "Humberto Guerrer Neto",
  "cpf": "363.794.958-00",
  "dataNascimento": "01/10/1987",
  "email": "humberto.guerrer@gmail.com",
  "enderecos": [
    {
      "bairro": "Jardim Europa",
      "cep": "17017-558",
      "localidade": "Bauru",
      "complemento": "Casa",
      "uf": "São Paulo",
      "logradouro": "Rua Milo de Almeida Sabino",
      "numero": "850"
    }
  ]
}
```

Resposta:
`O usuário 'Humberto Guerrer Neto' foi criado.`
    
- Cadastrando novo endereço:
`http://localhost:8080/enderecos`

Json body:
```
{
  "bairro": "Jardim Panorama",
  "cep": "15015-245",
  "localidade": "Piratininga",
  "complemento": "Casa",
  "uf": "São Paulo",
  "logradouro": "Rua da Glória",
  "numero": "214"
}
```
Resposta:
`O novo endereço foi cadastrado.`

- Obtendo a listagem de endereços cadastrados para um usuário:
`http://localhost:8080/usuarios/1`

Resposta:
```
{
    "id": 1,
    "nome": "Humberto Guerrer Neto",
    "email": "humberto.guerrer@gmail.com",
    "cpf": "363.794.958-00",
    "dataNascimento": "01/10/1987",
    "enderecos": [
        {
            "id": 1,
            "logradouro": "Rua Milo de Almeida Sabino",
            "numero": "850",
            "complemento": "Casa",
            "bairro": "Jardim Europa",
            "localidade": "Bauru",
            "uf": "São Paulo",
            "cep": "17017-558"
        }
    ]
}
```

**Bônus**
- Buscando um endereço através do CEP:
`http://localhost:8080/enderecos/69900901`

Resposta:
```
{
    "id": null,
    "logradouro": "Rua Rui Barbosa 285",
    "numero": null,
    "complemento": "",
    "bairro": "Centro",
    "localidade": "Rio Branco",
    "uf": "AC",
    "cep": "69900-901"
}
```
