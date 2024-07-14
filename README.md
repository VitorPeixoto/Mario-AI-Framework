# Mario AI Framework (fork)
Este é um fork do [Mario AI Framework](https://github.com/amidos2006/Mario-AI-Framework), um framework que permite o uso de métodos de IA aplicados a uma versão do Super Mario Bros.

## Alterações do Fork
> [!NOTE]  
> Eu subi várias coisas que não eram necessárias (arquivos buildados, fases, etc). Por conta disso, a lista de alterações é muito grande, muito ruim de entender. Então detalhei os pontos importantes abaixo. A lista completa de diferenças pode ser encontrada [aqui](https://github.com/VitorPeixoto/Mario-AI-Framework/commit/dc863139c189e3a7502818b0287ea5ac120f5f9d).

Para atender às necessidades do trabalho, algumas alterações foram feitas:
- **Mover todos as classes para um pacote:** Para utilizar o otimizador em Python, é necessário que as classes Java sejam parte de um pacote, então criei o pacote  `marioai.[...]`.
- **Parametrização do Notch Generator:** A idéia do trabalho era otimizar os parâmetros do gerador, então ajustei o método de geração para receber parâmetros. Vide [aqui](https://github.com/VitorPeixoto/Mario-AI-Framework/commit/dc863139c189e3a7502818b0287ea5ac120f5f9d#diff-fe20369f56f515ba8f1e509a90bd7db0a3ab5365dc8de79d1f52b6c1f23e1e03R310-R317).
- **Correção de bug:** Como consta no paper, encontrei um bug no Notch Generator que, em alguns casos, estourava uma exception na geração de colinas. Já que o trabalho envolvia gerar diversas fases, essa exceção prejudicaria os experimentos. Corrigi [aqui](https://github.com/VitorPeixoto/Mario-AI-Framework/commit/dc863139c189e3a7502818b0287ea5ac120f5f9d#diff-fe20369f56f515ba8f1e509a90bd7db0a3ab5365dc8de79d1f52b6c1f23e1e03R143).

## Como utilizar
Para instruções sobre como utilizar o framework para gerar mapas ou executar agentes para jogar os mapas, veja [aqui](https://github.com/amidos2006/Mario-AI-Framework#how-to-use).
