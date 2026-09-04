package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meituan.robust.ChangeQuickRedirect;
import df.i40;

/* JADX INFO: compiled from: RecommendTopicContainer.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class RecommendTopicContainer extends ConstraintLayout {
    public static final int K = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final i40 J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public RecommendTopicContainer(@dl.d Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public RecommendTopicContainer(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public RecommendTopicContainer(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        i40 i40VarB = i40.b(LayoutInflater.from(context), this);
        kotlin.jvm.internal.f0.o(i40VarB, "inflate(LayoutInflater.from(context), this)");
        this.J = i40VarB;
    }

    public /* synthetic */ RecommendTopicContainer(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @dl.d
    public final i40 getBinding() {
        return this.J;
    }
}
