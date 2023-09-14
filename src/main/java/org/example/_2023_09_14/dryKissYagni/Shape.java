package org.example._2023_09_14.dryKissYagni;

public class Shape {
    public enum Type { CIRCLE, SQUARE }
    
    private Type type;
    
    public Shape(Type type) {
        this.type = type;
    }
    
    public double calculateArea() {
        if (type == Type.CIRCLE) {
        } else if (type == Type.SQUARE) {
        }
        return 0.0;
    }
}