package androidx.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,190:1\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {185}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
public final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f1367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f1368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1369d;

    FullyDrawnReporterKt$reportWhenComplete$1(kotlin.coroutines.c<? super FullyDrawnReporterKt$reportWhenComplete$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f1368c = obj;
        this.f1369d |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.a(null, null, this);
    }
}
