package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.upload.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;

/* JADX INFO: compiled from: AvatarView.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nAvatarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarView.kt\ncom/max/xiaoheihe/module/account/component/AvatarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
@o(parameters = 0)
public final class AvatarView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f78816s = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f78817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f78818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f78819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f78820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f78821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f78822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f78823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f78824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f78825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private Drawable f78826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private Drawable f78827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ImageView f78828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RelativeLayout.LayoutParams f78829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f78830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RelativeLayout.LayoutParams f78831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f78832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RelativeLayout.LayoutParams f78833r;

    public AvatarView(@dl.e Context context) {
        super(context);
        this.f78818c = 8.0f;
        b(null, 0);
    }

    public AvatarView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f78818c = 8.0f;
        b(attributeSet, 0);
    }

    public AvatarView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f78818c = 8.0f;
        b(attributeSet, i10);
    }

    public AvatarView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f78818c = 8.0f;
        b(attributeSet, i10);
    }

    private final void b(AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, 24829, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = null;
        if (attributeSet != null) {
            Context context = getContext();
            TypedArray typedArrayObtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, R.styleable.f76408z, i10, 0) : null;
            if (typedArrayObtainStyledAttributes != null) {
                this.f78826k = typedArrayObtainStyledAttributes.getDrawable(0);
                this.f78827l = typedArrayObtainStyledAttributes.getDrawable(5);
                this.f78822g = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
                this.f78823h = typedArrayObtainStyledAttributes.getFloat(4, 0.0f);
                this.f78824i = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
                this.f78825j = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                this.f78819d = typedArrayObtainStyledAttributes.getFloat(6, 0.0f);
                this.f78821f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
                this.f78817b = typedArrayObtainStyledAttributes.getBoolean(8, false);
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        ImageView imageView = new ImageView(getContext());
        this.f78828m = imageView;
        if (this.f78826k != null) {
            imageView.setImageDrawable(this.f78826k);
        } else {
            imageView.setImageResource(R.drawable.common_default_avatar_40x40);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        this.f78829n = layoutParams2;
        ic.a aVar = ic.a.f119343a;
        Context context2 = getContext();
        f0.o(context2, "context");
        layoutParams2.setMarginStart(aVar.a(context2, this.f78822g));
        RelativeLayout.LayoutParams layoutParams3 = this.f78829n;
        if (layoutParams3 == null) {
            f0.S("avatarLP");
            layoutParams3 = null;
        }
        Context context3 = getContext();
        f0.o(context3, "context");
        layoutParams3.topMargin = aVar.a(context3, this.f78823h);
        RelativeLayout.LayoutParams layoutParams4 = this.f78829n;
        if (layoutParams4 == null) {
            f0.S("avatarLP");
            layoutParams4 = null;
        }
        Context context4 = getContext();
        f0.o(context4, "context");
        layoutParams4.setMarginEnd(aVar.a(context4, this.f78824i));
        RelativeLayout.LayoutParams layoutParams5 = this.f78829n;
        if (layoutParams5 == null) {
            f0.S("avatarLP");
            layoutParams5 = null;
        }
        Context context5 = getContext();
        f0.o(context5, "context");
        layoutParams5.bottomMargin = aVar.a(context5, this.f78825j);
        RelativeLayout.LayoutParams layoutParams6 = this.f78829n;
        if (layoutParams6 == null) {
            f0.S("avatarLP");
            layoutParams6 = null;
        }
        layoutParams6.addRule(13);
        ImageView imageView2 = this.f78828m;
        if (imageView2 == null) {
            f0.S(g.f93525b);
            imageView2 = null;
        }
        RelativeLayout.LayoutParams layoutParams7 = this.f78829n;
        if (layoutParams7 == null) {
            f0.S("avatarLP");
            layoutParams7 = null;
        }
        addView(imageView2, layoutParams7);
        this.f78830o = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        this.f78831p = layoutParams8;
        Context context6 = getContext();
        f0.o(context6, "context");
        layoutParams8.setMarginStart(aVar.a(context6, this.f78822g));
        RelativeLayout.LayoutParams layoutParams9 = this.f78831p;
        if (layoutParams9 == null) {
            f0.S("decorationLP");
            layoutParams9 = null;
        }
        Context context7 = getContext();
        f0.o(context7, "context");
        layoutParams9.topMargin = aVar.a(context7, this.f78823h);
        RelativeLayout.LayoutParams layoutParams10 = this.f78831p;
        if (layoutParams10 == null) {
            f0.S("decorationLP");
            layoutParams10 = null;
        }
        Context context8 = getContext();
        f0.o(context8, "context");
        layoutParams10.setMarginEnd(aVar.a(context8, this.f78824i));
        RelativeLayout.LayoutParams layoutParams11 = this.f78831p;
        if (layoutParams11 == null) {
            f0.S("decorationLP");
            layoutParams11 = null;
        }
        Context context9 = getContext();
        f0.o(context9, "context");
        layoutParams11.bottomMargin = aVar.a(context9, this.f78825j);
        RelativeLayout.LayoutParams layoutParams12 = this.f78831p;
        if (layoutParams12 == null) {
            f0.S("decorationLP");
            layoutParams12 = null;
        }
        layoutParams12.addRule(13);
        ImageView imageView3 = this.f78830o;
        if (imageView3 == null) {
            f0.S("decoration");
            imageView3 = null;
        }
        RelativeLayout.LayoutParams layoutParams13 = this.f78831p;
        if (layoutParams13 == null) {
            f0.S("decorationLP");
            layoutParams13 = null;
        }
        addView(imageView3, layoutParams13);
        ImageView imageView4 = new ImageView(getContext());
        this.f78832q = imageView4;
        if (this.f78827l != null) {
            imageView4.setImageDrawable(this.f78827l);
        } else {
            imageView4.setImageResource(R.drawable.ic_msg_red_point);
        }
        Context context10 = getContext();
        f0.o(context10, "context");
        int iA = aVar.a(context10, this.f78818c);
        Context context11 = getContext();
        f0.o(context11, "context");
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(iA, aVar.a(context11, this.f78818c));
        this.f78833r = layoutParams14;
        Context context12 = getContext();
        f0.o(context12, "context");
        layoutParams14.topMargin = aVar.a(context12, this.f78821f);
        if (this.f78817b) {
            RelativeLayout.LayoutParams layoutParams15 = this.f78833r;
            if (layoutParams15 == null) {
                f0.S("dotLP");
                layoutParams15 = null;
            }
            layoutParams15.addRule(20);
            RelativeLayout.LayoutParams layoutParams16 = this.f78833r;
            if (layoutParams16 == null) {
                f0.S("dotLP");
                layoutParams16 = null;
            }
            Context context13 = getContext();
            f0.o(context13, "context");
            layoutParams16.setMarginStart(aVar.a(context13, this.f78819d));
        } else {
            RelativeLayout.LayoutParams layoutParams17 = this.f78833r;
            if (layoutParams17 == null) {
                f0.S("dotLP");
                layoutParams17 = null;
            }
            layoutParams17.addRule(21);
            RelativeLayout.LayoutParams layoutParams18 = this.f78833r;
            if (layoutParams18 == null) {
                f0.S("dotLP");
                layoutParams18 = null;
            }
            Context context14 = getContext();
            f0.o(context14, "context");
            layoutParams18.setMarginEnd(aVar.a(context14, this.f78819d));
        }
        ImageView imageView5 = this.f78832q;
        if (imageView5 == null) {
            f0.S(com.google.android.exoplayer2.text.ttml.d.f49816x0);
            imageView5 = null;
        }
        RelativeLayout.LayoutParams layoutParams19 = this.f78833r;
        if (layoutParams19 == null) {
            f0.S("dotLP");
        } else {
            layoutParams = layoutParams19;
        }
        addView(imageView5, layoutParams);
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24838, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f78832q;
        if (imageView == null) {
            f0.S(com.google.android.exoplayer2.text.ttml.d.f49816x0);
            imageView = null;
        }
        imageView.setVisibility(8);
    }

    public final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24835, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78820e = false;
        ic.a aVar = ic.a.f119343a;
        int iF = aVar.f(this);
        RelativeLayout.LayoutParams layoutParams = this.f78829n;
        ImageView imageView = null;
        if (layoutParams == null) {
            f0.S("avatarLP");
            layoutParams = null;
        }
        layoutParams.width = iF;
        RelativeLayout.LayoutParams layoutParams2 = this.f78829n;
        if (layoutParams2 == null) {
            f0.S("avatarLP");
            layoutParams2 = null;
        }
        layoutParams2.height = iF;
        ImageView imageView2 = this.f78828m;
        if (imageView2 == null) {
            f0.S(g.f93525b);
            imageView2 = null;
        }
        imageView2.requestLayout();
        RelativeLayout.LayoutParams layoutParams3 = this.f78833r;
        if (layoutParams3 == null) {
            f0.S("dotLP");
            layoutParams3 = null;
        }
        Context context = getContext();
        f0.o(context, "context");
        layoutParams3.topMargin = aVar.a(context, this.f78821f);
        RelativeLayout.LayoutParams layoutParams4 = this.f78833r;
        if (layoutParams4 == null) {
            f0.S("dotLP");
            layoutParams4 = null;
        }
        Context context2 = getContext();
        f0.o(context2, "context");
        layoutParams4.setMarginEnd(aVar.a(context2, this.f78819d));
        ImageView imageView3 = this.f78832q;
        if (imageView3 == null) {
            f0.S(com.google.android.exoplayer2.text.ttml.d.f49816x0);
        } else {
            imageView = imageView3;
        }
        imageView.requestLayout();
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24834, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78820e = true;
        ic.a aVar = ic.a.f119343a;
        int iF = (int) ((aVar.f(this) * 5.0f) / 7.0f);
        RelativeLayout.LayoutParams layoutParams = this.f78829n;
        ImageView imageView = null;
        if (layoutParams == null) {
            f0.S("avatarLP");
            layoutParams = null;
        }
        layoutParams.width = iF;
        RelativeLayout.LayoutParams layoutParams2 = this.f78829n;
        if (layoutParams2 == null) {
            f0.S("avatarLP");
            layoutParams2 = null;
        }
        layoutParams2.height = iF;
        ImageView imageView2 = this.f78828m;
        if (imageView2 == null) {
            f0.S(g.f93525b);
            imageView2 = null;
        }
        imageView2.requestLayout();
        RelativeLayout.LayoutParams layoutParams3 = this.f78833r;
        if (layoutParams3 == null) {
            f0.S("dotLP");
            layoutParams3 = null;
        }
        int iF2 = aVar.f(this) / 7;
        Context context = getContext();
        f0.o(context, "context");
        layoutParams3.topMargin = iF2 + aVar.a(context, this.f78821f);
        RelativeLayout.LayoutParams layoutParams4 = this.f78833r;
        if (layoutParams4 == null) {
            f0.S("dotLP");
            layoutParams4 = null;
        }
        int iF3 = aVar.f(this) / 7;
        Context context2 = getContext();
        f0.o(context2, "context");
        layoutParams4.setMarginEnd(iF3 + aVar.a(context2, this.f78819d));
        ImageView imageView3 = this.f78832q;
        if (imageView3 == null) {
            f0.S(com.google.android.exoplayer2.text.ttml.d.f49816x0);
        } else {
            imageView = imageView3;
        }
        imageView.requestLayout();
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24837, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f78832q;
        if (imageView == null) {
            f0.S(com.google.android.exoplayer2.text.ttml.d.f49816x0);
            imageView = null;
        }
        imageView.setVisibility(0);
    }

    @qa.a(note = "设置头像url")
    public final void setAvatar(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24830, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f78828m;
        ImageView imageView2 = null;
        if (imageView == null) {
            f0.S(g.f93525b);
            imageView = null;
        }
        com.max.hbimage.b.c(imageView);
        ImageView imageView3 = this.f78828m;
        if (imageView3 == null) {
            f0.S(g.f93525b);
        } else {
            imageView2 = imageView3;
        }
        com.max.hbimage.b.V(str, imageView2, R.drawable.common_default_avatar_40x40);
    }

    public final void setAvatarBitmap(@dl.d Bitmap avatarBitmap) {
        if (PatchProxy.proxy(new Object[]{avatarBitmap}, this, changeQuickRedirect, false, 24831, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(avatarBitmap, "avatarBitmap");
        ImageView imageView = this.f78828m;
        if (imageView == null) {
            f0.S(g.f93525b);
            imageView = null;
        }
        imageView.setImageBitmap(avatarBitmap);
    }

    public final void setDecoration(@dl.e AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj}, this, changeQuickRedirect, false, 24833, new Class[]{AvatarDecorationObj.class}, Void.TYPE).isSupported) {
            return;
        }
        d();
        ImageView imageView = this.f78830o;
        ImageView imageView2 = null;
        if (imageView == null) {
            f0.S("decoration");
            imageView = null;
        }
        com.max.hbimage.b.c(imageView);
        if (avatarDecorationObj == null) {
            ImageView imageView3 = this.f78830o;
            if (imageView3 == null) {
                f0.S("decoration");
                imageView3 = null;
            }
            imageView3.setImageDrawable(null);
            return;
        }
        if (u.L1("svga", avatarDecorationObj.getSrc_type(), true) || com.max.hbcommon.utils.c.u(avatarDecorationObj.getSrc_url())) {
            return;
        }
        String src_url = avatarDecorationObj.getSrc_url();
        ImageView imageView4 = this.f78830o;
        if (imageView4 == null) {
            f0.S("decoration");
        } else {
            imageView2 = imageView4;
        }
        com.max.hbimage.b.K(src_url, imageView2);
    }

    @qa.a(note = "设置头像框url")
    public final void setDecorationUrl(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24832, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        AvatarDecorationObj avatarDecorationObj = new AvatarDecorationObj();
        avatarDecorationObj.setSrc_url(str);
        setDecoration(avatarDecorationObj);
    }

    public final void setDot(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24836, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f78832q;
        if (imageView == null) {
            f0.S(com.google.android.exoplayer2.text.ttml.d.f49816x0);
            imageView = null;
        }
        com.max.hbimage.b.I(str, imageView, R.drawable.ic_msg_red_point);
    }
}
