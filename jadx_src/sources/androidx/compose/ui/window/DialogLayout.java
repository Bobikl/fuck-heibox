package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.r;
import androidx.compose.runtime.u1;
import androidx.compose.ui.platform.AbstractComposeView;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b7\u00108J(\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eRA\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00072\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b\t\u0010%R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010/\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00108\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R\u0014\u00102\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00069"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/c;", "Landroidx/compose/runtime/r;", "parent", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "setContent", "(Landroidx/compose/runtime/r;Lyh/p;)V", "", "widthMeasureSpec", "heightMeasureSpec", RXScreenCaptureService.KEY_HEIGHT, "(II)V", "", "changed", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "g", "(ZIIII)V", ak.av, "(Landroidx/compose/runtime/p;I)V", "Landroid/view/Window;", "j", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "window", "<set-?>", "k", "Landroidx/compose/runtime/a1;", "getContent", "()Lyh/p;", "(Lyh/p;)V", "l", "Z", "getUsePlatformDefaultWidth", "()Z", "setUsePlatformDefaultWidth", "(Z)V", "usePlatformDefaultWidth", "m", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class DialogLayout extends AbstractComposeView implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Window window;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 content;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogLayout(@dl.d Context context, @dl.d Window window) {
        super(context, null, 0, 6, null);
        f0.p(context, "context");
        f0.p(window, "window");
        this.window = window;
        this.content = h2.g(ComposableSingletons$AndroidDialog_androidKt.f17165a.a(), null, 2, null);
    }

    private final p<androidx.compose.runtime.p, Integer, b2> getContent() {
        return (p) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return di.d.L0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return di.d.L0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar) {
        this.content.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @androidx.compose.runtime.h
    public void a(@dl.e androidx.compose.runtime.p pVar, final int i10) {
        androidx.compose.runtime.p pVarF = pVar.F(1735448596);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1735448596, i10, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:270)");
        }
        getContent().invoke(pVarF, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.DialogLayout$Content$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                this.f17175b.a(pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void g(boolean changed, int left, int top, int right, int bottom) {
        super.g(changed, left, top, right, bottom);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    @Override // androidx.compose.ui.window.c
    @dl.d
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.usePlatformDefaultWidth) {
            super.h(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void setContent(@dl.d r parent, @dl.d p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        f0.p(parent, "parent");
        f0.p(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        d();
    }

    public final void setUsePlatformDefaultWidth(boolean z10) {
        this.usePlatformDefaultWidth = z10;
    }
}
