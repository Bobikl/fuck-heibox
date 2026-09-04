package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum RemoteUserPriority {
    REMOTE_USER_PRIORITY_LOW(0),
    REMOTE_USER_PRIORITY_MEDIUM(100),
    REMOTE_USER_PRIORITY_HIGH(200);

    private int value;

    RemoteUserPriority(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
