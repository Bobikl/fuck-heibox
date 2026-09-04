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

/* JADX INFO: compiled from: LayoutPubgMmrBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112939l;

    private l90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f112928a = linearLayout;
        this.f112929b = imageView;
        this.f112930c = recyclerView;
        this.f112931d = textView;
        this.f112932e = textView2;
        this.f112933f = textView3;
        this.f112934g = textView4;
        this.f112935h = textView5;
        this.f112936i = relativeLayout;
        this.f112937j = linearLayout2;
        this.f112938k = linearLayout3;
        this.f112939l = linearLayout4;
    }

    @androidx.annotation.n0
    public static l90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21050, new Class[]{View.class}, l90.class);
        if (patchProxyResultProxy.isSupported) {
            return (l90) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_dan_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_dan_icon);
        if (imageView != null) {
            i10 = R.id.rv_mmr_info;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_mmr_info);
            if (recyclerView != null) {
                i10 = R.id.tv_dan_item0_name;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_dan_item0_name);
                if (textView != null) {
                    i10 = R.id.tv_dan_item1_name;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_dan_item1_name);
                    if (textView2 != null) {
                        i10 = R.id.tv_dan_name;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_dan_name);
                        if (textView3 != null) {
                            i10 = R.id.tv_match_count;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_match_count);
                            if (textView4 != null) {
                                i10 = R.id.tv_rank_number;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_rank_number);
                                if (textView5 != null) {
                                    i10 = R.id.vg_dan;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_dan);
                                    if (relativeLayout != null) {
                                        i10 = R.id.vg_dan_detail;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_dan_detail);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_dan_info;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_dan_info);
                                            if (linearLayout2 != null) {
                                                LinearLayout linearLayout3 = (LinearLayout) view;
                                                return new l90(linearLayout3, imageView, recyclerView, textView, textView2, textView3, textView4, textView5, relativeLayout, linearLayout, linearLayout2, linearLayout3);
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
    public static l90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21048, new Class[]{LayoutInflater.class}, l90.class);
        return patchProxyResultProxy.isSupported ? (l90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21049, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l90.class);
        if (patchProxyResultProxy.isSupported) {
            return (l90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_mmr, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112928a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21051, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
