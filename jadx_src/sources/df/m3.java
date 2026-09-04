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
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityXboxAchievementBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f113265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final wh0 f113274o;

    private m3(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 wh0 wh0Var) {
        this.f113260a = linearLayout;
        this.f113261b = imageView;
        this.f113262c = imageView2;
        this.f113263d = imageView3;
        this.f113264e = recyclerView;
        this.f113265f = smartRefreshLayout;
        this.f113266g = textView;
        this.f113267h = textView2;
        this.f113268i = textView3;
        this.f113269j = textView4;
        this.f113270k = linearLayout2;
        this.f113271l = linearLayout3;
        this.f113272m = relativeLayout;
        this.f113273n = relativeLayout2;
        this.f113274o = wh0Var;
    }

    @androidx.annotation.n0
    public static m3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16704, new Class[]{View.class}, m3.class);
        if (patchProxyResultProxy.isSupported) {
            return (m3) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.iv_mask;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_mask);
                if (imageView3 != null) {
                    i10 = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                    if (recyclerView != null) {
                        i10 = R.id.srl;
                        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                        if (smartRefreshLayout != null) {
                            i10 = R.id.tv_achievement_num;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_achievement_num);
                            if (textView != null) {
                                i10 = R.id.tv_g_coin;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_g_coin);
                                if (textView2 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_time;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_time);
                                        if (textView4 != null) {
                                            i10 = R.id.vg_g_coin;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_g_coin);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_header;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_header);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vg_img;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_img);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.vg_rank_in_friend;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_rank_in_friend);
                                                        if (relativeLayout2 != null) {
                                                            i10 = R.id.vg_xbox_detail_value;
                                                            View viewA = l3.d.a(view, R.id.vg_xbox_detail_value);
                                                            if (viewA != null) {
                                                                return new m3((LinearLayout) view, imageView, imageView2, imageView3, recyclerView, smartRefreshLayout, textView, textView2, textView3, textView4, linearLayout, linearLayout2, relativeLayout, relativeLayout2, wh0.a(viewA));
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16702, new Class[]{LayoutInflater.class}, m3.class);
        return patchProxyResultProxy.isSupported ? (m3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16703, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m3.class);
        if (patchProxyResultProxy.isSupported) {
            return (m3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_xbox_achievement, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113260a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16705, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
