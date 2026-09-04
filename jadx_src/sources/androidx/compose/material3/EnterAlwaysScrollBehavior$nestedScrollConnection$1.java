package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"androidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/b;", "Lb1/f;", "available", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "consumed", ak.aF, "(JJI)J", "Ls1/x;", ak.av, "(JJLkotlin/coroutines/c;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1 implements androidx.compose.ui.input.nestedscroll.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ EnterAlwaysScrollBehavior f9369b;

    EnterAlwaysScrollBehavior$nestedScrollConnection$1(EnterAlwaysScrollBehavior enterAlwaysScrollBehavior) {
        this.f9369b = enterAlwaysScrollBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object a(long j10, long j11, @dl.d kotlin.coroutines.c<? super s1.x> cVar) throws Throwable {
        EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1;
        long j12;
        if (cVar instanceof EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
            enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) cVar;
            int i10 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9374f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9374f = i10 - Integer.MIN_VALUE;
            } else {
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, cVar);
            }
        } else {
            enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, cVar);
        }
        Object objA = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9372d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9374f;
        if (i11 != 0) {
            if (i11 == 1) {
                j11 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9371c;
                enterAlwaysScrollBehavior$nestedScrollConnection$1 = (EnterAlwaysScrollBehavior$nestedScrollConnection$1) enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9370b;
                kotlin.t0.n(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9371c;
                kotlin.t0.n(objA);
            }
            return s1.x.b(s1.x.q(j12, ((s1.x) objA).getF139264a()));
        }
        kotlin.t0.n(objA);
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9370b = this;
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9371c = j11;
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9374f = 1;
        objA = androidx.compose.ui.input.nestedscroll.a.a(this, j10, j11, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1);
        if (objA == objH) {
            return objH;
        }
        enterAlwaysScrollBehavior$nestedScrollConnection$1 = this;
        long f139264a = ((s1.x) objA).getF139264a();
        TopAppBarState state = enterAlwaysScrollBehavior$nestedScrollConnection$1.f9369b.getState();
        float fN = s1.x.n(j11);
        androidx.compose.animation.core.x<Float> xVarD = enterAlwaysScrollBehavior$nestedScrollConnection$1.f9369b.d();
        androidx.compose.animation.core.h<Float> hVarC = enterAlwaysScrollBehavior$nestedScrollConnection$1.f9369b.c();
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9370b = null;
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9371c = f139264a;
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f9374f = 2;
        objA = AppBarKt.x(state, fN, xVarD, hVarC, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1);
        if (objA == objH) {
            return objH;
        }
        j12 = f139264a;
        return s1.x.b(s1.x.q(j12, ((s1.x) objA).getF139264a()));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    public long c(long consumed, long available, int source) {
        if (!this.f9369b.e().invoke().booleanValue()) {
            return b1.f.f30364b.e();
        }
        TopAppBarState state = this.f9369b.getState();
        state.g(state.c() + b1.f.r(consumed));
        if (this.f9369b.getState().d() == 0.0f) {
            if ((b1.f.r(consumed) == 0.0f) && b1.f.r(available) > 0.0f) {
                this.f9369b.getState().g(0.0f);
            }
        } else {
            if (this.f9369b.getState().d() == this.f9369b.getState().e()) {
                if (b1.f.r(consumed) == 0.0f) {
                    this.f9369b.getState().g(0.0f);
                }
            }
        }
        this.f9369b.getState().h(this.f9369b.getState().d() + b1.f.r(consumed));
        return b1.f.f30364b.e();
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public /* synthetic */ Object d(long j10, kotlin.coroutines.c cVar) {
        return androidx.compose.ui.input.nestedscroll.a.c(this, j10, cVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long e(long available, int source) {
        if (!this.f9369b.e().invoke().booleanValue()) {
            return b1.f.f30364b.e();
        }
        float fD = this.f9369b.getState().d();
        this.f9369b.getState().h(this.f9369b.getState().d() + b1.f.r(available));
        return !((fD > this.f9369b.getState().d() ? 1 : (fD == this.f9369b.getState().d() ? 0 : -1)) == 0) ? b1.f.i(available, 0.0f, 0.0f, 2, null) : b1.f.f30364b.e();
    }
}
