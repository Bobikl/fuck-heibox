package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* JADX INFO: compiled from: OnNotificationClickReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.vivo.push.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f106489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f106490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InsideNotificationItem f106491e;

    public p() {
        super(5);
    }

    public p(String str, long j10, InsideNotificationItem insideNotificationItem) {
        super(5);
        this.f106487a = str;
        this.f106490d = j10;
        this.f106491e = insideNotificationItem;
    }

    @Override // com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        aVar.a("package_name", this.f106487a);
        aVar.a("notify_id", this.f106490d);
        aVar.a("notification_v1", com.vivo.push.util.q.b(this.f106491e));
        aVar.a("open_pkg_name", this.f106488b);
        aVar.a("open_pkg_name_encode", this.f106489c);
    }

    public final String d() {
        return this.f106487a;
    }

    @Override // com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        this.f106487a = aVar.a("package_name");
        this.f106490d = aVar.b("notify_id", -1L);
        this.f106488b = aVar.a("open_pkg_name");
        this.f106489c = aVar.b("open_pkg_name_encode");
        String strA = aVar.a("notification_v1");
        if (!TextUtils.isEmpty(strA)) {
            this.f106491e = com.vivo.push.util.q.a(strA);
        }
        InsideNotificationItem insideNotificationItem = this.f106491e;
        if (insideNotificationItem != null) {
            insideNotificationItem.setMsgId(this.f106490d);
        }
    }

    public final long e() {
        return this.f106490d;
    }

    public final InsideNotificationItem f() {
        return this.f106491e;
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "OnNotificationClickCommand";
    }
}
