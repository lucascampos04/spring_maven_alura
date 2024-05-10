# Maven

O que é maven ?

Maven é basicamente um gerenciador de biblioteca, onde você podera implementar
dependencias em seu projeto, assim, deixando ele mais robusto e completo.

<hr/>

@JsonAlias
--
O @JsonAlias é usado para definir um ou mais apelidos para o nome da propriedade JSON associada ao campo Java.

Ao desserializar, o @JsonAlias permite que a biblioteca encontre o valor JSON correspondente, 
mesmo que o nome da propriedade no JSON não corresponda exatamente ao nome do campo Java.

Isso é útil quando você está trabalhando com diferentes versões de um JSON ou quando deseja permitir que uma 
propriedade seja referenciada por nomes diferentes.

@JsonProperty
--
Essa anotação é usada para definir o nome da propriedade JSON que está associada ao campo Java.

Quando o JSON é serializado, isto é, convertido de objetos Java para JSON, 
o nome especificado em @JsonProperty será usado como a chave para o campo no JSON de saída. 
Da mesma forma, quando o JSON é desserializado (convertido de JSON para objetos Java), 
a biblioteca procura pelo nome especificado em 
@JsonProperty para mapear o valor JSON para o campo Java.

<hr/>

~~~java
    import com.fasterxml.jackson.annotation.JsonAlias;
    import com.fasterxml.jackson.annotation.JsonProperty;
    
    public record DadosJson(
            @JsonAlias("nome") String name,
            @JsonAlias("email") String email,
            @JsonAlias("cpf") String cpf,
            @JsonAlias("rg") String rg,
            @JsonAlias("username") String username,
            @JsonProperty("phone") String phone) {
    }

~~~

<hr/>
    
# `<T>` Tipo Genérico

Aqui usamos na Interface *'IConvertDados'*

~~~Java
    package org.system_hotel.screen_match_alura.Services;

    public interface IConvertDados {
        <T> T obterDados(String json, Class<T> tClass);
    }
~~~

O uso de `<T>` como um tipo Genérico em Java permite escrever código independente do 
tipo especifico de dados manipulado. Isso torna o codigo mais flexivel e reutilizavel, permitindo a criação de metodos e classes que podem
operar com qualquer de objeto.

