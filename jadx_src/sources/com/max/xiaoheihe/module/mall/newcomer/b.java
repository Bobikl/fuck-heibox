package com.max.xiaoheihe.module.mall.newcomer;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.utils.l;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.NewcomerGameObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.n80;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewcomerDialogGameComponet.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b implements com.max.hbcommon.view.a.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90915b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final NewcomerGameObj f90916a;

    public b(@d NewcomerGameObj game) {
        f0.p(game, "game");
        this.f90916a = game;
    }

    @Override // com.max.hbcommon.view.a.h
    @d
    public ViewGroup.LayoutParams a(@e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42063, new Class[]{Context.class}, ViewGroup.LayoutParams.class);
        return patchProxyResultProxy.isSupported ? (ViewGroup.LayoutParams) patchProxyResultProxy.result : new ViewGroup.LayoutParams(ViewUtils.f(context, 168.0f), ViewUtils.f(context, 201.0f));
    }

    @Override // com.max.hbcommon.view.a.h
    @d
    public View b(@e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42062, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        n80 n80VarC = n80.c(LayoutInflater.from(context));
        f0.o(n80VarC, "inflate(LayoutInflater.from(context))");
        n80VarC.b().setBackground(q.M(q.o(context, R.color.white, 4.0f), context, R.color.divider_secondary_1_color, 0.5f));
        com.max.hbimage.b.K(this.f90916a.getHead_img(), n80VarC.f113734c);
        n80VarC.f113735d.setText(this.f90916a.getName());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l.e(R.string.rmb_symbol) + r1.G(this.f90916a.getPrice()));
        spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder.length(), 33);
        n80VarC.f113737f.setText(spannableStringBuilder);
        n80VarC.f113738g.setText(spannableStringBuilder);
        n80VarC.f113736e.setText(r1.G(this.f90916a.getNew_price()));
        n80VarC.f113741j.setBackground(q.o(context, R.color.interactive_color, 4.0f));
        n80VarC.b().setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ConstraintLayout constraintLayoutB = n80VarC.b();
        f0.o(constraintLayoutB, "viewBinding.root");
        return constraintLayoutB;
    }
}
