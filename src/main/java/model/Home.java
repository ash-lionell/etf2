package model;

import core.Node;
import core.action;
import core.outcome;
import core.vertex;

@vertex
public class Home implements Node {
    public boolean validate() {
        return false;
    }

    @action(outcome = @outcome(outcomeClass = Search.class))
    public void openSearch() {

    }
}
