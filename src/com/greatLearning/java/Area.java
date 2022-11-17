package com.greatLearning.java;

public class Area {
    final float pi = 3.14f;
    public float radius, result;

    public static void main(String[] args) {
        Area area = new Area();
        area.radius = 12.2f;
        area.result = area.pi * area.radius;
        System.out.println(area.result);
    }
}
