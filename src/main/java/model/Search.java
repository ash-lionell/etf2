package model;

import core.Node;
import core.action;
import core.outcome;
import core.vertex;

@vertex
public class Search implements Node {
    @Override
    public boolean validate() {
        return false;
    }

    public static final class ACTIONS {
        public static final String FLT_SEARCH = "flt_search";
    }

    @action(name = ACTIONS.FLT_SEARCH, outcome = @outcome(outcomeClass = Flight.class))
    public void flightSearch() {

    }
}
