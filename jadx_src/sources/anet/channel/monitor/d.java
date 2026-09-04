package anet.channel.monitor;

import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f29754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f29755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f29756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f29757d;

    d(b bVar, long j10, long j11, long j12) {
        this.f29757d = bVar;
        this.f29754a = j10;
        this.f29755b = j11;
        this.f29756c = j12;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.f29738a++;
        b.f29742e += this.f29754a;
        if (b.f29738a == 1) {
            b.f29741d = this.f29755b - this.f29756c;
        }
        int i10 = b.f29738a;
        if (i10 >= 2 && i10 <= 3) {
            long j10 = this.f29756c;
            long j11 = b.f29740c;
            if (j10 >= j11) {
                b.f29741d += this.f29755b - j10;
            } else if (j10 < j11) {
                long j12 = this.f29755b;
                if (j12 >= j11) {
                    long j13 = b.f29741d + (j12 - j10);
                    b.f29741d = j13;
                    b.f29741d = j13 - (b.f29740c - j10);
                }
            }
        }
        b.f29739b = this.f29756c;
        b.f29740c = this.f29755b;
        if (b.f29738a == 3) {
            b.f29746i = (long) this.f29757d.f29751n.a(b.f29742e, b.f29741d);
            b.f29743f++;
            b.b(this.f29757d);
            if (b.f29743f > 30) {
                this.f29757d.f29751n.a();
                b.f29743f = 3L;
            }
            double d10 = (b.f29746i * 0.68d) + (b.f29745h * 0.27d) + (b.f29744g * 0.05d);
            b.f29744g = b.f29745h;
            b.f29745h = b.f29746i;
            if (b.f29746i < b.f29744g * 0.65d || b.f29746i > b.f29744g * 2.0d) {
                b.f29746i = d10;
            }
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.BandWidthSampler", "NetworkSpeed", null, "mKalmanDataSize", Long.valueOf(b.f29742e), "mKalmanTimeUsed", Long.valueOf(b.f29741d), "speed", Double.valueOf(b.f29746i), "mSpeedKalmanCount", Long.valueOf(b.f29743f));
            }
            if (this.f29757d.f29750m > 5 || b.f29743f == 2) {
                a.a().a(b.f29746i);
                this.f29757d.f29750m = 0;
                this.f29757d.f29749l = b.f29746i < b.f29747j ? 1 : 5;
                ALog.i("awcn.BandWidthSampler", "NetworkSpeed notification!", null, "Send Network quality notification.");
            }
            b.f29741d = 0L;
            b.f29742e = 0L;
            b.f29738a = 0;
        }
    }
}
