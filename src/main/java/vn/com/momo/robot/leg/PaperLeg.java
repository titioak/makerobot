package vn.com.momo.robot.leg;

import javax.inject.Inject;

public class PaperLeg implements Leg{
    @Inject
    PaperLeg(){}

    @Override
    public void kick() {
        System.out.println("Kinking with Paper Leg");
    }
}
