package com.vivo.push.b;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: BaseAppCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends com.vivo.push.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f106470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f106471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106472f;

    public c(int i10, String str) {
        super(i10);
        this.f106469c = -1L;
        this.f106470d = -1;
        this.f106467a = null;
        this.f106468b = str;
    }

    public final int a(Context context) {
        if (this.f106470d == -1) {
            String str = this.f106468b;
            if (TextUtils.isEmpty(str)) {
                com.vivo.push.util.p.a("BaseAppCommand", "pkg name is null");
                String strA = a();
                if (TextUtils.isEmpty(strA)) {
                    com.vivo.push.util.p.a("BaseAppCommand", "src is null");
                    return -1;
                }
                str = strA;
            }
            this.f106470d = com.vivo.push.util.t.b(context, str);
            if (!TextUtils.isEmpty(this.f106472f)) {
                this.f106470d = 2;
            }
        }
        return this.f106470d;
    }

    public final void a(int i10) {
        this.f106471e = i10;
    }

    public final void b(String str) {
        this.f106467a = str;
    }

    @Override // com.vivo.push.o
    protected void c(com.vivo.push.a aVar) {
        aVar.a("req_id", this.f106467a);
        aVar.a("package_name", this.f106468b);
        aVar.a("sdk_version", 323L);
        aVar.a("PUSH_APP_STATUS", this.f106470d);
        if (TextUtils.isEmpty(this.f106472f)) {
            return;
        }
        aVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f106472f);
    }

    @Override // com.vivo.push.o
    protected void d(com.vivo.push.a aVar) {
        this.f106467a = aVar.a("req_id");
        this.f106468b = aVar.a("package_name");
        this.f106469c = aVar.b("sdk_version", 0L);
        this.f106470d = aVar.b("PUSH_APP_STATUS", 0);
        this.f106472f = aVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION");
    }

    public final int f() {
        return this.f106471e;
    }

    public final void g() {
        this.f106472f = null;
    }

    public final String h() {
        return this.f106467a;
    }

    @Override // com.vivo.push.o
    public String toString() {
        return "BaseAppCommand";
    }
}
