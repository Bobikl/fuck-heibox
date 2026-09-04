package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentFriendsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f117445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f117448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f117449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final mj f117450j;

    private x8(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 mb.q qVar, @androidx.annotation.n0 mj mjVar) {
        this.f117441a = relativeLayout;
        this.f117442b = recyclerView;
        this.f117443c = recyclerView2;
        this.f117444d = linearLayout;
        this.f117445e = smartRefreshLayout;
        this.f117446f = textView;
        this.f117447g = textView2;
        this.f117448h = id0Var;
        this.f117449i = qVar;
        this.f117450j = mjVar;
    }

    @androidx.annotation.n0
    public static x8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17268, new Class[]{View.class}, x8.class);
        if (patchProxyResultProxy.isSupported) {
            return (x8) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.rv_chat_room;
            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_chat_room);
            if (recyclerView2 != null) {
                i10 = R.id.rv_empty_view;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.rv_empty_view);
                if (linearLayout != null) {
                    i10 = R.id.srl;
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                    if (smartRefreshLayout != null) {
                        i10 = R.id.tv_add_friend;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_add_friend);
                        if (textView != null) {
                            i10 = R.id.tv_add_friend_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_add_friend_desc);
                            if (textView2 != null) {
                                i10 = R.id.v_div_4dp;
                                View viewA = l3.d.a(view, R.id.v_div_4dp);
                                if (viewA != null) {
                                    id0 id0VarA = id0.a(viewA);
                                    i10 = R.id.vg_search_empty;
                                    View viewA2 = l3.d.a(view, R.id.vg_search_empty);
                                    if (viewA2 != null) {
                                        mb.q qVarA = mb.q.a(viewA2);
                                        i10 = R.id.vg_search_header;
                                        View viewA3 = l3.d.a(view, R.id.vg_search_header);
                                        if (viewA3 != null) {
                                            return new x8((RelativeLayout) view, recyclerView, recyclerView2, linearLayout, smartRefreshLayout, textView, textView2, id0VarA, qVarA, mj.a(viewA3));
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
    public static x8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17266, new Class[]{LayoutInflater.class}, x8.class);
        return patchProxyResultProxy.isSupported ? (x8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17267, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x8.class);
        if (patchProxyResultProxy.isSupported) {
            return (x8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_friends, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117441a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17269, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
