package androidx.activity.compose;

import androidx.activity.m;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,176:1\n180#2,10:177\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n*L\n173#1:177,10\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", f = "ReportDrawn.kt", i = {0}, l = {182}, m = "invokeSuspend", n = {"$this$reportWhenComplete$iv"}, s = {"L$0"})
public final class ReportDrawnKt$ReportDrawnAfter$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f1451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f1453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ l<kotlin.coroutines.c<? super b2>, Object> f1454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReportDrawnKt$ReportDrawnAfter$1(m mVar, l<? super kotlin.coroutines.c<? super b2>, ? extends Object> lVar, kotlin.coroutines.c<? super ReportDrawnKt$ReportDrawnAfter$1> cVar) {
        super(2, cVar);
        this.f1453d = mVar;
        this.f1454e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ReportDrawnKt$ReportDrawnAfter$1(this.f1453d, this.f1454e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ReportDrawnKt$ReportDrawnAfter$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        m mVar;
        Throwable th2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f1452c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            m mVar2 = this.f1453d;
            l<kotlin.coroutines.c<? super b2>, Object> lVar = this.f1454e;
            mVar2.c();
            if (!mVar2.e()) {
                try {
                    this.f1451b = mVar2;
                    this.f1452c = 1;
                    if (lVar.invoke(this) == objH) {
                        return objH;
                    }
                    mVar = mVar2;
                    mVar.h();
                } catch (Throwable th3) {
                    mVar = mVar2;
                    th2 = th3;
                    mVar.h();
                    throw th2;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) this.f1451b;
            try {
                kotlin.t0.n(obj);
                mVar.h();
            } catch (Throwable th4) {
                th2 = th4;
                mVar.h();
                throw th2;
            }
        }
        return b2.f124493a;
    }
}
