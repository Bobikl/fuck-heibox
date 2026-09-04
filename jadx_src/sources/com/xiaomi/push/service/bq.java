package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.gb;
import com.xiaomi.push.gc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, c> f107969a = new ConcurrentHashMap<>();

    public static class a extends XMPushService.j {
        public a() {
            super(17);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "RecordTimeManager clear";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            bq.a().m737a();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final bq f107970a = new bq();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f107971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f107972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f107973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f107974d;

        private c() {
        }

        public long a() {
            long j10 = this.f107973c;
            long j11 = this.f107972b;
            if (j10 > j11) {
                return j10 - j11;
            }
            return 0L;
        }

        public long b() {
            long j10 = this.f107974d;
            long j11 = this.f107973c;
            if (j10 > j11) {
                return j10 - j11;
            }
            return 0L;
        }
    }

    public static bq a() {
        return b.f107970a;
    }

    private void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("xmsfVC", Long.valueOf(cVar.f107971a));
        map.put("packetId", str);
        map.put("pTime", Long.valueOf(cVar.a()));
        map.put("bTime", Long.valueOf(cVar.b()));
        gc.a().a(new gb("msg_process_time", map));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m737a() {
        if (this.f107969a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, c>> it = this.f107969a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            if (next == null || next.getValue() == null) {
                it.remove();
            } else {
                c value = next.getValue();
                if (Math.abs(SystemClock.elapsedRealtime() - value.f107972b) > 10000) {
                    a(next.getKey(), value);
                    it.remove();
                }
            }
        }
    }

    public void a(String str, long j10) {
        c cVar = this.f107969a.get(str);
        if (cVar != null) {
            cVar.f107973c = j10;
        }
    }

    public void a(String str, long j10, long j11) {
        c cVar = new c();
        cVar.f107971a = j11;
        cVar.f107972b = j10;
        this.f107969a.put(str, cVar);
    }

    public void b(String str, long j10) {
        c cVarRemove = this.f107969a.remove(str);
        if (cVarRemove != null) {
            cVarRemove.f107974d = j10;
            a(str, cVarRemove);
        }
    }
}
