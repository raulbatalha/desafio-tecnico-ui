#language:pt
Caracteristica: Teste para automação Getnet

  Contexto:
    Dado que desejo acessar Guia Médico na pagina da Unimed Cooperado!


  Esquema do Cenário:  CT001 Caso de Teste - Validar a seguinte sequência de ações
    Quando realizar uma pesquisa de Médicos no "<nomeDaPesquisa>"
    Entao Validar a apresentação dos resultados com a "<especialidade>" e "<cidade>".

    Exemplos:
      | nomeDaPesquisa | especialidade  | cidade                                                       |
      | Rio de Janeiro | Anestesiologia | Barra Da Tijuca - Rio de Janeiro / RJ - Tel.: (21) 2265-1692 |


  Esquema do Cenário:  CT002 Caso de Teste - Validar nas páginas 1, 2, e 3 do resultado, NÃO apresentação do resultado com cidade São Paulo
    Quando realizar uma pesquisa de Médicos no "<nomeDaPesquisa>"
    Entao Validar a apresentação dos resultados com a "<especialidade>" e "<cidade>".

    Exemplos:
      | nomeDaPesquisa | especialidade | cidade    |
      | Rio de Janeiro | Nefrologia    | São Paulo |