package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPubgModeDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113356i;

    private m90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f113348a = linearLayout;
        this.f113349b = imageView;
        this.f113350c = imageView2;
        this.f113351d = recyclerView;
        this.f113352e = textView;
        this.f113353f = textView2;
        this.f113354g = textView3;
        this.f113355h = relativeLayout;
        this.f113356i = linearLayout2;
    }

    @androidx.annotation.n0
    public static m90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21054, new Class[]{View.class}, m90.class);
        if (patchProxyResultProxy.isSupported) {
            return (m90) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_grade;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_grade);
        if (imageView != null) {
            i10 = R.id.iv_mode_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mode_icon);
            if (imageView2 != null) {
                i10 = R.id.rv_mode_card_list;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_mode_card_list);
                if (recyclerView != null) {
                    i10 = R.id.tv_grade;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_grade);
                    if (textView != null) {
                        i10 = R.id.tv_match_count;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_match_count);
                        if (textView2 != null) {
                            i10 = R.id.tv_mode_name;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_mode_name);
                            if (textView3 != null) {
                                i10 = R.id.vg_mode_data_header;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_mode_data_header);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_more;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_more);
                                    if (linearLayout != null) {
                                        return new m90((LinearLayout) view, imageView, imageView2, recyclerView, textView, textView2, textView3, relativeLayout, linearLayout);
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
    public static m90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21052, new Class[]{LayoutInflater.class}, m90.class);
        return patchProxyResultProxy.isSupported ? (m90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21053, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m90.class);
        if (patchProxyResultProxy.isSupported) {
            return (m90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_mode_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113348a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21055, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
