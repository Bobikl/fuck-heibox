package com.xiaomi.push;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;

/* JADX INFO: loaded from: classes4.dex */
public enum ff {
    ACTIVITY(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY),
    SERVICE_ACTION("service_action"),
    SERVICE_COMPONENT("service_component"),
    PROVIDER(com.umeng.analytics.pro.d.M);


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f424a;

    ff(String str) {
        this.f424a = str;
    }
}
