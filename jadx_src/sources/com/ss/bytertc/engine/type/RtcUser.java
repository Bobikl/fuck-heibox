package com.ss.bytertc.engine.type;

import com.ss.bytertc.engine.InternalRTCUser;

/* JADX INFO: loaded from: classes4.dex */
public class RtcUser {
    public String metaData;
    public String userId;

    public RtcUser() {
    }

    public RtcUser(InternalRTCUser internalRTCUser) {
        this.userId = internalRTCUser.userId;
        this.metaData = internalRTCUser.metaData;
    }

    public String toString() {
        return "RtcUser{uid='" + this.userId + "', metaData='" + this.metaData + "'}";
    }
}
