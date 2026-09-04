package z0;

import androidx.compose.runtime.p;
import com.meituan.robust.Constants;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import fi.l;
import fi.u;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u0;

/* JADX INFO: compiled from: ComposableMethod.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u001a\u0012\u0010\n\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\bH\u0002\u001a\f\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0005\u001a*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0006\b\u0000\u0010\r\u0018\u0001*\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0015\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0013\u001a\u00020\u00122\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\b0\u000f\"\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "realValueParams", "thisParams", ak.aF, "d", "Ljava/lang/reflect/Method;", "Lz0/a;", "f", "Ljava/lang/Class;", "", RXScreenCaptureService.KEY_HEIGHT, "Lz0/c;", "b", androidx.exifinterface.media.a.f23244d5, "count", "", "e", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "", "methodName", "args", "g", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lz0/c;", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f141838a = 31;

    @e
    public static final c b(@dl.d Method method) {
        f0.p(method, "<this>");
        ComposableInfo composableInfoF = f(method);
        if (composableInfoF.j()) {
            return new c(method, composableInfoF);
        }
        return null;
    }

    private static final int c(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i10 + i11)) / 10.0d);
    }

    private static final int d(int i10) {
        return (int) Math.ceil(((double) i10) / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] e(T t10, int i10) {
        l lVarW1 = u.W1(0, i10);
        ArrayList arrayList = new ArrayList(t.Y(lVarW1, 10));
        Iterator<Integer> it = lVarW1.iterator();
        while (it.hasNext()) {
            ((k0) it).nextInt();
            arrayList.add(t10);
        }
        f0.y(0, "T?");
        T[] tArr = (T[]) arrayList.toArray(new Object[0]);
        f0.n(tArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ComposableInfo f(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        f0.o(parameterTypes, "parameterTypes");
        int length = parameterTypes.length - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (f0.g(parameterTypes[length], p.class)) {
                break;
            }
            if (i10 < 0) {
                length = -1;
                break;
            }
            length = i10;
        }
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int iC = c(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i11 = length + 1 + iC;
        int length2 = method.getParameterTypes().length;
        int iD = (length2 != i11) != false ? d(length) : 0;
        return new ComposableInfo(i11 + iD == length2, length, iC, iD);
    }

    @dl.d
    public static final c g(@dl.d Class<?> cls, @dl.d String methodName, @dl.d Class<?>... args) throws NoSuchMethodException {
        Method declaredMethod;
        f0.p(cls, "<this>");
        f0.p(methodName, "methodName");
        f0.p(args, "args");
        int iC = c(args.length, 0);
        try {
            u0 u0Var = new u0(3);
            u0Var.b(args);
            u0Var.a(p.class);
            Class cls2 = Integer.TYPE;
            l lVarW1 = u.W1(0, iC);
            ArrayList arrayList = new ArrayList(t.Y(lVarW1, 10));
            Iterator<Integer> it = lVarW1.iterator();
            while (it.hasNext()) {
                ((k0) it).nextInt();
                arrayList.add(cls2);
            }
            Object[] array = arrayList.toArray(new Class[0]);
            f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            u0Var.b(array);
            declaredMethod = cls.getDeclaredMethod(methodName, (Class[]) u0Var.d(new Class[u0Var.c()]));
        } catch (ReflectiveOperationException unused) {
            int iD = d(args.length);
            try {
                u0 u0Var2 = new u0(4);
                u0Var2.b(args);
                u0Var2.a(p.class);
                Class cls3 = Integer.TYPE;
                l lVarW2 = u.W1(0, iC);
                ArrayList arrayList2 = new ArrayList(t.Y(lVarW2, 10));
                Iterator<Integer> it2 = lVarW2.iterator();
                while (it2.hasNext()) {
                    ((k0) it2).nextInt();
                    arrayList2.add(cls3);
                }
                Object[] array2 = arrayList2.toArray(new Class[0]);
                f0.n(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                u0Var2.b(array2);
                Class cls4 = Integer.TYPE;
                l lVarW3 = u.W1(0, iD);
                ArrayList arrayList3 = new ArrayList(t.Y(lVarW3, 10));
                Iterator<Integer> it3 = lVarW3.iterator();
                while (it3.hasNext()) {
                    ((k0) it3).nextInt();
                    arrayList3.add(cls4);
                }
                Object[] array3 = arrayList3.toArray(new Class[0]);
                f0.n(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                u0Var2.b(array3);
                declaredMethod = cls.getDeclaredMethod(methodName, (Class[]) u0Var2.d(new Class[u0Var2.c()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            c cVarB = b(declaredMethod);
            f0.m(cVarB);
            return cVarB;
        }
        throw new NoSuchMethodException(cls.getName() + lg.a.f131414g + methodName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object h(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(Constants.DOUBLE)) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                if (name.equals(Constants.INT)) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals(Constants.BYTE)) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals(Constants.CHAR)) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals(Constants.SHORT)) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }
}
