package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.content.res.i;
import com.max.hbcustomview.g;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbview.AutoRotatingView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.LinkSpecialTagObj;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserLevelView.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class UserLevelView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f78897e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f78898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BoxAutoPlayView f78899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AutoRotatingView f78900d;

    public UserLevelView(@dl.e Context context) {
        this(context, null);
    }

    public UserLevelView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserLevelView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public UserLevelView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24935, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BoxAutoPlayView boxAutoPlayView = new BoxAutoPlayView(getContext());
        this.f78899c = boxAutoPlayView;
        boxAutoPlayView.setmScrollltr(true);
        BoxAutoPlayView boxAutoPlayView2 = this.f78899c;
        View view = null;
        if (boxAutoPlayView2 == null) {
            f0.S("bv_bg");
            boxAutoPlayView2 = null;
        }
        boxAutoPlayView2.setRadiusZone(5);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 22.0f), ViewUtils.f(getContext(), 10.0f));
        BoxAutoPlayView boxAutoPlayView3 = this.f78899c;
        if (boxAutoPlayView3 == null) {
            f0.S("bv_bg");
            boxAutoPlayView3 = null;
        }
        boxAutoPlayView3.setRadius(ViewUtils.m(getContext(), layoutParams.width, layoutParams.height));
        layoutParams.addRule(13);
        View view2 = this.f78899c;
        if (view2 == null) {
            f0.S("bv_bg");
            view2 = null;
        }
        addView(view2, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 22.0f), ViewUtils.f(getContext(), 10.0f));
        Context context = getContext();
        f0.o(context, "context");
        this.f78900d = new AutoRotatingView(context);
        float fM = ViewUtils.m(getContext(), layoutParams2.width, layoutParams2.height);
        AutoRotatingView autoRotatingView = this.f78900d;
        if (autoRotatingView == null) {
            f0.S("ar_bg");
            autoRotatingView = null;
        }
        autoRotatingView.setDisplayRoundRadius(fM);
        layoutParams2.addRule(13);
        View view3 = this.f78900d;
        if (view3 == null) {
            f0.S("ar_bg");
            view3 = null;
        }
        addView(view3, layoutParams2);
        TextView textView = new TextView(getContext());
        this.f78898b = textView;
        textView.setTextSize(ViewUtils.g(getContext(), 7.0f));
        TextView textView2 = this.f78898b;
        if (textView2 == null) {
            f0.S("tv_level");
            textView2 = null;
        }
        textView2.setTextColor(getContext().getResources().getColor(R.color.white));
        TextView textView3 = this.f78898b;
        if (textView3 == null) {
            f0.S("tv_level");
            textView3 = null;
        }
        textView3.setTextSize(1, 7.0f);
        TextView textView4 = this.f78898b;
        if (textView4 == null) {
            f0.S("tv_level");
            textView4 = null;
        }
        textView4.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 22.0f), ViewUtils.f(getContext(), 10.0f));
        layoutParams3.addRule(13);
        TextView textView5 = this.f78898b;
        if (textView5 == null) {
            f0.S("tv_level");
            textView5 = null;
        }
        textView5.setLayoutParams(layoutParams3);
        View view4 = this.f78898b;
        if (view4 == null) {
            f0.S("tv_level");
        } else {
            view = view4;
        }
        addView(view);
    }

    @qa.a(note = "设置等级")
    public final void setLevel(int i10) {
        int i11;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24936, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f78898b;
        AutoRotatingView autoRotatingView = null;
        BoxAutoPlayView boxAutoPlayView = null;
        AutoRotatingView autoRotatingView2 = null;
        if (textView == null) {
            f0.S("tv_level");
            textView = null;
        }
        com.max.xiaoheihe.utils.d.A1(textView, String.valueOf(i10), false);
        if (22 <= i10 && i10 < 28) {
            BoxAutoPlayView boxAutoPlayView2 = this.f78899c;
            if (boxAutoPlayView2 == null) {
                f0.S("bv_bg");
                boxAutoPlayView2 = null;
            }
            boxAutoPlayView2.setVisibility(0);
            AutoRotatingView autoRotatingView3 = this.f78900d;
            if (autoRotatingView3 == null) {
                f0.S("ar_bg");
                autoRotatingView3 = null;
            }
            autoRotatingView3.setVisibility(8);
            BoxAutoPlayView boxAutoPlayView3 = this.f78899c;
            if (boxAutoPlayView3 == null) {
                f0.S("bv_bg");
                boxAutoPlayView3 = null;
            }
            if (i10 < 24) {
                i11 = R.drawable.user_level_8_bg;
            } else {
                i11 = i10 < 26 ? R.drawable.user_level_9_bg : R.drawable.user_level_10_bg;
            }
            boxAutoPlayView3.setmResId(i11);
            BoxAutoPlayView boxAutoPlayView4 = this.f78899c;
            if (boxAutoPlayView4 == null) {
                f0.S("bv_bg");
                boxAutoPlayView4 = null;
            }
            boxAutoPlayView4.c(ViewUtils.f(getContext(), 10.0f), ViewUtils.f(getContext(), 22.0f));
            BoxAutoPlayView boxAutoPlayView5 = this.f78899c;
            if (boxAutoPlayView5 == null) {
                f0.S("bv_bg");
            } else {
                boxAutoPlayView = boxAutoPlayView5;
            }
            boxAutoPlayView.e();
            return;
        }
        if (i10 <= 27) {
            BoxAutoPlayView boxAutoPlayView6 = this.f78899c;
            if (boxAutoPlayView6 == null) {
                f0.S("bv_bg");
                boxAutoPlayView6 = null;
            }
            boxAutoPlayView6.setVisibility(8);
            AutoRotatingView autoRotatingView4 = this.f78900d;
            if (autoRotatingView4 == null) {
                f0.S("ar_bg");
            } else {
                autoRotatingView = autoRotatingView4;
            }
            autoRotatingView.setVisibility(8);
            return;
        }
        BoxAutoPlayView boxAutoPlayView7 = this.f78899c;
        if (boxAutoPlayView7 == null) {
            f0.S("bv_bg");
            boxAutoPlayView7 = null;
        }
        boxAutoPlayView7.setVisibility(8);
        AutoRotatingView autoRotatingView5 = this.f78900d;
        if (autoRotatingView5 == null) {
            f0.S("ar_bg");
            autoRotatingView5 = null;
        }
        autoRotatingView5.setVisibility(0);
        AutoRotatingView autoRotatingView6 = this.f78900d;
        if (autoRotatingView6 == null) {
            f0.S("ar_bg");
            autoRotatingView6 = null;
        }
        autoRotatingView6.setRotateSpeed(60.0d);
        AutoRotatingView autoRotatingView7 = this.f78900d;
        if (autoRotatingView7 == null) {
            f0.S("ar_bg");
            autoRotatingView7 = null;
        }
        autoRotatingView7.setRotateItemSize(ViewUtils.f(getContext(), 46.0f), ViewUtils.f(getContext(), 46.0f));
        AutoRotatingView autoRotatingView8 = this.f78900d;
        if (autoRotatingView8 == null) {
            f0.S("ar_bg");
            autoRotatingView8 = null;
        }
        autoRotatingView8.setRotateDrawable((BitmapDrawable) i.g(getResources(), R.drawable.user_level_28_29_bg, null));
        AutoRotatingView autoRotatingView9 = this.f78900d;
        if (autoRotatingView9 == null) {
            f0.S("ar_bg");
        } else {
            autoRotatingView2 = autoRotatingView9;
        }
        autoRotatingView2.j();
    }

    public final void setSpecialTag(@dl.e LinkSpecialTagObj linkSpecialTagObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{linkSpecialTagObj}, this, changeQuickRedirect, false, 24937, new Class[]{LinkSpecialTagObj.class}, Void.TYPE).isSupported || linkSpecialTagObj == null) {
            return;
        }
        TextView textView = this.f78898b;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_level");
            textView = null;
        }
        textView.getLayoutParams().width = -2;
        TextView textView3 = this.f78898b;
        if (textView3 == null) {
            f0.S("tv_level");
            textView3 = null;
        }
        textView3.getLayoutParams().height = -2;
        TextView textView4 = new TextView(getContext());
        textView4.setTextSize(1, 8.0f);
        textView4.setIncludeFontPadding(false);
        textView4.setTypeface(com.max.hbcommon.utils.c.x(linkSpecialTagObj.is_bold()) ? com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c) : com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        String corner_radius = linkSpecialTagObj.getCorner_radius();
        int iF = !(corner_radius == null || corner_radius.length() == 0) ? ViewUtils.f(getContext(), n.p(linkSpecialTagObj.getCorner_radius())) : ViewUtils.f(getContext(), 1.0f);
        String start_color = linkSpecialTagObj.getStart_color();
        int iE1 = !(start_color == null || start_color.length() == 0) ? com.max.xiaoheihe.utils.d.e1(linkSpecialTagObj.getStart_color()) : com.max.xiaoheihe.utils.d.e1(linkSpecialTagObj.getColor());
        String end_color = linkSpecialTagObj.getEnd_color();
        int iE2 = !(end_color == null || end_color.length() == 0) ? com.max.xiaoheihe.utils.d.e1(linkSpecialTagObj.getEnd_color()) : com.max.xiaoheihe.utils.d.e1(linkSpecialTagObj.getColor());
        String padding_hor = linkSpecialTagObj.getPadding_hor();
        int iF2 = !(padding_hor == null || padding_hor.length() == 0) ? ViewUtils.f(getContext(), n.p(linkSpecialTagObj.getPadding_hor())) : ViewUtils.f(getContext(), 3.0f);
        String padding_ver = linkSpecialTagObj.getPadding_ver();
        if (padding_ver != null && padding_ver.length() != 0) {
            z10 = false;
        }
        g gVar = new g(linkSpecialTagObj.getName(), textView4.getPaint(), com.max.xiaoheihe.utils.d.E(R.color.white), iE1, iE2, iF, iF2, !z10 ? ViewUtils.f(getContext(), n.p(linkSpecialTagObj.getPadding_ver())) : ViewUtils.f(getContext(), 1.0f));
        TextView textView5 = this.f78898b;
        if (textView5 == null) {
            f0.S("tv_level");
            textView5 = null;
        }
        textView5.setBackground(gVar);
        TextView textView6 = this.f78898b;
        if (textView6 == null) {
            f0.S("tv_level");
        } else {
            textView2 = textView6;
        }
        textView2.setText("");
    }
}
