package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BBSRankHotView.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nBBSRankHotView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBSRankHotView.kt\ncom/max/xiaoheihe/module/bbs/component/BBSRankHotView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,166:1\n262#2,2:167\n*S KotlinDebug\n*F\n+ 1 BBSRankHotView.kt\ncom/max/xiaoheihe/module/bbs/component/BBSRankHotView\n*L\n72#1:167,2\n*E\n"})
@o(parameters = 0)
public final class BBSRankHotView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f80825i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f80826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f80827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f80828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public QMUIRadiusImageView f80829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f80830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RichStackModelView f80831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f80832h;

    public BBSRankHotView(@e Context context) {
        this(context, null);
    }

    public BBSRankHotView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSRankHotView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSRankHotView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b();
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27648, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.view_bbs_rank_hot, this);
        View viewFindViewById = findViewById(R.id.vg_rank);
        f0.o(viewFindViewById, "findViewById(R.id.vg_rank)");
        this.f80826b = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.vg_title);
        f0.o(viewFindViewById2, "findViewById(R.id.vg_title)");
        this.f80827c = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_rank);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_rank)");
        this.f80828d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.iv_img);
        f0.o(viewFindViewById4, "findViewById(R.id.iv_img)");
        setIv_img((QMUIRadiusImageView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_title);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_title)");
        this.f80830f = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_desc)");
        this.f80831g = (RichStackModelView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.tv_comment);
        f0.o(viewFindViewById7, "findViewById(R.id.tv_comment)");
        this.f80832h = (TextView) viewFindViewById7;
        getIv_img().setCornerRadius(ViewUtils.n(getContext(), ViewUtils.W(getIv_img()), ViewUtils.V(getIv_img()), ViewUtils.ViewType.IMAGE));
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27649, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80828d;
        ViewGroup viewGroup = null;
        if (textView == null) {
            f0.S("tv_rank");
            textView = null;
        }
        textView.setVisibility(8);
        ViewGroup viewGroup2 = this.f80827c;
        if (viewGroup2 == null) {
            f0.S("vg_title");
            viewGroup2 = null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = viewGroup2.getContext();
        f0.o(context, "context");
        marginLayoutParams.setMarginStart(l.c(12.0f, context));
        viewGroup2.setLayoutParams(marginLayoutParams);
        ViewGroup viewGroup3 = this.f80826b;
        if (viewGroup3 == null) {
            f0.S("vg_rank");
        } else {
            viewGroup = viewGroup3;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        Context context2 = viewGroup.getContext();
        f0.o(context2, "context");
        layoutParams2.width = l.c(12.0f, context2);
        viewGroup.setLayoutParams(layoutParams2);
    }

    @d
    public final QMUIRadiusImageView getIv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27646, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f80829e;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("iv_img");
        return null;
    }

    public final void setComment(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27652, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80832h;
        if (textView == null) {
            f0.S("tv_comment");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setIv_img(@d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 27647, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f80829e = qMUIRadiusImageView;
    }

    public final void setRank(int i10) {
        int i11;
        int color;
        Drawable drawableX;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27653, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        if (i10 <= 4) {
            color = getResources().getColor(R.color.white);
            i11 = 14;
            int iF = ViewUtils.f(getContext(), 16.0f);
            int iF2 = ViewUtils.f(getContext(), 14.0f);
            int iM = ViewUtils.m(getContext(), iF, iF2);
            if (i10 == 1) {
                drawableX = ViewUtils.x(iM, com.max.hbcommon.utils.l.a(R.color.orange_start), com.max.hbcommon.utils.l.a(R.color.orange_end));
            } else if (i10 != 2) {
                drawableX = i10 != 3 ? ViewUtils.x(iM, com.max.hbcommon.utils.l.a(R.color.green_start), com.max.hbcommon.utils.l.a(R.color.green_end)) : ViewUtils.x(iM, com.max.hbcommon.utils.l.a(R.color.blue_start), com.max.hbcommon.utils.l.a(R.color.blue_end));
            } else {
                drawableX = ViewUtils.x(iM, com.max.hbcommon.utils.l.a(R.color.purple_start), com.max.hbcommon.utils.l.a(R.color.purple_end));
            }
            TextView textView2 = this.f80828d;
            if (textView2 == null) {
                f0.S("tv_rank");
                textView2 = null;
            }
            textView2.setBackgroundDrawable(drawableX);
            TextView textView3 = this.f80828d;
            if (textView3 == null) {
                f0.S("tv_rank");
                textView3 = null;
            }
            textView3.getLayoutParams().height = iF;
            TextView textView4 = this.f80828d;
            if (textView4 == null) {
                f0.S("tv_rank");
                textView4 = null;
            }
            textView4.getLayoutParams().width = iF2;
        } else {
            int i12 = i10 < 10 ? 16 : 15;
            int color2 = getResources().getColor(R.color.text_secondary_1_color);
            TextView textView5 = this.f80828d;
            if (textView5 == null) {
                f0.S("tv_rank");
                textView5 = null;
            }
            textView5.setBackgroundResource(R.color.transparent);
            TextView textView6 = this.f80828d;
            if (textView6 == null) {
                f0.S("tv_rank");
                textView6 = null;
            }
            textView6.getLayoutParams().height = -2;
            TextView textView7 = this.f80828d;
            if (textView7 == null) {
                f0.S("tv_rank");
                textView7 = null;
            }
            textView7.getLayoutParams().width = -2;
            i11 = i12;
            color = color2;
        }
        TextView textView8 = this.f80828d;
        if (textView8 == null) {
            f0.S("tv_rank");
            textView8 = null;
        }
        textView8.setTextSize(ViewUtils.g(getContext(), i11));
        TextView textView9 = this.f80828d;
        if (textView9 == null) {
            f0.S("tv_rank");
            textView9 = null;
        }
        textView9.setTextColor(color);
        TextView textView10 = this.f80828d;
        if (textView10 == null) {
            f0.S("tv_rank");
        } else {
            textView = textView10;
        }
        textView.setText(String.valueOf(i10));
    }

    public final void setShowReason(@e RichStackModelObj richStackModelObj) {
        if (PatchProxy.proxy(new Object[]{richStackModelObj}, this, changeQuickRedirect, false, 27650, new Class[]{RichStackModelObj.class}, Void.TYPE).isSupported) {
            return;
        }
        RichStackModelView richStackModelView = this.f80831g;
        if (richStackModelView == null) {
            f0.S("tv_desc");
            richStackModelView = null;
        }
        richStackModelView.setRichStackData(richStackModelObj);
    }

    public final void setTitle(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27651, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80830f;
        if (textView == null) {
            f0.S("tv_title");
            textView = null;
        }
        textView.setText(str);
    }
}
