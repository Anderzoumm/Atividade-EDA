# Atividades — Estrutura de Dados (1º Estágio)

Repositório com as atividades práticas desenvolvidas durante o **primeiro estágio** da disciplina de **Estrutura de Dados**. O foco deste estágio foi a implementação de estruturas lineares do zero (sem usar `java.util.*`) e a resolução de exercícios de aplicação sobre cada uma delas.

## 📂 Estrutura do repositório

```
.
├── vetor/     → Vetor Genérico (array dinâmico)
├── pilhas/    → Pilha (LIFO)
└── filas/     → Fila (FIFO) e Fila com Prioridade
```

Cada pasta representa uma estrutura de dados diferente, contendo a classe da estrutura e os exercícios de aplicação resolvidos com ela.

---

## 📦 `vetor/` — Vetor Genérico

Implementação de um vetor genérico (`VetorGenerico<T>`) com redimensionamento automático (dobra de capacidade quando fica cheio).

**Operações implementadas:** `adiciona(T)`, `adiciona(posicao, T)`, `busca(posicao)`, `busca(T)`, `remove(posicao)`, `tamanho()`, `toString()`.

| Arquivo | Descrição |
|---|---|
| `VetorGenerico.java` | Classe genérica base |
| `Exercicio3.java` | Consulta de posições (linguagens de programação) — busca por índice, busca por valor, tratamento de posição inválida |
| `Exercicio4.java` | Cadastro de livros — inserção, consulta por posição e por título, tratamento de exceções |
| `Exercicio5.java` | Validação de capacidade — comportamento do vetor ao atingir e ultrapassar o limite inicial |

---

## 📚 `pilhas/` — Pilha (LIFO)

Implementação de uma pilha genérica (`Pilha<T>`) usando vetor como estrutura interna.

**Operações implementadas:** `empilha(T)`, `desempilha()`, `topo()`, `estaVazia()`, `tamanho()`, `toString()`.

| Arquivo | Descrição |
|---|---|
| `Pilha.java` | Classe da pilha (inclui os métodos herdados do vetor genérico + operações de pilha) |
| `Exercicio2.java` | Teste básico: empilha A, B, C; consulta e remove o topo |
| `Exercicio3.java` | Demonstração do `toString()` no formato `[A, B, C]` |
| `Exercicio4.java` | Inversão de palavra (`hello` → `olleh`) |
| `Exercicio5.java` | Verificação de palíndromo (`arara`, `casa`) |
| `Exercicio6.java` | Inversão da ordem das palavras de uma frase |

---

## 🎫 `filas/` — Fila (FIFO) e Fila com Prioridade

Implementação de uma fila genérica (`Fila<T>`) e de uma extensão com prioridade (`FilaComPrioridade<T>`), usadas para simular cenários reais de atendimento.

**Operações da fila:** `enfileirar(T)`, `desenfileirar()`, `espiar()`, `estaVazia()`, `tamanho()`, `toString()`.

`FilaComPrioridade<T extends Comparable<T>>` mantém os elementos sempre ordenados pela prioridade (menor valor = mais prioritário), preservando a ordem de chegada em caso de empate.

| Arquivo | Descrição |
|---|---|
| `Fila.java` | Classe da fila (FIFO) |
| `FilaComPrioridade.java` | Extensão da fila que ordena por prioridade |
| `Documento.java`, `ClienteBanco.java`, `ClienteMercado.java`, `Pessoa.java`, `Paciente.java`, `DocumentoPrioridade.java`, `Chamada.java`, `Processo.java`, `Tarefa.java` | Classes de domínio usadas nos exercícios |
| `Exercicio1.java` | Fila de impressão |
| `Exercicio2.java` | Atendimento de banco |
| `Exercicio3.java` | Fila de supermercado |
| `Exercicio4.java` | Senhas com prioridade (fila normal + prioritária, razão 3:1) |
| `Exercicio5.java` | Pronto-socorro (fila com prioridade) |
| `Exercicio6.java` | Impressão com urgência (prioridade + desempate por ordem de chegada) |
| `Exercicio7.java` | Fila de chamadas telefônicas |


---

## ▶️ Como executar

Os arquivos usam `package`, então a compilação/execução deve ser feita a partir da **raiz do repositório**.

```bash
# compilar todos os arquivos de um pacote
javac vetor/*.java
javac pilhas/*.java
javac filas/*.java

# executar um exercício específico (exemplo)
java vetor.Exercicio3
java pilhas.Exercicio4
java filas.Exercicio5
```

> 💡 Se acentos aparecerem incorretos no terminal, execute com a flag de encoding:
> `java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 filas.Exercicio5`

---

## 🐞 Observações técnicas

- Na classe `Fila`, o método `desenfileirar()` continha um bug de índice (`elementos[tamanho]` em vez de `elementos[tamanho - 1]`), que causava `ArrayIndexOutOfBoundsException` sempre que a fila estava exatamente no limite da capacidade. O bug foi corrigido.
- A classe `FilaComPrioridade<T extends Comparable<T>>` acessa o array interno por meio de métodos auxiliares (`obtemElemento`/`defineElemento`) em vez de indexação direta, evitando um `ClassCastException` causado pelo apagamento de tipo (*type erasure*) ao herdar um array genérico em uma subclasse com bound.
- Em `VetorGenerico` e `Pilha`, o método `adiciona(T)` aumenta a capacidade **antes** de verificar se o vetor está cheio — por isso, na prática, ele nunca retorna `false` (a capacidade dobra automaticamente antes da inserção).

---

## 🎯 Objetivo da disciplina

Compreender, na prática, o funcionamento interno de estruturas de dados lineares (vetor dinâmico, pilha e fila), implementando-as manualmente e aplicando-as na resolução de problemas do dia a dia (impressão, atendimento, priorização, entre outros).
