package z;

import android.content.Context;
import android.content.Intent;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActivityResultContract.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: z.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityResultContract.kt */
    public static final class C1283a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f141807a;

        public C1283a(T t10) {
            this.f141807a = t10;
        }

        public final T a() {
            return this.f141807a;
        }
    }

    @d
    public abstract Intent a(@d Context context, I i10);

    @e
    public C1283a<O> b(@d Context context, I i10) {
        f0.p(context, "context");
        return null;
    }

    public abstract O c(int i10, @e Intent intent);
}
