package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.n0;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: InvalidationHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class l extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f138390b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<d> f138391a;

    l(d dVar) {
        super(Looper.getMainLooper());
        this.f138391a = new WeakReference<>(dVar);
    }

    @Override // android.os.Handler
    public void handleMessage(@n0 Message message) {
        d dVar = this.f138391a.get();
        if (dVar == null) {
            return;
        }
        if (message.what == -1) {
            dVar.invalidateSelf();
            return;
        }
        Iterator<a> it = dVar.f138346i.iterator();
        while (it.hasNext()) {
            it.next().a(message.what);
        }
    }
}
