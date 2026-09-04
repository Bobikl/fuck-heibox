package org.android.spdy;

/* JADX INFO: loaded from: classes5.dex */
public enum RequestPriority {
    HIGHEST(0),
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    LOWEST(4),
    IDLE(5),
    DEFAULT_PRIORITY(1);

    private int priority;

    RequestPriority(int i10) {
        this.priority = i10;
    }

    int getPriorityInt() {
        return this.priority;
    }
}
