package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRollRoomBottomBarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118477h;

    private zw(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f118470a = relativeLayout;
        this.f118471b = textView;
        this.f118472c = textView2;
        this.f118473d = textView3;
        this.f118474e = textView4;
        this.f118475f = textView5;
        this.f118476g = linearLayout;
        this.f118477h = relativeLayout2;
    }

    @androidx.annotation.n0
    public static zw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19764, new Class[]{View.class}, zw.class);
        if (patchProxyResultProxy.isSupported) {
            return (zw) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_joined_state;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_joined_state);
        if (textView != null) {
            i10 = R.id.tv_num_of_participants;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_num_of_participants);
            if (textView2 != null) {
                i10 = R.id.tv_rmb_symbol;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_rmb_symbol);
                if (textView3 != null) {
                    i10 = R.id.tv_roll_item_price;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_roll_item_price);
                    if (textView4 != null) {
                        i10 = R.id.tv_total_price;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_total_price);
                        if (textView5 != null) {
                            i10 = R.id.vg_roll_item_info;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_roll_item_info);
                            if (linearLayout != null) {
                                i10 = R.id.vg_total_price;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_total_price);
                                if (relativeLayout != null) {
                                    return new zw((RelativeLayout) view, textView, textView2, textView3, textView4, textView5, linearLayout, relativeLayout);
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
    public static zw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19762, new Class[]{LayoutInflater.class}, zw.class);
        return patchProxyResultProxy.isSupported ? (zw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19763, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zw.class);
        if (patchProxyResultProxy.isSupported) {
            return (zw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_roll_room_bottom_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118470a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19765, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
