package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117170g;

    private wf(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f117164a = linearLayout;
        this.f117165b = cardView;
        this.f117166c = view;
        this.f117167d = imageView;
        this.f117168e = textView;
        this.f117169f = linearLayout2;
        this.f117170g = linearLayout3;
    }

    @androidx.annotation.n0
    public static wf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17992, new Class[]{View.class}, wf.class);
        if (patchProxyResultProxy.isSupported) {
            return (wf) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_game_img;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_game_img);
        if (cardView != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                i10 = R.id.iv_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView != null) {
                    i10 = R.id.tv_follow_state;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_follow_state);
                    if (textView != null) {
                        i10 = R.id.vg_is_owned;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_is_owned);
                        if (linearLayout != null) {
                            i10 = R.id.vg_name;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_name);
                            if (linearLayout2 != null) {
                                return new wf((LinearLayout) view, cardView, viewA, imageView, textView, linearLayout, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17990, new Class[]{LayoutInflater.class}, wf.class);
        return patchProxyResultProxy.isSupported ? (wf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17991, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wf.class);
        if (patchProxyResultProxy.isSupported) {
            return (wf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117164a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17993, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
