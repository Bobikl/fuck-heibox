package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGetGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f114150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114151d;

    private o9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114148a = relativeLayout;
        this.f114149b = imageView;
        this.f114150c = bottomButtonLeftItemView;
        this.f114151d = linearLayout;
    }

    @androidx.annotation.n0
    public static o9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17336, new Class[]{View.class}, o9.class);
        if (patchProxyResultProxy.isSupported) {
            return (o9) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bubble_triangle;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bubble_triangle);
        if (imageView != null) {
            i10 = R.id.ll_bottom_bar;
            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.ll_bottom_bar);
            if (bottomButtonLeftItemView != null) {
                i10 = R.id.ll_remind_bubble;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_remind_bubble);
                if (linearLayout != null) {
                    return new o9((RelativeLayout) view, imageView, bottomButtonLeftItemView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17334, new Class[]{LayoutInflater.class}, o9.class);
        return patchProxyResultProxy.isSupported ? (o9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17335, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o9.class);
        if (patchProxyResultProxy.isSupported) {
            return (o9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_get_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114148a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17337, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
