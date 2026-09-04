package androidx.compose.foundation.gestures;

import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.t0;
import s1.x;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/b;", "Lb1/f;", "available", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "consumed", ak.aF, "(JJI)J", "Ls1/x;", ak.av, "(JJLkotlin/coroutines/c;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements androidx.compose.ui.input.nestedscroll.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ m2<ScrollingLogic> f5561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f5562c;

    ScrollableKt$scrollableNestedScrollConnection$1(m2<ScrollingLogic> m2Var, boolean z10) {
        this.f5561b = m2Var;
        this.f5562c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object a(long j10, long j11, @dl.d kotlin.coroutines.c<? super x> cVar) throws Throwable {
        ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1;
        long jA;
        ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1;
        if (cVar instanceof ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = (ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) cVar;
            int i10 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5567f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5567f = i10 - Integer.MIN_VALUE;
            } else {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, cVar);
            }
        } else {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, cVar);
        }
        Object objB = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5565d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5567f;
        if (i11 == 0) {
            t0.n(objB);
            if (this.f5562c) {
                ScrollingLogic value = this.f5561b.getValue();
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5563b = this;
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5564c = j11;
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5567f = 1;
                objB = value.b(j11, scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1);
                if (objB == objH) {
                    return objH;
                }
                scrollableKt$scrollableNestedScrollConnection$1 = this;
            } else {
                jA = x.f139262b.a();
                scrollableKt$scrollableNestedScrollConnection$1 = this;
            }
            x xVarB = x.b(jA);
            m2<ScrollingLogic> m2Var = scrollableKt$scrollableNestedScrollConnection$1.f5561b;
            xVarB.getF139264a();
            m2Var.getValue().m(false);
            return xVarB;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5564c;
        scrollableKt$scrollableNestedScrollConnection$1 = (ScrollableKt$scrollableNestedScrollConnection$1) scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f5563b;
        t0.n(objB);
        jA = x.p(j11, ((x) objB).getF139264a());
        x xVarB2 = x.b(jA);
        m2<ScrollingLogic> m2Var2 = scrollableKt$scrollableNestedScrollConnection$1.f5561b;
        xVarB2.getF139264a();
        m2Var2.getValue().m(false);
        return xVarB2;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long c(long consumed, long available, int source) {
        return this.f5562c ? this.f5561b.getValue().l(available) : b1.f.f30364b.e();
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public /* synthetic */ Object d(long j10, kotlin.coroutines.c cVar) {
        return androidx.compose.ui.input.nestedscroll.a.c(this, j10, cVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long e(long available, int source) {
        if (androidx.compose.ui.input.nestedscroll.c.g(source, androidx.compose.ui.input.nestedscroll.c.INSTANCE.b())) {
            this.f5561b.getValue().m(true);
        }
        return b1.f.f30364b.e();
    }
}
