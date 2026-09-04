package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFriendCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f111633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f111640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final wy f111642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111643k;

    private i50(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 wy wyVar, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f111633a = cardView;
        this.f111634b = cardView2;
        this.f111635c = imageView;
        this.f111636d = imageView2;
        this.f111637e = recyclerView;
        this.f111638f = textView;
        this.f111639g = textView2;
        this.f111640h = i20Var;
        this.f111641i = relativeLayout;
        this.f111642j = wyVar;
        this.f111643k = frameLayout;
    }

    @androidx.annotation.n0
    public static i50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20624, new Class[]{View.class}, i50.class);
        if (patchProxyResultProxy.isSupported) {
            return (i50) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.iv_refresh_point;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_refresh_point);
        if (imageView != null) {
            i10 = R.id.iv_refreshing;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_refreshing);
            if (imageView2 != null) {
                i10 = R.id.rv_my_friend_card_list;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_my_friend_card_list);
                if (recyclerView != null) {
                    i10 = R.id.tv_friend_title;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_friend_title);
                    if (textView != null) {
                        i10 = R.id.tv_my_friend_card_nothing;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_my_friend_card_nothing);
                        if (textView2 != null) {
                            i10 = R.id.vg_friend_card_bottom;
                            View viewA = l3.d.a(view, R.id.vg_friend_card_bottom);
                            if (viewA != null) {
                                i20 i20VarA = i20.a(viewA);
                                i10 = R.id.vg_my_friend_card_no_friend;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_my_friend_card_no_friend);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_my_friend_card_title_wrapper;
                                    View viewA2 = l3.d.a(view, R.id.vg_my_friend_card_title_wrapper);
                                    if (viewA2 != null) {
                                        wy wyVarA = wy.a(viewA2);
                                        i10 = R.id.vg_refreshing;
                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_refreshing);
                                        if (frameLayout != null) {
                                            return new i50(cardView, cardView, imageView, imageView2, recyclerView, textView, textView2, i20VarA, relativeLayout, wyVarA, frameLayout);
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
    public static i50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20622, new Class[]{LayoutInflater.class}, i50.class);
        return patchProxyResultProxy.isSupported ? (i50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20623, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i50.class);
        if (patchProxyResultProxy.isSupported) {
            return (i50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_friend_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f111633a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20625, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
