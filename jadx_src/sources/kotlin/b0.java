package kotlin;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b0 {

    /* JADX INFO: compiled from: LazyJVM.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124492a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f124492a = iArr;
        }
    }

    @dl.d
    public static final <T> z<T> a(@dl.e Object obj, @dl.d yh.a<? extends T> initializer) {
        kotlin.jvm.internal.f0.p(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, obj);
    }

    @dl.d
    public static final <T> z<T> b(@dl.d LazyThreadSafetyMode mode, @dl.d yh.a<? extends T> initializer) {
        kotlin.jvm.internal.f0.p(mode, "mode");
        kotlin.jvm.internal.f0.p(initializer, "initializer");
        int i10 = a.f124492a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            kotlin.jvm.internal.u uVar = null;
            return new SynchronizedLazyImpl(initializer, uVar, i11, uVar);
        }
        if (i10 == 2) {
            return new SafePublicationLazyImpl(initializer);
        }
        if (i10 == 3) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.d
    public static final <T> z<T> c(@dl.d yh.a<? extends T> initializer) {
        kotlin.jvm.internal.f0.p(initializer, "initializer");
        kotlin.jvm.internal.u uVar = null;
        return new SynchronizedLazyImpl(initializer, uVar, 2, uVar);
    }
}
