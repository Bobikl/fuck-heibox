package androidx.compose.material3.internal;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.u1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.j2;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.g;
import androidx.core.app.o0;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import b1.f;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import s1.h;
import s1.n;
import s1.r;
import s1.s;
import yh.p;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u0010h\u001a\u00020g\u0012\u0006\u0010i\u001a\u000203\u0012\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002J\u0006\u0010\r\u001a\u00020\u0006J(\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J&\u0010\u001e\u001a\u00020\u00062\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0012\u0010\"\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016R\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R/\u0010F\u001a\u0004\u0018\u00010\u000b2\b\u0010@\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER8\u0010M\u001a\u0004\u0018\u00010G2\b\u0010@\u001a\u0004\u0018\u00010G8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bH\u0010A\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010V\u001a\u00020S8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010XRA\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u00112\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010A\u001a\u0004\b]\u0010^\"\u0004\b\u0013\u0010_R$\u0010c\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u00198\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010QR\u0014\u0010f\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/material3/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/k2;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/b2;", "n", "Landroid/view/WindowManager$LayoutParams;", "k", "Landroid/graphics/Rect;", "Ls1/p;", "o", "m", "Landroidx/compose/runtime/r;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "content", "setContent", "(Landroidx/compose/runtime/r;Lyh/p;)V", ak.av, "(Landroidx/compose/runtime/p;I)V", "Landroid/view/KeyEvent;", o0.I0, "", "dispatchKeyEvent", "onDismissRequest", "", "testTag", "p", "q", "l", "Landroid/view/MotionEvent;", "onTouchEvent", "", "setLayoutDirection", "onGlobalLayout", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "Landroid/view/View;", "composeView", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "params", "Landroidx/compose/ui/window/g;", "Landroidx/compose/ui/window/g;", "getPositionProvider", "()Landroidx/compose/ui/window/g;", "setPositionProvider", "(Landroidx/compose/ui/window/g;)V", "positionProvider", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "<set-?>", "Landroidx/compose/runtime/a1;", "getParentBounds", "()Ls1/p;", "setParentBounds", "(Ls1/p;)V", "parentBounds", "Ls1/r;", "r", "getPopupContentSize-bOM6tXw", "()Ls1/r;", "setPopupContentSize-fhxjrPA", "(Ls1/r;)V", "popupContentSize", ak.aB, "Landroidx/compose/runtime/m2;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Ls1/h;", "t", "F", "maxSupportedElevation", ak.aG, "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "v", "tmpWindowVisibleFrame", "x", "getContent", "()Lyh/p;", "(Lyh/p;)V", "y", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Ls1/e;", "density", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "<init>", "(Lyh/a;Ljava/lang/String;Landroid/view/View;Ls1/e;Landroidx/compose/ui/window/g;Ljava/util/UUID;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView implements k2, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private yh.a<b2> f11954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @d
    private String testTag;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @d
    private final View composeView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @d
    private final WindowManager windowManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @d
    private final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d
    private g positionProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d
    private LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d
    private final a1 parentBounds;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d
    private final a1 popupContentSize;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d
    private final m2 canCalculatePosition;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d
    private final Rect previousWindowVisibleFrame;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d
    private final Rect tmpWindowVisibleFrame;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @d
    private final p<f, s1.p, Boolean> f11967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @d
    private final a1 content;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/material3/internal/PopupLayout$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", sd.b.f139384b, "Landroid/graphics/Outline;", "result", "Lkotlin/b2;", "getOutline", "material3_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@d View view, @d Outline result) {
            f0.p(view, "view");
            f0.p(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11972a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f11972a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(@e yh.a<b2> aVar, @d String testTag, @d View composeView, @d s1.e density, @d g initialPositionProvider, @d UUID popupId) {
        f0.p(testTag, "testTag");
        f0.p(composeView, "composeView");
        f0.p(density, "density");
        f0.p(initialPositionProvider, "initialPositionProvider");
        f0.p(popupId, "popupId");
        Context context = composeView.getContext();
        f0.o(context, "composeView.context");
        super(context, null, 0, 6, null);
        this.f11954j = aVar;
        this.testTag = testTag;
        this.composeView = composeView;
        Object systemService = composeView.getContext().getSystemService("window");
        f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = k();
        this.positionProvider = initialPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.parentBounds = h2.g(null, null, 2, null);
        this.popupContentSize = h2.g(null, null, 2, null);
        this.canCalculatePosition = e2.d(new yh.a<Boolean>() { // from class: androidx.compose.material3.internal.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf((this.f11973b.getParentBounds() == null || this.f11973b.m3getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float fG = h.g(8);
        this.maxSupportedElevation = fG;
        this.previousWindowVisibleFrame = new Rect();
        this.tmpWindowVisibleFrame = new Rect();
        this.f11967w = new p<f, s1.p, Boolean>() { // from class: androidx.compose.material3.internal.PopupLayout$dismissOnOutsideClick$1
            @Override // yh.p
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@e f fVar, @d s1.p bounds) {
                f0.p(bounds, "bounds");
                boolean z10 = false;
                if (fVar != null && (f.p(fVar.getF30368a()) < bounds.t() || f.p(fVar.getF30368a()) > bounds.x() || f.r(fVar.getF30368a()) < bounds.getF139243b() || f.r(fVar.getF30368a()) > bounds.j())) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        };
        setId(R.id.content);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(composeView));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(composeView));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(composeView));
        composeView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.E1(fG));
        setOutlineProvider(new a());
        this.content = h2.g(ComposableSingletons$ExposedDropdownMenuPopupKt.f11919a.a(), null, 2, null);
    }

    private final p<androidx.compose.runtime.p, Integer, b2> getContent() {
        return (p) this.content.getValue();
    }

    private final WindowManager.LayoutParams k() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        return layoutParams;
    }

    private final void n(LayoutDirection layoutDirection) {
        int i10 = b.f11972a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    private final s1.p o(Rect rect) {
        return new s1.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar) {
        this.content.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @androidx.compose.runtime.h
    public void a(@e androidx.compose.runtime.p pVar, final int i10) {
        androidx.compose.runtime.p pVarF = pVar.F(-797839545);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-797839545, i10, -1, "androidx.compose.material3.internal.PopupLayout.Content (ExposedDropdownMenuPopup.kt:300)");
        }
        getContent().invoke(pVarF, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.material3.internal.PopupLayout$Content$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@e androidx.compose.runtime.p pVar2, int i11) {
                this.f11970b.a(pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@d KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        f0.p(event, "event");
        if (event.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                yh.a<b2> aVar = this.f11954j;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e
    public final s1.p getParentBounds() {
        return (s1.p) this.parentBounds.getValue();
    }

    @d
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final r m3getPopupContentSizebOM6tXw() {
        return (r) this.popupContentSize.getValue();
    }

    @d
    public final g getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.k2
    @d
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @d
    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.k2
    public /* synthetic */ View getViewRoot() {
        return j2.b(this);
    }

    public final void l() {
        ViewTreeLifecycleOwner.b(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    public final void m() {
        this.windowManager.addView(this, this.params);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (f0.g(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            return;
        }
        q();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    @Override // android.view.View
    public boolean onTouchEvent(@e MotionEvent event) {
        boolean z10;
        f fVarD;
        if (event == null) {
            return super.onTouchEvent(event);
        }
        if ((event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) || event.getAction() == 4) {
            s1.p parentBounds = getParentBounds();
            if (parentBounds != null) {
                p<f, s1.p, Boolean> pVar = this.f11967w;
                if (event.getX() == 0.0f) {
                    if (event.getY() == 0.0f) {
                        fVarD = null;
                    } else {
                        fVarD = f.d(b1.g.a(this.params.x + event.getX(), this.params.y + event.getY()));
                    }
                } else {
                    fVarD = f.d(b1.g.a(this.params.x + event.getX(), this.params.y + event.getY()));
                }
                z10 = pVar.invoke(fVarD, parentBounds).booleanValue();
            }
            if (z10) {
                yh.a<b2> aVar = this.f11954j;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void p(@e yh.a<b2> aVar, @d String testTag, @d LayoutDirection layoutDirection) {
        f0.p(testTag, "testTag");
        f0.p(layoutDirection, "layoutDirection");
        this.f11954j = aVar;
        this.testTag = testTag;
        n(layoutDirection);
    }

    public final void q() {
        r rVarM3getPopupContentSizebOM6tXw;
        s1.p parentBounds = getParentBounds();
        if (parentBounds == null || (rVarM3getPopupContentSizebOM6tXw = m3getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long f139248a = rVarM3getPopupContentSizebOM6tXw.getF139248a();
        Rect rect = this.previousWindowVisibleFrame;
        this.composeView.getWindowVisibleDisplayFrame(rect);
        s1.p pVarO = o(rect);
        long jA = this.positionProvider.a(parentBounds, s.a(pVarO.G(), pVarO.r()), this.parentLayoutDirection, f139248a);
        this.params.x = n.m(jA);
        this.params.y = n.o(jA);
        this.windowManager.updateViewLayout(this, this.params);
    }

    public final void setContent(@d androidx.compose.runtime.r parent, @d p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        f0.p(parent, "parent");
        f0.p(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentBounds(@e s1.p pVar) {
        this.parentBounds.setValue(pVar);
    }

    public final void setParentLayoutDirection(@d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m4setPopupContentSizefhxjrPA(@e r rVar) {
        this.popupContentSize.setValue(rVar);
    }

    public final void setPositionProvider(@d g gVar) {
        f0.p(gVar, "<set-?>");
        this.positionProvider = gVar;
    }

    public final void setTestTag(@d String str) {
        f0.p(str, "<set-?>");
        this.testTag = str;
    }
}
