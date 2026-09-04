package androidx.work;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.p0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: WorkContinuation.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w {
    @n0
    public static w a(@n0 List<w> list) {
        return list.get(0).b(list);
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract w b(@n0 List<w> list);

    @n0
    public abstract q c();

    @n0
    public abstract p0<List<WorkInfo>> d();

    @n0
    public abstract LiveData<List<WorkInfo>> e();

    @n0
    public final w f(@n0 o oVar) {
        return g(Collections.singletonList(oVar));
    }

    @n0
    public abstract w g(@n0 List<o> list);
}
