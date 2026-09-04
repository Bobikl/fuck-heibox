package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPubgFriendRankHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111715l;

    private i90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f111704a = linearLayout;
        this.f111705b = imageView;
        this.f111706c = imageView2;
        this.f111707d = imageView3;
        this.f111708e = linearLayout2;
        this.f111709f = linearLayout3;
        this.f111710g = linearLayout4;
        this.f111711h = textView;
        this.f111712i = textView2;
        this.f111713j = textView3;
        this.f111714k = textView4;
        this.f111715l = textView5;
    }

    @androidx.annotation.n0
    public static i90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21038, new Class[]{View.class}, i90.class);
        if (patchProxyResultProxy.isSupported) {
            return (i90) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_mode_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_mode_arrow);
        if (imageView != null) {
            i10 = R.id.iv_region_arrow;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_region_arrow);
            if (imageView2 != null) {
                i10 = R.id.iv_season_arrow;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_season_arrow);
                if (imageView3 != null) {
                    i10 = R.id.ll_mode;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_mode);
                    if (linearLayout != null) {
                        i10 = R.id.ll_region;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_region);
                        if (linearLayout2 != null) {
                            i10 = R.id.ll_season;
                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_season);
                            if (linearLayout3 != null) {
                                i10 = R.id.tv_col_friend;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_col_friend);
                                if (textView != null) {
                                    i10 = R.id.tv_header_rank_desc;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_header_rank_desc);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_mode;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_mode);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_region;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_region);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_season;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_season);
                                                if (textView5 != null) {
                                                    return new i90((LinearLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5);
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
    public static i90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21036, new Class[]{LayoutInflater.class}, i90.class);
        return patchProxyResultProxy.isSupported ? (i90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21037, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i90.class);
        if (patchProxyResultProxy.isSupported) {
            return (i90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_friend_rank_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111704a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21039, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
