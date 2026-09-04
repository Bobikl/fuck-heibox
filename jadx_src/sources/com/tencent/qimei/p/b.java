package com.tencent.qimei.p;

import com.tencent.qimei.codez.FalconSdk;
import com.tencent.qimei.codez.shell.UserInfoType;
import com.tencent.qimei.v.d;

/* JADX INFO: compiled from: QimeiSec.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f101302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f101303b = false;

    public static b a() {
        if (f101302a == null) {
            synchronized (b.class) {
                if (f101302a == null) {
                    f101302a = new b();
                }
            }
        }
        return f101302a;
    }

    public synchronized boolean a(String str) {
        boolean zInit;
        if (!d.a(str).t()) {
            return false;
        }
        com.tencent.qimei.o.d dVarA = com.tencent.qimei.o.d.a(str);
        com.tencent.qimei.d.d dVarL = com.tencent.qimei.d.d.l();
        com.tencent.qimei.u.d dVarB = com.tencent.qimei.u.d.b();
        com.tencent.qimei.u.a aVar = new com.tencent.qimei.u.a(str);
        try {
            zInit = FalconSdk.getInstance().setUserInfo(UserInfoType.TYPE_APP_KEY.toString(), str).setUserInfo(UserInfoType.TYPE_Q16.toString(), aVar.J()).setUserInfo(UserInfoType.TYPE_Q36.toString(), aVar.D()).setUserInfo(UserInfoType.TYPE_CHANNEL_ID.toString(), aVar.E()).setUserInfo(UserInfoType.TYPE_USER_ID_PARAM.toString(), aVar.G()).setUserInfo(UserInfoType.TYPE_IMEI.toString(), dVarA.d()).setUserInfo(UserInfoType.TYPE_IMSI.toString(), dVarA.e()).setUserInfo(UserInfoType.TYPE_MAC.toString(), dVarA.f()).setUserInfo(UserInfoType.TYPE_CID.toString(), dVarA.g()).setUserInfo(UserInfoType.TYPE_NET_WORK_TYPE.toString(), dVarL.u()).setUserInfo(UserInfoType.TYPE_ANDROID_ID.toString(), dVarA.a()).setUserInfo(UserInfoType.TYPE_LOCAL_IP.toString(), dVarL.m()).setUserInfo(UserInfoType.TYPE_APP_VERSION.toString(), com.tencent.qimei.d.a.a()).setUserInfo(UserInfoType.TYPE_QIMEI_VERSION.toString(), dVarB.getSdkVersion()).setUserInfo(UserInfoType.TYPE_OAID.toString(), dVarA.h()).init(dVarB.F());
        } catch (Throwable th2) {
            if (com.tencent.qimei.l.b.b()) {
                com.tencent.qimei.n.a.a(th2);
            }
            zInit = false;
        }
        com.tencent.qimei.n.a.b("SDK_INIT", "Falcon %s init(appKey: %s)，r:%b", b(), str, Boolean.valueOf(zInit));
        if (zInit) {
            com.tencent.qimei.c.a.a().a(d.a(str).q() * 1000, new a(this, str));
        }
        return zInit;
    }

    public String b() {
        try {
            return FalconSdk.getInstance().getVersion();
        } catch (Throwable unused) {
            return "";
        }
    }

    public synchronized boolean b(String str) {
        if (!d.a(str).t()) {
            return false;
        }
        if (this.f101303b) {
            return true;
        }
        try {
            this.f101303b = FalconSdk.getInstance().report();
        } catch (Throwable th2) {
            this.f101303b = false;
            if (com.tencent.qimei.l.b.b()) {
                com.tencent.qimei.n.a.a(th2);
            }
        }
        com.tencent.qimei.n.a.b("上报", "Falcon report(appKey: %s)，r:%b", str, Boolean.valueOf(this.f101303b));
        return this.f101303b;
    }
}
