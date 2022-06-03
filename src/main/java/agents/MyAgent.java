package agents;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class MyAgent extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new Behaviour() {
            @Override
            public void action() {
                System.out.println("Action...");
            }

            @Override
            public boolean done() {
                return false;
            }
        });
        System.out.println("*** Agent " + getLocalName() + " started ***");
    }

    @Override
    protected void takeDown() {
        System.out.println("*** Agent " + getLocalName() + " terminated ***");
    }

    @Override
    protected void beforeMove() {
        System.out.println("*** Agent " + getLocalName() + " before move ***");
    }
    @Override
    protected void afterMove() {
        System.out.println("*** Agent " + getLocalName() + " after move ***");
    }
}
