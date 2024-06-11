# Desafio Senior Software Engineer


### <a name="setup_environment">Preparando o Ambiente</a> 


Tecnologias necessárias para o desafio:

- JDK17
- Docker
- Maven
- Eclipse
- Postman


Montando o ambiente

1. Importar o projeto no eclipse
2. Executar o comando mvn clean install 
3. Executar o 'docker compose up -d
4. Executar a classe 'InsuranceQuoteServiceApplication' como Java Application (run as -> Java Application)

Obs.: Para executar os serviços é necessário rodar o 'docker compose' do projeto 'sr-software-engineer-challenge'

A documentação dos serviços disponíveis podem ser acessadas através do link abaixo

```shell script
http://localhost:8090/swagger-ui/index.html 
```



| Requisito                                                                                           | 
|-----------------------------------------------------------------------------------------------------|
| <ul><li>[OK] Desenvolvimento do endpoint para receber as cotações de seguro</li></ul>               |
| <ul><li>[OK] Validação do produto e oferta da requisião</li></ul>                                   |
| <ul><li>[OK] Persistência da cotação de seguro recebida</li></ul>                                   |
| <ul><li>[!] Envio da mensagem da cotação recebida no tópico kafka</li></ul>                         |
| <ul><li>[!] Recebimento da mensagem da apólice emitida no tópico kafka</li></ul>                    |
| <ul><li>[OK] Atualização da cotação de seguro no banco de dados com os dados da apólice</li></ul>   |
| <ul><li>[OK] Desenvolvimento do(s) endpoint(s) para consulta da(s) cotação(ões) de seguro</li></ul> |