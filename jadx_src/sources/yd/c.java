package yd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GameVideoUiBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class c implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final TextView A;

    @n0
    public final View B;

    @n0
    public final View C;

    @n0
    public final LinearLayout D;

    @n0
    public final LinearLayout E;

    @n0
    public final LinearLayout F;

    @n0
    public final FrameLayout G;

    @n0
    public final ImageView H;

    @n0
    public final LinearLayout I;

    @n0
    public final LinearLayout J;

    @n0
    public final RelativeLayout K;

    @n0
    public final LinearLayout L;

    @n0
    public final FrameLayout M;

    @n0
    public final RelativeLayout N;

    @n0
    public final LinearLayout O;

    @n0
    public final ImageView P;

    @n0
    public final LinearLayout Q;

    @n0
    public final RelativeLayout R;

    @n0
    public final LinearLayout S;

    @n0
    public final LinearLayout T;

    @n0
    public final LinearLayout U;

    @n0
    public final LinearLayout V;

    @n0
    public final RelativeLayout W;

    @n0
    public final RelativeLayout X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f141683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final View f141684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f141686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f141687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final ImageView f141688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final ImageView f141689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final ImageView f141690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final ImageView f141691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final ImageView f141692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final ImageView f141693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final ImageView f141694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final ImageView f141695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final ImageView f141696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final ImageView f141697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final ProgressBar f141698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @n0
    public final SeekBar f141699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    public final TextView f141700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @n0
    public final TextView f141701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    public final TextView f141702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @n0
    public final TextView f141703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @n0
    public final TextView f141704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @n0
    public final TextView f141705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @n0
    public final TextView f141706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @n0
    public final TextView f141707y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @n0
    public final TextView f141708z;

    private c(@n0 RelativeLayout relativeLayout, @n0 View view, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 ImageView imageView5, @n0 ImageView imageView6, @n0 ImageView imageView7, @n0 ImageView imageView8, @n0 ImageView imageView9, @n0 ImageView imageView10, @n0 ImageView imageView11, @n0 ImageView imageView12, @n0 ImageView imageView13, @n0 ProgressBar progressBar, @n0 SeekBar seekBar, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 TextView textView6, @n0 TextView textView7, @n0 TextView textView8, @n0 TextView textView9, @n0 TextView textView10, @n0 View view2, @n0 View view3, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3, @n0 FrameLayout frameLayout, @n0 ImageView imageView14, @n0 LinearLayout linearLayout4, @n0 LinearLayout linearLayout5, @n0 RelativeLayout relativeLayout2, @n0 LinearLayout linearLayout6, @n0 FrameLayout frameLayout2, @n0 RelativeLayout relativeLayout3, @n0 LinearLayout linearLayout7, @n0 ImageView imageView15, @n0 LinearLayout linearLayout8, @n0 RelativeLayout relativeLayout4, @n0 LinearLayout linearLayout9, @n0 LinearLayout linearLayout10, @n0 LinearLayout linearLayout11, @n0 LinearLayout linearLayout12, @n0 RelativeLayout relativeLayout5, @n0 RelativeLayout relativeLayout6) {
        this.f141683a = relativeLayout;
        this.f141684b = view;
        this.f141685c = imageView;
        this.f141686d = imageView2;
        this.f141687e = imageView3;
        this.f141688f = imageView4;
        this.f141689g = imageView5;
        this.f141690h = imageView6;
        this.f141691i = imageView7;
        this.f141692j = imageView8;
        this.f141693k = imageView9;
        this.f141694l = imageView10;
        this.f141695m = imageView11;
        this.f141696n = imageView12;
        this.f141697o = imageView13;
        this.f141698p = progressBar;
        this.f141699q = seekBar;
        this.f141700r = textView;
        this.f141701s = textView2;
        this.f141702t = textView3;
        this.f141703u = textView4;
        this.f141704v = textView5;
        this.f141705w = textView6;
        this.f141706x = textView7;
        this.f141707y = textView8;
        this.f141708z = textView9;
        this.A = textView10;
        this.B = view2;
        this.C = view3;
        this.D = linearLayout;
        this.E = linearLayout2;
        this.F = linearLayout3;
        this.G = frameLayout;
        this.H = imageView14;
        this.I = linearLayout4;
        this.J = linearLayout5;
        this.K = relativeLayout2;
        this.L = linearLayout6;
        this.M = frameLayout2;
        this.N = relativeLayout3;
        this.O = linearLayout7;
        this.P = imageView15;
        this.Q = linearLayout8;
        this.R = relativeLayout4;
        this.S = linearLayout9;
        this.T = linearLayout10;
        this.U = linearLayout11;
        this.V = linearLayout12;
        this.W = relativeLayout5;
        this.X = relativeLayout6;
    }

    @n0
    public static c a(@n0 View view) {
        View viewA;
        View viewA2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Mx, new Class[]{View.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_blank;
        View viewA3 = l3.d.a(view, i10);
        if (viewA3 != null) {
            i10 = R.id.iv_back;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_info_close;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.iv_loading;
                    ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                    if (imageView3 != null) {
                        i10 = R.id.iv_lock_screen;
                        ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                        if (imageView4 != null) {
                            i10 = R.id.iv_mid_info;
                            ImageView imageView5 = (ImageView) l3.d.a(view, i10);
                            if (imageView5 != null) {
                                i10 = R.id.iv_more;
                                ImageView imageView6 = (ImageView) l3.d.a(view, i10);
                                if (imageView6 != null) {
                                    i10 = R.id.iv_mute_bottom;
                                    ImageView imageView7 = (ImageView) l3.d.a(view, i10);
                                    if (imageView7 != null) {
                                        i10 = R.id.iv_mute_top;
                                        ImageView imageView8 = (ImageView) l3.d.a(view, i10);
                                        if (imageView8 != null) {
                                            i10 = R.id.iv_preview;
                                            ImageView imageView9 = (ImageView) l3.d.a(view, i10);
                                            if (imageView9 != null) {
                                                i10 = R.id.iv_speed_up_left;
                                                ImageView imageView10 = (ImageView) l3.d.a(view, i10);
                                                if (imageView10 != null) {
                                                    i10 = R.id.iv_speed_up_right;
                                                    ImageView imageView11 = (ImageView) l3.d.a(view, i10);
                                                    if (imageView11 != null) {
                                                        i10 = R.id.iv_volume_left;
                                                        ImageView imageView12 = (ImageView) l3.d.a(view, i10);
                                                        if (imageView12 != null) {
                                                            i10 = R.id.iv_volume_right;
                                                            ImageView imageView13 = (ImageView) l3.d.a(view, i10);
                                                            if (imageView13 != null) {
                                                                i10 = R.id.pb_mid;
                                                                ProgressBar progressBar = (ProgressBar) l3.d.a(view, i10);
                                                                if (progressBar != null) {
                                                                    i10 = R.id.seek_bar;
                                                                    SeekBar seekBar = (SeekBar) l3.d.a(view, i10);
                                                                    if (seekBar != null) {
                                                                        i10 = R.id.tv_current_position;
                                                                        TextView textView = (TextView) l3.d.a(view, i10);
                                                                        if (textView != null) {
                                                                            i10 = R.id.tv_error_action;
                                                                            TextView textView2 = (TextView) l3.d.a(view, i10);
                                                                            if (textView2 != null) {
                                                                                i10 = R.id.tv_error_message;
                                                                                TextView textView3 = (TextView) l3.d.a(view, i10);
                                                                                if (textView3 != null) {
                                                                                    i10 = R.id.tv_info_action;
                                                                                    TextView textView4 = (TextView) l3.d.a(view, i10);
                                                                                    if (textView4 != null) {
                                                                                        i10 = R.id.tv_info_text;
                                                                                        TextView textView5 = (TextView) l3.d.a(view, i10);
                                                                                        if (textView5 != null) {
                                                                                            i10 = R.id.tv_loading_info;
                                                                                            TextView textView6 = (TextView) l3.d.a(view, i10);
                                                                                            if (textView6 != null) {
                                                                                                i10 = R.id.tv_loading_speed;
                                                                                                TextView textView7 = (TextView) l3.d.a(view, i10);
                                                                                                if (textView7 != null) {
                                                                                                    i10 = R.id.tv_preview;
                                                                                                    TextView textView8 = (TextView) l3.d.a(view, i10);
                                                                                                    if (textView8 != null) {
                                                                                                        i10 = R.id.tv_title;
                                                                                                        TextView textView9 = (TextView) l3.d.a(view, i10);
                                                                                                        if (textView9 != null) {
                                                                                                            i10 = R.id.tv_whole_duration;
                                                                                                            TextView textView10 = (TextView) l3.d.a(view, i10);
                                                                                                            if (textView10 != null && (viewA = l3.d.a(view, (i10 = R.id.v_blur_mask))) != null && (viewA2 = l3.d.a(view, (i10 = R.id.v_top_placeholder))) != null) {
                                                                                                                i10 = R.id.vg_bottom_panel;
                                                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                                                                                if (linearLayout != null) {
                                                                                                                    i10 = R.id.vg_bottom_panel_content;
                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                    if (linearLayout2 != null) {
                                                                                                                        i10 = R.id.vg_controller;
                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                        if (linearLayout3 != null) {
                                                                                                                            i10 = R.id.vg_error;
                                                                                                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                                                                                                                            if (frameLayout != null) {
                                                                                                                                i10 = R.id.vg_expand;
                                                                                                                                ImageView imageView14 = (ImageView) l3.d.a(view, i10);
                                                                                                                                if (imageView14 != null) {
                                                                                                                                    i10 = R.id.vg_fast_play;
                                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                    if (linearLayout4 != null) {
                                                                                                                                        i10 = R.id.vg_info;
                                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                        if (linearLayout5 != null) {
                                                                                                                                            i10 = R.id.vg_land_bottom_options;
                                                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                                                                                                                            if (relativeLayout != null) {
                                                                                                                                                i10 = R.id.vg_loading;
                                                                                                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                                if (linearLayout6 != null) {
                                                                                                                                                    i10 = R.id.vg_loading_container;
                                                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, i10);
                                                                                                                                                    if (frameLayout2 != null) {
                                                                                                                                                        i10 = R.id.vg_menu;
                                                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, i10);
                                                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                                                            i10 = R.id.vg_mid_info;
                                                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                                                i10 = R.id.vg_play_button;
                                                                                                                                                                ImageView imageView15 = (ImageView) l3.d.a(view, i10);
                                                                                                                                                                if (imageView15 != null) {
                                                                                                                                                                    i10 = R.id.vg_preview;
                                                                                                                                                                    LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                                                    if (linearLayout8 != null) {
                                                                                                                                                                        i10 = R.id.vg_recommend;
                                                                                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, i10);
                                                                                                                                                                        if (relativeLayout3 != null) {
                                                                                                                                                                            i10 = R.id.vg_top_controller;
                                                                                                                                                                            LinearLayout linearLayout9 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                                                            if (linearLayout9 != null) {
                                                                                                                                                                                i10 = R.id.vg_top_option;
                                                                                                                                                                                LinearLayout linearLayout10 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                                                                if (linearLayout10 != null) {
                                                                                                                                                                                    i10 = R.id.vg_top_panel;
                                                                                                                                                                                    LinearLayout linearLayout11 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                                                                    if (linearLayout11 != null) {
                                                                                                                                                                                        i10 = R.id.vg_top_panel_content;
                                                                                                                                                                                        LinearLayout linearLayout12 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                                                                        if (linearLayout12 != null) {
                                                                                                                                                                                            i10 = R.id.vg_user_interface;
                                                                                                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, i10);
                                                                                                                                                                                            if (relativeLayout4 != null) {
                                                                                                                                                                                                i10 = R.id.vg_volume;
                                                                                                                                                                                                RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, i10);
                                                                                                                                                                                                if (relativeLayout5 != null) {
                                                                                                                                                                                                    return new c((RelativeLayout) view, viewA3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, progressBar, seekBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewA, viewA2, linearLayout, linearLayout2, linearLayout3, frameLayout, imageView14, linearLayout4, linearLayout5, relativeLayout, linearLayout6, frameLayout2, relativeLayout2, linearLayout7, imageView15, linearLayout8, relativeLayout3, linearLayout9, linearLayout10, linearLayout11, linearLayout12, relativeLayout4, relativeLayout5);
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

    @n0
    public static c c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Kx, new Class[]{LayoutInflater.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static c d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Lx, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.game_video_ui, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f141683a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Nx, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
