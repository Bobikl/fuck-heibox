package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class CoreProtocol implements UMLogDataProtocol, UMSenderStateNotify {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f104329a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final CoreProtocol f104330a = new CoreProtocol();

        private a() {
        }
    }

    private CoreProtocol() {
    }

    public static CoreProtocol getInstance(Context context) {
        if (f104329a == null && context != null) {
            f104329a = context.getApplicationContext();
        }
        return a.f104330a;
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onConnectionAvailable() {
        o.a(f104329a).a();
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onSenderIdle() {
        o.a(f104329a).b();
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        o.a(f104329a).a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j10) {
        return o.a(f104329a).a(j10);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i10) {
        o.a(f104329a).a(obj, i10);
    }
}
