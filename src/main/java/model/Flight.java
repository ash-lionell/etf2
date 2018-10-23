package model;

import core.Node;
import core.action;
import core.validation;
import core.vertex;

@vertex
public class Flight implements Node {
    @Override
    public boolean validate() {
        return false;
    }


    public static class FlightSegment implements Node {
        @Override
        public boolean validate() {
            return false;
        }

        public static final class STATE {
            public static final String MANAGE_FLT = "mng_flt";
            public static final String NO_MANAGE_FLT = "no_mng_flt";
        }

        @validation(srcState = STATE.MANAGE_FLT)
        public void checkManageFlightBtn() {

        }

        @validation(srcState = STATE.NO_MANAGE_FLT)
        public void checkNoManageFlightBtn() {

        }

        @action(srcState = STATE.MANAGE_FLT)
        public void performManageFlight() {

        }
    }
}
