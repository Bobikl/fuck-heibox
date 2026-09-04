package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentDota2RecordListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f113327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f113329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f113332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final vl f113333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113335i;

    private m8(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 vl vlVar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f113327a = smartRefreshLayout;
        this.f113328b = recyclerView;
        this.f113329c = smartRefreshLayout2;
        this.f113330d = textView;
        this.f113331e = textView2;
        this.f113332f = consecutiveScrollerLayout;
        this.f113333g = vlVar;
        this.f113334h = linearLayout;
        this.f113335i = linearLayout2;
    }

    @androidx.annotation.n0
    public static m8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17224, new Class[]{View.class}, m8.class);
        if (patchProxyResultProxy.isSupported) {
            return (m8) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
            i10 = R.id.tv_max_lose;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_max_lose);
            if (textView != null) {
                i10 = R.id.tv_max_win;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_max_win);
                if (textView2 != null) {
                    i10 = R.id.vg_container;
                    ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.vg_container);
                    if (consecutiveScrollerLayout != null) {
                        i10 = R.id.vg_header;
                        View viewA = l3.d.a(view, R.id.vg_header);
                        if (viewA != null) {
                            vl vlVarA = vl.a(viewA);
                            i10 = R.id.vg_max_lose;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_max_lose);
                            if (linearLayout != null) {
                                i10 = R.id.vg_max_win;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_max_win);
                                if (linearLayout2 != null) {
                                    return new m8(smartRefreshLayout, recyclerView, smartRefreshLayout, textView, textView2, consecutiveScrollerLayout, vlVarA, linearLayout, linearLayout2);
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
    public static m8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17222, new Class[]{LayoutInflater.class}, m8.class);
        return patchProxyResultProxy.isSupported ? (m8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17223, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m8.class);
        if (patchProxyResultProxy.isSupported) {
            return (m8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dota2_record_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f113327a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17225, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
