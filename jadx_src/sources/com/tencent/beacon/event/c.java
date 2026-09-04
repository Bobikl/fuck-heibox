package com.tencent.beacon.event;

/* JADX INFO: compiled from: EventManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements com.tencent.beacon.base.net.a.b<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventBean f99066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f99067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f99068c;

    c(d dVar, EventBean eventBean, String str) {
        this.f99068c = dVar;
        this.f99066a = eventBean;
        this.f99067b = str;
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.e eVar) {
        com.tencent.beacon.base.util.c.e("convert to report by beacon socket also fail, failure = %s", eVar.toString());
        com.tencent.beacon.a.b.g.e().a("464", eVar.toString());
        this.f99068c.b(this.f99067b, this.f99066a);
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(byte[] bArr) {
        com.tencent.beacon.base.util.c.a("[EventManager]", "convert to report by beacon socket success, eventCode = %s, logId = %s", this.f99066a.getEventCode(), this.f99067b);
    }
}
