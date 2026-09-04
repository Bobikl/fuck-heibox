package com.vivo.push.b;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: ReporterCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends com.vivo.push.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, String> f106503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106504b;

    public x() {
        super(2012);
    }

    public x(long j10) {
        this();
        this.f106504b = j10;
    }

    public final void a(HashMap<String, String> map) {
        this.f106503a = map;
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("ReporterCommand.EXTRA_PARAMS", this.f106503a);
        aVar.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.f106504b);
    }

    public final void d() {
        if (this.f106503a == null) {
            com.vivo.push.util.p.d("ReporterCommand", "reportParams is empty");
            return;
        }
        StringBuilder sb2 = new StringBuilder("report message reportType:");
        sb2.append(this.f106504b);
        sb2.append(",msgId:");
        String str = this.f106503a.get(x9.b.f141138c);
        if (TextUtils.isEmpty(str)) {
            str = this.f106503a.get("message_id");
        }
        sb2.append(str);
        com.vivo.push.util.p.d("ReporterCommand", sb2.toString());
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.f106503a = (HashMap) aVar.d("ReporterCommand.EXTRA_PARAMS");
        this.f106504b = aVar.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.f106504b);
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "ReporterCommand（" + this.f106504b + ")";
    }
}
