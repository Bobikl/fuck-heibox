package anet.channel.strategy;

import java.io.Serializable;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class ConnHistoryItem implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte f29869a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f29870b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f29871c = 0;

    ConnHistoryItem() {
    }

    int a() {
        int i10 = 0;
        for (int i11 = this.f29869a & 255; i11 > 0; i11 >>= 1) {
            i10 += i11 & 1;
        }
        return i10;
    }

    void a(boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - (z10 ? this.f29870b : this.f29871c) > 10000) {
            this.f29869a = (byte) ((this.f29869a << 1) | (!z10 ? 1 : 0));
            if (z10) {
                this.f29870b = jCurrentTimeMillis;
            } else {
                this.f29871c = jCurrentTimeMillis;
            }
        }
    }

    boolean b() {
        return (this.f29869a & 1) == 1;
    }

    boolean c() {
        return a() >= 3 && System.currentTimeMillis() - this.f29871c <= 300000;
    }

    boolean d() {
        long j10 = this.f29870b;
        long j11 = this.f29871c;
        if (j10 <= j11) {
            j10 = j11;
        }
        return j10 != 0 && System.currentTimeMillis() - j10 > 86400000;
    }
}
