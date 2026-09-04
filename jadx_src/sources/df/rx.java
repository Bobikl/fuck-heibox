package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.recyclerview.ConsciousHorizontalRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSearchMiniprogramBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rx implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayoutCompat f115338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f115340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsciousHorizontalRecyclerView f115341d;

    private rx(@androidx.annotation.n0 LinearLayoutCompat linearLayoutCompat, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ConsciousHorizontalRecyclerView consciousHorizontalRecyclerView) {
        this.f115338a = linearLayoutCompat;
        this.f115339b = imageView;
        this.f115340c = cardView;
        this.f115341d = consciousHorizontalRecyclerView;
    }

    @androidx.annotation.n0
    public static rx a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19836, new Class[]{View.class}, rx.class);
        if (patchProxyResultProxy.isSupported) {
            return (rx) patchProxyResultProxy.result;
        }
        int i10 = R.id.bg_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.bg_img);
        if (imageView != null) {
            i10 = R.id.cv_features;
            CardView cardView = (CardView) l3.d.a(view, R.id.cv_features);
            if (cardView != null) {
                i10 = R.id.rv_features;
                ConsciousHorizontalRecyclerView consciousHorizontalRecyclerView = (ConsciousHorizontalRecyclerView) l3.d.a(view, R.id.rv_features);
                if (consciousHorizontalRecyclerView != null) {
                    return new rx((LinearLayoutCompat) view, imageView, cardView, consciousHorizontalRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static rx c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19834, new Class[]{LayoutInflater.class}, rx.class);
        return patchProxyResultProxy.isSupported ? (rx) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rx d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19835, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rx.class);
        if (patchProxyResultProxy.isSupported) {
            return (rx) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_miniprogram, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayoutCompat b() {
        return this.f115338a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19837, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
