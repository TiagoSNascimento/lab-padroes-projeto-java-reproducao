package digitalinnovationonegof.Singleton;

import digitalinnovationonegoffacade.Facade;
import digitalinnovationonegofstrategy.Strategy.Comportamento;
import digitalinnovationonegofstrategy.Strategy.ComportamentoAgressivo;
import digitalinnovationonegofstrategy.Strategy.ComportamentoDefensivo;
import digitalinnovationonegofstrategy.Strategy.ComportamentoNormal;
import digitalinnovationonegofstrategy.Strategy.Robo;

public class Test {
    public static void main(String[] args) {
        
        //Testes Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Testes Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Testes Facade

        Facade facade = new Facade();
        facade.migrarCliente("Tiago", "13169899");
    }
}