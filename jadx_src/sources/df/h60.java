package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.EventStateView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameEventBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final EventStateView f111288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111290l;

    private h60(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 EventStateView eventStateView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f111279a = relativeLayout;
        this.f111280b = cardView;
        this.f111281c = imageView;
        this.f111282d = linearLayout;
        this.f111283e = textView;
        this.f111284f = textView2;
        this.f111285g = textView3;
        this.f111286h = textView4;
        this.f111287i = textView5;
        this.f111288j = eventStateView;
        this.f111289k = view;
        this.f111290l = linearLayout2;
    }

    @androidx.annotation.n0
    public static h60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20724, new Class[]{View.class}, h60.class);
        if (patchProxyResultProxy.isSupported) {
            return (h60) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_image;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_image);
        if (cardView != null) {
            i10 = R.id.iv_image;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_image);
            if (imageView != null) {
                i10 = R.id.ll_platforms;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_platforms);
                if (linearLayout != null) {
                    i10 = R.id.tv_count_down;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_count_down);
                    if (textView != null) {
                        i10 = R.id.tv_count_down_before;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_count_down_before);
                        if (textView2 != null) {
                            i10 = R.id.tv_count_down_unit;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_count_down_unit);
                            if (textView3 != null) {
                                i10 = R.id.tv_tag;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_tag);
                                if (textView4 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView5 != null) {
                                        i10 = R.id.v_event_state;
                                        EventStateView eventStateView = (EventStateView) l3.d.a(view, R.id.v_event_state);
                                        if (eventStateView != null) {
                                            i10 = R.id.v_shine_bg;
                                            View viewA = l3.d.a(view, R.id.v_shine_bg);
                                            if (viewA != null) {
                                                i10 = R.id.vg_count_down;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_count_down);
                                                if (linearLayout2 != null) {
                                                    return new h60((RelativeLayout) view, cardView, imageView, linearLayout, textView, textView2, textView3, textView4, textView5, eventStateView, viewA, linearLayout2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20722, new Class[]{LayoutInflater.class}, h60.class);
        return patchProxyResultProxy.isSupported ? (h60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20723, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h60.class);
        if (patchProxyResultProxy.isSupported) {
            return (h60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_event, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111279a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20725, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
