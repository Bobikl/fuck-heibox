package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {159, 183, bb.c.b.E0}, m = "processNewAnchors$material3_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f11099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f11100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f11101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f11102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f11103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f11104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, kotlin.coroutines.c<? super SwipeableState$processNewAnchors$1> cVar) {
        super(cVar);
        this.f11103f = swipeableState;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.compose.material3.SwipeableState$processNewAnchors$1 for r1v1 'this'  kotlin.coroutines.c
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
            r1.f11102e = r2
            int r2 = r1.f11104g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f11104g = r2
            androidx.compose.material3.SwipeableState<T> r2 = r1.f11103f
            r0 = 0
            java.lang.Object r2 = r2.H(r0, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState$processNewAnchors$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
