package g;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: AbsNetworkChangeObservable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f118912a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f118913b = Collections.synchronizedList(new ArrayList());

    public void a(Context context) {
        boolean z10;
        if (context == null) {
            z10 = true;
        } else {
            try {
                int iU = b.a.u(context);
                if (this.f118912a == -1) {
                    this.f118912a = iU;
                } else if (this.f118912a != iU) {
                    this.f118912a = iU;
                    z10 = true;
                }
                z10 = false;
            } catch (Exception e10) {
                f.b.a(3, e10, "mayChangeNetwork exception occur", new Object[0]);
                return;
            }
        }
        if (z10) {
            f.b.b("changeNetwork call", new Object[0]);
            synchronized (this.f118913b) {
                Iterator<b> it = this.f118913b.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
    }
}
