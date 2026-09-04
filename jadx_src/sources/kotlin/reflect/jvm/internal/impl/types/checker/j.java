package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface j extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f128080b = a.f128081a;

    /* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f128081a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private static final k f128082b = new k(f.a.f128072a, null, 2, 0 == true ? 1 : 0);

        private a() {
        }

        @dl.d
        public final k a() {
            return f128082b;
        }
    }

    @dl.d
    OverridingUtil b();

    @dl.d
    f c();
}
