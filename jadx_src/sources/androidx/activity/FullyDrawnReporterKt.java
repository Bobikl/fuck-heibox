package androidx.activity;

import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlin.t0;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FullyDrawnReporterKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.b2] */
    @dl.e
    public static final Object a(@dl.d m mVar, @dl.d yh.l<? super kotlin.coroutines.c<? super b2>, ? extends Object> lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FullyDrawnReporterKt$reportWhenComplete$1 fullyDrawnReporterKt$reportWhenComplete$1;
        m mVar2;
        if (cVar instanceof FullyDrawnReporterKt$reportWhenComplete$1) {
            fullyDrawnReporterKt$reportWhenComplete$1 = (FullyDrawnReporterKt$reportWhenComplete$1) cVar;
            int i10 = fullyDrawnReporterKt$reportWhenComplete$1.f1369d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fullyDrawnReporterKt$reportWhenComplete$1.f1369d = i10 - Integer.MIN_VALUE;
            } else {
                fullyDrawnReporterKt$reportWhenComplete$1 = new FullyDrawnReporterKt$reportWhenComplete$1(cVar);
            }
        } else {
            fullyDrawnReporterKt$reportWhenComplete$1 = new FullyDrawnReporterKt$reportWhenComplete$1(cVar);
        }
        Object obj = fullyDrawnReporterKt$reportWhenComplete$1.f1368c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = fullyDrawnReporterKt$reportWhenComplete$1.f1369d;
        try {
            if (i11 == 0) {
                t0.n(obj);
                mVar.c();
                if (mVar.e()) {
                    return b2.f124493a;
                }
                fullyDrawnReporterKt$reportWhenComplete$1.f1367b = mVar;
                fullyDrawnReporterKt$reportWhenComplete$1.f1369d = 1;
                if (lVar.invoke(fullyDrawnReporterKt$reportWhenComplete$1) == objH) {
                    mVar2 = mVar;
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m mVar3 = (m) fullyDrawnReporterKt$reportWhenComplete$1.f1367b;
                t0.n(obj);
                mVar2 = mVar3;
            }
            mVar2 = mVar;
            c0.d(1);
            mVar2.h();
            c0.c(1);
            mVar = b2.f124493a;
            return mVar;
        } catch (Throwable th2) {
            c0.d(1);
            mVar.h();
            c0.c(1);
            throw th2;
        }
    }

    private static final Object b(m mVar, yh.l<? super kotlin.coroutines.c<? super b2>, ? extends Object> lVar, kotlin.coroutines.c<? super b2> cVar) {
        mVar.c();
        if (mVar.e()) {
            return b2.f124493a;
        }
        try {
            lVar.invoke(cVar);
            return b2.f124493a;
        } finally {
            c0.d(1);
            mVar.h();
            c0.c(1);
        }
    }
}
