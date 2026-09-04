package com.max.xiaoheihe.module.bbs.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meituan.robust.ChangeQuickRedirect;
import df.fi0;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: BottomAdsBarConstraintLayout.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BottomAdsBarConstraintLayout extends ConstraintLayout {
    public static final int K = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final fi0 J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public BottomAdsBarConstraintLayout(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public BottomAdsBarConstraintLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public BottomAdsBarConstraintLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        fi0 fi0VarD = fi0.d(LayoutInflater.from(context), this, true);
        f0.o(fi0VarD, "inflate(LayoutInflater.from(context), this, true)");
        this.J = fi0VarD;
    }

    public /* synthetic */ BottomAdsBarConstraintLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @d
    public final fi0 getBinding() {
        return this.J;
    }
}
