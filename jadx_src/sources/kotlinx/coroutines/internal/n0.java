package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.c1;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\u001a;\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00180\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u001c2\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080Hø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\"\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\"\u0010\u0004\u001a!\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u001e\u0010$\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0014\u0010'\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010&\u001a\u00020%H\u0007\u001a\u0010\u0010)\u001a\u00020(*\u00060\u0012j\u0002`\u0013H\u0000\u001a%\u0010,\u001a\u00020+*\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020(*\u00060\u0012j\u0002`\u00132\n\u0010\u0019\u001a\u00060\u0012j\u0002`\u0013H\u0002\u001a\u0014\u0010/\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000\"\u0014\u00102\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00104\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00101\"\u001c\u00107\u001a\n 5*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00101\"\u001c\u00108\u001a\n 5*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00101*\f\b\u0000\u00109\"\u00020\n2\u00020\n*\f\b\u0000\u0010:\"\u00020\u00122\u00020\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"", androidx.exifinterface.media.a.S4, "exception", "p", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "r", "Lkotlin/coroutines/c;", "continuation", "q", "(Ljava/lang/Throwable;Lkotlin/coroutines/c;)Ljava/lang/Throwable;", "Lkotlin/coroutines/jvm/internal/c;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "o", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/c;)Ljava/lang/Throwable;", ak.aB, "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "f", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lkotlin/Pair;", "", "e", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "recoveredStacktrace", "Lkotlin/b2;", "l", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "m", "(Ljava/lang/Throwable;Lkotlin/coroutines/c;)Ljava/lang/Object;", "t", ak.aG, "g", "", "message", "d", "", "k", "methodName", "", "i", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", RXScreenCaptureService.KEY_HEIGHT, "j", ak.av, "Ljava/lang/String;", "baseContinuationImplClass", "b", "stackTraceRecoveryClass", "kotlin.jvm.PlatformType", ak.aF, "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f130185a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f130186b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f130187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f130188d;

    static {
        Object objB;
        Object objB2;
        try {
            Result.a aVar = Result.f124476c;
            objB = Result.b(Class.forName(f130185a).getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        if (Result.e(objB) != null) {
            objB = f130185a;
        }
        f130187c = (String) objB;
        try {
            Result.a aVar3 = Result.f124476c;
            objB2 = Result.b(n0.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.a aVar4 = Result.f124476c;
            objB2 = Result.b(kotlin.t0.a(th3));
        }
        if (Result.e(objB2) != null) {
            objB2 = f130186b;
        }
        f130188d = (String) objB2;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @dl.d
    @z1
    public static final StackTraceElement d(@dl.d String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    private static final <E extends Throwable> Pair<E, StackTraceElement[]> e(E e10) {
        boolean z10;
        Throwable cause = e10.getCause();
        if (cause == null || !kotlin.jvm.internal.f0.g(cause.getClass(), e10.getClass())) {
            return c1.a(e10, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e10.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (k(stackTraceElement)) {
                z10 = true;
                return z10 ? c1.a(cause, stackTrace) : c1.a(e10, new StackTraceElement[0]);
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    private static final <E extends Throwable> E f(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d("Coroutine boundary"));
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int i10 = i(stackTrace, f130187c);
        int i11 = 0;
        if (i10 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            e11.setStackTrace((StackTraceElement[]) array);
            return e11;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + i10];
        for (int i12 = 0; i12 < i10; i12++) {
            stackTraceElementArr[i12] = stackTrace[i12];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i11 + i10] = it.next();
            i11++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    private static final ArrayDeque<StackTraceElement> g(kotlin.coroutines.jvm.internal.c cVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = cVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = cVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.f0.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.f0.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.f0.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (kotlin.jvm.internal.f0.g(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    public static final void j(@dl.d Throwable th2, @dl.d Throwable th3) {
        th2.initCause(th3);
    }

    public static final boolean k(@dl.d StackTraceElement stackTraceElement) {
        return kotlin.text.u.v2(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    private static final void l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (k(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i11 > length2) {
            return;
        }
        while (true) {
            if (h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i11) {
                return;
            } else {
                length2--;
            }
        }
    }

    @dl.e
    public static final Object m(@dl.d Throwable th2, @dl.d kotlin.coroutines.c<?> cVar) throws Throwable {
        throw th2;
    }

    private static final Object n(Throwable th2, kotlin.coroutines.c<?> cVar) throws Throwable {
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E o(E e10, kotlin.coroutines.jvm.internal.c cVar) {
        Pair pairE = e(e10);
        Throwable th2 = (Throwable) pairE.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairE.b();
        Throwable thS = s(th2);
        if (thS == null) {
            return e10;
        }
        ArrayDeque<StackTraceElement> arrayDequeG = g(cVar);
        if (arrayDequeG.isEmpty()) {
            return e10;
        }
        if (th2 != e10) {
            l(stackTraceElementArr, arrayDequeG);
        }
        return (E) f(th2, thS, arrayDequeG);
    }

    @dl.d
    public static final <E extends Throwable> E p(@dl.d E e10) {
        return e10;
    }

    @dl.d
    public static final <E extends Throwable> E q(@dl.d E e10, @dl.d kotlin.coroutines.c<?> cVar) {
        return e10;
    }

    private static final <E extends Throwable> E r(E e10) {
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int i10 = i(stackTrace, f130188d);
        int i11 = i10 + 1;
        int i12 = i(stackTrace, f130187c);
        int i13 = 0;
        int i14 = (length - i10) - (i12 == -1 ? 0 : length - i12);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i14];
        while (i13 < i14) {
            stackTraceElementArr[i13] = i13 == 0 ? d("Coroutine boundary") : stackTrace[(i11 + i13) - 1];
            i13++;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    private static final <E extends Throwable> E s(E e10) {
        E e11 = (E) ExceptionsConstructorKt.h(e10);
        if (e11 == null) {
            return null;
        }
        if ((e10 instanceof kotlinx.coroutines.k0) || kotlin.jvm.internal.f0.g(e11.getMessage(), e10.getMessage())) {
            return e11;
        }
        return null;
    }

    @dl.d
    public static final <E extends Throwable> E t(@dl.d E e10) {
        return e10;
    }

    @dl.d
    public static final <E extends Throwable> E u(@dl.d E e10) {
        E e11 = (E) e10.getCause();
        if (e11 != null && kotlin.jvm.internal.f0.g(e11.getClass(), e10.getClass())) {
            boolean z10 = false;
            for (StackTraceElement stackTraceElement : e10.getStackTrace()) {
                if (k(stackTraceElement)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return e11;
            }
        }
        return e10;
    }
}
