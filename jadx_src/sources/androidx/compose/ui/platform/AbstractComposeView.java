package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Recomposer;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\b\u0002\u0010R\u001a\u00020\u0012¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000f\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0004J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0004J7\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0012H\u0016J\u0012\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u0012H\u0016J\"\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012H\u0016J\u001c\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J$\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J$\u0010+\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)H\u0014J,\u0010+\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020\u0018H\u0014J\b\u0010-\u001a\u00020\u0018H\u0016R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010/R(\u00106\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0003\u00103\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00108R(\u0010=\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010:\"\u0004\b;\u0010<R0\u0010E\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00188F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010>\u0012\u0004\bC\u0010D\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u0018\u0010I\u001a\u00020\u0018*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010@R\u0011\u0010M\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bL\u0010@¨\u0006U"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Lkotlin/b2;", ak.aF, "Landroidx/compose/runtime/r;", "b", "j", "f", "parent", "setParentCompositionContext", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", Constants.KEY_STRATEGY, "setViewCompositionStrategy", ak.av, "(Landroidx/compose/runtime/p;I)V", "d", "e", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", RXScreenCaptureService.KEY_HEIGHT, "(II)V", "", "changed", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "onLayout", "g", "(ZIIII)V", "layoutDirection", "onRtlPropertiesChanged", "Landroid/view/View;", "child", "addView", UCropPlusActivity.ARG_INDEX, "width", "height", "Landroid/view/ViewGroup$LayoutParams;", "params", "addViewInLayout", "preventRequestLayout", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Landroidx/compose/runtime/q;", "Landroidx/compose/runtime/q;", "composition", "Landroidx/compose/runtime/r;", "setParentContext", "(Landroidx/compose/runtime/r;)V", "parentContext", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "creatingComposition", "i", "(Landroidx/compose/runtime/r;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractComposeView extends ViewGroup {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f15412i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private WeakReference<androidx.compose.runtime.r> cachedViewTreeCompositionContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private IBinder previousAttachedWindowToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.q composition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.r parentContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private yh.a<kotlin.b2> f15417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean creatingComposition;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public AbstractComposeView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public AbstractComposeView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public AbstractComposeView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f15417f = ViewCompositionStrategy.INSTANCE.a().a(this);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final androidx.compose.runtime.r b(androidx.compose.runtime.r rVar) {
        androidx.compose.runtime.r rVar2 = i(rVar) ? rVar : null;
        if (rVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(rVar2);
        }
        return rVar;
    }

    private final void c() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = v2.e(this, j(), androidx.compose.runtime.internal.b.c(-656146368, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
                        if ((i10 & 11) == 2 && pVar.b()) {
                            pVar.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:248)");
                        }
                        this.f15420b.a(pVar, 8);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
                        a(pVar, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @androidx.compose.ui.h
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean i(androidx.compose.runtime.r rVar) {
        return !(rVar instanceof Recomposer) || ((Recomposer) rVar).o0().getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    private final androidx.compose.runtime.r j() {
        androidx.compose.runtime.r rVar;
        androidx.compose.runtime.r rVar2 = this.parentContext;
        if (rVar2 != null) {
            return rVar2;
        }
        androidx.compose.runtime.r rVarD = WindowRecomposer_androidKt.d(this);
        androidx.compose.runtime.r rVar3 = null;
        androidx.compose.runtime.r rVarB = rVarD != null ? b(rVarD) : null;
        if (rVarB != null) {
            return rVarB;
        }
        WeakReference<androidx.compose.runtime.r> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference != null && (rVar = weakReference.get()) != null && i(rVar)) {
            rVar3 = rVar;
        }
        androidx.compose.runtime.r rVar4 = rVar3;
        return rVar4 == null ? b(WindowRecomposer_androidKt.h(this)) : rVar4;
    }

    private final void setParentContext(androidx.compose.runtime.r rVar) {
        if (this.parentContext != rVar) {
            this.parentContext = rVar;
            if (rVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            androidx.compose.runtime.q qVar = this.composition;
            if (qVar != null) {
                qVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @androidx.compose.ui.t
    @androidx.compose.runtime.h
    public abstract void a(@dl.e androidx.compose.runtime.p pVar, int i10);

    @Override // android.view.ViewGroup
    public void addView(@dl.e View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(@dl.e View view, int i10) {
        c();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(@dl.e View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup
    public void addView(@dl.e View view, int i10, @dl.e ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@dl.e View view, @dl.e ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@dl.e View child, int index, @dl.e ViewGroup.LayoutParams params) {
        c();
        return super.addViewInLayout(child, index, params);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@dl.e View child, int index, @dl.e ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        c();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    public final void d() {
        if (!(this.parentContext != null || isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        f();
    }

    public final void e() {
        androidx.compose.runtime.q qVar = this.composition;
        if (qVar != null) {
            qVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(@dl.e androidx.compose.runtime.r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.b1) childAt).setShowLayoutBounds(z10);
        }
    }

    public final void setViewCompositionStrategy(@dl.d ViewCompositionStrategy strategy) {
        kotlin.jvm.internal.f0.p(strategy, "strategy");
        yh.a<kotlin.b2> aVar = this.f15417f;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f15417f = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
