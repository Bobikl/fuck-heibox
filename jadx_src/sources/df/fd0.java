package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MenuMoreVerticalBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SeekBar f110531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SeekBar f110532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110550z;

    private fd0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 SeekBar seekBar, @androidx.annotation.n0 SeekBar seekBar2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout9, @androidx.annotation.n0 LinearLayout linearLayout10, @androidx.annotation.n0 LinearLayout linearLayout11, @androidx.annotation.n0 LinearLayout linearLayout12) {
        this.f110525a = linearLayout;
        this.f110526b = imageView;
        this.f110527c = imageView2;
        this.f110528d = imageView3;
        this.f110529e = imageView4;
        this.f110530f = imageView5;
        this.f110531g = seekBar;
        this.f110532h = seekBar2;
        this.f110533i = textView;
        this.f110534j = textView2;
        this.f110535k = textView3;
        this.f110536l = textView4;
        this.f110537m = textView5;
        this.f110538n = textView6;
        this.f110539o = linearLayout2;
        this.f110540p = linearLayout3;
        this.f110541q = linearLayout4;
        this.f110542r = linearLayout5;
        this.f110543s = linearLayout6;
        this.f110544t = linearLayout7;
        this.f110545u = linearLayout8;
        this.f110546v = relativeLayout;
        this.f110547w = linearLayout9;
        this.f110548x = linearLayout10;
        this.f110549y = linearLayout11;
        this.f110550z = linearLayout12;
    }

    @androidx.annotation.n0
    public static fd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21437, new Class[]{View.class}, fd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_menu_charge;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_menu_charge);
        if (imageView != null) {
            i10 = R.id.iv_menu_close;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_menu_close);
            if (imageView2 != null) {
                i10 = R.id.iv_menu_collect;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_menu_collect);
                if (imageView3 != null) {
                    i10 = R.id.iv_menu_report;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_menu_report);
                    if (imageView4 != null) {
                        i10 = R.id.iv_menu_reward;
                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_menu_reward);
                        if (imageView5 != null) {
                            i10 = R.id.sb_danmaku_alpha;
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
                                            i10 = R.id.tv_menu_charge;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_menu_charge);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_menu_collect;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_menu_collect);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_menu_report;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_menu_report);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_menu_reward;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_menu_reward);
                                                        if (textView6 != null) {
                                                            i10 = R.id.vg_danmaku_alpha;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_danmaku_alpha);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.vg_danmaku_area;
                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_danmaku_area);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.vg_menu_bitrate;
                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_menu_bitrate);
                                                                    if (linearLayout3 != null) {
                                                                        i10 = R.id.vg_menu_bitrate_list;
                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_menu_bitrate_list);
                                                                        if (linearLayout4 != null) {
                                                                            i10 = R.id.vg_menu_charge;
                                                                            LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_menu_charge);
                                                                            if (linearLayout5 != null) {
                                                                                i10 = R.id.vg_menu_collect;
                                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_menu_collect);
                                                                                if (linearLayout6 != null) {
                                                                                    i10 = R.id.vg_menu_danmaku;
                                                                                    LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_menu_danmaku);
                                                                                    if (linearLayout7 != null) {
                                                                                        i10 = R.id.vg_menu_header;
                                                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_menu_header);
                                                                                        if (relativeLayout != null) {
                                                                                            i10 = R.id.vg_menu_report;
                                                                                            LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.vg_menu_report);
                                                                                            if (linearLayout8 != null) {
                                                                                                i10 = R.id.vg_menu_reward;
                                                                                                LinearLayout linearLayout9 = (LinearLayout) l3.d.a(view, R.id.vg_menu_reward);
                                                                                                if (linearLayout9 != null) {
                                                                                                    i10 = R.id.vg_menu_speed;
                                                                                                    LinearLayout linearLayout10 = (LinearLayout) l3.d.a(view, R.id.vg_menu_speed);
                                                                                                    if (linearLayout10 != null) {
                                                                                                        i10 = R.id.vg_menu_speed_list;
                                                                                                        LinearLayout linearLayout11 = (LinearLayout) l3.d.a(view, R.id.vg_menu_speed_list);
                                                                                                        if (linearLayout11 != null) {
                                                                                                            return new fd0((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, seekBar, seekBar2, textView, textView2, textView3, textView4, textView5, textView6, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, relativeLayout, linearLayout8, linearLayout9, linearLayout10, linearLayout11);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21435, new Class[]{LayoutInflater.class}, fd0.class);
        return patchProxyResultProxy.isSupported ? (fd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21436, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.menu_more_vertical, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110525a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21438, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
