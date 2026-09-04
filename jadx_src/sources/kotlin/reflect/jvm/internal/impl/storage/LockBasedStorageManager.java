package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.b2;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public class LockBasedStorageManager implements kotlin.reflect.jvm.internal.impl.storage.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f127922d = StringsKt__StringsKt.A5(LockBasedStorageManager.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.storage.m f127923e = new a("NO_LOCKS", f.f127934a, kotlin.reflect.jvm.internal.impl.storage.e.f127953b);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f127924f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final kotlin.reflect.jvm.internal.impl.storage.j f127925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f127926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f127927c;

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static final class a extends LockBasedStorageManager {
        a(String str, f fVar, kotlin.reflect.jvm.internal.impl.storage.j jVar) {
            super(str, fVar, jVar, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        @dl.d
        protected <K, V> n<V> p(@dl.d String str, K k10) {
            if (str == null) {
                j(0);
            }
            n<V> nVarA = n.a();
            if (nVarA == null) {
                j(1);
            }
            return nVarA;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends j<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f127928f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LockBasedStorageManager lockBasedStorageManager, yh.a aVar, Object obj) {
            super(lockBasedStorageManager, aVar);
            this.f127928f = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h
        @dl.d
        protected n<T> c(boolean z10) {
            n<T> nVarD = n.d(this.f127928f);
            if (nVarD == null) {
                a(0);
            }
            return nVarD;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> extends k<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.l f127930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ yh.l f127931h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LockBasedStorageManager lockBasedStorageManager, yh.a aVar, yh.l lVar, yh.l lVar2) {
            super(lockBasedStorageManager, aVar);
            this.f127930g = lVar;
            this.f127931h = lVar2;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h
        @dl.d
        protected n<T> c(boolean z10) {
            yh.l lVar = this.f127930g;
            if (lVar == null) {
                n<T> nVarC = super.c(z10);
                if (nVarC == null) {
                    a(0);
                }
                return nVarC;
            }
            n<T> nVarD = n.d(lVar.invoke(Boolean.valueOf(z10)));
            if (nVarD == null) {
                a(1);
            }
            return nVarD;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.i
        protected void d(@dl.d T t10) {
            if (t10 == null) {
                a(2);
            }
            this.f127931h.invoke(t10);
        }
    }

    public static class d<K, V> extends e<K, V> implements kotlin.reflect.jvm.internal.impl.storage.a<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f127933e = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(@dl.d LockBasedStorageManager lockBasedStorageManager, @dl.d ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, null);
            if (lockBasedStorageManager == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }

        /* synthetic */ d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.e, kotlin.reflect.jvm.internal.impl.storage.a
        @dl.d
        public V a(K k10, @dl.d yh.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            V v10 = (V) super.a(k10, aVar);
            if (v10 == null) {
                b(3);
            }
            return v10;
        }
    }

    public static class e<K, V> extends l<g<K, V>, V> implements kotlin.reflect.jvm.internal.impl.storage.b<K, V> {

        public class a implements yh.l<g<K, V>, V> {
            a() {
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(g<K, V> gVar) {
                return (V) ((g) gVar).f127936b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(@dl.d LockBasedStorageManager lockBasedStorageManager, @dl.d ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new a());
            if (lockBasedStorageManager == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }

        /* synthetic */ e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @dl.e
        public V a(K k10, @dl.d yh.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            return invoke(new g(k10, aVar));
        }
    }

    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f127934a = new a();

        public static final class a implements f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f
            @dl.d
            public RuntimeException a(@dl.d Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw kotlin.reflect.jvm.internal.impl.utils.c.b(th2);
            }
        }

        @dl.d
        RuntimeException a(@dl.d Throwable th2);
    }

    public static class g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f127935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final yh.a<? extends V> f127936b;

        public g(K k10, yh.a<? extends V> aVar) {
            this.f127935a = k10;
            this.f127936b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f127935a.equals(((g) obj).f127935a);
        }

        public int hashCode() {
            return this.f127935a.hashCode();
        }
    }

    public static class h<T> implements kotlin.reflect.jvm.internal.impl.storage.i<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LockBasedStorageManager f127937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final yh.a<? extends T> f127938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private volatile Object f127939d;

        public h(@dl.d LockBasedStorageManager lockBasedStorageManager, @dl.d yh.a<? extends T> aVar) {
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f127939d = NotValue.NOT_COMPUTED;
            this.f127937b = lockBasedStorageManager;
            this.f127938c = aVar;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        protected void b(T t10) {
        }

        @dl.d
        protected n<T> c(boolean z10) {
            n<T> nVarP = this.f127937b.p("in a lazy value", null);
            if (nVarP == null) {
                a(2);
            }
            return nVarP;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x003c A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:38:0x0012, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:38:0x0012, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x004b A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:38:0x0012, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0050 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:38:0x0012, inners: #1 }] */
        @Override // yh.a
        public T invoke() {
            T tInvoke;
            n<T> nVarC;
            Object obj = this.f127939d;
            if (!(obj instanceof NotValue)) {
                return (T) WrappedValues.f(obj);
            }
            this.f127937b.f127925a.lock();
            try {
                Object obj2 = this.f127939d;
                if (obj2 instanceof NotValue) {
                    NotValue notValue = NotValue.COMPUTING;
                    if (obj2 == notValue) {
                        this.f127939d = NotValue.RECURSION_WAS_DETECTED;
                        n<T> nVarC2 = c(true);
                        if (!nVarC2.c()) {
                            tInvoke = nVarC2.b();
                        } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                            nVarC = c(false);
                            if (nVarC.c()) {
                                this.f127939d = notValue;
                                try {
                                    tInvoke = this.f127938c.invoke();
                                    b(tInvoke);
                                    this.f127939d = tInvoke;
                                } catch (Throwable th2) {
                                    if (kotlin.reflect.jvm.internal.impl.utils.c.a(th2)) {
                                        this.f127939d = NotValue.NOT_COMPUTED;
                                        throw th2;
                                    }
                                    if (this.f127939d == NotValue.COMPUTING) {
                                        this.f127939d = WrappedValues.c(th2);
                                    }
                                    throw this.f127937b.f127926b.a(th2);
                                }
                            } else {
                                tInvoke = nVarC.b();
                            }
                        } else {
                            this.f127939d = notValue;
                            tInvoke = this.f127938c.invoke();
                            b(tInvoke);
                            this.f127939d = tInvoke;
                        }
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        nVarC = c(false);
                        if (nVarC.c()) {
                            tInvoke = nVarC.b();
                        } else {
                            this.f127939d = notValue;
                            tInvoke = this.f127938c.invoke();
                            b(tInvoke);
                            this.f127939d = tInvoke;
                        }
                    } else {
                        this.f127939d = notValue;
                        tInvoke = this.f127938c.invoke();
                        b(tInvoke);
                        this.f127939d = tInvoke;
                    }
                } else {
                    tInvoke = (T) WrappedValues.f(obj2);
                }
                this.f127937b.f127925a.unlock();
                return tInvoke;
            } catch (Throwable th3) {
                this.f127937b.f127925a.unlock();
                throw th3;
            }
        }

        public boolean v0() {
            return (this.f127939d == NotValue.NOT_COMPUTED || this.f127939d == NotValue.COMPUTING) ? false : true;
        }
    }

    public static abstract class i<T> extends h<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private volatile kotlin.reflect.jvm.internal.impl.storage.k<T> f127940e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@dl.d LockBasedStorageManager lockBasedStorageManager, @dl.d yh.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f127940e = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h
        protected final void b(T t10) {
            this.f127940e = new kotlin.reflect.jvm.internal.impl.storage.k<>(t10);
            try {
                d(t10);
            } finally {
                this.f127940e = null;
            }
        }

        protected abstract void d(T t10);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h, yh.a
        public T invoke() {
            kotlin.reflect.jvm.internal.impl.storage.k<T> kVar = this.f127940e;
            return (kVar == null || !kVar.b()) ? (T) super.invoke() : kVar.a();
        }
    }

    public static class j<T> extends h<T> implements kotlin.reflect.jvm.internal.impl.storage.h<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f127941e = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@dl.d LockBasedStorageManager lockBasedStorageManager, @dl.d yh.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h, yh.a
        @dl.d
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                a(2);
            }
            return t10;
        }
    }

    public static abstract class k<T> extends i<T> implements kotlin.reflect.jvm.internal.impl.storage.h<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f127942f = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@dl.d LockBasedStorageManager lockBasedStorageManager, @dl.d yh.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.i, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h, yh.a
        @dl.d
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                a(2);
            }
            return t10;
        }
    }

    public static class l<K, V> implements kotlin.reflect.jvm.internal.impl.storage.g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LockBasedStorageManager f127943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ConcurrentMap<K, Object> f127944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final yh.l<? super K, ? extends V> f127945d;

        public l(@dl.d LockBasedStorageManager lockBasedStorageManager, @dl.d ConcurrentMap<K, Object> concurrentMap, @dl.d yh.l<? super K, ? extends V> lVar) {
            if (lockBasedStorageManager == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f127943b = lockBasedStorageManager;
            this.f127944c = concurrentMap;
            this.f127945d = lVar;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @dl.d
        private AssertionError d(K k10, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.q(new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.f127943b));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.g
        public boolean J0(K k10) {
            Object obj = this.f127944c.get(k10);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        protected LockBasedStorageManager c() {
            return this.f127943b;
        }

        @dl.d
        protected n<V> e(K k10, boolean z10) {
            n<V> nVarP = this.f127943b.p("", k10);
            if (nVarP == null) {
                b(3);
            }
            return nVarP;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003b A[Catch: all -> 0x00b5, PHI: r0
  0x003b: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v17 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:48:0x0018, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:48:0x0018, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x004a A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:48:0x0018, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x004f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:48:0x0018, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0056  */
        /* JADX WARN: Code duplicated, block: B:27:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0076 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #1 {all -> 0x007b, blocks: (B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:49:0x0057, outer: #0 }] */
        @Override // yh.l
        @dl.e
        public V invoke(K k10) {
            AssertionError assertionErrorD;
            V vInvoke;
            Object objPut;
            V vB;
            n<V> nVarE;
            Object obj = this.f127944c.get(k10);
            if (obj != null && obj != NotValue.COMPUTING) {
                return (V) WrappedValues.d(obj);
            }
            this.f127943b.f127925a.lock();
            try {
                Object obj2 = this.f127944c.get(k10);
                NotValue notValue = NotValue.COMPUTING;
                if (obj2 == notValue) {
                    obj2 = NotValue.RECURSION_WAS_DETECTED;
                    n<V> nVarE2 = e(k10, true);
                    if (!nVarE2.c()) {
                        vB = nVarE2.b();
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        nVarE = e(k10, false);
                        if (!nVarE.c()) {
                            vB = nVarE.b();
                        } else {
                            if (obj2 != null) {
                                assertionErrorD = null;
                                try {
                                    this.f127944c.put(k10, notValue);
                                    vInvoke = this.f127945d.invoke(k10);
                                    objPut = this.f127944c.put(k10, WrappedValues.b(vInvoke));
                                    if (objPut == notValue) {
                                        this.f127943b.f127925a.unlock();
                                        return vInvoke;
                                    }
                                    assertionErrorD = d(k10, objPut);
                                    throw assertionErrorD;
                                } catch (Throwable th2) {
                                    if (kotlin.reflect.jvm.internal.impl.utils.c.a(th2)) {
                                        this.f127944c.remove(k10);
                                        throw th2;
                                    }
                                    if (th2 == assertionErrorD) {
                                        throw this.f127943b.f127926b.a(th2);
                                    }
                                    Object objPut2 = this.f127944c.put(k10, WrappedValues.c(th2));
                                    if (objPut2 != NotValue.COMPUTING) {
                                        throw d(k10, objPut2);
                                    }
                                    throw this.f127943b.f127926b.a(th2);
                                }
                            }
                            vB = (V) WrappedValues.d(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            assertionErrorD = null;
                            this.f127944c.put(k10, notValue);
                            vInvoke = this.f127945d.invoke(k10);
                            objPut = this.f127944c.put(k10, WrappedValues.b(vInvoke));
                            if (objPut == notValue) {
                                this.f127943b.f127925a.unlock();
                                return vInvoke;
                            }
                            assertionErrorD = d(k10, objPut);
                            throw assertionErrorD;
                        }
                        vB = (V) WrappedValues.d(obj2);
                    }
                } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                    nVarE = e(k10, false);
                    if (!nVarE.c()) {
                        vB = nVarE.b();
                    } else {
                        if (obj2 != null) {
                            assertionErrorD = null;
                            this.f127944c.put(k10, notValue);
                            vInvoke = this.f127945d.invoke(k10);
                            objPut = this.f127944c.put(k10, WrappedValues.b(vInvoke));
                            if (objPut == notValue) {
                                this.f127943b.f127925a.unlock();
                                return vInvoke;
                            }
                            assertionErrorD = d(k10, objPut);
                            throw assertionErrorD;
                        }
                        vB = (V) WrappedValues.d(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        assertionErrorD = null;
                        this.f127944c.put(k10, notValue);
                        vInvoke = this.f127945d.invoke(k10);
                        objPut = this.f127944c.put(k10, WrappedValues.b(vInvoke));
                        if (objPut == notValue) {
                            this.f127943b.f127925a.unlock();
                            return vInvoke;
                        }
                        assertionErrorD = d(k10, objPut);
                        throw assertionErrorD;
                    }
                    vB = (V) WrappedValues.d(obj2);
                }
                this.f127943b.f127925a.unlock();
                return vB;
            } catch (Throwable th3) {
                this.f127943b.f127925a.unlock();
                throw th3;
            }
        }
    }

    public static class m<K, V> extends l<K, V> implements kotlin.reflect.jvm.internal.impl.storage.f<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f127946e = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@dl.d LockBasedStorageManager lockBasedStorageManager, @dl.d ConcurrentMap<K, Object> concurrentMap, @dl.d yh.l<? super K, ? extends V> lVar) {
            super(lockBasedStorageManager, concurrentMap, lVar);
            if (lockBasedStorageManager == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.l, yh.l
        @dl.d
        public V invoke(K k10) {
            V v10 = (V) super.invoke(k10);
            if (v10 == null) {
                b(3);
            }
            return v10;
        }
    }

    public static class n<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f127947c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f127948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f127949b;

        private n(T t10, boolean z10) {
            this.f127948a = t10;
            this.f127949b = z10;
        }

        @dl.d
        public static <T> n<T> a() {
            return new n<>(null, true);
        }

        @dl.d
        public static <T> n<T> d(T t10) {
            return new n<>(t10, false);
        }

        public T b() {
            return this.f127948a;
        }

        public boolean c() {
            return this.f127949b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f127948a);
        }
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (yh.l<InterruptedException, b2>) null);
    }

    public LockBasedStorageManager(String str, @dl.e Runnable runnable, @dl.e yh.l<InterruptedException, b2> lVar) {
        this(str, f.f127934a, kotlin.reflect.jvm.internal.impl.storage.j.f127954a.a(runnable, lVar));
    }

    private LockBasedStorageManager(@dl.d String str, @dl.d f fVar, @dl.d kotlin.reflect.jvm.internal.impl.storage.j jVar) {
        if (str == null) {
            j(4);
        }
        if (fVar == null) {
            j(5);
        }
        if (jVar == null) {
            j(6);
        }
        this.f127925a = jVar;
        this.f127926b = fVar;
        this.f127927c = str;
    }

    /* synthetic */ LockBasedStorageManager(String str, f fVar, kotlin.reflect.jvm.internal.impl.storage.j jVar, a aVar) {
        this(str, fVar, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    private static /* synthetic */ void j(int i10) {
        String str = (i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i10 != 6) {
            switch (i10) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i10 == 10 || i10 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i10 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i10 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 10 && i10 != 13 && i10 != 20 && i10 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @dl.d
    public static <T extends Throwable> T q(@dl.d T t10) {
        if (t10 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (!stackTrace[i11].getClassName().startsWith(f127922d)) {
                i10 = i11;
                break;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        t10.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return t10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    @dl.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.f<K, V> a(@dl.d yh.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        kotlin.reflect.jvm.internal.impl.storage.f<K, V> fVarN = n(lVar, m());
        if (fVarN == null) {
            j(10);
        }
        return fVarN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    @dl.d
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> b(@dl.d yh.a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    @dl.d
    public <T> kotlin.reflect.jvm.internal.impl.storage.h<T> c(@dl.d yh.a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    @dl.d
    public <T> kotlin.reflect.jvm.internal.impl.storage.h<T> d(@dl.d yh.a<? extends T> aVar, yh.l<? super Boolean, ? extends T> lVar, @dl.d yh.l<? super T, b2> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    @dl.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.a<K, V> e() {
        return new d(this, m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    @dl.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.b<K, V> f() {
        return new e(this, m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    public <T> T g(@dl.d yh.a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f127925a.lock();
        try {
            T tInvoke = aVar.invoke();
            this.f127925a.unlock();
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw this.f127926b.a(th2);
            } catch (Throwable th3) {
                this.f127925a.unlock();
                throw th3;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    @dl.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> h(@dl.d yh.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        kotlin.reflect.jvm.internal.impl.storage.g<K, V> gVarO = o(lVar, m());
        if (gVarO == null) {
            j(20);
        }
        return gVarO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    @dl.d
    public <T> kotlin.reflect.jvm.internal.impl.storage.h<T> i(@dl.d yh.a<? extends T> aVar, @dl.d T t10) {
        if (aVar == null) {
            j(26);
        }
        if (t10 == null) {
            j(27);
        }
        return new b(this, aVar, t10);
    }

    @dl.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.f<K, V> n(@dl.d yh.l<? super K, ? extends V> lVar, @dl.d ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    @dl.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> o(@dl.d yh.l<? super K, ? extends V> lVar, @dl.d ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    @dl.d
    protected <K, V> n<V> p(@dl.d String str, K k10) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k10 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k10;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f127927c + ")";
    }
}
