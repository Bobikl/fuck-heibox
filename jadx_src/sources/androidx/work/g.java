package androidx.work;

import android.content.Context;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: DelegatingWorkerFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28779c = n.i("DelegatingWkrFctry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<z> f28780b = new CopyOnWriteArrayList();

    @Override // androidx.work.z
    @p0
    public final m a(@n0 Context context, @n0 String str, @n0 WorkerParameters workerParameters) {
        Iterator<z> it = this.f28780b.iterator();
        while (it.hasNext()) {
            try {
                m mVarA = it.next().a(context, str, workerParameters);
                if (mVarA != null) {
                    return mVarA;
                }
            } catch (Throwable th2) {
                n.e().d(f28779c, "Unable to instantiate a ListenableWorker (" + str + ")", th2);
                throw th2;
            }
        }
        return null;
    }

    public final void d(@n0 z zVar) {
        this.f28780b.add(zVar);
    }

    @j1
    @n0
    List<z> e() {
        return this.f28780b;
    }
}
