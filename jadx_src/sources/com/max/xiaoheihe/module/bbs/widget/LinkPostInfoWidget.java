package com.max.xiaoheihe.module.bbs.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: LinkPostInfoWidget.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public class LinkPostInfoWidget extends ConstraintLayout {
    public static final int M = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ImageView J;

    @e
    private TextView K;

    @e
    private TextView L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public LinkPostInfoWidget(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public LinkPostInfoWidget(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public LinkPostInfoWidget(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        LayoutInflater.from(context).inflate(R.layout.layout_link_post_info, (ViewGroup) this, true);
        this.J = (ImageView) findViewById(R.id.iv_post_img);
        this.K = (TextView) findViewById(R.id.tv_post_author);
        this.L = (TextView) findViewById(R.id.tv_post_info);
    }

    public /* synthetic */ LinkPostInfoWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @e
    public final TextView getMPostAuthorTextView() {
        return this.K;
    }

    @e
    public final ImageView getMPostImageView() {
        return this.J;
    }

    @e
    public final TextView getMPostInfoTextView() {
        return this.L;
    }
}
