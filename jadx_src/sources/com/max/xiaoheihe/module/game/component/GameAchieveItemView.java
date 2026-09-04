package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.utils.l;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameAchieveItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameAchieveItemView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f86617l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f86618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f86620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f86621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewGroup f86622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f86623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f86624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ProgressBar f86625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f86626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f86627k;

    public GameAchieveItemView(@e Context context) {
        this(context, null);
    }

    public GameAchieveItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameAchieveItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameAchieveItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36352, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setIv_icon(new ImageView(getContext()));
        int iF = ViewUtils.f(getContext(), 44.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.bottomMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 10.0f);
        getIv_icon().setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(getIv_icon(), layoutParams);
        View.inflate(getContext(), R.layout.view_game_achievement_item_content, this);
        View viewFindViewById = findViewById(R.id.tv_name);
        f0.o(viewFindViewById, "findViewById(R.id.tv_name)");
        setTv_name((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_trophy);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_trophy)");
        setIv_trophy((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_percent_temp);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_percent_temp)");
        setTv_percent_temp((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.vg_item_single_achievement_x_wrapper);
        f0.o(viewFindViewById4, "findViewById(R.id.vg_ite…le_achievement_x_wrapper)");
        setVg_wrapper((ViewGroup) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_time);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_time)");
        setTv_time((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.tv_percent);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_percent)");
        setTv_percent((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.pb_item_single_achievement_x);
        f0.o(viewFindViewById7, "findViewById(R.id.pb_item_single_achievement_x)");
        setPb_achievement((ProgressBar) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_desc)");
        setTv_desc((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.v_item_single_achievement_x_divider);
        f0.o(viewFindViewById9, "findViewById(R.id.v_item…le_achievement_x_divider)");
        setDivider(viewFindViewById9);
    }

    @d
    public final View getDivider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36350, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86627k;
        if (view != null) {
            return view;
        }
        f0.S(SearchHelper.E);
        return null;
    }

    @d
    public final ImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36332, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86618b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @d
    public final ImageView getIv_trophy() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36336, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86620d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_trophy");
        return null;
    }

    @d
    public final ProgressBar getPb_achievement() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36346, new Class[0], ProgressBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressBar) patchProxyResultProxy.result;
        }
        ProgressBar progressBar = this.f86625i;
        if (progressBar != null) {
            return progressBar;
        }
        f0.S("pb_achievement");
        return null;
    }

    @d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36348, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86626j;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36334, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86619c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @d
    public final TextView getTv_percent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36344, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86624h;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_percent");
        return null;
    }

    @d
    public final TextView getTv_percent_temp() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36338, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86621e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_percent_temp");
        return null;
    }

    @d
    public final TextView getTv_time() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36342, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86623g;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_time");
        return null;
    }

    @d
    public final ViewGroup getVg_wrapper() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36340, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86622f;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_wrapper");
        return null;
    }

    public final void setAchieved(boolean z10, float f10, @e String str, @e String str2) {
        ScaleDrawable scaleDrawable;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), str, str2}, this, changeQuickRedirect, false, 36358, new Class[]{Boolean.TYPE, Float.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Pair<Integer, Integer> pairN = l.n(f10);
        Drawable progressDrawable = getPb_achievement().getProgressDrawable();
        f0.n(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        if (z10) {
            getTv_name().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            int iF = ViewUtils.f(getContext(), 2.0f);
            Object obj = pairN.first;
            f0.o(obj, "colorPair.first");
            int iIntValue = ((Number) obj).intValue();
            Object obj2 = pairN.second;
            f0.o(obj2, "colorPair.second");
            scaleDrawable = new ScaleDrawable(ViewUtils.x(iF, iIntValue, ((Number) obj2).intValue()), 3, 1.0f, -1.0f);
            com.max.hbimage.b.d0(str, getIv_icon(), ViewUtils.f(getContext(), 2.0f));
            getTv_time().setVisibility(0);
            getVg_wrapper().setVisibility(0);
            getTv_percent_temp().setVisibility(8);
            getIv_icon().setColorFilter((ColorFilter) null);
        } else {
            getTv_name().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
            scaleDrawable = new ScaleDrawable(ViewUtils.x(ViewUtils.f(getContext(), 2.0f), com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color), com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color)), 3, 1.0f, -1.0f);
            getTv_time().setVisibility(8);
            getVg_wrapper().setVisibility(8);
            getTv_percent_temp().setVisibility(0);
            if (com.max.hbcommon.utils.c.u(str2)) {
                com.max.hbimage.b.d0(str, getIv_icon(), ViewUtils.f(getContext(), 2.0f));
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                getIv_icon().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                com.max.hbimage.b.d0(str, getIv_icon(), ViewUtils.f(getContext(), 2.0f));
            } else {
                getIv_icon().setColorFilter((ColorFilter) null);
                com.max.hbimage.b.d0(str2, getIv_icon(), ViewUtils.f(getContext(), 2.0f));
            }
        }
        layerDrawable.setDrawableByLayerId(android.R.id.progress, scaleDrawable);
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36354, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    public final void setDivider(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36351, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86627k = view;
    }

    public final void setFirstGray(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36356, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.f(getContext(), 0.0f), ViewUtils.f(getContext(), 6.0f), ViewUtils.f(getContext(), 0.0f), ViewUtils.f(getContext(), 0.0f));
            setLayoutParams(marginLayoutParams);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(ViewUtils.f(getContext(), 0.0f), ViewUtils.f(getContext(), 0.0f), ViewUtils.f(getContext(), 0.0f), ViewUtils.f(getContext(), 0.0f));
        setLayoutParams(marginLayoutParams2);
    }

    public final void setIv_icon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36333, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86618b = imageView;
    }

    public final void setIv_trophy(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36337, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86620d = imageView;
    }

    public final void setName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36353, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setText(str);
    }

    public final void setPb_achievement(@d ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{progressBar}, this, changeQuickRedirect, false, 36347, new Class[]{ProgressBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(progressBar, "<set-?>");
        this.f86625i = progressBar;
    }

    public final void setPercent(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36357, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_percent().setText(str);
        getTv_percent_temp().setText(str);
    }

    public final void setTime(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36355, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_time().setText(str);
    }

    public final void setTv_desc(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36349, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86626j = textView;
    }

    public final void setTv_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36335, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86619c = textView;
    }

    public final void setTv_percent(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36345, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86624h = textView;
    }

    public final void setTv_percent_temp(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36339, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86621e = textView;
    }

    public final void setTv_time(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36343, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86623g = textView;
    }

    public final void setVg_wrapper(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36341, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86622f = viewGroup;
    }
}
