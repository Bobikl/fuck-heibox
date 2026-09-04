package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.u0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/u0;", "Lkotlin/b2;", ak.av, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/q;", "coordinates", androidx.exifinterface.media.a.T4, "", "b", "Z", "wasPositioned", "Lkotlin/coroutines/c;", ak.aF, "Lkotlin/coroutines/c;", "continuation", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class AwaitFirstLayoutModifier implements u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean wasPositioned;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private kotlin.coroutines.c<? super b2> continuation;

    @Override // androidx.compose.ui.layout.u0
    public void W(@dl.d androidx.compose.ui.layout.q coordinates) {
        f0.p(coordinates, "coordinates");
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        kotlin.coroutines.c<? super b2> cVar = this.continuation;
        if (cVar != null) {
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(b2.f124493a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object a(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AwaitFirstLayoutModifier$waitForFirstLayout$1 awaitFirstLayoutModifier$waitForFirstLayout$1;
        kotlin.coroutines.c<? super b2> cVar2;
        if (cVar instanceof AwaitFirstLayoutModifier$waitForFirstLayout$1) {
            awaitFirstLayoutModifier$waitForFirstLayout$1 = (AwaitFirstLayoutModifier$waitForFirstLayout$1) cVar;
            int i10 = awaitFirstLayoutModifier$waitForFirstLayout$1.f6418f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                awaitFirstLayoutModifier$waitForFirstLayout$1.f6418f = i10 - Integer.MIN_VALUE;
            } else {
                awaitFirstLayoutModifier$waitForFirstLayout$1 = new AwaitFirstLayoutModifier$waitForFirstLayout$1(this, cVar);
            }
        } else {
            awaitFirstLayoutModifier$waitForFirstLayout$1 = new AwaitFirstLayoutModifier$waitForFirstLayout$1(this, cVar);
        }
        Object obj = awaitFirstLayoutModifier$waitForFirstLayout$1.f6416d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = awaitFirstLayoutModifier$waitForFirstLayout$1.f6418f;
        if (i11 == 0) {
            t0.n(obj);
            if (!this.wasPositioned) {
                kotlin.coroutines.c<? super b2> cVar3 = this.continuation;
                awaitFirstLayoutModifier$waitForFirstLayout$1.f6414b = this;
                awaitFirstLayoutModifier$waitForFirstLayout$1.f6415c = cVar3;
                awaitFirstLayoutModifier$waitForFirstLayout$1.f6418f = 1;
                kotlin.coroutines.h hVar = new kotlin.coroutines.h(IntrinsicsKt__IntrinsicsJvmKt.d(awaitFirstLayoutModifier$waitForFirstLayout$1));
                this.continuation = hVar;
                Object objA = hVar.a();
                if (objA == kotlin.coroutines.intrinsics.b.h()) {
                    kotlin.coroutines.jvm.internal.f.c(awaitFirstLayoutModifier$waitForFirstLayout$1);
                }
                if (objA == objH) {
                    return objH;
                }
                cVar2 = cVar3;
            }
            return b2.f124493a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar2 = (kotlin.coroutines.c) awaitFirstLayoutModifier$waitForFirstLayout$1.f6415c;
        t0.n(obj);
        if (cVar2 != null) {
            Result.a aVar = Result.f124476c;
            cVar2.resumeWith(Result.b(b2.f124493a));
        }
        return b2.f124493a;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
