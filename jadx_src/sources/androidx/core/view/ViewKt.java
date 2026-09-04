package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,432:1\n40#1:433\n56#1:434\n329#1,4:438\n43#2,3:435\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n71#1:433\n71#1:434\n315#1:438,4\n238#1:435,3\n*E\n"})
public final class ViewKt {

    /* JADX INFO: compiled from: View.kt */
    @kotlin.jvm.internal.t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n*L\n1#1,432:1\n*E\n"})
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f21313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<View, kotlin.b2> f21314c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(View view, yh.l<? super View, kotlin.b2> lVar) {
            this.f21313b = view;
            this.f21314c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
            this.f21313b.removeOnAttachStateChangeListener(this);
            this.f21314c.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @kotlin.jvm.internal.t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnDetach$1\n*L\n1#1,432:1\n*E\n"})
    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f21319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<View, kotlin.b2> f21320c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view, yh.l<? super View, kotlin.b2> lVar) {
            this.f21319b = view;
            this.f21320c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
            this.f21319b.removeOnAttachStateChangeListener(this);
            this.f21320c.invoke(view);
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @kotlin.jvm.internal.t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,432:1\n72#2,2:433\n*E\n"})
    public static final class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l f21321b;

        public c(yh.l lVar) {
            this.f21321b = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@dl.d View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            kotlin.jvm.internal.f0.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f21321b.invoke(view);
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @kotlin.jvm.internal.t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n*L\n1#1,432:1\n*E\n"})
    public static final class d implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<View, kotlin.b2> f21322b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(yh.l<? super View, kotlin.b2> lVar) {
            this.f21322b = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@dl.d View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            kotlin.jvm.internal.f0.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f21322b.invoke(view);
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @kotlin.jvm.internal.t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n*L\n1#1,432:1\n*E\n"})
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<View, kotlin.b2> f21323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f21324c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(yh.l<? super View, kotlin.b2> lVar, View view) {
            this.f21323b = lVar;
            this.f21324c = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21323b.invoke(this.f21324c);
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @kotlin.jvm.internal.t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n*L\n1#1,432:1\n*E\n"})
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<kotlin.b2> f21325b;

        public f(yh.a<kotlin.b2> aVar) {
            this.f21325b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21325b.invoke();
        }
    }

    public static final void A(@dl.d View view, @dl.d yh.l<? super ViewGroup.LayoutParams, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        block.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @xh.h(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void B(View view, yh.l<? super T, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.f0.y(1, androidx.exifinterface.media.a.f23244d5);
        block.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void C(@dl.d View view, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setPadding(i10, i11, i12, i13);
    }

    public static /* synthetic */ void D(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingLeft();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingRight();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setPadding(i10, i11, i12, i13);
    }

    @androidx.annotation.w0(17)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void E(@dl.d View view, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static /* synthetic */ void F(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingStart();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static final void b(@dl.d View view, @dl.d yh.l<? super View, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        if (j1.O0(view)) {
            action.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new a(view, action));
        }
    }

    public static final void c(@dl.d View view, @dl.d yh.l<? super View, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        if (j1.O0(view)) {
            view.addOnAttachStateChangeListener(new b(view, action));
        } else {
            action.invoke(view);
        }
    }

    public static final void d(@dl.d View view, @dl.d yh.l<? super View, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        if (!j1.U0(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new c(action));
        } else {
            action.invoke(view);
        }
    }

    public static final void e(@dl.d View view, @dl.d yh.l<? super View, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        view.addOnLayoutChangeListener(new d(action));
    }

    @dl.d
    public static final c1 f(@dl.d View view, @dl.d yh.l<? super View, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        c1 c1VarA = c1.a(view, new e(action, view));
        kotlin.jvm.internal.f0.o(c1VarA, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return c1VarA;
    }

    @dl.d
    public static final Bitmap g(@dl.d View view, @dl.d Bitmap.Config config) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(config, "config");
        if (!j1.U0(view)) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        kotlin.jvm.internal.f0.o(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap h(View view, Bitmap.Config config, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return g(view, config);
    }

    @dl.d
    public static final kotlin.sequences.m<View> i(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        return kotlin.sequences.q.b(new ViewKt$allViews$1(view, null));
    }

    @dl.d
    public static final kotlin.sequences.m<ViewParent> j(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        return SequencesKt__SequencesKt.l(view.getParent(), ViewKt$ancestors$1.f21318d);
    }

    public static final int k(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int l(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return s.b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int m(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int n(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int o(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return s.c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int p(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean q(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean r(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean s(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        return view.getVisibility() == 0;
    }

    @dl.d
    public static final Runnable t(@dl.d View view, long j10, @dl.d yh.a<kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        f fVar = new f(action);
        view.postDelayed(fVar, j10);
        return fVar;
    }

    @dl.d
    @androidx.annotation.w0(16)
    public static final Runnable u(@dl.d View view, long j10, @dl.d final yh.a<kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        Runnable runnable = new Runnable() { // from class: androidx.core.view.z2
            @Override // java.lang.Runnable
            public final void run() {
                ViewKt.v(action);
            }
        };
        androidx.core.view.c.a(view, runnable, j10);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(yh.a action) {
        kotlin.jvm.internal.f0.p(action, "$action");
        action.invoke();
    }

    public static final void w(@dl.d View view, boolean z10) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setVisibility(z10 ? 8 : 0);
    }

    public static final void x(@dl.d View view, boolean z10) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setVisibility(z10 ? 4 : 0);
    }

    public static final void y(@dl.d View view, @androidx.annotation.t0 int i10) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setPadding(i10, i10, i10, i10);
    }

    public static final void z(@dl.d View view, boolean z10) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }
}
