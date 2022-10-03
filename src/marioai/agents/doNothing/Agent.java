package marioai.agents.doNothing;

import marioai.engine.core.MarioAgent;
import marioai.engine.core.MarioForwardModel;
import marioai.engine.core.MarioTimer;
import marioai.engine.helper.MarioActions;

public class Agent implements MarioAgent {
    @Override
    public void initialize(MarioForwardModel model, MarioTimer timer) {

    }

    @Override
    public boolean[] getActions(MarioForwardModel model, MarioTimer timer) {
        return new boolean[MarioActions.numberOfActions()];
    }

    @Override
    public String getAgentName() {
        return "DoNothingAgent";
    }
}
