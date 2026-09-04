package com.tencent.beacon.event;

import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: EventReportCallback.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements com.tencent.beacon.base.net.a.b<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Long> f99111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f99113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f99114d = new Date().getTime();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f99115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f99116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.tencent.beacon.event.a.a f99117g;

    f(g gVar, String str, com.tencent.beacon.event.a.a aVar, Set<Long> set, String str2) {
        this.f99115e = gVar;
        this.f99116f = str;
        this.f99117g = aVar;
        this.f99111a = new HashSet(set);
        this.f99112b = "[EventReport(" + str + ")]";
        this.f99113c = str2;
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.e eVar) {
        com.tencent.beacon.base.util.c.a(this.f99112b, 3, "send failure reason: %s. LogID: %s.", eVar.toString(), this.f99113c);
        this.f99115e.a(this.f99111a);
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(byte[] bArr) {
        com.tencent.beacon.base.util.c.a(this.f99112b, 3, "report success! sendingID will delete this time's IDs. offer task: %s! ", Boolean.valueOf(((EventModule) com.tencent.beacon.a.c.c.d().a(ModuleName.EVENT)).c().a(new e(this, new Date().getTime() - this.f99114d))));
        if (this.f99111a.size() >= this.f99115e.a()) {
            com.tencent.beacon.a.b.a.a().a(this.f99115e);
        }
    }
}
