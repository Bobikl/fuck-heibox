package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivitySetAvatarDecorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f117699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f117707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117708k;

    private y1(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 View view, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f117698a = relativeLayout;
        this.f117699b = heyBoxAvatarView;
        this.f117700c = linearLayout;
        this.f117701d = relativeLayout2;
        this.f117702e = textView;
        this.f117703f = textView2;
        this.f117704g = frameLayout;
        this.f117705h = linearLayout2;
        this.f117706i = view;
        this.f117707j = titleBar;
        this.f117708k = relativeLayout3;
    }

    @androidx.annotation.n0
    public static y1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16544, new Class[]{View.class}, y1.class);
        if (patchProxyResultProxy.isSupported) {
            return (y1) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.avatar_decor_list_containers;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.avatar_decor_list_containers);
            if (linearLayout != null) {
                i10 = R.id.bottom_bar;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.bottom_bar);
                if (relativeLayout != null) {
                    i10 = R.id.comment;
                    TextView textView = (TextView) l3.d.a(view, R.id.comment);
                    if (textView != null) {
                        i10 = R.id.confirm;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.confirm);
                        if (textView2 != null) {
                            i10 = R.id.fl_tab;
                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_tab);
                            if (frameLayout != null) {
                                i10 = R.id.ll_tab;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_tab);
                                if (linearLayout2 != null) {
                                    i10 = R.id.title_divider;
                                    View viewA = l3.d.a(view, R.id.title_divider);
                                    if (viewA != null) {
                                        i10 = R.id.toolbar;
                                        TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.toolbar);
                                        if (titleBar != null) {
                                            i10 = R.id.vg_title_container;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_title_container);
                                            if (relativeLayout2 != null) {
                                                return new y1((RelativeLayout) view, heyBoxAvatarView, linearLayout, relativeLayout, textView, textView2, frameLayout, linearLayout2, viewA, titleBar, relativeLayout2);
                                            }
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
    public static y1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16542, new Class[]{LayoutInflater.class}, y1.class);
        return patchProxyResultProxy.isSupported ? (y1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16543, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y1.class);
        if (patchProxyResultProxy.isSupported) {
            return (y1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_set_avatar_decor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117698a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16545, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
