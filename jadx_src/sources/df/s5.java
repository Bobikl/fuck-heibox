package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.MaxHeightRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogHeyboxVoiceMicReconnectBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f115448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final MaxHeightRecyclerView f115450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f115458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115460n;

    private s5(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 MaxHeightRecyclerView maxHeightRecyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115447a = constraintLayout;
        this.f115448b = cardView;
        this.f115449c = imageView;
        this.f115450d = maxHeightRecyclerView;
        this.f115451e = textView;
        this.f115452f = textView2;
        this.f115453g = textView3;
        this.f115454h = linearLayout;
        this.f115455i = linearLayout2;
        this.f115456j = relativeLayout;
        this.f115457k = linearLayout3;
        this.f115458l = constraintLayout2;
        this.f115459m = linearLayout4;
        this.f115460n = relativeLayout2;
    }

    @androidx.annotation.n0
    public static s5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16936, new Class[]{View.class}, s5.class);
        if (patchProxyResultProxy.isSupported) {
            return (s5) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_bg;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_bg);
        if (cardView != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.rv_ip_list;
                MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) l3.d.a(view, R.id.rv_ip_list);
                if (maxHeightRecyclerView != null) {
                    i10 = R.id.tv_left_button;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_left_button);
                    if (textView != null) {
                        i10 = R.id.tv_right_button;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_right_button);
                        if (textView2 != null) {
                            i10 = R.id.tv_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView3 != null) {
                                i10 = R.id.vg_bg;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bg);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_button_panel;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_button_panel);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_center_view;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_center_view);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_components;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_components);
                                            if (linearLayout3 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                i10 = R.id.vg_fixed_view;
                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_fixed_view);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.vg_top_view;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_top_view);
                                                    if (relativeLayout2 != null) {
                                                        return new s5(constraintLayout, cardView, imageView, maxHeightRecyclerView, textView, textView2, textView3, linearLayout, linearLayout2, relativeLayout, linearLayout3, constraintLayout, linearLayout4, relativeLayout2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16934, new Class[]{LayoutInflater.class}, s5.class);
        return patchProxyResultProxy.isSupported ? (s5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16935, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s5.class);
        if (patchProxyResultProxy.isSupported) {
            return (s5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_heybox_voice_mic_reconnect, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115447a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16937, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
