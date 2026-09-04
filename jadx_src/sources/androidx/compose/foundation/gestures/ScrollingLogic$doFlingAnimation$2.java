package androidx.compose.foundation.gestures;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {bb.c.b.R5}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements yh.p<m, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f5582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f5584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f5585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Ref.LongRef f5586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f5587i;

    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$2$a", "Landroidx/compose/foundation/gestures/m;", "", "pixels", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScrollingLogic f5588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b1.f> f5589b;

        /* JADX WARN: Multi-variable type inference failed */
        a(ScrollingLogic scrollingLogic, yh.l<? super b1.f, b1.f> lVar) {
            this.f5588a = scrollingLogic;
            this.f5589b = lVar;
        }

        @Override // androidx.compose.foundation.gestures.m
        public float a(float pixels) {
            ScrollingLogic scrollingLogic = this.f5588a;
            return scrollingLogic.t(this.f5589b.invoke(b1.f.d(scrollingLogic.u(pixels))).getF30368a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j10, kotlin.coroutines.c<? super ScrollingLogic$doFlingAnimation$2> cVar) {
        super(2, cVar);
        this.f5585g = scrollingLogic;
        this.f5586h = longRef;
        this.f5587i = j10;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(mVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f5585g, this.f5586h, this.f5587i, cVar);
        scrollingLogic$doFlingAnimation$2.f5584f = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        ScrollingLogic scrollingLogic;
        Ref.LongRef longRef;
        ScrollingLogic scrollingLogic2;
        long j10;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5583e;
        if (i10 == 0) {
            t0.n(obj);
            final m mVar = (m) this.f5584f;
            final ScrollingLogic scrollingLogic3 = this.f5585g;
            a aVar = new a(this.f5585g, new yh.l<b1.f, b1.f>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final long a(long j11) {
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    return b1.f.u(j11, scrollingLogic3.o(scrollingLogic4.a(mVar, scrollingLogic4.o(j11), androidx.compose.ui.input.nestedscroll.c.INSTANCE.b())));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b1.f invoke(b1.f fVar) {
                    return b1.f.d(a(fVar.getF30368a()));
                }
            });
            scrollingLogic = this.f5585g;
            Ref.LongRef longRef2 = this.f5586h;
            long j11 = this.f5587i;
            g flingBehavior = scrollingLogic.getFlingBehavior();
            long j12 = longRef2.f124890b;
            float fN = scrollingLogic.n(scrollingLogic.s(j11));
            this.f5584f = scrollingLogic;
            this.f5580b = scrollingLogic;
            this.f5581c = longRef2;
            this.f5582d = j12;
            this.f5583e = 1;
            obj = flingBehavior.a(aVar, fN, this);
            if (obj == objH) {
                return objH;
            }
            longRef = longRef2;
            scrollingLogic2 = scrollingLogic;
            j10 = j12;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f5582d;
            longRef = (Ref.LongRef) this.f5581c;
            scrollingLogic = (ScrollingLogic) this.f5580b;
            scrollingLogic2 = (ScrollingLogic) this.f5584f;
            t0.n(obj);
        }
        longRef.f124890b = scrollingLogic.v(j10, scrollingLogic2.n(((Number) obj).floatValue()));
        return b2.f124493a;
    }
}
