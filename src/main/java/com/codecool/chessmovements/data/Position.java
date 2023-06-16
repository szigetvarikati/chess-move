package com.codecool.chessmovements.data;

public record Position(int x, int y) {
    @Override
    public String toString() {
        return "[%d, %d]".formatted(x, y);
    }
}
