package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.lifecycle.LiveData;
import androidx.work.impl.g0;
import com.google.common.util.concurrent.p0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {

    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected WorkManager() {
    }

    public static void B(@n0 Context context, @n0 a aVar) {
        g0.B(context, aVar);
    }

    public static boolean C() {
        return g0.C();
    }

    @n0
    @Deprecated
    public static WorkManager p() {
        g0 g0VarI = g0.I();
        if (g0VarI != null) {
            return g0VarI;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    @n0
    public static WorkManager q(@n0 Context context) {
        return g0.J(context);
    }

    @n0
    public abstract LiveData<List<WorkInfo>> A(@n0 x xVar);

    @n0
    public abstract q D();

    @n0
    public abstract p0<UpdateResult> E(@n0 y yVar);

    @n0
    public final w a(@n0 String str, @n0 ExistingWorkPolicy existingWorkPolicy, @n0 o oVar) {
        return b(str, existingWorkPolicy, Collections.singletonList(oVar));
    }

    @n0
    public abstract w b(@n0 String str, @n0 ExistingWorkPolicy existingWorkPolicy, @n0 List<o> list);

    @n0
    public final w c(@n0 o oVar) {
        return d(Collections.singletonList(oVar));
    }

    @n0
    public abstract w d(@n0 List<o> list);

    @n0
    public abstract q e();

    @n0
    public abstract q f(@n0 String str);

    @n0
    public abstract q g(@n0 String str);

    @n0
    public abstract q h(@n0 UUID uuid);

    @n0
    public abstract PendingIntent i(@n0 UUID uuid);

    @n0
    public final q j(@n0 y yVar) {
        return k(Collections.singletonList(yVar));
    }

    @n0
    public abstract q k(@n0 List<? extends y> list);

    @n0
    public abstract q l(@n0 String str, @n0 ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @n0 s sVar);

    @n0
    public q m(@n0 String str, @n0 ExistingWorkPolicy existingWorkPolicy, @n0 o oVar) {
        return n(str, existingWorkPolicy, Collections.singletonList(oVar));
    }

    @n0
    public abstract q n(@n0 String str, @n0 ExistingWorkPolicy existingWorkPolicy, @n0 List<o> list);

    @n0
    public abstract a o();

    @n0
    public abstract p0<Long> r();

    @n0
    public abstract LiveData<Long> s();

    @n0
    public abstract p0<WorkInfo> t(@n0 UUID uuid);

    @n0
    public abstract LiveData<WorkInfo> u(@n0 UUID uuid);

    @n0
    public abstract p0<List<WorkInfo>> v(@n0 x xVar);

    @n0
    public abstract p0<List<WorkInfo>> w(@n0 String str);

    @n0
    public abstract LiveData<List<WorkInfo>> x(@n0 String str);

    @n0
    public abstract p0<List<WorkInfo>> y(@n0 String str);

    @n0
    public abstract LiveData<List<WorkInfo>> z(@n0 String str);
}
