# Projeto 
ForumHub é uma uma API Rest para a simulação de um fórum para inserir duvidas sobre cursos e projetos que estão participando.

### Funcionalidades

- [x] CRUD;

### Dependências utilizadas

* Spring Web
* Spring Data JPA
* SpringDoc
* DevTools
* Validation
* Lombok
* MySQL Driver
* Flyway Migration.

### Etapas para execução

* Faça o Fork deste projeto;
* Abra o projeto em uma IDE da sua preferência;
* Atraves do terminal de sua IDE acesse seu MySQL previamente instalado;
* Crie o database seu MySQL ---> (create database forumHub;)
* Dentro da pasta src --> main --> resources, atualize sua application.properties corretamente como o nome do database, username, senhas e chaves para a jwt.secret;
* Rode a aplicação;
* Acesse sua database e insira um email e senha no formarto hash ---> insert into usuarios values(1, 'email', 'senha')
* Acesse a aplicação na via web utilizando Insomnia se tiver instalado previamente ou Swagger via web diretalmente.

### Acesso a aplicação

* `http://localhost:8080/swagger-ui.html` - Para acesso da API em uma versão Web.
* `http://localhost:8080/v3/api-docs/` - Para acesso de um JSON que mostra os endereços e endpoints da API.

### Tecnologias utilizadas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![MySql](https://img.shields.io/badge/mysql-%230040FF.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Hibernate](https://img.shields.io/badge/hibernate-%23999999.svg?style=for-the-badge&logo=hibernate&logoColor=white)
![Flyway](https://img.shields.io/badge/flyway-%23FF0000.svg?style=for-the-badge&logo=flyway&logoColor=white)
![LombokFlyway](https://img.shields.io/badge/lombok-%23DC143C.svg?style=for-the-badge&logo=lombok&logoColor=white)
