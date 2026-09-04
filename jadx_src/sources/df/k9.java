package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.recyclerview.UniversalRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentGameShotPictureSelectorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f112480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final UniversalRecyclerView f112486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f112487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final p80 f112491l;

    private k9(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 UniversalRecyclerView universalRecyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 p80 p80Var) {
        this.f112480a = frameLayout;
        this.f112481b = frameLayout2;
        this.f112482c = imageView;
        this.f112483d = imageView2;
        this.f112484e = imageView3;
        this.f112485f = imageView4;
        this.f112486g = universalRecyclerView;
        this.f112487h = smartRefreshLayout;
        this.f112488i = textView;
        this.f112489j = linearLayout;
        this.f112490k = relativeLayout;
        this.f112491l = p80Var;
    }

    @androidx.annotation.n0
    public static k9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17320, new Class[]{View.class}, k9.class);
        if (patchProxyResultProxy.isSupported) {
            return (k9) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_game_shot_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_game_shot_container);
        if (frameLayout != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.iv_folder_arrow;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_folder_arrow);
                if (imageView2 != null) {
                    i10 = R.id.iv_help;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_help);
                    if (imageView3 != null) {
                        i10 = R.id.iv_refresh;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_refresh);
                        if (imageView4 != null) {
                            i10 = R.id.rv;
                            UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) l3.d.a(view, R.id.rv);
                            if (universalRecyclerView != null) {
                                i10 = R.id.srl;
                                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                if (smartRefreshLayout != null) {
                                    i10 = R.id.tv_folder_name;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_folder_name);
                                    if (textView != null) {
                                        i10 = R.id.vg_folder;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_folder);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_folder_title;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_folder_title);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_help;
                                                View viewA = l3.d.a(view, R.id.vg_help);
                                                if (viewA != null) {
                                                    return new k9((FrameLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, universalRecyclerView, smartRefreshLayout, textView, linearLayout, relativeLayout, p80.a(viewA));
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static k9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17318, new Class[]{LayoutInflater.class}, k9.class);
        return patchProxyResultProxy.isSupported ? (k9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17319, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k9.class);
        if (patchProxyResultProxy.isSupported) {
            return (k9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_shot_picture_selector, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f112480a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17321, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
