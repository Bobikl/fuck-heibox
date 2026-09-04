package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSingleAchievementNoProgressbarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114999f;

    private qy(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view) {
        this.f114994a = relativeLayout;
        this.f114995b = imageView;
        this.f114996c = textView;
        this.f114997d = textView2;
        this.f114998e = textView3;
        this.f114999f = view;
    }

    @androidx.annotation.n0
    public static qy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19932, new Class[]{View.class}, qy.class);
        if (patchProxyResultProxy.isSupported) {
            return (qy) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_item_single_achievement_npb_image;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_single_achievement_npb_image);
        if (imageView != null) {
            i10 = R.id.tv_item_single_achievement_npb_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_item_single_achievement_npb_desc);
            if (textView != null) {
                i10 = R.id.tv_item_single_achievement_npb_name;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_single_achievement_npb_name);
                if (textView2 != null) {
                    i10 = R.id.tv_item_single_achievement_npb_time;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_single_achievement_npb_time);
                    if (textView3 != null) {
                        i10 = R.id.v_item_single_achievement_npb_divider;
                        View viewA = l3.d.a(view, R.id.v_item_single_achievement_npb_divider);
                        if (viewA != null) {
                            return new qy((RelativeLayout) view, imageView, textView, textView2, textView3, viewA);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19930, new Class[]{LayoutInflater.class}, qy.class);
        return patchProxyResultProxy.isSupported ? (qy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19931, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qy.class);
        if (patchProxyResultProxy.isSupported) {
            return (qy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_single_achievement_no_progressbar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114994a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19933, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
