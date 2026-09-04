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

/* JADX INFO: compiled from: FragmentMomentsPrivacyBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ea implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110108e;

    private ea(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f110104a = relativeLayout;
        this.f110105b = recyclerView;
        this.f110106c = cardView;
        this.f110107d = textView;
        this.f110108e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static ea a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17400, new Class[]{View.class}, ea.class);
        if (patchProxyResultProxy.isSupported) {
            return (ea) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_tags;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_tags);
        if (recyclerView != null) {
            i10 = R.id.rv_tags_card;
            CardView cardView = (CardView) l3.d.a(view, R.id.rv_tags_card);
            if (cardView != null) {
                i10 = R.id.tv_moment_setting_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_moment_setting_desc);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new ea(relativeLayout, recyclerView, cardView, textView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ea c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17398, new Class[]{LayoutInflater.class}, ea.class);
        return patchProxyResultProxy.isSupported ? (ea) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ea d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17399, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ea.class);
        if (patchProxyResultProxy.isSupported) {
            return (ea) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_moments_privacy, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110104a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17401, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
