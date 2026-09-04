package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewMyFriendCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class og0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final h20 f114237e;

    private og0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 h20 h20Var) {
        this.f114233a = cardView;
        this.f114234b = recyclerView;
        this.f114235c = textView;
        this.f114236d = relativeLayout;
        this.f114237e = h20Var;
    }

    @androidx.annotation.n0
    public static og0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21778, new Class[]{View.class}, og0.class);
        if (patchProxyResultProxy.isSupported) {
            return (og0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_my_friend_card_list;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_my_friend_card_list);
        if (recyclerView != null) {
            i10 = R.id.tv_my_friend_card_nothing;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_my_friend_card_nothing);
            if (textView != null) {
                i10 = R.id.vg_my_friend_card_no_friend;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_my_friend_card_no_friend);
                if (relativeLayout != null) {
                    i10 = R.id.vg_my_friend_card_title_wrapper;
                    View viewA = l3.d.a(view, R.id.vg_my_friend_card_title_wrapper);
                    if (viewA != null) {
                        return new og0((CardView) view, recyclerView, textView, relativeLayout, h20.a(viewA));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static og0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21776, new Class[]{LayoutInflater.class}, og0.class);
        return patchProxyResultProxy.isSupported ? (og0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static og0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21777, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, og0.class);
        if (patchProxyResultProxy.isSupported) {
            return (og0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_my_friend_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114233a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21779, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
