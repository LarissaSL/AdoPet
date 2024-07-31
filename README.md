# 🖥️🐶🐱 Sobre o projeto

Adopet é um site fictício de adoção de pets, com funcionalidades para cadastro de tutores, de abrigos e de pets, além de solicitação de adoções. O Objetivo do Projeto é implementar técnicas de boa prática de programação.

## 🎯 Inclusões

- ✅ Separação da Lógica de negócios dos Controllers;
- ✅ Uso do padrão de DTO´s para lidar com as informações que entram e saem da API;
- ✅ Implementação dos Designer Patterns: Strategy (Separando as validações) e Chain of Responsibility (Cadeia de Responsabilidade em um pedido, no caso, nas validações);
- ✅ Retirada de códigos redudantes nas classes de Entidade;
- ✅ Inclusão de Paginação;

Foi incluido o uso de padrões DTO´s, para representar as informações que chegam e saem da API, junto ao padrão de designer pattern: Strategy e o Chain. Além de isolar a lógica nas classes de Service e deixar o Controller responsável apenas pelo Fluxo das requisições

---

## ⚙️ Funcionalidades

- ✅ Cadastro/atualização de tutores;
- ✅ Cadastro de abrigos;
- ✅ Cadastro de pets do abrigo;
- ✅ Listagem de pets disponíveis para adoção;
- 🟡 Solicitação de adoção;
- 🟡 Aprovação/reprovação de adoção;

`OBS.:` Para que a função de Solicitação, Aprovação e Reprovação funcionem é necessário configurar a parte de Email no `application.properties`

---

# 🖥️🛠️ Como usar?
## Configure seu banco de Dados
1. É preciso ter baixado o MySQL
2. Configure no arquivo `application.properties` seu username e senha
![image](https://github.com/user-attachments/assets/06272e43-3f7f-4a43-bab6-ef1e77a34ed0)


# 🌐 Para testar as Rotas
## 🛠️ Cadastrar um novo Abrigo:
1. Acesse a URL: http://localhost:8080/abrigos no API dog, Postman ou Insomnia
2. Troque o método para `POST`
3. Construa o seu JSON
```json
{
    "nome": "Abrigo Amor Animal",
    "telefone": "(21)34567-8901",
    "email": "info@abrigoamoranimal.com"
}
```
### Resultado
![image](https://github.com/user-attachments/assets/6c6e203d-1654-4536-9880-ce4117ed06c4)


## 🛠️ Cadastrar um novo Tutor:
1. Acesse a URL: http://localhost:8080/tutores no API dog, Postman ou Insomnia
2. Troque o método para `POST`
3. Construa o seu JSON
```json
{
	"nome": "Merida",
	"telefone": "(21)11867-8901",
	"email": "merida@gmail.com"
}
```
### Resultado
![image](https://github.com/user-attachments/assets/766521e7-97ef-41e4-a4bb-4fc63a3d0183)



## 🛠️ Cadastrar um novo Pet:
1. Acesse a URL: http://localhost:8080/abrigos/1/pets no API dog, Postman ou Insomnia
2. Troque o método para `POST`
3. Construa o seu JSON
```json
{
    "nome": "Zeus",
    "tipo": "CACHORRO",
    "raca": "Pastor Alemão",
    "idade": 4,
    "cor": "Preto",
    "peso": 35.0
}
```
### Resultado
![image](https://github.com/user-attachments/assets/109a768e-45bb-45c7-9a19-04a1f6d055f9)



## 🛠️ Exibir os PETS por Abrigo:
1. Acesse a URL: http://localhost:8080/abrigos/1/pets no API dog, Postman ou Insomnia
2. Troque o método para `GET`
3. Construa o seu JSON
```json
{
    "nome": "Zeus",
    "tipo": "CACHORRO",
    "raca": "Pastor Alemão",
    "idade": 4,
    "cor": "Preto",
    "peso": 35.0
}
```
### Resultado
![image](https://github.com/user-attachments/assets/af4e50a0-756e-4a44-b2d4-84027e8c8323)

## 🛠️ Solicitar adoção de um Pet:
1. Acesse a URL: http://localhost:8080/adocoes no API dog, Postman ou Insomnia
2. Troque o método para `POST`
3. Construa o seu JSON
```json
{
    "idPet": 3,
    "idTutor": 6,
    "motivo": "Estou muito interessado em adotar este pet e acredito que posso proporcionar um ótimo lar para ele."
}
```
### Resultado
![image](https://github.com/user-attachments/assets/480a8f77-99e1-4137-a9e2-7492ecffd654)

---

## 🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest do projeto:

- **[Java 17](https://www.oracle.com/java)**
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**
- **[Maven](https://maven.apache.org)**
- **[MySQL](https://www.mysql.com)**
- **[Hibernate](https://hibernate.org)**
- **[Flyway](https://flywaydb.org)**

---

## 📝 Licença

O projeto desse repositório foi desenvolvido por [Alura](https://www.alura.com.br) e utilizado nos cursos de boas práticas de programação com Java.

Instrutor: [Rodrigo Ferreira](https://cursos.alura.com.br/user/rodrigo-ferreira)


`Confira o Projeto antes das mudanças aqui:` ---[3238-boas-praticas-java-projeto_inicial (1).zip](https://github.com/user-attachments/files/16447768/3238-boas-praticas-java-projeto_inicial.1.zip)

