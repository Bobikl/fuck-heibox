package com.max.xiaoheihe.module.bbs.component.likecomment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n;
import androidx.compose.runtime.internal.o;
import bb.c;
import bb.d;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;
import lg.a;

/* JADX INFO: compiled from: BBSLinkListLikeCommentBase.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSLinkListLikeCommentBase extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80995g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ShineButton f80996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f80997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f80998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n
    private int f80999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n
    private int f81000f;

    public BBSLinkListLikeCommentBase(@e Context context) {
        this(context, null);
    }

    public BBSLinkListLikeCommentBase(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSLinkListLikeCommentBase(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSLinkListLikeCommentBase(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f80999e = R.color.text_primary_1_color;
        this.f81000f = R.color.text_secondary_2_color;
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28009, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        int iF = ViewUtils.f(getContext(), 20.0f);
        ShineButton shineButton = new ShineButton(getContext());
        this.f80996b = shineButton;
        shineButton.setBtnColor(getContext().getResources().getColor(R.color.text_secondary_2_color));
        ShineButton shineButton2 = this.f80996b;
        View view = null;
        if (shineButton2 == null) {
            f0.S("sb");
            shineButton2 = null;
        }
        shineButton2.setBtnFillColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        ShineButton shineButton3 = this.f80996b;
        if (shineButton3 == null) {
            f0.S("sb");
            shineButton3 = null;
        }
        shineButton3.setAllowRandomColor(false);
        ShineButton shineButton4 = this.f80996b;
        if (shineButton4 == null) {
            f0.S("sb");
            shineButton4 = null;
        }
        shineButton4.setShineCount(6);
        ShineButton shineButton5 = this.f80996b;
        if (shineButton5 == null) {
            f0.S("sb");
            shineButton5 = null;
        }
        shineButton5.setClickAnimDuration(c.b.W8);
        ShineButton shineButton6 = this.f80996b;
        if (shineButton6 == null) {
            f0.S("sb");
            shineButton6 = null;
        }
        shineButton6.setAnimDuration(c.b.W8);
        ShineButton shineButton7 = this.f80996b;
        if (shineButton7 == null) {
            f0.S("sb");
            shineButton7 = null;
        }
        shineButton7.setShineTurnAngle(30.0f);
        ShineButton shineButton8 = this.f80996b;
        if (shineButton8 == null) {
            f0.S("sb");
            shineButton8 = null;
        }
        shineButton8.setShineDistanceMultiple(2.0f);
        ShineButton shineButton9 = this.f80996b;
        if (shineButton9 == null) {
            f0.S("sb");
            shineButton9 = null;
        }
        shineButton9.setSmallShineColor(getContext().getResources().getColor(R.color.transparent));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        View view2 = this.f80996b;
        if (view2 == null) {
            f0.S("sb");
            view2 = null;
        }
        addView(view2, layoutParams);
        this.f80997c = new ImageView(getContext());
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iF, iF);
        View view3 = this.f80997c;
        if (view3 == null) {
            f0.S("iv_icon");
            view3 = null;
        }
        addView(view3, layoutParams2);
        ImageView imageView = this.f80997c;
        if (imageView == null) {
            f0.S("iv_icon");
            imageView = null;
        }
        imageView.setVisibility(8);
        TextView textView = new TextView(getContext());
        this.f80998d = textView;
        d.d(textView, 2);
        TextView textView2 = this.f80998d;
        if (textView2 == null) {
            f0.S("tv_num");
            textView2 = null;
        }
        textView2.setTextSize(ViewUtils.g(getContext(), 13.0f));
        TextView textView3 = this.f80998d;
        if (textView3 == null) {
            f0.S("tv_num");
            textView3 = null;
        }
        textView3.setTextColor(b(false));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = ViewUtils.f(getContext(), 4.0f);
        View view4 = this.f80998d;
        if (view4 == null) {
            f0.S("tv_num");
        } else {
            view = view4;
        }
        addView(view, layoutParams3);
    }

    public final int b(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28022, new Class[]{Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return com.max.xiaoheihe.utils.d.E(z10 ? this.f80999e : this.f81000f);
    }

    public final void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28017, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = null;
        if (z10) {
            ShineButton shineButton = this.f80996b;
            if (shineButton == null) {
                f0.S("sb");
                shineButton = null;
            }
            shineButton.setVisibility(8);
            ImageView imageView2 = this.f80997c;
            if (imageView2 == null) {
                f0.S("iv_icon");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(0);
            return;
        }
        ShineButton shineButton2 = this.f80996b;
        if (shineButton2 == null) {
            f0.S("sb");
            shineButton2 = null;
        }
        shineButton2.setVisibility(0);
        ImageView imageView3 = this.f80997c;
        if (imageView3 == null) {
            f0.S("iv_icon");
        } else {
            imageView = imageView3;
        }
        imageView.setVisibility(8);
    }

    public final void d(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28015, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80998d;
        if (textView == null) {
            f0.S("tv_num");
            textView = null;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    public final int getCheckedColorId() {
        return this.f80999e;
    }

    public final int getNormalColorId() {
        return this.f81000f;
    }

    @dl.d
    public final ImageView getNormalImageView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28019, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80997c;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    public final void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28016, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c(false);
        ShineButton shineButton = this.f80996b;
        TextView textView = null;
        if (shineButton == null) {
            f0.S("sb");
            shineButton = null;
        }
        shineButton.setChecked(z10);
        TextView textView2 = this.f80998d;
        if (textView2 == null) {
            f0.S("tv_num");
        } else {
            textView = textView2;
        }
        textView.setTextColor(b(z10));
    }

    public final void setChecked(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28020, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setChecked(z10, z11, true);
    }

    public final void setChecked(boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28021, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ShineButton shineButton = this.f80996b;
        TextView textView = null;
        if (shineButton == null) {
            f0.S("sb");
            shineButton = null;
        }
        shineButton.setChecked(z10, z11, z12);
        TextView textView2 = this.f80998d;
        if (textView2 == null) {
            f0.S("tv_num");
        } else {
            textView = textView2;
        }
        textView.setTextColor(b(z10));
    }

    public final void setCheckedColorId(int i10) {
        this.f80999e = i10;
    }

    public final void setDarkStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28023, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ShineButton shineButton = this.f80996b;
        ShineButton shineButton2 = null;
        if (shineButton == null) {
            f0.S("sb");
            shineButton = null;
        }
        shineButton.setBtnFillColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white));
        ShineButton shineButton3 = this.f80996b;
        if (shineButton3 == null) {
            f0.S("sb");
        } else {
            shineButton2 = shineButton3;
        }
        shineButton2.setBtnColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha30));
        this.f80999e = R.color.white;
        this.f81000f = R.color.white_alpha30;
    }

    public final void setIconSize(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28011, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ShineButton shineButton = this.f80996b;
        ImageView imageView = null;
        if (shineButton == null) {
            f0.S("sb");
            shineButton = null;
        }
        shineButton.getLayoutParams().width = i10;
        ShineButton shineButton2 = this.f80996b;
        if (shineButton2 == null) {
            f0.S("sb");
            shineButton2 = null;
        }
        shineButton2.getLayoutParams().height = i10;
        ImageView imageView2 = this.f80997c;
        if (imageView2 == null) {
            f0.S("iv_icon");
            imageView2 = null;
        }
        imageView2.getLayoutParams().width = i10;
        ImageView imageView3 = this.f80997c;
        if (imageView3 == null) {
            f0.S("iv_icon");
        } else {
            imageView = imageView3;
        }
        imageView.getLayoutParams().height = i10;
    }

    public final void setNormalColorId(int i10) {
        this.f81000f = i10;
    }

    public final void setNormalIconState(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28018, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = null;
        if (z10) {
            ImageView imageView2 = this.f80997c;
            if (imageView2 == null) {
                f0.S("iv_icon");
            } else {
                imageView = imageView2;
            }
            imageView.clearColorFilter();
            return;
        }
        ImageView imageView3 = this.f80997c;
        if (imageView3 == null) {
            f0.S("iv_icon");
        } else {
            imageView = imageView3;
        }
        imageView.setColorFilter(getContext().getResources().getColor(R.color.text_secondary_2_color));
    }

    public final void setNum(int i10) {
        String string;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28013, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        if (i10 < 10000) {
            TextView textView2 = this.f80998d;
            if (textView2 == null) {
                f0.S("tv_num");
            } else {
                textView = textView2;
            }
            textView.setText(String.valueOf(i10));
            return;
        }
        int i11 = i10 / 10000;
        int i12 = i10 % 10000;
        if (i12 < 1000) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append((char) 19975);
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i11);
            sb3.append(a.f131414g);
            sb3.append(i12 / 1000);
            sb3.append((char) 19975);
            string = sb3.toString();
        }
        TextView textView3 = this.f80998d;
        if (textView3 == null) {
            f0.S("tv_num");
        } else {
            textView = textView3;
        }
        textView.setText(string);
    }

    public final void setNum(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28012, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80998d;
        if (textView == null) {
            f0.S("tv_num");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setNumSize(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 28014, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80998d;
        if (textView == null) {
            f0.S("tv_num");
            textView = null;
        }
        textView.setTextSize(1, f10);
    }

    public final void setShapeResource(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28010, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ShineButton shineButton = this.f80996b;
        if (shineButton == null) {
            f0.S("sb");
            shineButton = null;
        }
        shineButton.setShapeResource(i10);
    }
}
