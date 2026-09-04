package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.MMRInfo;
import com.max.xiaoheihe.module.account.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: Dota2UserItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2UserItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f87218l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QMUIRadiusImageView f87219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f87221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f87222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f87223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f87224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f87225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f87226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f87227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f87228k;

    /* JADX INFO: compiled from: Dota2UserItemView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dota2UserObj f87230c;

        a(Dota2UserObj dota2UserObj) {
            this.f87230c = dota2UserObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37399, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = Dota2UserItemView.this.getContext();
            f0.o(context, "context");
            b.p0(context, null, this.f87230c.getSteam_id());
        }
    }

    public Dota2UserItemView(@e Context context) {
        this(context, null);
    }

    public Dota2UserItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2UserItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2UserItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37395, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_user_item, (ViewGroup) null);
        f0.n(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        View view = (ViewGroup) viewInflate;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 56.0f));
        layoutParams.addRule(15);
        view.setLayoutParams(layoutParams);
        addView(view);
        View viewFindViewById = findViewById(R.id.iv_avatar);
        f0.o(viewFindViewById, "findViewById(R.id.iv_avatar)");
        setIvAvatar((QMUIRadiusImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_name)");
        setTvName((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_win_rate);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_win_rate)");
        setTvWinRate((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.f76248pb);
        f0.o(viewFindViewById4, "findViewById(R.id.pb)");
        setPb((ProgressBar) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_match_num);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_match_num)");
        setTvMatchNum((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.vg_dan);
        f0.o(viewFindViewById6, "findViewById(R.id.vg_dan)");
        setVgDan((FrameLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.iv_dan_icon);
        f0.o(viewFindViewById7, "findViewById(R.id.iv_dan_icon)");
        setIvDanIcon((ImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.tv_dan_number);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_dan_number)");
        setTvDanNumber((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.iv_arrow);
        f0.o(viewFindViewById9, "findViewById(R.id.iv_arrow)");
        setIvArrow((ImageView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.iv_authentication);
        f0.o(viewFindViewById10, "findViewById(R.id.iv_authentication)");
        setIvAuthentication((ImageView) viewFindViewById10);
        setPbStyle(0);
    }

    @d
    public final String b(@e String str) {
        String strL2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37397, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return String.valueOf(n.p((str == null || (strL2 = u.l2(str, "%", "", false, 4, null)) == null) ? null : StringsKt__StringsKt.F5(strL2).toString()) / 100.0f);
    }

    @d
    public final ImageView getIvArrow() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37391, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87227j;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivArrow");
        return null;
    }

    @d
    public final ImageView getIvAuthentication() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37393, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87228k;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivAuthentication");
        return null;
    }

    @d
    public final QMUIRadiusImageView getIvAvatar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37375, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f87219b;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("ivAvatar");
        return null;
    }

    @d
    public final ImageView getIvDanIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37387, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87225h;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivDanIcon");
        return null;
    }

    @d
    public final ProgressBar getPb() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37381, new Class[0], ProgressBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressBar) patchProxyResultProxy.result;
        }
        ProgressBar progressBar = this.f87222e;
        if (progressBar != null) {
            return progressBar;
        }
        f0.S("pb");
        return null;
    }

    @d
    public final TextView getTvDanNumber() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37389, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87226i;
        if (textView != null) {
            return textView;
        }
        f0.S("tvDanNumber");
        return null;
    }

    @d
    public final TextView getTvMatchNum() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37383, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87223f;
        if (textView != null) {
            return textView;
        }
        f0.S("tvMatchNum");
        return null;
    }

    @d
    public final TextView getTvName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37377, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87220c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvName");
        return null;
    }

    @d
    public final TextView getTvWinRate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37379, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87221d;
        if (textView != null) {
            return textView;
        }
        f0.S("tvWinRate");
        return null;
    }

    @d
    public final FrameLayout getVgDan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37385, new Class[0], FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f87224g;
        if (frameLayout != null) {
            return frameLayout;
        }
        f0.S("vgDan");
        return null;
    }

    public final void setData(@e Dota2UserObj dota2UserObj) {
        if (PatchProxy.proxy(new Object[]{dota2UserObj}, this, changeQuickRedirect, false, 37396, new Class[]{Dota2UserObj.class}, Void.TYPE).isSupported || dota2UserObj == null) {
            return;
        }
        com.max.hbimage.b.K(dota2UserObj.getAvatar(), getIvAvatar());
        getTvName().setText(dota2UserObj.getName());
        getTvWinRate().setText(dota2UserObj.getWin_rate());
        setPbStyle(com.max.xiaoheihe.utils.d.F(getContext(), R.color.dota2_tianhui));
        l.f0(b(dota2UserObj.getWin_rate()), getPb());
        getTvMatchNum().setText(dota2UserObj.getMatch_num());
        TextView tvDanNumber = getTvDanNumber();
        MMRInfo mmr_info = dota2UserObj.getMmr_info();
        tvDanNumber.setText(mmr_info != null ? mmr_info.getDan_value() : null);
        MMRInfo mmr_info2 = dota2UserObj.getMmr_info();
        com.max.hbimage.b.K(mmr_info2 != null ? mmr_info2.getDan_icon() : null, getIvDanIcon());
        getIvAuthentication().setVisibility(c.x(dota2UserObj.is_verified()) ? 0 : 8);
        setOnClickListener(new a(dota2UserObj));
    }

    public final void setIvArrow(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37392, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87227j = imageView;
    }

    public final void setIvAuthentication(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37394, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87228k = imageView;
    }

    public final void setIvAvatar(@d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 37376, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f87219b = qMUIRadiusImageView;
    }

    public final void setIvDanIcon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37388, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87225h = imageView;
    }

    public final void setPb(@d ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{progressBar}, this, changeQuickRedirect, false, 37382, new Class[]{ProgressBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(progressBar, "<set-?>");
        this.f87222e = progressBar;
    }

    public final void setPbStyle(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37398, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(getContext(), 2.0f);
        Drawable progressDrawable = getPb().getProgressDrawable();
        f0.n(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        layerDrawable.setDrawableByLayerId(android.R.id.progress, new ScaleDrawable(ViewUtils.G(iF, i10), 3, 1.0f, -1.0f));
        layerDrawable.setDrawableByLayerId(android.R.id.background, ViewUtils.G(iF, com.max.xiaoheihe.utils.d.E(R.color.white_alpha10)));
    }

    public final void setTvDanNumber(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37390, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87226i = textView;
    }

    public final void setTvMatchNum(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37384, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87223f = textView;
    }

    public final void setTvName(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37378, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87220c = textView;
    }

    public final void setTvWinRate(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37380, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87221d = textView;
    }

    public final void setVgDan(@d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 37386, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameLayout, "<set-?>");
        this.f87224g = frameLayout;
    }
}
