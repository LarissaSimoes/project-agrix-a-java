# Agrix - Sistema de Gestão de Fazendas e Plantações

Agrix é um sistema que visa melhorar a eficiência no cultivo de plantações, reduzindo o desperdício de recursos e promovendo práticas agrícolas mais sustentáveis.

## Funcionalidades

O projeto Agrix será desenvolvido em fases, e atualmente (fase A) inclui as seguintes funcionalidades:

1. **Cadastrar Fazendas**:
   - Rota POST `/farms` para cadastrar fazendas.

2. **Listar Fazendas**:
   - Rota GET `/farms` para listar todas as fazendas cadastradas.

3. **Detalhes de Fazenda**:
   - Rota GET `/farms/{id}` para obter informações sobre uma fazenda específica.

4. **Cadastrar Plantações**:
   - Rota POST `/farms/{farmId}/crops` para criar plantações em uma fazenda.

5. **Listar Plantações de Fazenda**:
   - Rota GET `/farms/{farmId}/crops` para listar as plantações de uma fazenda.

6. **Listar Todas as Plantações**:
   - Rota GET `/crops` para listar todas as plantações cadastradas.

7. **Detalhes de Plantação**:
   - Rota GET `/crops/{id}` para obter informações sobre uma plantação específica.

## Tecnologias Utilizadas

O projeto Agrix utiliza as seguintes tecnologias e frameworks:

- **Spring Boot**: Para criar a aplicação e disponibilizar as APIs.

- **Spring Data JPA**: Para a camada de persistência e acesso ao banco de dados.

- **Docker**: Para configurar a aplicação para execução em contêineres Docker.

## Como executar o projeto

<br/>

```bash
# Clone ou baixe o repositório
git clone git@github.com:LarissaSimoes/project-agrix-a-java.git
# Entre no diretório
cd project-agrix-a-java
# Instale as dependências
mvn install -DskipTests
# Execute a aplicação
Executar a Classe Principal (AgrixApplication.java)
```

<br /><hr /><br />

<p align='center'>
  Desenvolvido por <b>Larissa Simões</b>
  <br/><br/>

  <a href="https://www.linkedin.com/in/dev-larissa-carneiro-simoes/">
    <img alt="linkedIn" height="30px" src="https://i.imgur.com/TQRXxhT.png" />
  </a>
  &nbsp;&nbsp;
</p>

