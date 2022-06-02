package org.example.model;

import java.util.Objects;

public abstract class Tree {
    private double height;
    private double trunkWidth;
    private int leavesNumber;
    private LeaveType leaveType;

    public Tree(double height, double trunkWidth, int leavesNumber, LeaveType leaveType){
        this.leaveType = leaveType;
        this.height = height;
        this.trunkWidth = trunkWidth;
        this.leavesNumber = leavesNumber;
    }

    public abstract void grow();

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTrunkWidth() {
        return trunkWidth;
    }

    public void setTrunkWidth(double trunkWidth) {
        this.trunkWidth = trunkWidth;
    }

    public int getLeavesNumber() {
        return leavesNumber;
    }

    public void setLeavesNumber(int leavesNumber) {
        this.leavesNumber = leavesNumber;
    }

    public LeaveType getLeaveType() {
        return leaveType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", trunkWidth=" + trunkWidth +
                ", leavesNumber=" + leavesNumber +
                ", leaveType=" + leaveType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Double.compare(tree.height, height) == 0 && Double.compare(tree.trunkWidth, trunkWidth) == 0 && leavesNumber == tree.leavesNumber && leaveType == tree.leaveType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, trunkWidth, leavesNumber, leaveType);
    }
}
