package androidx.work.multiprocess;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.work.o;
import com.google.common.util.concurrent.p0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: RemoteWorkContinuation.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected d() {
    }

    @n0
    public static d a(@n0 List<d> list) {
        return list.get(0).b(list);
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract d b(@n0 List<d> list);

    @n0
    public abstract p0<Void> c();

    @n0
    public final d d(@n0 o oVar) {
        return e(Collections.singletonList(oVar));
    }

    @n0
    public abstract d e(@n0 List<o> list);
}
