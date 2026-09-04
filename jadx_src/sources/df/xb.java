package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentVoiceMicBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f117513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f117514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayoutCompat f117519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayoutCompat f117520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final SeekBar f117521l;

    private xb(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayoutCompat linearLayoutCompat, @androidx.annotation.n0 LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.n0 SeekBar seekBar) {
        this.f117510a = constraintLayout;
        this.f117511b = textView;
        this.f117512c = imageView;
        this.f117513d = progressBar;
        this.f117514e = titleBar;
        this.f117515f = textView2;
        this.f117516g = textView3;
        this.f117517h = frameLayout;
        this.f117518i = linearLayout;
        this.f117519j = linearLayoutCompat;
        this.f117520k = linearLayoutCompat2;
        this.f117521l = seekBar;
    }

    @androidx.annotation.n0
    public static xb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17580, new Class[]{View.class}, xb.class);
        if (patchProxyResultProxy.isSupported) {
            return (xb) patchProxyResultProxy.result;
        }
        int i10 = R.id.btn_connect_action;
        TextView textView = (TextView) l3.d.a(view, R.id.btn_connect_action);
        if (textView != null) {
            i10 = R.id.iv_mic_volume;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_mic_volume);
            if (imageView != null) {
                i10 = R.id.pb_volume;
                ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_volume);
                if (progressBar != null) {
                    i10 = R.id.title_bar;
                    TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.title_bar);
                    if (titleBar != null) {
                        i10 = R.id.tv_connect_status;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_connect_status);
                        if (textView2 != null) {
                            i10 = R.id.tv_mic_status;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_mic_status);
                            if (textView3 != null) {
                                i10 = R.id.vg_connect;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_connect);
                                if (frameLayout != null) {
                                    i10 = R.id.vg_connect_status;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_connect_status);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_mic_switch;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) l3.d.a(view, R.id.vg_mic_switch);
                                        if (linearLayoutCompat != null) {
                                            i10 = R.id.vg_mic_volume;
                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) l3.d.a(view, R.id.vg_mic_volume);
                                            if (linearLayoutCompat2 != null) {
                                                i10 = R.id.volume_seek_bar;
                                                SeekBar seekBar = (SeekBar) l3.d.a(view, R.id.volume_seek_bar);
                                                if (seekBar != null) {
                                                    return new xb((ConstraintLayout) view, textView, imageView, progressBar, titleBar, textView2, textView3, frameLayout, linearLayout, linearLayoutCompat, linearLayoutCompat2, seekBar);
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
    public static xb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17578, new Class[]{LayoutInflater.class}, xb.class);
        return patchProxyResultProxy.isSupported ? (xb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17579, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xb.class);
        if (patchProxyResultProxy.isSupported) {
            return (xb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_voice_mic, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117510a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17581, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
