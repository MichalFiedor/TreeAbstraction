package org.example.model;

public abstract class HardwoodTree extends Tree {

    public HardwoodTree(double height, double trunkWidth, int leavesNumber) {
        super(height, trunkWidth, leavesNumber, LeaveType.LEAF);
    }

    @Override
    public void grow() {
        setHeight(getHeight() + 1.3);
        setLeavesNumber(getLeavesNumber() + 10000);
        setTrunkWidth(getTrunkWidth() + 0.17);
    }
}
