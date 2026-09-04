package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentR6PlayerWeaponsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListView f109278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f109279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109281e;

    private cb(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ListView listView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView) {
        this.f109277a = linearLayout;
        this.f109278b = listView;
        this.f109279c = smartRefreshLayout;
        this.f109280d = relativeLayout;
        this.f109281e = textView;
    }

    @androidx.annotation.n0
    public static cb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17496, new Class[]{View.class}, cb.class);
        if (patchProxyResultProxy.isSupported) {
            return (cb) patchProxyResultProxy.result;
        }
        int i10 = R.id.lv;
        ListView listView = (ListView) l3.d.a(view, R.id.lv);
        if (listView != null) {
            i10 = R.id.srl;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
            if (smartRefreshLayout != null) {
                i10 = R.id.sticky_layout_header;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.sticky_layout_header);
                if (relativeLayout != null) {
                    i10 = R.id.tv_filter;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_filter);
                    if (textView != null) {
                        return new cb((LinearLayout) view, listView, smartRefreshLayout, relativeLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17494, new Class[]{LayoutInflater.class}, cb.class);
        return patchProxyResultProxy.isSupported ? (cb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17495, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cb.class);
        if (patchProxyResultProxy.isSupported) {
            return (cb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_r6_player_weapons, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109277a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17497, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
