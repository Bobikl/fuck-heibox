package androidx.p001datastore.core;

import bb.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {c.b.f30741k5}, m = "writeData$datastore_core", n = {"this", "scratchFile", "stream"}, s = {"L$0", "L$1", "L$4"})
public final class SingleProcessDataStore$writeData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f22168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f22169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f22170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f22171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f22173i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$writeData$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.c<? super SingleProcessDataStore$writeData$1> cVar) {
        super(cVar);
        this.f22172h = singleProcessDataStore;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.datastore.core.SingleProcessDataStore$writeData$1 for r1v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r2) {
        /*
            r1 = this;
            r1.f22171g = r2
            int r2 = r1.f22173i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f22173i = r2
            androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.f22172h
            r0 = 0
            java.lang.Object r2 = r2.A(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p001datastore.core.SingleProcessDataStore$writeData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
