package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemVisitedHistoryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final x3 f113216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f113221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113223j;

    private m10(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 x3 x3Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f113214a = relativeLayout;
        this.f113215b = cardView;
        this.f113216c = x3Var;
        this.f113217d = imageView;
        this.f113218e = imageView2;
        this.f113219f = textView;
        this.f113220g = textView2;
        this.f113221h = hBLineHeightTextView;
        this.f113222i = relativeLayout2;
        this.f113223j = linearLayout;
    }

    @androidx.annotation.n0
    public static m10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20228, new Class[]{View.class}, m10.class);
        if (patchProxyResultProxy.isSupported) {
            return (m10) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_img;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_img);
        if (cardView != null) {
            i10 = R.id.gpv;
            View viewA = l3.d.a(view, R.id.gpv);
            if (viewA != null) {
                x3 x3VarA = x3.a(viewA);
                i10 = R.id.iv_check;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_check);
                if (imageView != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView2 != null) {
                        i10 = R.id.tv_extra_tag;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_extra_tag);
                        if (textView != null) {
                            i10 = R.id.tv_tag;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_tag);
                            if (textView2 != null) {
                                i10 = R.id.tv_title;
                                HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_title);
                                if (hBLineHeightTextView != null) {
                                    i10 = R.id.vg_extra_info;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_extra_info);
                                    if (relativeLayout != null) {
                                        i10 = R.id.vg_tag;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                        if (linearLayout != null) {
                                            return new m10((RelativeLayout) view, cardView, x3VarA, imageView, imageView2, textView, textView2, hBLineHeightTextView, relativeLayout, linearLayout);
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
    public static m10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20226, new Class[]{LayoutInflater.class}, m10.class);
        return patchProxyResultProxy.isSupported ? (m10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20227, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m10.class);
        if (patchProxyResultProxy.isSupported) {
            return (m10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_visited_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113214a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20229, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
