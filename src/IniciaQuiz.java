import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;

public class IniciaQuiz {

    public static void iniciar() {

        List<Questao> questoes = new ArrayList<>(); // criando array list para questoes

        Questao q1 = new Questao(); // instanciando primeira questao

        q1.pergunta = "No contexto da Logística 4.0, a principal vantagem da integração entre sensores IoT e sistemas WMS é:";
        q1.opcaoA = "Eliminar a necessidade de operadores humanos em 100% dos processos";
        q1.opcaoB = "Reduzir o lead time de produção industrial";
        q1.opcaoC = "Permitir rastreamento em tempo real e gestão preditiva de estoques";
        q1.opcaoD = "Trocar o ERP por sistemas autônomos baseados em nuvem";
        q1.opcaoE = "Centralizar os estoques em um único armazém nacional";
        q1.correta = "Permitir rastreamento em tempo real e gestão preditiva de estoques";
        questoes.add(q1);

        Questao q2 = new Questao(); // instanciando segunda questao

        q2.pergunta = "A aplicação de blockchain na cadeia logística tem como principal impacto:";
        q2.opcaoA = "Reduzir o uso de planilhas na conferência de cargas";
        q2.opcaoB = "Criar sistemas de rastreamento com base em satélites";
        q2.opcaoC = "Garantir a integridade e transparência dos registros transacionais entre os elos da cadeia";
        q2.opcaoD = "Substituir o transporte multimodal por sistemas peer-to-peer";
        q2.opcaoE = "Facilitar o transporte de cargas vivas";
        q2.correta = "Garantir a integridade e transparência dos registros transacionais entre os elos da cadeia";
        questoes.add(q2);

        Questao q3 = new Questao();  // instanciando terceira questao

        q3.pergunta = "Em um ambiente logístico automatizado, o uso de RPA (Robotic Process Automation) está mais associado a:";
        q3.opcaoA = "Controle de empilhadeiras autônomas";
        q3.opcaoB = "Processos administrativos como emissão de documentos fiscais e agendamentos de coleta";
        q3.opcaoC = "Sistemas de picking robotizado";
        q3.opcaoD = "Gerenciamento térmico de produtos refrigerados";
        q3.opcaoE = "Modelagem de rotas urbanas";
        q3.correta = "Processos administrativos como emissão de documentos fiscais e agendamentos de coleta";
        questoes.add(q3);

        Questao q4 = new Questao();  // instanciando quarta questao

        q4.pergunta = "Em operações complexas, o TMS com inteligência artificial pode:";
        q4.opcaoA = "Realizar manutenção preventiva nos veículos";
        q4.opcaoB = "Integrar diretamente o sistema de folha de pagamento";
        q4.opcaoC = "Otimizar rotas com base em tráfego em tempo real, clima e volume de pedidos históricos";
        q4.opcaoD = "Reduzir o tempo de empilhamento em docas";
        q4.opcaoE = "Eliminar a necessidade de rastreadores veiculares";
        q4.correta = "Otimizar rotas com base em tráfego em tempo real, clima e volume de pedidos históricos";
        questoes.add(q4);

        Questao q5 = new Questao();  // instanciando quinta questao

        q5.pergunta = "Uma das principais barreiras para a adoção ampla de tecnologias baseadas em Big Data na logística é:";
        q5.opcaoA = "Alto custo de mão de obra operacional";
        q5.opcaoB = "Ausência de conectividade em áreas portuárias";
        q5.opcaoC = "Falta de maturidade analítica e integração entre os dados da cadeia";
        q5.opcaoD = "Alto custo de combustíveis fósseis";
        q5.opcaoE = "Ausência de equipamentos de movimentação automatizados";
        q5.correta = "Falta de maturidade analítica e integração entre os dados da cadeia";
        questoes.add(q5);

        Questao q6 = new Questao();  // instanciando sexta questao

        q6.pergunta = "Em centros de distribuição avançados, a automação baseada em RFID substitui o código de barras principalmente por:";
        q6.opcaoA = "Diminuir o uso de papel";
        q6.opcaoB = "Aumentar a margem de lucro sobre o produto final";
        q6.opcaoC = "Reduzir falhas humanas e permitir leitura sem contato direto ou visada";
        q6.opcaoD = "Reforçar a segurança patrimonial";
        q6.opcaoE = "Otimizar apenas o transporte de última milha";
        q6.correta = "Reduzir falhas humanas e permitir leitura sem contato direto ou visada";
        questoes.add(q6);

        Questao q7 = new Questao();  // instanciando setima questao

        q7.pergunta = "O principal papel da análise preditiva na logística é:";
        q7.opcaoA = "Registrar entregas feitas";
        q7.opcaoB = "Programar o transporte com base em hábitos passados";
        q7.opcaoC = "Antecipar demandas, falhas operacionais e gargalos logísticos";
        q7.opcaoD = "Substituir o controle de qualidade";
        q7.opcaoE = "Informar as áreas de marketing";
        q7.correta = "Antecipar demandas, falhas operacionais e gargalos logísticos";
        questoes.add(q7);

        Questao q8 = new Questao();  // instanciando oitava questao

        q8.pergunta = "Qual alternativa representa um impacto direto da computação em nuvem na gestão logística?";
        q8.opcaoA = "Menor tempo de espera para manutenção de empilhadeiras";
        q8.opcaoB = "Flexibilização e escalabilidade de sistemas logísticos com atualização em tempo real";
        q8.opcaoC = "Substituição de operadores por robôs de chão";
        q8.opcaoD = "Aumento do lead time proposital";
        q8.opcaoE = "Redução do controle fiscal da cadeia";
        q8.correta = "Flexibilização e escalabilidade de sistemas logísticos com atualização em tempo real";
        questoes.add(q8);

        Questao q9 = new Questao();  // instanciando nona questao

        q9.pergunta = "A utilização de gêmeos digitais (digital twins) na logística permite:";
        q9.opcaoA = "Replicar armazéns em realidade aumentada";
        q9.opcaoB = "Simular e otimizar operações logísticas com base em dados reais, em tempo real";
        q9.opcaoC = "Controlar frotas por drones";
        q9.opcaoD = "Gerenciar entregas por modais autônomos";
        q9.opcaoE = "Proteger os dados da empresa contra ciberataques";
        q9.correta = "Simular e otimizar operações logísticas com base em dados reais, em tempo real";
        questoes.add(q9);

        Questao q10 = new Questao(); //  // instanciando decima questao

        q10.pergunta = " A principal vantagem do uso de veículos autônomos na cadeia de suprimentos é:";
        q10.opcaoA = "Eliminar a necessidade de licenciamento de cargas";
        q10.opcaoB = "Substituir o modal ferroviário";
        q10.opcaoC = "Reduzir acidentes, aumentar previsibilidade e eficiência nas entregas";
        q10.opcaoD = "Eliminar o planejamento de rotas";
        q10.opcaoE = "Operar apenas em ambientes fechados";
        q10.correta = "Reduzir acidentes, aumentar previsibilidade e eficiência nas entregas";
        questoes.add(q10);

        Questao q11 = new Questao();  // instanciando decima primeira questao

        q11.pergunta = " Em sistemas avançados de picking com visão computacional, o principal diferencial tecnológico é:";
        q11.opcaoA = "Reduzir a embalagem primária";
        q11.opcaoB = "Executar auditorias fiscais automatizadas";
        q11.opcaoC = "Permitir que robôs escolham e movimentem produtos com base em reconhecimento visual e aprendizado de máquina";
        q11.opcaoD = "Calcular o custo de frete internacional";
        q11.opcaoE = "Substituir o WMS por RFID";
        q11.correta = "Permitir que robôs escolham e movimentem produtos com base em reconhecimento visual e aprendizado de máquina";
        questoes.add(q11);

        Questao q12 = new Questao(); // instanciando decima segunda questao

        q12.pergunta = " A aplicação de Machine Learning em sistemas de previsão de demanda logística contribui para:";
        q12.opcaoA = "Aumentar o nível de estoque de segurança";
        q12.opcaoB = "Ajustar automaticamente os estoques e prever sazonalidades com maior acurácia";
        q12.opcaoC = "Eliminar o papel do planejador de demanda";
        q12.opcaoD = "Reduzir o uso de códigos SKU";
        q12.opcaoE = "Automatizar o processo de recrutamento da equipe";
        q12.correta = "Ajustar automaticamente os estoques e prever sazonalidades com maior acurácia";
        questoes.add(q12);

        Questao q13 = new Questao();  // instanciando decima terceira questao

        q13.pergunta = "Em projetos de logística inteligente, o uso de sistemas embarcados com telemetria veicular tem como foco:";
        q13.opcaoA = "Prever desvios de temperatura e comportamento de condução";
        q13.opcaoB = "Identificar produtos com data de validade vencida";
        q13.opcaoC = "Reduzir os custos de armazenagem";
        q13.opcaoD = "Aumentar o espaço físico da frota";
        q13.opcaoE = "Controlar notas fiscais eletrônicas";
        q13.correta = "Prever desvios de temperatura e comportamento de condução";
        questoes.add(q13);

        Questao q14 = new Questao();  // instanciando decima quarta questao

        q14.pergunta = "O conceito de “last mile as a service” (LMaaS) envolve:";
        q14.opcaoA = "Entregas exclusivas por grandes transportadoras nacionais";
        q14.opcaoB = "Utilização de plataformas tecnológicas para terceirizar e otimizar a última milha com operadores logísticos variados";
        q14.opcaoC = "Entregas feitas apenas por drones e patinetes autônomos";
        q14.opcaoD = "Armazenamento em grandes hubs urbanos";
        q14.opcaoE = "Substituição da cadeia de suprimentos por centros de autoatendimento";
        q14.correta = "Utilização de plataformas tecnológicas para terceirizar e otimizar a última milha com operadores logísticos variados";
        questoes.add(q14);

        Questao q15 = new Questao();  // instanciando decima quinta questao

        q15.pergunta = " Em logística farmacêutica, o uso de IoT em containers inteligentes tem como principal objetivo:";
        q15.opcaoA = "Reduzir o volume transportado";
        q15.opcaoB = "Garantir conformidade com temperatura, umidade e integridade do produto durante o transporte";
        q15.opcaoC = "Substituir embalagens secundárias";
        q15.opcaoD = "Aumentar o tempo de prateleira";
        q15.opcaoE = "Diminuir o número de rotas";
        q15.correta = "Garantir conformidade com temperatura, umidade e integridade do produto durante o transporte";
        questoes.add(q15);

        int acertos = 0;
        int erros = 0;

        for (int i = 0; i < questoes.size(); i++){
            questoes.get(i).randomizarOpcoes();                                 // embaralhando as questoes
            questoes.get(i).escrevaQuestao(i+1);                         // escrevendo as questoes
            String resposta = questoes.get(i).leiaResposta();                  // lendo a resposta do usuario

            boolean correta = questoes.get(i).isCorreta(resposta);              // verificando se a resposta esta correta

            if (correta == true) {                                              // contabilizando a questao como acerto se estiver correta
                acertos = acertos + 1;
            }
            else {
                erros = erros + 1;                                              // contabilizando a questao como erro se estiver errada
            }
        }

        System.out.println(String.format("%s%n%s%n",                            // formatando a saida - quebrando linha
                "Total de acertos: " + acertos + ", " + String.format("%.2f", (double) acertos / questoes.size() * 100) + "%",      // formatando porcentagem
                "Total de erros: " + erros + ", " + String.format("%.2f", (double) erros / questoes.size() * 100) + "%"));          // formatando porcentagem

    }
}