package vn.com.momo.robot.leg;

import javax.inject.Inject;

public class IronLeg implements Leg{
    @Inject
    IronLeg(){}

    @Override
    public void kick() {
        System.out.println("Kinking with an Iron Leg");
    }
}
