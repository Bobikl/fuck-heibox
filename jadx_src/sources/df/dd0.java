package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MenuDanmakuSettingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SeekBar f109761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SeekBar f109762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109767h;

    private dd0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SeekBar seekBar, @androidx.annotation.n0 SeekBar seekBar2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f109760a = linearLayout;
        this.f109761b = seekBar;
        this.f109762c = seekBar2;
        this.f109763d = textView;
        this.f109764e = textView2;
        this.f109765f = linearLayout2;
        this.f109766g = linearLayout3;
        this.f109767h = linearLayout4;
    }

    @androidx.annotation.n0
    public static dd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21429, new Class[]{View.class}, dd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (dd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.sb_danmaku_alpha;
        SeekBar seekBar = (SeekBar) l3.d.a(view, R.id.sb_danmaku_alpha);
        if (seekBar != null) {
            i10 = R.id.sb_danmaku_area;
            SeekBar seekBar2 = (SeekBar) l3.d.a(view, R.id.sb_danmaku_area);
            if (seekBar2 != null) {
                i10 = R.id.tv_danmaku_alpha;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_danmaku_alpha);
                if (textView != null) {
                    i10 = R.id.tv_danmaku_area;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_danmaku_area);
                    if (textView2 != null) {
                        i10 = R.id.vg_danmaku_alpha;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_danmaku_alpha);
                        if (linearLayout != null) {
                            i10 = R.id.vg_danmaku_area;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_danmaku_area);
                            if (linearLayout2 != null) {
                                i10 = R.id.vg_danmaku_options;
                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_danmaku_options);
                                if (linearLayout3 != null) {
                                    return new dd0((LinearLayout) view, seekBar, seekBar2, textView, textView2, linearLayout, linearLayout2, linearLayout3);
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
    public static dd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21427, new Class[]{LayoutInflater.class}, dd0.class);
        return patchProxyResultProxy.isSupported ? (dd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21428, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (dd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.menu_danmaku_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109760a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21430, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
