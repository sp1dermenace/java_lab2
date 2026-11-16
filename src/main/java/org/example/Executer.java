package org.example;

public class Executer {
    private final IGameEngine engine;

    public Executer(IGameEngine engine){
        this.engine = engine;
    }

    public void run(Command[] program){
        for(Command c : program){
            System.out.println("> "+c);
            engine.exec(c);
        }
    }
}
