package com.google.android.gms.common.stats;

import androidx.annotation.n0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @v8.a
        public static final int f52625a = 7;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @v8.a
        public static final int f52626b = 8;
    }

    public abstract int b();

    public abstract long c();

    public abstract long d();

    @n0
    public abstract String f();

    @n0
    public final String toString() {
        return d() + "\t" + b() + "\t" + c() + f();
    }
}
