package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum FirstFramePlayState {
    FIRST_FRAME_PLAY_STATE_PLAYING(0),
    FIRST_FRAME_PLAY_STATE_PLAYED(1),
    FIRST_FRAME_PLAY_STATE_END(2);

    private int state;

    FirstFramePlayState(int i10) {
        this.state = i10;
    }

    public static FirstFramePlayState fromId(int i10) {
        for (FirstFramePlayState firstFramePlayState : values()) {
            if (firstFramePlayState.value() == i10) {
                return firstFramePlayState;
            }
        }
        return null;
    }

    public int value() {
        return this.state;
    }
}
