package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameDataActivityCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113491e;

    private mk(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 CardView cardView2) {
        this.f113487a = cardView;
        this.f113488b = imageView;
        this.f113489c = textView;
        this.f113490d = textView2;
        this.f113491e = cardView2;
    }

    @androidx.annotation.n0
    public static mk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18471, new Class[]{View.class}, mk.class);
        if (patchProxyResultProxy.isSupported) {
            return (mk) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_activity_card;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_activity_card);
        if (imageView != null) {
            i10 = R.id.tv_dont_display;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_dont_display);
            if (textView != null) {
                i10 = R.id.tv_internal_tag;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_internal_tag);
                if (textView2 != null) {
                    CardView cardView = (CardView) view;
                    return new mk(cardView, imageView, textView, textView2, cardView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18469, new Class[]{LayoutInflater.class}, mk.class);
        return patchProxyResultProxy.isSupported ? (mk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18470, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mk.class);
        if (patchProxyResultProxy.isSupported) {
            return (mk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_data_activity_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113487a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18472, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
