package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.h;
import androidx.work.impl.g0;
import androidx.work.o;
import androidx.work.s;
import androidx.work.w;
import androidx.work.x;
import androidx.work.y;
import com.google.common.util.concurrent.p0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: RemoteWorkManager.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected e() {
    }

    @n0
    public static e o(@n0 Context context) {
        e eVarM = g0.J(context).M();
        if (eVarM != null) {
            return eVarM;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @n0
    public final d a(@n0 String str, @n0 ExistingWorkPolicy existingWorkPolicy, @n0 o oVar) {
        return b(str, existingWorkPolicy, Collections.singletonList(oVar));
    }

    @n0
    public abstract d b(@n0 String str, @n0 ExistingWorkPolicy existingWorkPolicy, @n0 List<o> list);

    @n0
    public final d c(@n0 o oVar) {
        return d(Collections.singletonList(oVar));
    }

    @n0
    public abstract d d(@n0 List<o> list);

    @n0
    public abstract p0<Void> e();

    @n0
    public abstract p0<Void> f(@n0 String str);

    @n0
    public abstract p0<Void> g(@n0 String str);

    @n0
    public abstract p0<Void> h(@n0 UUID uuid);

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract p0<Void> i(@n0 w wVar);

    @n0
    public abstract p0<Void> j(@n0 y yVar);

    @n0
    public abstract p0<Void> k(@n0 List<y> list);

    @n0
    public abstract p0<Void> l(@n0 String str, @n0 ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @n0 s sVar);

    @n0
    public final p0<Void> m(@n0 String str, @n0 ExistingWorkPolicy existingWorkPolicy, @n0 o oVar) {
        return n(str, existingWorkPolicy, Collections.singletonList(oVar));
    }

    @n0
    public abstract p0<Void> n(@n0 String str, @n0 ExistingWorkPolicy existingWorkPolicy, @n0 List<o> list);

    @n0
    public abstract p0<List<WorkInfo>> p(@n0 x xVar);

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract p0<Void> q(@n0 String str, @n0 h hVar);

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract p0<Void> r(@n0 UUID uuid, @n0 androidx.work.e eVar);
}
