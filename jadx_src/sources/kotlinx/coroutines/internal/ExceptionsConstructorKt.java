package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0082\b\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0082\u0010\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018*(\b\u0002\u0010\u001a\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001b"}, d2 = {"", androidx.exifinterface.media.a.S4, "exception", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "b", "Ljava/lang/reflect/Constructor;", "constructor", ak.aF, "block", "g", "", "defaultValue", "f", "accumulator", "d", ak.av, "I", "throwableFields", "Lkotlinx/coroutines/internal/k;", "Lkotlinx/coroutines/internal/k;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class ExceptionsConstructorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130115a = f(Throwable.class, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final k f130116b;

    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "kotlin.jvm.PlatformType", ak.av, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$c", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.g.l(Integer.valueOf(((Constructor) t11).getParameterTypes().length), Integer.valueOf(((Constructor) t10).getParameterTypes().length));
        }
    }

    static {
        k kVar;
        try {
            kVar = o.a() ? z0.f130238a : e.f130160a;
        } catch (Throwable unused) {
            kVar = z0.f130238a;
        }
        f130116b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> yh.l<Throwable, Throwable> b(Class<E> cls) {
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new yh.l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(@dl.d Throwable th2) {
                return null;
            }
        };
        if (f130115a != f(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Iterator it = ArraysKt___ArraysKt.mw(cls.getConstructors(), new a()).iterator();
        while (it.hasNext()) {
            yh.l<Throwable, Throwable> lVarC = c((Constructor) it.next());
            if (lVarC != null) {
                return lVarC;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    private static final yh.l<Throwable, Throwable> c(final Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new yh.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Throwable invoke(@dl.d Throwable th2) {
                    Object objB;
                    try {
                        Result.a aVar = Result.f124476c;
                        Object objNewInstance = constructor.newInstance(new Object[0]);
                        if (objNewInstance == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                        }
                        Throwable th3 = (Throwable) objNewInstance;
                        th3.initCause(th2);
                        objB = Result.b(th3);
                        if (Result.i(objB)) {
                            objB = null;
                        }
                        return (Throwable) objB;
                    } catch (Throwable th4) {
                        Result.a aVar2 = Result.f124476c;
                        objB = Result.b(kotlin.t0.a(th4));
                    }
                }
            };
        }
        if (length != 1) {
            if (length == 2 && kotlin.jvm.internal.f0.g(parameterTypes[0], String.class) && kotlin.jvm.internal.f0.g(parameterTypes[1], Throwable.class)) {
                return new yh.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.e
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Throwable invoke(@dl.d Throwable th2) {
                        Object objB;
                        try {
                            Result.a aVar = Result.f124476c;
                            Object objNewInstance = constructor.newInstance(th2.getMessage(), th2);
                            if (objNewInstance == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                            }
                            objB = Result.b((Throwable) objNewInstance);
                            if (Result.i(objB)) {
                                objB = null;
                            }
                            return (Throwable) objB;
                        } catch (Throwable th3) {
                            Result.a aVar2 = Result.f124476c;
                            objB = Result.b(kotlin.t0.a(th3));
                        }
                    }
                };
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (kotlin.jvm.internal.f0.g(cls, Throwable.class)) {
            return new yh.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Throwable invoke(@dl.d Throwable th2) {
                    Object objB;
                    try {
                        Result.a aVar = Result.f124476c;
                        Object objNewInstance = constructor.newInstance(th2);
                        if (objNewInstance == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                        }
                        objB = Result.b((Throwable) objNewInstance);
                        if (Result.i(objB)) {
                            objB = null;
                        }
                        return (Throwable) objB;
                    } catch (Throwable th3) {
                        Result.a aVar2 = Result.f124476c;
                        objB = Result.b(kotlin.t0.a(th3));
                    }
                }
            };
        }
        if (kotlin.jvm.internal.f0.g(cls, String.class)) {
            return new yh.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Throwable invoke(@dl.d Throwable th2) {
                    Object objB;
                    try {
                        Result.a aVar = Result.f124476c;
                        Object objNewInstance = constructor.newInstance(th2.getMessage());
                        if (objNewInstance == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                        }
                        Throwable th3 = (Throwable) objNewInstance;
                        th3.initCause(th2);
                        objB = Result.b(th3);
                        if (Result.i(objB)) {
                            objB = null;
                        }
                        return (Throwable) objB;
                    } catch (Throwable th4) {
                        Result.a aVar2 = Result.f124476c;
                        objB = Result.b(kotlin.t0.a(th4));
                    }
                }
            };
        }
        return null;
    }

    private static final int d(Class<?> cls, int i10) {
        do {
            int i11 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    static /* synthetic */ int e(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return d(cls, i10);
    }

    private static final int f(Class<?> cls, int i10) {
        Object objB;
        xh.a.i(cls);
        try {
            Result.a aVar = Result.f124476c;
            objB = Result.b(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (Result.i(objB)) {
            objB = numValueOf;
        }
        return ((Number) objB).intValue();
    }

    private static final yh.l<Throwable, Throwable> g(final yh.l<? super Throwable, ? extends Throwable> lVar) {
        return new yh.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Throwable invoke(@dl.d Throwable th2) {
                Object objB;
                yh.l<Throwable, Throwable> lVar2 = lVar;
                try {
                    Result.a aVar = Result.f124476c;
                    objB = Result.b(lVar2.invoke(th2));
                } catch (Throwable th3) {
                    Result.a aVar2 = Result.f124476c;
                    objB = Result.b(kotlin.t0.a(th3));
                }
                if (Result.i(objB)) {
                    objB = null;
                }
                return (Throwable) objB;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public static final <E extends Throwable> E h(@dl.d E e10) {
        Object objB;
        if (!(e10 instanceof kotlinx.coroutines.k0)) {
            return (E) f130116b.a(e10.getClass()).invoke(e10);
        }
        try {
            Result.a aVar = Result.f124476c;
            objB = Result.b(((kotlinx.coroutines.k0) e10).a());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (E) objB;
    }
}
