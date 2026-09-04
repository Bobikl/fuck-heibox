package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum FirstFrameSendState {
    FIRST_FRAME_SEND_STATE_SENDING(0),
    FIRST_FRAME_SEND_STATE_SENT(1),
    FIRST_FRAME_SEND_STAT_END(2);

    private int state;

    FirstFrameSendState(int i10) {
        this.state = i10;
    }

    public static FirstFrameSendState fromId(int i10) {
        for (FirstFrameSendState firstFrameSendState : values()) {
            if (firstFrameSendState.value() == i10) {
                return firstFrameSendState;
            }
        }
        return FIRST_FRAME_SEND_STATE_SENDING;
    }

    public int value() {
        return this.state;
    }
}
