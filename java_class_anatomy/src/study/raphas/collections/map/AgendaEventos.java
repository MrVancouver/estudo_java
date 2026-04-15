package study.raphas.collections.map;

import java.util.*;
import java.time.LocalDate;
import java.time.Month;
public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos(){
        this.eventoMap = new HashMap<>();
    }
    public void AdicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }
    public void ExibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    public void ObterProximoEvento(){
        // Set<LocalDate> dataSet = eventoMap.keySet();
        // Collection<Evento> values = eventoMap.values();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("o próximo evento "+entry.getValue()+" acontecera na data "+entry.getKey());
                break;
            }
        }

    }
public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos à agenda
    agendaEventos.AdicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.AdicionarEvento(LocalDate.of(2026, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.AdicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.AdicionarEvento(LocalDate.of(2026, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.AdicionarEvento(LocalDate.of(2026, 1, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    // Exibe a agenda completa de eventos
    agendaEventos.ExibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    agendaEventos.ObterProximoEvento();
  }

}
