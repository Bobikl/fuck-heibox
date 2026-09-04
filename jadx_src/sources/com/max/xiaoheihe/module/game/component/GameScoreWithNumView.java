package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.bg0;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameScoreWithNumView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameScoreWithNumView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f86818l = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public bg0 f86819k;

    public GameScoreWithNumView(@e Context context) {
        this(context, null);
    }

    public GameScoreWithNumView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameScoreWithNumView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36697, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "context");
        setRadius(com.max.accelworld.c.a(3.0f, context));
        setCardElevation(0.0f);
        setCardBackgroundColor(l.h(getContext(), R.color.transparent));
        Context context2 = getContext();
        f0.o(context2, "context");
        bg0 bg0VarC = bg0.c(kb.c.d(context2));
        f0.o(bg0VarC, "inflate(context.layoutInflater())");
        setBinding(bg0VarC);
        addView(getBinding().b());
    }

    @d
    public final bg0 getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36695, new Class[0], bg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bg0) patchProxyResultProxy.result;
        }
        bg0 bg0Var = this.f86819k;
        if (bg0Var != null) {
            return bg0Var;
        }
        f0.S("binding");
        return null;
    }

    public final void setBinding(@d bg0 bg0Var) {
        if (PatchProxy.proxy(new Object[]{bg0Var}, this, changeQuickRedirect, false, 36696, new Class[]{bg0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bg0Var, "<set-?>");
        this.f86819k = bg0Var;
    }

    public final void setData(@e String str, @e String str2, @e String str3, @e String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 36698, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        r1.Q1(this, getBinding().f108961f, getBinding().f108957b, getBinding().f108958c, getBinding().f108959d, str, str2, str3, str4);
    }
}
