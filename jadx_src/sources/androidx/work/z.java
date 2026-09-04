package androidx.work;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: WorkerFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f29488a = n.i("WorkerFactory");

    /* JADX INFO: compiled from: WorkerFactory.java */
    public class a extends z {
        a() {
        }

        @Override // androidx.work.z
        @p0
        public m a(@n0 Context context, @n0 String str, @n0 WorkerParameters workerParameters) {
            return null;
        }
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static z c() {
        return new a();
    }

    @p0
    public abstract m a(@n0 Context context, @n0 String str, @n0 WorkerParameters workerParameters);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @p0
    public final m b(@n0 Context context, @n0 String str, @n0 WorkerParameters workerParameters) {
        m mVarA = a(context, str, workerParameters);
        if (mVarA == null) {
            Class clsAsSubclass = null;
            try {
                clsAsSubclass = Class.forName(str).asSubclass(m.class);
            } catch (Throwable th2) {
                n.e().d(f29488a, "Invalid class: " + str, th2);
            }
            if (clsAsSubclass != null) {
                try {
                    mVarA = (m) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th3) {
                    n.e().d(f29488a, "Could not instantiate " + str, th3);
                }
            }
        }
        if (mVarA == null || !mVarA.p()) {
            return mVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
