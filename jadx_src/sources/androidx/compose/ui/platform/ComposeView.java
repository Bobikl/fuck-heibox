package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\n\u001a\u00020\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bR'\u0010\t\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0002\b\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/b2;", ak.av, "(Landroidx/compose/runtime/p;I)V", "", "getAccessibilityClassName", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "content", "setContent", "(Lyh/p;)V", "Landroidx/compose/runtime/a1;", "j", "Landroidx/compose/runtime/a1;", "", "<set-?>", "k", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f15591l = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1<yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>> content;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ComposeView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ComposeView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ComposeView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        this.content = androidx.compose.runtime.h2.g(null, null, 2, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @androidx.compose.runtime.h
    public void a(@dl.e androidx.compose.runtime.p pVar, final int i10) {
        androidx.compose.runtime.p pVarF = pVar.F(420213850);
        if (ComposerKt.g0()) {
            ComposerKt.w0(420213850, i10, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:402)");
        }
        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> value = this.content.getValue();
        if (value != null) {
            value.invoke(pVarF, 0);
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.ComposeView$Content$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                this.f15594b.a(pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    @dl.d
    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        kotlin.jvm.internal.f0.o(name, "javaClass.name");
        return name;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public final void setContent(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(content);
        if (isAttachedToWindow()) {
            d();
        }
    }
}
