package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.utils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: BBSLinkImageContentView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSLinkImageContentView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f80797h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QMUIRadiusImageView f80798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QMUIRadiusImageView f80799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f80800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public QMUIRadiusImageView f80801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f80802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f80803g;

    public BBSLinkImageContentView(@e Context context) {
        this(context, null);
    }

    public BBSLinkImageContentView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSLinkImageContentView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSLinkImageContentView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27593, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        this.f80803g = ViewUtils.n(getContext(), ViewUtils.L(getContext()) / 3, ViewUtils.L(getContext()) / 3, ViewUtils.ViewType.IMAGE);
        int iF = ViewUtils.f(getContext(), 0.5f);
        setIv_img0(new QMUIRadiusImageView(getContext()));
        int color = getContext().getResources().getColor(R.color.divider_secondary_1_color);
        int iF2 = ViewUtils.f(getContext(), 80.0f);
        int iF3 = ViewUtils.f(getContext(), 6.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, iF2);
        layoutParams.weight = 1.0f;
        getIv_img0().setScaleType(ImageView.ScaleType.CENTER_CROP);
        getIv_img0().setCornerRadius(this.f80803g);
        getIv_img0().setBorderWidth(iF);
        getIv_img0().setBorderColor(color);
        addView(getIv_img0(), layoutParams);
        setIv_img1(new QMUIRadiusImageView(getContext()));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, iF2);
        layoutParams2.weight = 1.0f;
        layoutParams2.leftMargin = iF3;
        getIv_img1().setScaleType(ImageView.ScaleType.CENTER_CROP);
        getIv_img1().setCornerRadius(this.f80803g);
        getIv_img1().setBorderWidth(iF);
        getIv_img1().setBorderColor(color);
        addView(getIv_img1(), layoutParams2);
        setVg_img2(new RelativeLayout(getContext()));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, iF2);
        layoutParams3.weight = 1.0f;
        layoutParams3.leftMargin = iF3;
        addView(getVg_img2(), layoutParams3);
        setIv_img2(new QMUIRadiusImageView(getContext()));
        getIv_img2().setId(R.id.iv_img2);
        ViewGroup.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        getIv_img2().setScaleType(ImageView.ScaleType.CENTER_CROP);
        getIv_img2().setCornerRadius(this.f80803g);
        getIv_img2().setBorderWidth(iF);
        getIv_img2().setBorderColor(color);
        getVg_img2().addView(getIv_img2(), layoutParams4);
        setTv_img_cnt(new TextView(getContext()));
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(6, R.id.iv_img2);
        layoutParams5.addRule(7, R.id.iv_img2);
        layoutParams5.topMargin = ViewUtils.f(getContext(), 0.5f);
        layoutParams5.rightMargin = ViewUtils.f(getContext(), 0.5f);
        getTv_img_cnt().setBackgroundResource(R.color.black_alpha50);
        int iF4 = ViewUtils.f(getContext(), 3.0f);
        int iF5 = ViewUtils.f(getContext(), 2.5f);
        getTv_img_cnt().setPadding(iF4, iF5, iF4, iF5);
        getTv_img_cnt().setTextColor(getContext().getResources().getColor(R.color.white));
        getTv_img_cnt().setTextSize(1, 10.0f);
        getTv_img_cnt().setIncludeFontPadding(false);
        getTv_img_cnt().setVisibility(8);
        getVg_img2().addView(getTv_img_cnt(), layoutParams5);
    }

    public final int getCornerRadius() {
        return this.f80803g;
    }

    @d
    public final QMUIRadiusImageView getIv_img0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27583, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f80798b;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("iv_img0");
        return null;
    }

    @d
    public final QMUIRadiusImageView getIv_img1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27585, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f80799c;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("iv_img1");
        return null;
    }

    @d
    public final QMUIRadiusImageView getIv_img2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27589, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f80801e;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("iv_img2");
        return null;
    }

    @d
    public final TextView getTv_img_cnt() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27591, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80802f;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_img_cnt");
        return null;
    }

    @d
    public final RelativeLayout getVg_img2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27587, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f80800d;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("vg_img2");
        return null;
    }

    public final void setCornerRadius(int i10) {
        this.f80803g = i10;
    }

    public final void setImages(@e List<String> list, @e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27594, new Class[]{List.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (list != null) {
            int iF = (f0.g(b.f83401f, str) || f0.g(b.f83400e, str)) ? ViewUtils.f(getContext(), 2.0f) : -1;
            int size = list.size();
            String str2 = "";
            for (int i10 = 0; i10 < size; i10++) {
                str2 = str2 + list.get(i10) + ';';
            }
            if (list.size() > 0) {
                int size2 = list.size();
                b.A(list.get(0), getIv_img0(), str2, iF, 0, z10);
                if (size2 > 1) {
                    getIv_img1().setVisibility(0);
                    b.A(list.get(1), getIv_img1(), str2, iF, 1, z10);
                } else {
                    getIv_img1().setVisibility(4);
                }
                if (size2 <= 2) {
                    getVg_img2().setVisibility(4);
                    return;
                }
                getVg_img2().setVisibility(0);
                b.A(list.get(2), getIv_img2(), str2, iF, 2, z10);
                if (size2 <= 3) {
                    getTv_img_cnt().setVisibility(8);
                    return;
                }
                if (f0.g(b.f83401f, str)) {
                    getTv_img_cnt().setBackgroundDrawable(q.H(getContext(), R.color.black_alpha50, ViewUtils.h0(getContext(), this.f80803g)));
                } else {
                    getTv_img_cnt().setBackgroundResource(R.color.text_primary_1_color_alpha80);
                }
                getTv_img_cnt().setVisibility(0);
                if (size2 > 10) {
                    getTv_img_cnt().setText(getContext().getResources().getString(R.string.more_than_ten_images));
                    return;
                }
                TextView tv_img_cnt = getTv_img_cnt();
                v0 v0Var = v0.f124986a;
                String string = getContext().getResources().getString(R.string.img_count_format);
                f0.o(string, "context.resources.getStr….string.img_count_format)");
                String str3 = String.format(string, Arrays.copyOf(new Object[]{size2 + ""}, 1));
                f0.o(str3, "format(format, *args)");
                tv_img_cnt.setText(str3);
            }
        }
    }

    public final void setIv_img0(@d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 27584, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f80798b = qMUIRadiusImageView;
    }

    public final void setIv_img1(@d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 27586, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f80799c = qMUIRadiusImageView;
    }

    public final void setIv_img2(@d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 27590, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f80801e = qMUIRadiusImageView;
    }

    public final void setTv_img_cnt(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27592, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80802f = textView;
    }

    public final void setVg_img2(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 27588, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f80800d = relativeLayout;
    }
}
