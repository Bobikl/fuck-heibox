package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.w;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements yh.p<w<? super Rect>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f1395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ View f1396d;

    /* JADX INFO: compiled from: PipHintTracker.kt */
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w<Rect> f1401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f1403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View.OnLayoutChangeListener f1404e;

        /* JADX WARN: Multi-variable type inference failed */
        a(w<? super Rect> wVar, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f1401b = wVar;
            this.f1402c = view;
            this.f1403d = onScrollChangedListener;
            this.f1404e = onLayoutChangeListener;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View v10) {
            f0.p(v10, "v");
            this.f1401b.v(PipHintTrackerKt.c(this.f1402c));
            this.f1402c.getViewTreeObserver().addOnScrollChangedListener(this.f1403d);
            this.f1402c.addOnLayoutChangeListener(this.f1404e);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View v10) {
            f0.p(v10, "v");
            v10.getViewTreeObserver().removeOnScrollChangedListener(this.f1403d);
            v10.removeOnLayoutChangeListener(this.f1404e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, kotlin.coroutines.c<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> cVar) {
        super(2, cVar);
        this.f1396d = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(w wVar, View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i12 == i16 && i11 == i15 && i13 == i17) {
            return;
        }
        f0.o(v10, "v");
        wVar.v(PipHintTrackerKt.c(v10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(w wVar, View view) {
        wVar.v(PipHintTrackerKt.c(view));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.f1396d, cVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.f1395c = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super Rect> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f1394b;
        if (i10 == 0) {
            t0.n(obj);
            final w wVar = (w) this.f1395c;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.t
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.i(wVar, view, i11, i12, i13, i14, i15, i16, i17, i18);
                }
            };
            final View view = this.f1396d;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.u
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.k(wVar, view);
                }
            };
            final a aVar = new a(wVar, this.f1396d, onScrollChangedListener, onLayoutChangeListener);
            if (androidx.activity.a.f1409a.a(this.f1396d)) {
                wVar.v(PipHintTrackerKt.c(this.f1396d));
                this.f1396d.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.f1396d.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.f1396d.addOnAttachStateChangeListener(aVar);
            final View view2 = this.f1396d;
            yh.a<b2> aVar2 = new yh.a<b2>() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    view2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                    view2.removeOnAttachStateChangeListener(aVar);
                }
            };
            this.f1394b = 1;
            if (ProduceKt.a(wVar, aVar2, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
