package androidx.compose.ui.window;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.k;
import androidx.activity.o;
import androidx.activity.q;
import androidx.compose.runtime.r;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.j2;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.o0;
import androidx.core.view.g3;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010'\u001a\u00020%8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Landroidx/activity/k;", "Landroidx/compose/ui/platform/k2;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/b2;", "k", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "l", "Landroidx/compose/runtime/r;", "parentComposition", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "children", "j", "(Landroidx/compose/runtime/r;Lyh/p;)V", "onDismissRequest", "Landroidx/compose/ui/window/b;", "properties", "m", "i", "Landroid/view/MotionEvent;", o0.I0, "", "onTouchEvent", "cancel", "f", "Landroidx/compose/ui/window/b;", "Landroid/view/View;", "g", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/window/DialogLayout;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/window/DialogLayout;", "dialogLayout", "Ls1/h;", "F", "maxSupportedElevation", "", "I", "defaultSoftInputMode", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Ls1/e;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lyh/a;Landroidx/compose/ui/window/b;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Ls1/e;Ljava/util/UUID;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class DialogWrapper extends k implements k2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f17177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.window.b properties;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View composeView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final DialogLayout dialogLayout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int defaultSoftInputMode;

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/window/DialogWrapper$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", sd.b.f139384b, "Landroid/graphics/Outline;", "result", "Lkotlin/b2;", "getOutline", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@dl.d View view, @dl.d Outline result) {
            f0.p(view, "view");
            f0.p(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17184a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f17184a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogWrapper(@dl.d yh.a<b2> onDismissRequest, @dl.d androidx.compose.ui.window.b properties, @dl.d View composeView, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density, @dl.d UUID dialogId) {
        super(new ContextThemeWrapper(composeView.getContext(), (Build.VERSION.SDK_INT >= 31 || properties.getDecorFitsSystemWindows()) ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0, 2, null);
        f0.p(onDismissRequest, "onDismissRequest");
        f0.p(properties, "properties");
        f0.p(composeView, "composeView");
        f0.p(layoutDirection, "layoutDirection");
        f0.p(density, "density");
        f0.p(dialogId, "dialogId");
        this.f17177e = onDismissRequest;
        this.properties = properties;
        this.composeView = composeView;
        float fG = s1.h.g(8);
        this.maxSupportedElevation = fG;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        this.defaultSoftInputMode = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        g3.c(window, this.properties.getDecorFitsSystemWindows());
        Context context = getContext();
        f0.o(context, "context");
        DialogLayout dialogLayout = new DialogLayout(context, window);
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + dialogId);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.E1(fG));
        dialogLayout.setOutlineProvider(new a());
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            f(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.b(dialogLayout, ViewTreeLifecycleOwner.a(composeView));
        ViewTreeViewModelStoreOwner.b(dialogLayout, ViewTreeViewModelStoreOwner.a(composeView));
        ViewTreeSavedStateRegistryOwner.b(dialogLayout, ViewTreeSavedStateRegistryOwner.a(composeView));
        m(this.f17177e, this.properties, layoutDirection);
        q.b(getOnBackPressedDispatcher(), this, false, new l<o, b2>() { // from class: androidx.compose.ui.window.DialogWrapper.2
            {
                super(1);
            }

            public final void a(@dl.d o addCallback) {
                f0.p(addCallback, "$this$addCallback");
                if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                    DialogWrapper.this.f17177e.invoke();
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(o oVar) {
                a(oVar);
                return b2.f124493a;
            }
        }, 2, null);
    }

    private static final void f(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                f(viewGroup2);
            }
        }
    }

    private final void k(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i10 = b.f17184a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i11);
    }

    private final void l(SecureFlagPolicy secureFlagPolicy) {
        boolean zA = i.a(secureFlagPolicy, AndroidPopup_androidKt.i(this.composeView));
        Window window = getWindow();
        f0.m(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @Override // androidx.compose.ui.platform.k2
    @dl.d
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // androidx.compose.ui.platform.k2
    public /* synthetic */ View getViewRoot() {
        return j2.b(this);
    }

    public final void i() {
        this.dialogLayout.e();
    }

    public final void j(@dl.d r parentComposition, @dl.d p<? super androidx.compose.runtime.p, ? super Integer, b2> children) {
        f0.p(parentComposition, "parentComposition");
        f0.p(children, "children");
        this.dialogLayout.setContent(parentComposition, children);
    }

    public final void m(@dl.d yh.a<b2> onDismissRequest, @dl.d androidx.compose.ui.window.b properties, @dl.d LayoutDirection layoutDirection) {
        f0.p(onDismissRequest, "onDismissRequest");
        f0.p(properties, "properties");
        f0.p(layoutDirection, "layoutDirection");
        this.f17177e = onDismissRequest;
        this.properties = properties;
        l(properties.getSecurePolicy());
        k(layoutDirection);
        this.dialogLayout.setUsePlatformDefaultWidth(properties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (properties.getDecorFitsSystemWindows()) {
                Window window = getWindow();
                if (window != null) {
                    window.setSoftInputMode(this.defaultSoftInputMode);
                    return;
                }
                return;
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@dl.d MotionEvent event) {
        f0.p(event, "event");
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.f17177e.invoke();
        }
        return zOnTouchEvent;
    }
}
