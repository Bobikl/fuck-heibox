package com.alibaba.sdk.android.httpdns.probe;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IPProbeService f37999a;

    public static synchronized IPProbeService a(b bVar) {
        if (f37999a == null) {
            e eVar = new e();
            f37999a = eVar;
            eVar.setIPListUpdateCallback(bVar);
        }
        return f37999a;
    }
}
