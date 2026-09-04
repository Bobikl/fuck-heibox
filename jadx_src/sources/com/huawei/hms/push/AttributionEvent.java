package com.huawei.hms.push;

/* JADX INFO: loaded from: classes7.dex */
public enum AttributionEvent {
    APP_START_COMPLETE(1),
    OPEN_PRIVACY_PAGE(2),
    REJECT_PRIVACY(3),
    AGREED_PRIVACY(4),
    PERMISSION_GRANTED(5),
    PERMISSION_DENIED(6),
    OPEN_LANDING_PAGE(7);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61189a;

    AttributionEvent(int i10) {
        this.f61189a = i10;
    }

    public int getEventId() {
        return this.f61189a;
    }
}
