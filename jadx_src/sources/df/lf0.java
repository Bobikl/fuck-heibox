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

/* JADX INFO: compiled from: ViewFriendRankingCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final du f113040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ty f113041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f113042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final xj f113043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113045k;

    private lf0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 du duVar, @androidx.annotation.n0 ty tyVar, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 xj xjVar, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f113035a = cardView;
        this.f113036b = imageView;
        this.f113037c = recyclerView;
        this.f113038d = textView;
        this.f113039e = textView2;
        this.f113040f = duVar;
        this.f113041g = tyVar;
        this.f113042h = i20Var;
        this.f113043i = xjVar;
        this.f113044j = relativeLayout;
        this.f113045k = linearLayout;
    }

    @androidx.annotation.n0
    public static lf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21666, new Class[]{View.class}, lf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_refresh_friend_list;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_refresh_friend_list);
        if (imageView != null) {
            i10 = R.id.rv_friend_ranking_card;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_friend_ranking_card);
            if (recyclerView != null) {
                i10 = R.id.tv_no_following;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_no_following);
                if (textView != null) {
                    i10 = R.id.tv_refresh_friend_list;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_refresh_friend_list);
                    if (textView2 != null) {
                        i10 = R.id.vg_follow_list_title;
                        View viewA = l3.d.a(view, R.id.vg_follow_list_title);
                        if (viewA != null) {
                            du duVarA = du.a(viewA);
                            i10 = R.id.vg_friend_and_follow_tab;
                            View viewA2 = l3.d.a(view, R.id.vg_friend_and_follow_tab);
                            if (viewA2 != null) {
                                ty tyVarA = ty.a(viewA2);
                                i10 = R.id.vg_friend_ranking_layout_all_bottom;
                                View viewA3 = l3.d.a(view, R.id.vg_friend_ranking_layout_all_bottom);
                                if (viewA3 != null) {
                                    i20 i20VarA = i20.a(viewA3);
                                    i10 = R.id.vg_friend_ranking_title;
                                    View viewA4 = l3.d.a(view, R.id.vg_friend_ranking_title);
                                    if (viewA4 != null) {
                                        xj xjVarA = xj.a(viewA4);
                                        i10 = R.id.vg_refresh_friend_list;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_refresh_friend_list);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_refresh_friend_list_btn;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_refresh_friend_list_btn);
                                            if (linearLayout != null) {
                                                return new lf0((CardView) view, imageView, recyclerView, textView, textView2, duVarA, tyVarA, i20VarA, xjVarA, relativeLayout, linearLayout);
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
    public static lf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21664, new Class[]{LayoutInflater.class}, lf0.class);
        return patchProxyResultProxy.isSupported ? (lf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21665, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_friend_ranking_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113035a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21667, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
