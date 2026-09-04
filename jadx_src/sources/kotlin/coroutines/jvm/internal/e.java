package kotlin.coroutines.jvm.internal;

import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.tencent.qcloud.core.util.IOUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f124721a = 1;

    private static final void a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    private static final d b(BaseContinuationImpl baseContinuationImpl) {
        return (d) baseContinuationImpl.getClass().getAnnotation(d.class);
    }

    private static final int c(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField(BasePuzzleInfo.PUZZLE_TYPE_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @u0(version = "1.3")
    @xh.h(name = "getSpilledVariableFieldMapping")
    @dl.e
    public static final String[] d(@dl.d BaseContinuationImpl baseContinuationImpl) {
        f0.p(baseContinuationImpl, "<this>");
        d dVarB = b(baseContinuationImpl);
        if (dVarB == null) {
            return null;
        }
        a(1, dVarB.v());
        ArrayList arrayList = new ArrayList();
        int iC = c(baseContinuationImpl);
        int[] iArrI = dVarB.i();
        int length = iArrI.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArrI[i10] == iC) {
                arrayList.add(dVarB.s()[i10]);
                arrayList.add(dVarB.n()[i10]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @u0(version = "1.3")
    @xh.h(name = "getStackTraceElement")
    @dl.e
    public static final StackTraceElement e(@dl.d BaseContinuationImpl baseContinuationImpl) {
        String strC;
        f0.p(baseContinuationImpl, "<this>");
        d dVarB = b(baseContinuationImpl);
        if (dVarB == null) {
            return null;
        }
        a(1, dVarB.v());
        int iC = c(baseContinuationImpl);
        int i10 = iC < 0 ? -1 : dVarB.l()[iC];
        String strB = g.f124722a.b(baseContinuationImpl);
        if (strB == null) {
            strC = dVarB.c();
        } else {
            strC = strB + IOUtils.DIR_SEPARATOR_UNIX + dVarB.c();
        }
        return new StackTraceElement(strC, dVarB.m(), dVarB.f(), i10);
    }
}
