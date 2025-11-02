Feature: Login de usuario en el portal

  Como usuario registrado
  Quiero iniciar sesión
  Para poder acceder a mi área personal

 
  Scenario: Inicio de sesión exitoso
    Given estoy en la pagina de login
    When ingreso el usuario "andres" y la contrasena "pass123"
    Then deberia ser redirigido a mi "Area Personal"
    
  Scenario Outline: Inicio de sesión fallido
    Given estoy en la pagina de login
    When ingreso el usuario "<usuario>" y la contrasena "<password>"
    Then deberia ver el mensaje de error "<mensaje>"

    Examples:
      | usuario | password | mensaje                             |
      | mal     | pass123  | Usuario o contrasena inválidos      |
      | andres  | malapass | Usuario o contrasena inválidos      |
      |         | pass123  | Usuario y contrasena son obligatorios |
      | andres  |          | Usuario y contrasena son obligatorios |