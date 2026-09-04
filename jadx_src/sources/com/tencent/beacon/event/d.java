package com.tencent.beacon.event;

import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.exoplayer2.audio.q0;
import com.tencent.beacon.event.immediate.Beacon2MsfTransferArgs;
import com.tencent.beacon.event.immediate.Beacon2WnsTransferArgs;
import com.tencent.beacon.event.immediate.BeaconTransferArgs;
import com.tencent.beacon.event.open.EventResult;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: EventManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements h, com.tencent.beacon.a.a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.tencent.beacon.event.a.a f99104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f99105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f99106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f99107e = 2000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f99108f = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f99103a = com.tencent.beacon.a.b.a.a().a(3000);

    public d() {
        com.tencent.beacon.event.a.a aVarA = com.tencent.beacon.event.a.a.a();
        this.f99104b = aVarA;
        this.f99105c = new g(2000, aVarA, true);
        this.f99106d = new g(1000, aVarA, false);
        com.tencent.beacon.a.a.b.a().a(11, this);
        com.tencent.beacon.a.a.b.a().a(2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BeaconTransferArgs a(byte[] bArr, int i10) {
        return i10 == 3 ? new Beacon2MsfTransferArgs(bArr) : new Beacon2WnsTransferArgs(bArr);
    }

    @Override // com.tencent.beacon.event.h
    public EventResult a(String str, @n0 EventBean eventBean) {
        com.tencent.beacon.base.util.c.a("[EventManager]", "eventName is %s, logID is %s", eventBean.getEventCode(), str);
        com.tencent.beacon.a.b.a.a().a(new b(this, eventBean, str));
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        return EventResult.a.a(Long.parseLong(str));
    }

    @Override // com.tencent.beacon.event.h
    public void a() {
        com.tencent.beacon.a.b.a.a().a(2000, 0L, this.f99107e, this.f99105c);
        com.tencent.beacon.a.b.a.a().a(1000, 0L, this.f99108f, this.f99106d);
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        int i10 = cVar.f98739a;
        if (i10 == 2) {
            Map map = (Map) cVar.f98740b.get("d_m");
            if (map != null) {
                this.f99107e = com.tencent.beacon.base.util.b.a((String) map.get("realtimePollingTime"), this.f99107e, 100L, q0.f44202v);
                this.f99108f = com.tencent.beacon.base.util.b.a((String) map.get("normalPollingTime"), this.f99108f, 1000L, 50000L);
            }
        } else if (i10 == 11) {
            Object obj = cVar.f98740b.get("u_c_r_p");
            if (obj != null) {
                long jLongValue = ((Long) obj).longValue();
                if (jLongValue >= 100 && jLongValue <= q0.f44202v) {
                    this.f99107e = jLongValue;
                }
            }
            Object obj2 = cVar.f98740b.get("u_c_n_p");
            if (obj2 != null) {
                long jLongValue2 = ((Long) obj2).longValue();
                if (jLongValue2 >= 1000 && jLongValue2 <= 50000) {
                    this.f99108f = jLongValue2;
                }
            }
        }
        com.tencent.beacon.base.util.c.a("[EventManager]", "pollingTime maybe change, realtime: %s normal: %s", Long.valueOf(this.f99107e), Long.valueOf(this.f99108f));
    }

    public void a(EventBean eventBean, String str) {
        Map<String, String> eventValue = eventBean.getEventValue();
        eventValue.put("A156", "N");
        eventBean.setEventValue(eventValue);
        ArrayList arrayList = new ArrayList();
        arrayList.add(eventBean);
        com.tencent.beacon.base.net.d.c().a(com.tencent.beacon.event.c.d.a(arrayList, true)).a(new c(this, eventBean, str), com.tencent.beacon.a.b.a.b());
    }

    @Override // com.tencent.beacon.event.h
    public void a(boolean z10) {
        if (z10) {
            this.f99106d.run();
            this.f99105c.run();
        } else {
            com.tencent.beacon.a.b.a.a().a(this.f99106d);
            com.tencent.beacon.a.b.a.a().a(this.f99105c);
        }
    }

    @Override // com.tencent.beacon.event.h
    public boolean a(Runnable runnable) {
        return this.f99103a.post(runnable);
    }

    @Override // com.tencent.beacon.event.h
    public EventResult b(@p0 String str, @n0 EventBean eventBean) {
        boolean zA = a(new a(this, eventBean));
        com.tencent.beacon.base.util.c.a("[EventModule]", 1, "event: %s. go in EventManager(%s). offer: %s", eventBean.getEventCode(), eventBean.getAppKey(), Boolean.valueOf(zA));
        if (!zA) {
            return EventResult.a.a(103);
        }
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        return EventResult.a.a(Long.parseLong(str));
    }

    @Override // com.tencent.beacon.event.h
    public void b() {
        com.tencent.beacon.a.b.a.a().b(2000);
        com.tencent.beacon.a.b.a.a().b(1000);
    }

    @Override // com.tencent.beacon.event.h
    public void c() {
        com.tencent.beacon.a.b.a.a().a(2000, false);
        com.tencent.beacon.a.b.a.a().a(1000, false);
    }
}
