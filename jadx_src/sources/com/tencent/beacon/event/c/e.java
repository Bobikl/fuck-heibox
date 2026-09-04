package com.tencent.beacon.event.c;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: LogIDGenerator.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f99072a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f99073b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f99074c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f99075d;

    e(g gVar) {
        this.f99075d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f99075d) {
            long j10 = this.f99075d.f99094r.get();
            long j11 = this.f99075d.f99093q.get();
            long j12 = this.f99075d.f99095s.get();
            if (this.f99072a == j10 && this.f99073b == j11 && this.f99074c == j12) {
                return;
            }
            this.f99072a = j10;
            this.f99073b = j11;
            this.f99074c = j12;
            g gVar = this.f99075d;
            SharedPreferences.Editor editorEdit = gVar.a(gVar.f99089m).edit();
            if (com.tencent.beacon.base.util.b.a(editorEdit)) {
                editorEdit.putLong("on_date", this.f99075d.f99092p).putLong("realtime_log_id", this.f99072a).putLong("normal_log_id", this.f99073b).putLong("immediate_log_id", this.f99074c).putLong("realtime_min_log_id", this.f99075d.f99096t).putLong("realtime_max_log_id", this.f99075d.f99097u).putLong("normal_min_log_id", this.f99075d.f99098v).putLong("normal_max_log_id", this.f99075d.f99099w).putLong("immediate_min_log_id", this.f99075d.f99100x).putLong("immediate_max_log_id", this.f99075d.f99101y).apply();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[LogID ");
            sb2.append(this.f99075d.f99090n);
            sb2.append("]");
            com.tencent.beacon.base.util.c.a(sb2.toString(), "  write serial to sp, date: %s ,realtime: %d, normal: %d, immediate: %d ", Long.valueOf(this.f99075d.f99092p), Long.valueOf(this.f99072a), Long.valueOf(this.f99073b), Long.valueOf(this.f99074c));
        }
    }
}
