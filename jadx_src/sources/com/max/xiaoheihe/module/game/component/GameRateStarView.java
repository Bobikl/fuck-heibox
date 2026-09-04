package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameRateStarView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameRateStarView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86812g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f86813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f86814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f86815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f86816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f86817f;

    public GameRateStarView(@e Context context) {
        this(context, null);
    }

    public GameRateStarView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameRateStarView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameRateStarView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
        b(attributeSet);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36690, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        ImageView imageView = new ImageView(getContext());
        this.f86813b = imageView;
        imageView.setImageResource(R.drawable.ic_rating_star);
        ImageView imageView2 = this.f86813b;
        ImageView imageView3 = null;
        if (imageView2 == null) {
            f0.S("iv_rating_0");
            imageView2 = null;
        }
        addView(imageView2);
        ImageView imageView4 = new ImageView(getContext());
        this.f86814c = imageView4;
        imageView4.setImageResource(R.drawable.ic_rating_star);
        ImageView imageView5 = this.f86814c;
        if (imageView5 == null) {
            f0.S("iv_rating_1");
            imageView5 = null;
        }
        addView(imageView5);
        ImageView imageView6 = new ImageView(getContext());
        this.f86815d = imageView6;
        imageView6.setImageResource(R.drawable.ic_rating_star);
        ImageView imageView7 = this.f86815d;
        if (imageView7 == null) {
            f0.S("iv_rating_2");
            imageView7 = null;
        }
        addView(imageView7);
        ImageView imageView8 = new ImageView(getContext());
        this.f86816e = imageView8;
        imageView8.setImageResource(R.drawable.ic_rating_star);
        ImageView imageView9 = this.f86816e;
        if (imageView9 == null) {
            f0.S("iv_rating_3");
            imageView9 = null;
        }
        addView(imageView9);
        ImageView imageView10 = new ImageView(getContext());
        this.f86817f = imageView10;
        imageView10.setImageResource(R.drawable.ic_rating_star);
        ImageView imageView11 = this.f86817f;
        if (imageView11 == null) {
            f0.S("iv_rating_4");
        } else {
            imageView3 = imageView11;
        }
        addView(imageView3);
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 36691, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f76308i1);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.GameRateStarView)");
        float dimension = typedArrayObtainStyledAttributes.getDimension(1, ViewUtils.f(getContext(), 10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(0, ViewUtils.f(getContext(), 3.0f));
        setStarSize((int) dimension);
        setStarGap((int) dimension2);
    }

    public final void setRating(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 36694, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iT0 = r1.t0(getContext(), String.valueOf(2 * f10));
        int color = getContext().getResources().getColor(R.color.divider_secondary_1_color);
        ImageView imageView = null;
        if (f10 > 0.0f) {
            ImageView imageView2 = this.f86813b;
            if (imageView2 == null) {
                f0.S("iv_rating_0");
                imageView2 = null;
            }
            imageView2.setColorFilter(iT0);
        } else {
            ImageView imageView3 = this.f86813b;
            if (imageView3 == null) {
                f0.S("iv_rating_0");
                imageView3 = null;
            }
            imageView3.setColorFilter(color);
        }
        if (f10 > 1.0f) {
            ImageView imageView4 = this.f86814c;
            if (imageView4 == null) {
                f0.S("iv_rating_1");
                imageView4 = null;
            }
            imageView4.setColorFilter(iT0);
        } else {
            ImageView imageView5 = this.f86814c;
            if (imageView5 == null) {
                f0.S("iv_rating_1");
                imageView5 = null;
            }
            imageView5.setColorFilter(color);
        }
        if (f10 > 2.0f) {
            ImageView imageView6 = this.f86815d;
            if (imageView6 == null) {
                f0.S("iv_rating_2");
                imageView6 = null;
            }
            imageView6.setColorFilter(iT0);
        } else {
            ImageView imageView7 = this.f86815d;
            if (imageView7 == null) {
                f0.S("iv_rating_2");
                imageView7 = null;
            }
            imageView7.setColorFilter(color);
        }
        if (f10 > 3.0f) {
            ImageView imageView8 = this.f86816e;
            if (imageView8 == null) {
                f0.S("iv_rating_3");
                imageView8 = null;
            }
            imageView8.setColorFilter(iT0);
        } else {
            ImageView imageView9 = this.f86816e;
            if (imageView9 == null) {
                f0.S("iv_rating_3");
                imageView9 = null;
            }
            imageView9.setColorFilter(color);
        }
        if (f10 > 4.0f) {
            ImageView imageView10 = this.f86817f;
            if (imageView10 == null) {
                f0.S("iv_rating_4");
            } else {
                imageView = imageView10;
            }
            imageView.setColorFilter(iT0);
            return;
        }
        ImageView imageView11 = this.f86817f;
        if (imageView11 == null) {
            f0.S("iv_rating_4");
        } else {
            imageView = imageView11;
        }
        imageView.setColorFilter(color);
    }

    public final void setStarGap(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36693, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f86814c;
        ImageView imageView2 = null;
        if (imageView == null) {
            f0.S("iv_rating_1");
            imageView = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).leftMargin = i10;
        ImageView imageView3 = this.f86815d;
        if (imageView3 == null) {
            f0.S("iv_rating_2");
            imageView3 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams2).leftMargin = i10;
        ImageView imageView4 = this.f86816e;
        if (imageView4 == null) {
            f0.S("iv_rating_3");
            imageView4 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = imageView4.getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams3).leftMargin = i10;
        ImageView imageView5 = this.f86817f;
        if (imageView5 == null) {
            f0.S("iv_rating_4");
        } else {
            imageView2 = imageView5;
        }
        ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i10;
    }

    public final void setStarSize(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36692, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f86813b;
        ImageView imageView2 = null;
        if (imageView == null) {
            f0.S("iv_rating_0");
            imageView = null;
        }
        imageView.getLayoutParams().width = i10;
        ImageView imageView3 = this.f86813b;
        if (imageView3 == null) {
            f0.S("iv_rating_0");
            imageView3 = null;
        }
        imageView3.getLayoutParams().height = i10;
        ImageView imageView4 = this.f86814c;
        if (imageView4 == null) {
            f0.S("iv_rating_1");
            imageView4 = null;
        }
        imageView4.getLayoutParams().width = i10;
        ImageView imageView5 = this.f86814c;
        if (imageView5 == null) {
            f0.S("iv_rating_1");
            imageView5 = null;
        }
        imageView5.getLayoutParams().height = i10;
        ImageView imageView6 = this.f86815d;
        if (imageView6 == null) {
            f0.S("iv_rating_2");
            imageView6 = null;
        }
        imageView6.getLayoutParams().width = i10;
        ImageView imageView7 = this.f86815d;
        if (imageView7 == null) {
            f0.S("iv_rating_2");
            imageView7 = null;
        }
        imageView7.getLayoutParams().height = i10;
        ImageView imageView8 = this.f86816e;
        if (imageView8 == null) {
            f0.S("iv_rating_3");
            imageView8 = null;
        }
        imageView8.getLayoutParams().width = i10;
        ImageView imageView9 = this.f86816e;
        if (imageView9 == null) {
            f0.S("iv_rating_3");
            imageView9 = null;
        }
        imageView9.getLayoutParams().height = i10;
        ImageView imageView10 = this.f86817f;
        if (imageView10 == null) {
            f0.S("iv_rating_4");
            imageView10 = null;
        }
        imageView10.getLayoutParams().width = i10;
        ImageView imageView11 = this.f86817f;
        if (imageView11 == null) {
            f0.S("iv_rating_4");
        } else {
            imageView2 = imageView11;
        }
        imageView2.getLayoutParams().height = i10;
    }
}
