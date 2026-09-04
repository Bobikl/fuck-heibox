package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Clickable.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001b\u0010\u0011\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u001b\u0010\u0013\u001a\u00020\u0001*\u00020\f8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlin/Function0;", "", "d", "(Landroidx/compose/runtime/p;I)Lyh/a;", "Landroid/view/View;", "f", "", ak.av, "J", "b", "()J", "TapIndicationDelay", "Landroidx/compose/ui/input/key/b;", "g", "(Landroid/view/KeyEvent;)Z", "isPress", ak.aF, "isClick", "e", "isEnter", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class Clickable_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f4856a = ViewConfiguration.getTapTimeout();

    public static final long b() {
        return f4856a;
    }

    public static final boolean c(@dl.d KeyEvent isClick) {
        kotlin.jvm.internal.f0.p(isClick, "$this$isClick");
        return androidx.compose.ui.input.key.c.g(androidx.compose.ui.input.key.d.b(isClick), androidx.compose.ui.input.key.c.INSTANCE.b()) && e(isClick);
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final yh.a<Boolean> d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1990508712);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1990508712, i10, -1, "androidx.compose.foundation.isComposeRootInScrollableContainer (Clickable.android.kt:34)");
        }
        final View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
        yh.a<Boolean> aVar = new yh.a<Boolean>() { // from class: androidx.compose.foundation.Clickable_androidKt$isComposeRootInScrollableContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Clickable_androidKt.f(view));
            }
        };
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return aVar;
    }

    private static final boolean e(KeyEvent keyEvent) {
        int iB = androidx.compose.ui.input.key.f.b(androidx.compose.ui.input.key.d.a(keyEvent));
        return iB == 23 || iB == 66 || iB == 160;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean g(@dl.d KeyEvent isPress) {
        kotlin.jvm.internal.f0.p(isPress, "$this$isPress");
        return androidx.compose.ui.input.key.c.g(androidx.compose.ui.input.key.d.b(isPress), androidx.compose.ui.input.key.c.INSTANCE.a()) && e(isPress);
    }
}
