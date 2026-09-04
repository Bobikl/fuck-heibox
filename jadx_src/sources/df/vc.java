package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemAchievementTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116779g;

    private vc(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f116773a = relativeLayout;
        this.f116774b = imageView;
        this.f116775c = imageView2;
        this.f116776d = imageView3;
        this.f116777e = linearLayout;
        this.f116778f = linearLayout2;
        this.f116779g = linearLayout3;
    }

    @androidx.annotation.n0
    public static vc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17676, new Class[]{View.class}, vc.class);
        if (patchProxyResultProxy.isSupported) {
            return (vc) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_item_achievement_title_person;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_achievement_title_person);
        if (imageView != null) {
            i10 = R.id.iv_item_achievement_title_point;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_achievement_title_point);
            if (imageView2 != null) {
                i10 = R.id.iv_item_achievement_title_recently;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_item_achievement_title_recently);
                if (imageView3 != null) {
                    i10 = R.id.vg_item_achievement_title_person;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item_achievement_title_person);
                    if (linearLayout != null) {
                        i10 = R.id.vg_item_achievement_title_point;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_item_achievement_title_point);
                        if (linearLayout2 != null) {
                            i10 = R.id.vg_item_achievement_title_recently;
                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_item_achievement_title_recently);
                            if (linearLayout3 != null) {
                                return new vc((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17674, new Class[]{LayoutInflater.class}, vc.class);
        return patchProxyResultProxy.isSupported ? (vc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17675, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vc.class);
        if (patchProxyResultProxy.isSupported) {
            return (vc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_achievement_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116773a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17677, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
