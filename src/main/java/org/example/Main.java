import org.example.Command;
import org.example.Executer;
import org.example.IGameEngine;
import org.example.GameEngine;

public static void main(String[] args){
    Command prog[] = {
            new Command("initMap", "10", "10"),
            new Command("addUnit", "unit1", "warrior", "1", "1"),
            new Command("addUnit", "unit2", "archer", "2", "2"),
            new Command("move", "unit1", "3", "3"),
            new Command("startGame"),
            new Command("move", "unit1", "-1", "3"),
            new Command("move", "unit1", "3", "3"),
            new Command("move", "unit2", "3", "3"),
            new Command("attack", "unit1", "unit2"),
            new Command("build", "barracks1", "barracks", "5", "5"),
            new Command("endTurn"),
            new Command("print")
    };

    IGameEngine engine = new GameEngine();
    Executer exec = new Executer(engine);
    exec.run(prog);

    engine.exec(new Command("cheatCode", "infinite_armor"));
    ((GameEngine) engine).registerCommand("cheatCode", a -> {
        System.out.println("Активирован чит-код: " + a[0]);
    });
    engine.exec(new Command("cheatCode", "infinite_armor"));

}











