package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewR6FriendsCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f109803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f109807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final xj f109808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109810h;

    private dh0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 xj xjVar, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f109803a = cardView;
        this.f109804b = imageView;
        this.f109805c = recyclerView;
        this.f109806d = textView;
        this.f109807e = i20Var;
        this.f109808f = xjVar;
        this.f109809g = relativeLayout;
        this.f109810h = linearLayout;
    }

    @androidx.annotation.n0
    public static dh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21838, new Class[]{View.class}, dh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (dh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_refresh_friend_list;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_refresh_friend_list);
        if (imageView != null) {
            i10 = R.id.rv_friend_ranking_card;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_friend_ranking_card);
            if (recyclerView != null) {
                i10 = R.id.tv_refresh_friend_list;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_refresh_friend_list);
                if (textView != null) {
                    i10 = R.id.vg_friend_ranking_layout_all_bottom;
                    View viewA = l3.d.a(view, R.id.vg_friend_ranking_layout_all_bottom);
                    if (viewA != null) {
                        i20 i20VarA = i20.a(viewA);
                        i10 = R.id.vg_friend_ranking_title;
                        View viewA2 = l3.d.a(view, R.id.vg_friend_ranking_title);
                        if (viewA2 != null) {
                            xj xjVarA = xj.a(viewA2);
                            i10 = R.id.vg_refresh_friend_list;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_refresh_friend_list);
                            if (relativeLayout != null) {
                                i10 = R.id.vg_refresh_friend_list_btn;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_refresh_friend_list_btn);
                                if (linearLayout != null) {
                                    return new dh0((CardView) view, imageView, recyclerView, textView, i20VarA, xjVarA, relativeLayout, linearLayout);
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
    public static dh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21836, new Class[]{LayoutInflater.class}, dh0.class);
        return patchProxyResultProxy.isSupported ? (dh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21837, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (dh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_r6_friends_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f109803a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21839, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
