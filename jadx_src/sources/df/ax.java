package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRollRoomEarnInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ax implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f108650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108653k;

    private ax(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f108643a = linearLayout;
        this.f108644b = cardView;
        this.f108645c = textView;
        this.f108646d = textView2;
        this.f108647e = textView3;
        this.f108648f = textView4;
        this.f108649g = view;
        this.f108650h = bBSUserSectionView;
        this.f108651i = linearLayout2;
        this.f108652j = relativeLayout;
        this.f108653k = relativeLayout2;
    }

    @androidx.annotation.n0
    public static ax a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19768, new Class[]{View.class}, ax.class);
        if (patchProxyResultProxy.isSupported) {
            return (ax) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_room_info;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_room_info);
        if (cardView != null) {
            i10 = R.id.tv_rmb_symbol;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_rmb_symbol);
            if (textView != null) {
                i10 = R.id.tv_roll_item_count;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_roll_item_count);
                if (textView2 != null) {
                    i10 = R.id.tv_roll_item_price;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_roll_item_price);
                    if (textView3 != null) {
                        i10 = R.id.tv_total_price;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_total_price);
                        if (textView4 != null) {
                            i10 = R.id.v_divider;
                            View viewA = l3.d.a(view, R.id.v_divider);
                            if (viewA != null) {
                                i10 = R.id.v_user;
                                BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.v_user);
                                if (bBSUserSectionView != null) {
                                    i10 = R.id.vg_item;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_roll_item_info;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_roll_item_info);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_total_price;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_total_price);
                                            if (relativeLayout2 != null) {
                                                return new ax((LinearLayout) view, cardView, textView, textView2, textView3, textView4, viewA, bBSUserSectionView, linearLayout, relativeLayout, relativeLayout2);
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
    public static ax c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19766, new Class[]{LayoutInflater.class}, ax.class);
        return patchProxyResultProxy.isSupported ? (ax) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ax d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19767, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ax.class);
        if (patchProxyResultProxy.isSupported) {
            return (ax) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_roll_room_earn_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108643a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19769, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
