package com.ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes4.dex */
public class PushSingleStreamParam {
    public boolean isScreen;
    public String roomId;
    public String url;
    public String userId;

    public PushSingleStreamParam() {
        this.isScreen = false;
    }

    public PushSingleStreamParam(String str, String str2, String str3, boolean z10) {
        this.roomId = str;
        this.userId = str2;
        this.url = str3;
        this.isScreen = z10;
    }
}
