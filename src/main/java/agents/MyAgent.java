package agents;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.TickerBehaviour;

public class MyAgent extends Agent {

    private int compteur = 0;

    @Override
    protected void setup() {
        ParallelBehaviour parallelBehaviour = new ParallelBehaviour();
        addBehaviour(parallelBehaviour);

       /* parallelBehaviour.addSubBehaviour(new TickerBehaviour(this, 1000) {
            @Override
            protected void onTick() {
                System.out.println("Tick "+(++compteur));
            }
        });

        parallelBehaviour.addSubBehaviour(new Behaviour() {
            @Override
            public void action() {
                System.out.println("Action..."+(++compteur));
            }

            @Override
            public boolean done() {
                if(compteur > 1000) {
                    System.out.println("Done");
                    return true;
                }
                return false;
            }
        });*/

        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                System.out.println("One Shot Behaviour");
            }
        });

        addBehaviour(new TickerBehaviour(this, 1000) {
            @Override
            protected void onTick() {
                System.out.println("Tick "+(++compteur));
            }
        });

        addBehaviour(new Behaviour() {
            @Override
            public void action() {
                System.out.println("Action..."+(++compteur));
            }

            @Override
            public boolean done() {
                if(compteur > 1000) {
                    System.out.println("Done");
                    return true;
                }
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
