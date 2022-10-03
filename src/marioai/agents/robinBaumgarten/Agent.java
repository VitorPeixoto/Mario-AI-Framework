package marioai.agents.robinBaumgarten;

import marioai.engine.core.MarioAgent;
import marioai.engine.core.MarioForwardModel;
import marioai.engine.core.MarioTimer;
import marioai.engine.helper.MarioActions;

/**
 * @author RobinBaumgarten
 */
public class Agent implements MarioAgent {
    private boolean[] action;
    private AStarTree tree;

    @Override
    public void initialize(MarioForwardModel model, MarioTimer timer) {
        this.action = new boolean[MarioActions.numberOfActions()];
        this.tree = new AStarTree();
    }

    @Override
    public boolean[] getActions(MarioForwardModel model, MarioTimer timer) {
        action = this.tree.optimise(model, timer);
        return action;
    }

    @Override
    public String getAgentName() {
        return "RobinBaumgartenAgent";
    }

}
