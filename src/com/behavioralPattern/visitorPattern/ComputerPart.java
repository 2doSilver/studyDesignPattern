package com.behavioralPattern.visitorPattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
