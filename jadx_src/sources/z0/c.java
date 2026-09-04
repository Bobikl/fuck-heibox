package z0;

import androidx.compose.runtime.internal.o;
import androidx.compose.runtime.p;
import com.umeng.analytics.pro.ak;
import dl.e;
import fi.l;
import fi.u;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.m;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComposableMethod.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J<\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lz0/c;", "", "Ljava/lang/reflect/Method;", ak.av, "Landroidx/compose/runtime/p;", "composer", "instance", "", "args", "d", "(Landroidx/compose/runtime/p;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "", "hashCode", "b", "()I", "parameterCount", "Ljava/lang/reflect/Parameter;", ak.aF, "()[Ljava/lang/reflect/Parameter;", "parameters", "method", "Lz0/a;", "composableInfo", "<init>", "(Ljava/lang/reflect/Method;Lz0/a;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f141835c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Method f141836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ComposableInfo f141837b;

    public c(@dl.d Method method, @dl.d ComposableInfo composableInfo) {
        f0.p(method, "method");
        f0.p(composableInfo, "composableInfo");
        this.f141836a = method;
        this.f141837b = composableInfo;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Method getF141836a() {
        return this.f141836a;
    }

    public final int b() {
        return this.f141837b.i();
    }

    @dl.d
    public final Parameter[] c() {
        Parameter[] parameters = this.f141836a.getParameters();
        f0.o(parameters, "method.parameters");
        return (Parameter[]) m.M1(parameters, 0, this.f141837b.i());
    }

    @e
    public final Object d(@dl.d p composer, @e Object instance, @dl.d Object... args) {
        Object objH;
        f0.p(composer, "composer");
        f0.p(args, "args");
        ComposableInfo composableInfo = this.f141837b;
        int realParamsCount = composableInfo.getRealParamsCount();
        int changedParams = composableInfo.getChangedParams();
        int defaultParams = composableInfo.getDefaultParams();
        int length = this.f141836a.getParameterTypes().length;
        int i10 = realParamsCount + 1;
        int i11 = changedParams + i10;
        Object[] objArr = new Integer[defaultParams];
        for (int i12 = 0; i12 < defaultParams; i12++) {
            int i13 = i12 * 31;
            l lVarW1 = u.W1(i13, Math.min(i13 + 31, realParamsCount));
            ArrayList arrayList = new ArrayList(t.Y(lVarW1, 10));
            Iterator<Integer> it = lVarW1.iterator();
            while (it.hasNext()) {
                int iNextInt = ((k0) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= args.length || args[iNextInt] == null) ? 1 : 0));
            }
            int iIntValue = 0;
            int i14 = 0;
            for (Object obj : arrayList) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                iIntValue |= ((Number) obj).intValue() << i14;
                i14 = i15;
            }
            objArr[i12] = Integer.valueOf(iIntValue);
        }
        Object[] objArr2 = new Object[length];
        int i16 = 0;
        while (i16 < length) {
            if (i16 >= 0 && i16 < realParamsCount) {
                if (i16 < 0 || i16 > ArraysKt___ArraysKt.Xe(args)) {
                    Class<?> cls = this.f141836a.getParameterTypes()[i16];
                    f0.o(cls, "method.parameterTypes[idx]");
                    objH = d.h(cls);
                } else {
                    objH = args[i16];
                }
            } else if (i16 == realParamsCount) {
                objH = composer;
            } else if (i16 == i10) {
                objH = 1;
            } else if (i10 + 1 <= i16 && i16 < i11) {
                objH = 0;
            } else {
                if (!(i11 <= i16 && i16 < length)) {
                    throw new IllegalStateException("Unexpected index".toString());
                }
                objH = objArr[i16 - i11];
            }
            objArr2[i16] = objH;
            i16++;
        }
        return this.f141836a.invoke(instance, Arrays.copyOf(objArr2, length));
    }

    public boolean equals(@e Object other) {
        if (other instanceof c) {
            return f0.g(this.f141836a, ((c) other).f141836a);
        }
        return false;
    }

    public int hashCode() {
        return this.f141836a.hashCode();
    }
}
