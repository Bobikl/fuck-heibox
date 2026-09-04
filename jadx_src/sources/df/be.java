package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBbsTopicGroupBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class be implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f108922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final c30 f108925d;

    private be(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 c30 c30Var) {
        this.f108922a = cardView;
        this.f108923b = recyclerView;
        this.f108924c = textView;
        this.f108925d = c30Var;
    }

    @androidx.annotation.n0
    public static be a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17804, new Class[]{View.class}, be.class);
        if (patchProxyResultProxy.isSupported) {
            return (be) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_topic;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_topic);
        if (recyclerView != null) {
            i10 = R.id.tv_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
            if (textView != null) {
                i10 = R.id.vg_all;
                View viewA = l3.d.a(view, R.id.vg_all);
                if (viewA != null) {
                    return new be((CardView) view, recyclerView, textView, c30.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static be c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17802, new Class[]{LayoutInflater.class}, be.class);
        return patchProxyResultProxy.isSupported ? (be) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static be d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17803, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, be.class);
        if (patchProxyResultProxy.isSupported) {
            return (be) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bbs_topic_group, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f108922a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17805, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
