package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentAvatarDecorMallBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f110847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f110854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110855j;

    private g7(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 View view, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f110846a = relativeLayout;
        this.f110847b = heyBoxAvatarView;
        this.f110848c = relativeLayout2;
        this.f110849d = textView;
        this.f110850e = textView2;
        this.f110851f = linearLayout;
        this.f110852g = recyclerView;
        this.f110853h = view;
        this.f110854i = titleBar;
        this.f110855j = relativeLayout3;
    }

    @androidx.annotation.n0
    public static g7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17096, new Class[]{View.class}, g7.class);
        if (patchProxyResultProxy.isSupported) {
            return (g7) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.bottom_bar;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.bottom_bar);
            if (relativeLayout != null) {
                i10 = R.id.comment;
                TextView textView = (TextView) l3.d.a(view, R.id.comment);
                if (textView != null) {
                    i10 = R.id.confirm;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.confirm);
                    if (textView2 != null) {
                        i10 = R.id.ll_tab;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_tab);
                        if (linearLayout != null) {
                            i10 = R.id.rv;
                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                            if (recyclerView != null) {
                                i10 = R.id.title_divider;
                                View viewA = l3.d.a(view, R.id.title_divider);
                                if (viewA != null) {
                                    i10 = R.id.toolbar;
                                    TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.toolbar);
                                    if (titleBar != null) {
                                        i10 = R.id.vg_title_container;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_title_container);
                                        if (relativeLayout2 != null) {
                                            return new g7((RelativeLayout) view, heyBoxAvatarView, relativeLayout, textView, textView2, linearLayout, recyclerView, viewA, titleBar, relativeLayout2);
                                        }
                                    }
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
    public static g7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17094, new Class[]{LayoutInflater.class}, g7.class);
        return patchProxyResultProxy.isSupported ? (g7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17095, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g7.class);
        if (patchProxyResultProxy.isSupported) {
            return (g7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_avatar_decor_mall, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110846a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17097, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
