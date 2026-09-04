package com.taobao.agoo.a.a;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.p;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class d extends b {
    public static final String JSON_CMD_DISABLEPUSH = "disablePush";
    public static final String JSON_CMD_ENABLEPUSH = "enablePush";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f98552c;

    public static byte[] a(String str, String str2, String str3, boolean z10) {
        d dVar = new d();
        dVar.f98550a = str;
        dVar.f98551b = str2;
        dVar.f98552c = str3;
        if (z10) {
            dVar.f98534e = JSON_CMD_ENABLEPUSH;
        } else {
            dVar.f98534e = JSON_CMD_DISABLEPUSH;
        }
        return dVar.a();
    }

    public byte[] a() {
        try {
            p.a aVar = new p.a();
            aVar.a(b.JSON_CMD, this.f98534e).a("appKey", this.f98550a);
            if (TextUtils.isEmpty(this.f98551b)) {
                aVar.a("utdid", this.f98552c);
            } else {
                aVar.a("deviceId", this.f98551b);
            }
            String string = aVar.a().toString();
            ALog.i("SwitchDO", "buildData", "data", string);
            return string.getBytes("utf-8");
        } catch (Throwable th2) {
            ALog.e("SwitchDO", "buildData", th2, new Object[0]);
            return null;
        }
    }
}
