package anet.channel;

import anet.channel.heartbeat.IHeartbeat;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class SessionInfo {
    public final IAuth auth;
    public final DataFrameCb dataFrameCb;
    public final IHeartbeat heartbeat;
    public final String host;
    public final boolean isAccs;
    public final boolean isKeepAlive;

    private SessionInfo(String str, boolean z10, boolean z11, IAuth iAuth, IHeartbeat iHeartbeat, DataFrameCb dataFrameCb) {
        this.host = str;
        this.isAccs = z11;
        this.auth = iAuth;
        this.isKeepAlive = z10;
        this.heartbeat = iHeartbeat;
        this.dataFrameCb = dataFrameCb;
    }

    public static SessionInfo create(String str, boolean z10, boolean z11, IAuth iAuth, IHeartbeat iHeartbeat, DataFrameCb dataFrameCb) {
        return new SessionInfo(str, z10, z11, iAuth, iHeartbeat, dataFrameCb);
    }
}
