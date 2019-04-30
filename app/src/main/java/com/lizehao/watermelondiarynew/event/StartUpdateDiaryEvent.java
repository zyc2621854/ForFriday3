package com.lizehao.watermelondiarynew.event;

/**
 *Created by chen on 2017/5/26
 */
public class StartUpdateDiaryEvent {

    private int position;

    public StartUpdateDiaryEvent(int position) {
        this.position = position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}