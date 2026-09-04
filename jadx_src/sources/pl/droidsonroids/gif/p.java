package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RenderTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends q {
    p(d dVar) {
        super(dVar);
    }

    @Override // pl.droidsonroids.gif.q
    public void a() {
        d dVar = this.f138397b;
        long jB = dVar.f138345h.B(dVar.f138344g);
        if (jB >= 0) {
            this.f138397b.f138341d = SystemClock.uptimeMillis() + jB;
            if (this.f138397b.isVisible() && this.f138397b.f138340c) {
                d dVar2 = this.f138397b;
                if (!dVar2.f138350m) {
                    dVar2.f138339b.remove(this);
                    d dVar3 = this.f138397b;
                    dVar3.f138354q = dVar3.f138339b.schedule(this, jB, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f138397b.f138346i.isEmpty() && this.f138397b.j() == this.f138397b.f138345h.n() - 1) {
                d dVar4 = this.f138397b;
                dVar4.f138351n.sendEmptyMessageAtTime(dVar4.k(), this.f138397b.f138341d);
            }
        } else {
            d dVar5 = this.f138397b;
            dVar5.f138341d = Long.MIN_VALUE;
            dVar5.f138340c = false;
        }
        if (!this.f138397b.isVisible() || this.f138397b.f138351n.hasMessages(-1)) {
            return;
        }
        this.f138397b.f138351n.sendEmptyMessageAtTime(-1, 0L);
    }
}
