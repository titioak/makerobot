package vn.com.momo.robot;

import vn.com.momo.robot.arm.FireArm;
import vn.com.momo.robot.arm.LaserArm;
import vn.com.momo.robot.leg.IronLeg;
import vn.com.momo.robot.leg.PaperLeg;

import javax.inject.Inject;

public class FullRobot {
    private FireArm fireArm;
    private LaserArm laserArm;
    private PaperLeg paperLeg;
    private IronLeg ironLeg;

    @Inject
    public FullRobot(FireArm fireArm, LaserArm laserArm, PaperLeg paperLeg, IronLeg ironLeg){
        this.fireArm = fireArm;
        this.laserArm = laserArm;
        this.paperLeg = paperLeg;
        this.ironLeg = ironLeg ;
    }

    public void doIt(){
        fireArm.punch();
        laserArm.punch();
        paperLeg.kick();
        ironLeg.kick();
    }
}

