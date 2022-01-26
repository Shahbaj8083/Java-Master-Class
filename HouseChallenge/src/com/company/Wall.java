package com.company;

public class Wall {
    private boolean painted;
    private int windows;

    public Wall(boolean painted, int windows) {
        this.painted = painted;
        this.windows = windows;
    }
    public boolean wallCharacter(){//we can access private isPainted() method using this method
        return isPainted();
    }

    private boolean isPainted() {
        return painted;
    }

    private int getWindows() {
        return windows;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
}
