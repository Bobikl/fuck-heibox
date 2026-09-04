package com.tencent.beacon.event.c;

import com.tencent.beacon.event.EventBean;

/* JADX INFO: compiled from: EventConverterFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.tencent.beacon.base.net.b.c.a<EventBean, com.tencent.beacon.event.a.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0952b f99069a = new C0952b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f99070b = new a();

    /* JADX INFO: compiled from: EventConverterFactory.java */
    public static final class a implements com.tencent.beacon.base.net.b.c<EventBean, com.tencent.beacon.event.a.b> {
        a() {
        }

        @Override // com.tencent.beacon.base.net.b.c
        public com.tencent.beacon.event.a.b a(EventBean eventBean) {
            com.tencent.beacon.event.a.b bVar = new com.tencent.beacon.event.a.b();
            bVar.f99056b = eventBean.getEventTime();
            bVar.f99058d = eventBean.getAppKey();
            byte[] bArrA = com.tencent.beacon.base.util.b.a(eventBean);
            bVar.f99059e = bArrA;
            if (bArrA != null) {
                bVar.f99057c = bArrA.length;
            }
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.tencent.beacon.event.c.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventConverterFactory.java */
    public static final class C0952b implements com.tencent.beacon.base.net.b.c<com.tencent.beacon.event.a.b, EventBean> {
        C0952b() {
        }

        @Override // com.tencent.beacon.base.net.b.c
        public EventBean a(com.tencent.beacon.event.a.b bVar) {
            Object objA = com.tencent.beacon.base.util.b.a(bVar.f99059e);
            if (objA == null || !(objA instanceof EventBean)) {
                return null;
            }
            EventBean eventBean = (EventBean) objA;
            eventBean.setCid(bVar.f99055a);
            return eventBean;
        }
    }

    private b() {
    }

    public static b a() {
        return new b();
    }

    public com.tencent.beacon.base.net.b.c<EventBean, com.tencent.beacon.event.a.b> b() {
        return this.f99070b;
    }

    public com.tencent.beacon.base.net.b.c<com.tencent.beacon.event.a.b, EventBean> c() {
        return this.f99069a;
    }
}
