package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewR6ModeCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f111003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111010h;

    private gh0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f111003a = cardView;
        this.f111004b = imageView;
        this.f111005c = relativeLayout;
        this.f111006d = recyclerView;
        this.f111007e = textView;
        this.f111008f = textView2;
        this.f111009g = textView3;
        this.f111010h = relativeLayout2;
    }

    @androidx.annotation.n0
    public static gh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21850, new Class[]{View.class}, gh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_mode_card_sign;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_mode_card_sign);
        if (imageView != null) {
            i10 = R.id.rl_mode_card_title;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_mode_card_title);
            if (relativeLayout != null) {
                i10 = R.id.rv_mode_card_list;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_mode_card_list);
                if (recyclerView != null) {
                    i10 = R.id.tv_mode_card_game_count;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_mode_card_game_count);
                    if (textView != null) {
                        i10 = R.id.tv_mode_card_no_data;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_mode_card_no_data);
                        if (textView2 != null) {
                            i10 = R.id.tv_mode_card_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_mode_card_title);
                            if (textView3 != null) {
                                i10 = R.id.vg_mode_card_no_data;
                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_mode_card_no_data);
                                if (relativeLayout2 != null) {
                                    return new gh0((CardView) view, imageView, relativeLayout, recyclerView, textView, textView2, textView3, relativeLayout2);
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
    public static gh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21848, new Class[]{LayoutInflater.class}, gh0.class);
        return patchProxyResultProxy.isSupported ? (gh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21849, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_r6_mode_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f111003a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21851, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
