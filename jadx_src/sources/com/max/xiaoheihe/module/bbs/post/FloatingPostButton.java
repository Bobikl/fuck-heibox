package com.max.xiaoheihe.module.bbs.post;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbimage.b;
import com.max.hbresource.a;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: FloatingPostButton.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFloatingPostButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingPostButton.kt\ncom/max/xiaoheihe/module/bbs/post/FloatingPostButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,96:1\n162#2,8:97\n*S KotlinDebug\n*F\n+ 1 FloatingPostButton.kt\ncom/max/xiaoheihe/module/bbs/post/FloatingPostButton\n*L\n61#1:97,8\n*E\n"})
@o(parameters = 0)
public final class FloatingPostButton extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81459g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f81460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f81461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f81462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f81463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f81464f;

    public FloatingPostButton(@e Context context) {
        this(context, null);
    }

    public FloatingPostButton(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingPostButton(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public FloatingPostButton(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b(context);
        a(context);
    }

    private final void a(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 28487, new Class[]{Context.class}, Void.TYPE).isSupported || context == null) {
            return;
        }
        GradientDrawable gradientDrawableK = q.k(context, context.getColor(R.color.black_start), context.getColor(R.color.black_end), GradientDrawable.Orientation.BL_TR, new float[]{60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f});
        f0.o(gradientDrawableK, "getGradientRectShapeByCo…, 60f, 60f)\n            )");
        setBackground(gradientDrawableK);
    }

    private final void b(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 28486, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.layout_post_btn, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.ll_post_btn_container);
        f0.o(viewFindViewById, "findViewById(R.id.ll_post_btn_container)");
        this.f81460b = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.iv_icon);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_icon)");
        this.f81461c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_text);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_text)");
        this.f81462d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.vg_icon);
        f0.o(viewFindViewById4, "findViewById(R.id.vg_icon)");
        this.f81463e = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.v_border);
        f0.o(viewFindViewById5, "findViewById(R.id.v_border)");
        this.f81464f = viewFindViewById5;
        TextView textView = null;
        if (i0.s()) {
            String avartar = i0.i().getAccount_detail().getAvartar();
            ImageView imageView = this.f81461c;
            if (imageView == null) {
                f0.S("iv_icon");
                imageView = null;
            }
            b.K(avartar, imageView);
            ImageView imageView2 = this.f81461c;
            if (imageView2 == null) {
                f0.S("iv_icon");
                imageView2 = null;
            }
            imageView2.clearColorFilter();
            View view = this.f81464f;
            if (view == null) {
                f0.S("v_border");
                view = null;
            }
            view.setVisibility(0);
            LinearLayout linearLayout = this.f81460b;
            if (linearLayout == null) {
                f0.S("llContainer");
                linearLayout = null;
            }
            linearLayout.setPadding(ViewUtils.f(context, 24.0f), linearLayout.getPaddingTop(), ViewUtils.f(context, 24.0f), linearLayout.getPaddingBottom());
            View view2 = this.f81463e;
            if (view2 == null) {
                f0.S("vg_icon");
                view2 = null;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = ViewUtils.f(context, 22.0f);
                layoutParams2.height = ViewUtils.f(context, 22.0f);
            } else {
                layoutParams2 = null;
            }
            view2.setLayoutParams(layoutParams2);
        }
        TextView textView2 = this.f81462d;
        if (textView2 == null) {
            f0.S("tv_text");
        } else {
            textView = textView2;
        }
        textView.setTypeface(a.f71893a.a(a.f71895c));
    }

    public final void setIconImage(@d String url) {
        if (PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, 28489, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(url, "url");
        ImageView imageView = this.f81461c;
        if (imageView == null) {
            f0.S("iv_icon");
            imageView = null;
        }
        b.H(url, imageView);
    }

    public final void setText(@e CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 28488, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f81462d;
        if (textView == null) {
            f0.S("tv_text");
            textView = null;
        }
        textView.setText(charSequence);
    }
}
