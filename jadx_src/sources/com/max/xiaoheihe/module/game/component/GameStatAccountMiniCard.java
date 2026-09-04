package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import bb.d;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameStatAccountMiniCard.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameStatAccountMiniCard extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f86820v = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private ImageView f86821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @e
    private ImageView f86822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private ImageView f86823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e
    private TextView f86824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @e
    private View f86825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @e
    private TextView f86826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @e
    private TextView f86827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @e
    private ImageView f86828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @e
    private View f86829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @e
    private View f86830t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f86831u;

    public GameStatAccountMiniCard(@e Context context) {
        this(context, null);
    }

    public GameStatAccountMiniCard(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameStatAccountMiniCard(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h(attributeSet);
    }

    private final void h(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 36703, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.layout_game_stat_account_mini_card, this);
        setRadius(ViewUtils.p(getContext(), this, ViewUtils.ViewType.IMAGE));
        this.f86821k = (ImageView) findViewById(R.id.iv_bg);
        this.f86822l = (ImageView) findViewById(R.id.iv_game_data_card_role);
        this.f86823m = (ImageView) findViewById(R.id.iv_app_icon);
        TextView textView = (TextView) findViewById(R.id.tv_nick_name);
        this.f86824n = textView;
        if (textView != null) {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        }
        this.f86826p = (TextView) findViewById(R.id.tv_data);
        this.f86828r = (ImageView) findViewById(R.id.iv_level_icon);
        this.f86827q = (TextView) findViewById(R.id.tv_data_desc);
        this.f86829s = findViewById(R.id.vg_go_binding);
        this.f86825o = findViewById(R.id.vg_data);
        this.f86830t = findViewById(R.id.iv_close_rec);
    }

    public final boolean getBindState() {
        return this.f86831u;
    }

    @e
    public final ImageView getIv_app_icon() {
        return this.f86823m;
    }

    @e
    public final ImageView getIv_bg() {
        return this.f86821k;
    }

    @e
    public final View getIv_close_rec() {
        return this.f86830t;
    }

    @e
    public final ImageView getIv_game_data_card_role() {
        return this.f86822l;
    }

    @e
    public final ImageView getIv_level_icon() {
        return this.f86828r;
    }

    @e
    public final TextView getTv_data() {
        return this.f86826p;
    }

    @e
    public final TextView getTv_data_desc() {
        return this.f86827q;
    }

    @e
    public final TextView getTv_nick_name() {
        return this.f86824n;
    }

    @e
    public final View getVg_data() {
        return this.f86825o;
    }

    @e
    public final View getVg_go_binding() {
        return this.f86829s;
    }

    public final void setBindState(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36704, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f86831u = z10;
        if (z10) {
            View view = this.f86829s;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f86825o;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            ImageView imageView = this.f86822l;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View view3 = this.f86830t;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            TextView textView = this.f86826p;
            if (textView != null) {
                d.d(textView, 4);
                return;
            }
            return;
        }
        View view4 = this.f86829s;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.f86825o;
        if (view5 != null) {
            view5.setVisibility(4);
        }
        ImageView imageView2 = this.f86822l;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        View view6 = this.f86830t;
        if (view6 != null) {
            view6.setVisibility(0);
        }
        ImageView imageView3 = this.f86828r;
        if (imageView3 != null) {
            imageView3.setColorFilter(getContext().getResources().getColor(R.color.divider_primary_1_not_change_color));
        }
        ImageView imageView4 = this.f86828r;
        if (imageView4 != null) {
            imageView4.setImageResource(R.drawable.splash_logo);
        }
    }

    public final void setIv_app_icon(@e ImageView imageView) {
        this.f86823m = imageView;
    }

    public final void setIv_bg(@e ImageView imageView) {
        this.f86821k = imageView;
    }

    public final void setIv_close_rec(@e View view) {
        this.f86830t = view;
    }

    public final void setIv_game_data_card_role(@e ImageView imageView) {
        this.f86822l = imageView;
    }

    public final void setIv_level_icon(@e ImageView imageView) {
        this.f86828r = imageView;
    }

    public final void setTv_data(@e TextView textView) {
        this.f86826p = textView;
    }

    public final void setTv_data_desc(@e TextView textView) {
        this.f86827q = textView;
    }

    public final void setTv_nick_name(@e TextView textView) {
        this.f86824n = textView;
    }

    public final void setVg_data(@e View view) {
        this.f86825o = view;
    }

    public final void setVg_go_binding(@e View view) {
        this.f86829s = view;
    }
}
