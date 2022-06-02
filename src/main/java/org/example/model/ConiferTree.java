package org.example.model;

public abstract class ConiferTree extends Tree {

    public ConiferTree(double height, double trunkWidth, int leavesNumber) {
        super(height, trunkWidth, leavesNumber, LeaveType.NEEDLE);
    }

    @Override
    public void grow() {
        setHeight(getHeight() + 1.1);
        setLeavesNumber(getLeavesNumber() + 5000);
        setTrunkWidth(getTrunkWidth() + 0.2);
    }
}
