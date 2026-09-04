package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.component.SearchView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityChannelListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConsecutiveScrollerLayout f112319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ue f112328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final we f112331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final SearchView f112332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f112333o;

    private k(@androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 ue ueVar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 we weVar, @androidx.annotation.n0 SearchView searchView, @androidx.annotation.n0 mb.q qVar) {
        this.f112319a = consecutiveScrollerLayout;
        this.f112320b = imageView;
        this.f112321c = recyclerView;
        this.f112322d = recyclerView2;
        this.f112323e = recyclerView3;
        this.f112324f = textView;
        this.f112325g = textView2;
        this.f112326h = textView3;
        this.f112327i = textView4;
        this.f112328j = ueVar;
        this.f112329k = linearLayout;
        this.f112330l = linearLayout2;
        this.f112331m = weVar;
        this.f112332n = searchView;
        this.f112333o = qVar;
    }

    @androidx.annotation.n0
    public static k a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16280, new Class[]{View.class}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_edit_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_edit_icon);
        if (imageView != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.rv_recommend;
                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_recommend);
                if (recyclerView2 != null) {
                    i10 = R.id.rv_subscribed;
                    RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_subscribed);
                    if (recyclerView3 != null) {
                        i10 = R.id.tv_channel_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_channel_desc);
                        if (textView != null) {
                            i10 = R.id.tv_channel_title;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_channel_title);
                            if (textView2 != null) {
                                i10 = R.id.tv_done;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_done);
                                if (textView3 != null) {
                                    i10 = R.id.tv_edit;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_edit);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_add_btn;
                                        View viewA = l3.d.a(view, R.id.vg_add_btn);
                                        if (viewA != null) {
                                            ue ueVarA = ue.a(viewA);
                                            i10 = R.id.vg_edit;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_edit);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_header;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_header);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vg_recommend_title;
                                                    View viewA2 = l3.d.a(view, R.id.vg_recommend_title);
                                                    if (viewA2 != null) {
                                                        we weVarA = we.a(viewA2);
                                                        i10 = R.id.vg_search;
                                                        SearchView searchView = (SearchView) l3.d.a(view, R.id.vg_search);
                                                        if (searchView != null) {
                                                            i10 = R.id.vg_search_empty;
                                                            View viewA3 = l3.d.a(view, R.id.vg_search_empty);
                                                            if (viewA3 != null) {
                                                                return new k((ConsecutiveScrollerLayout) view, imageView, recyclerView, recyclerView2, recyclerView3, textView, textView2, textView3, textView4, ueVarA, linearLayout, linearLayout2, weVarA, searchView, mb.q.a(viewA3));
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
    public static k c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16278, new Class[]{LayoutInflater.class}, k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16279, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_channel_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConsecutiveScrollerLayout b() {
        return this.f112319a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16281, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
