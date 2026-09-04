package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCareerRecordBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pe implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114524f;

    private pe(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f114519a = cardView;
        this.f114520b = imageView;
        this.f114521c = imageView2;
        this.f114522d = textView;
        this.f114523e = textView2;
        this.f114524f = frameLayout;
    }

    @androidx.annotation.n0
    public static pe a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17860, new Class[]{View.class}, pe.class);
        if (patchProxyResultProxy.isSupported) {
            return (pe) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
        if (imageView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView2 != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_value;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_value);
                    if (textView2 != null) {
                        i10 = R.id.vg_container;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_container);
                        if (frameLayout != null) {
                            return new pe((CardView) view, imageView, imageView2, textView, textView2, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pe c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17858, new Class[]{LayoutInflater.class}, pe.class);
        return patchProxyResultProxy.isSupported ? (pe) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pe d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17859, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pe.class);
        if (patchProxyResultProxy.isSupported) {
            return (pe) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_career_record, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114519a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17861, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
