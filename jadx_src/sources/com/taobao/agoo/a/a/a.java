package com.taobao.agoo.a.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.p;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a extends b {
    public static final String JSON_CMD_REMOVEALIAS = "removeAlias";
    public static final String JSON_CMD_REMOVEALLALIAS = "unbindAllAlias";
    public static final String JSON_CMD_SETALIAS = "setAlias";
    public static final String JSON_PUSH_USER_TOKEN = "pushAliasToken";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f98532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f98533d;

    public static byte[] a(String str, String str2) {
        a aVar = new a();
        aVar.f98530a = str;
        aVar.f98531b = str2;
        aVar.f98534e = JSON_CMD_REMOVEALLALIAS;
        return aVar.a();
    }

    public static byte[] a(String str, String str2, String str3) {
        a aVar = new a();
        aVar.f98530a = str;
        aVar.f98531b = str2;
        aVar.f98532c = str3;
        aVar.f98534e = JSON_CMD_SETALIAS;
        return aVar.a();
    }

    public static byte[] b(String str, String str2, String str3) {
        a aVar = new a();
        aVar.f98530a = str;
        aVar.f98531b = str2;
        aVar.f98533d = str3;
        aVar.f98534e = JSON_CMD_REMOVEALIAS;
        return aVar.a();
    }

    public static byte[] c(String str, String str2, String str3) {
        a aVar = new a();
        aVar.f98530a = str;
        aVar.f98531b = str2;
        aVar.f98532c = str3;
        aVar.f98534e = JSON_CMD_REMOVEALIAS;
        return aVar.a();
    }

    public byte[] a() {
        try {
            String string = new p.a().a(b.JSON_CMD, this.f98534e).a("appKey", this.f98530a).a("deviceId", this.f98531b).a("alias", this.f98532c).a(JSON_PUSH_USER_TOKEN, this.f98533d).a().toString();
            ALog.i("AliasDO", "buildData", "data", string);
            return string.getBytes("utf-8");
        } catch (Throwable th2) {
            ALog.e("AliasDO", "buildData", th2, new Object[0]);
            return null;
        }
    }
}
