package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: QRCodeShareView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class QRCodeShareView extends ConstraintLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    public TextView J;
    public TextView K;
    public ImageView L;
    public LinearLayout M;
    public ImageView N;
    public ImageView O;
    public ImageView P;
    private final int Q;
    private final int R;
    private final int S;
    private final int T;
    private int U;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRCodeShareView(@dl.d Context context) {
        this(context, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRCodeShareView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRCodeShareView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRCodeShareView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.f0.p(context, "context");
        this.Q = ViewUtils.f(getContext(), 14.0f);
        this.R = ViewUtils.f(getContext(), 16.0f);
        this.S = ViewUtils.f(getContext(), 48.0f);
        this.T = ViewUtils.f(getContext(), 72.0f);
        this.U = ViewUtils.f(getContext(), 24.0f);
        D(attributeSet);
        C();
    }

    private final void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ed, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setIv_logo(new ImageView(getContext()));
        if (ob.a.b().t()) {
            getIv_logo().setImageResource(R.drawable.common_max_bottom_logo_black);
        } else {
            getIv_logo().setImageResource(R.drawable.common_logo_65x20);
        }
        ImageView iv_logo = getIv_logo();
        int i10 = R.id.iv_logo;
        iv_logo.setId(i10);
        getIv_logo().setColorFilter(getContext().getResources().getColor(R.color.text_primary_1_color));
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ViewUtils.f(getContext(), 52.0f), ViewUtils.f(getContext(), 16.0f));
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.U;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.Q;
        layoutParams.f19300h = 0;
        layoutParams.f19292d = 0;
        addView(getIv_logo(), layoutParams);
        setVg_game_logo(new LinearLayout(getContext()));
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(ViewUtils.f(getContext(), 52.0f), ViewUtils.f(getContext(), 16.0f));
        layoutParams2.f19294e = i10;
        layoutParams2.f19300h = i10;
        layoutParams2.f19306k = i10;
        addView(getVg_game_logo(), layoutParams2);
        setIv_cross(new ImageView(getContext()));
        getIv_cross().setImageResource(R.drawable.common_close_line_24x24);
        getIv_cross().setColorFilter(com.max.hbcommon.utils.l.a(R.color.background_layer_2_color));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), 6.0f), ViewUtils.f(getContext(), 6.0f));
        layoutParams3.gravity = 16;
        layoutParams3.leftMargin = ViewUtils.f(getContext(), 6.0f);
        layoutParams3.rightMargin = ViewUtils.f(getContext(), 5.0f);
        layoutParams2.f19306k = i10;
        getVg_game_logo().addView(getIv_cross(), layoutParams3);
        setIv_game_logo(new ImageView(getContext()));
        getIv_game_logo().setImageResource(R.drawable.ic_heybox_pubg_logo);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 16;
        getVg_game_logo().addView(getIv_game_logo(), layoutParams4);
        getVg_game_logo().setVisibility(8);
        setTv_desc(new TextView(getContext()));
        TextView tv_desc = getTv_desc();
        int i11 = R.id.tv_desc;
        tv_desc.setId(i11);
        getTv_desc().setTextSize(1, 10.0f);
        getTv_desc().setIncludeFontPadding(false);
        getTv_desc().setText("长按识别二维码下载");
        TextView tv_desc2 = getTv_desc();
        Resources resources = getContext().getResources();
        int i12 = R.color.text_secondary_1_color;
        tv_desc2.setTextColor(resources.getColor(i12));
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = this.U;
        layoutParams5.f19292d = 0;
        layoutParams5.f19306k = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = this.Q;
        addView(getTv_desc(), layoutParams5);
        setTv_title(new TextView(getContext()));
        getTv_title().setTextSize(1, 10.0f);
        getTv_title().setIncludeFontPadding(false);
        getTv_title().setTextColor(getContext().getResources().getColor(i12));
        getTv_title().setText("3亿Steam玩家的必备应用");
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams6.f19304j = i11;
        layoutParams6.f19292d = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = this.U;
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = ViewUtils.f(getContext(), 2.0f);
        addView(getTv_title(), layoutParams6);
        setIv_qrcode(new ImageView(getContext()));
        getIv_qrcode().setImageResource(R.drawable.heybox_2d_barcodes);
        int i13 = this.S;
        ConstraintLayout.LayoutParams layoutParams7 = new ConstraintLayout.LayoutParams(i13, i13);
        ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = this.U;
        int i14 = this.R;
        ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = i14;
        ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = i14;
        layoutParams7.f19306k = 0;
        layoutParams7.f19300h = 0;
        layoutParams7.f19298g = 0;
        addView(getIv_qrcode(), layoutParams7);
    }

    private final void D(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.Fd, new Class[]{AttributeSet.class}, Void.TYPE).isSupported || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.C2);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.U = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.QRCodeShareView_qrCodeHorSpace, this.U);
    }

    public final int getIconSizeBig() {
        return this.T;
    }

    public final int getIconSizeSmall() {
        return this.S;
    }

    @dl.d
    public final ImageView getIv_cross() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ad, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.O;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_cross");
        return null;
    }

    @dl.d
    public final ImageView getIv_game_logo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31662yd, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.N;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_game_logo");
        return null;
    }

    @dl.d
    public final ImageView getIv_logo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31574ud, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.L;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_logo");
        return null;
    }

    @dl.d
    public final ImageView getIv_qrcode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Cd, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.P;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_qrcode");
        return null;
    }

    public final int getSpaceBig() {
        return this.R;
    }

    public final int getSpaceHorizon() {
        return this.U;
    }

    public final int getSpaceSmall() {
        return this.Q;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31486qd, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final TextView getTv_title() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31530sd, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_title");
        return null;
    }

    @dl.d
    public final LinearLayout getVg_game_logo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31618wd, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            return linearLayout;
        }
        kotlin.jvm.internal.f0.S("vg_game_logo");
        return null;
    }

    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Jd, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getIv_logo().setColorFilter(i10);
    }

    public final void setDesc(@dl.d CharSequence text) {
        if (PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, bb.c.d.Id, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(text, "text");
        getTv_desc().setText(text);
    }

    public final void setIv_cross(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.Bd, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.O = imageView;
    }

    public final void setIv_game_logo(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.f31684zd, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.N = imageView;
    }

    public final void setIv_logo(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.f31596vd, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.L = imageView;
    }

    public final void setIv_qrcode(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.Dd, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.P = imageView;
    }

    public final void setLogo(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Kd, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getVg_game_logo().setVisibility(0);
        getIv_game_logo().setImageResource(i10);
    }

    public final void setSpaceHorizon(int i10) {
        this.U = i10;
    }

    public final void setTitle(@dl.d CharSequence text) {
        if (PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, bb.c.d.Hd, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(text, "text");
        getTv_title().setText(text);
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.f31508rd, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.J = textView;
    }

    public final void setTv_title(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.f31552td, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.K = textView;
    }

    public final void setUrl(@dl.d String url) {
        if (PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, bb.c.d.Gd, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(url, "url");
        if (url.length() > 100) {
            getIv_qrcode().getLayoutParams().width = this.T;
            getIv_qrcode().getLayoutParams().height = this.T;
            ViewGroup.LayoutParams layoutParams = getIv_logo().getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).topMargin = this.R;
            getTv_title().setTextSize(1, 11.0f);
            getTv_desc().setTextSize(1, 11.0f);
        } else {
            getIv_qrcode().getLayoutParams().width = this.S;
            getIv_qrcode().getLayoutParams().height = this.S;
            ViewGroup.LayoutParams layoutParams2 = getIv_logo().getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).topMargin = this.Q;
            getTv_title().setTextSize(1, 10.0f);
            getTv_desc().setTextSize(1, 10.0f);
        }
        Bitmap bitmapL = ob.a.b().l(url);
        if (bitmapL != null) {
            getIv_qrcode().setImageBitmap(bitmapL);
        }
    }

    public final void setVg_game_logo(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, bb.c.d.f31640xd, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linearLayout, "<set-?>");
        this.M = linearLayout;
    }
}
