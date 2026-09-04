package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.max.hbcustomview.seekbar.HbRangeTrendView;
import com.max.hbcustomview.seekbar.RangeSeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameFilterSliderTrendWithSwitchBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f131700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f131701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f131702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f131703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RangeSeekBar f131704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final HbRangeTrendView f131705g;

    private p1(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 RadioButton radioButton3, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 RangeSeekBar rangeSeekBar, @androidx.annotation.n0 HbRangeTrendView hbRangeTrendView) {
        this.f131699a = constraintLayout;
        this.f131700b = radioButton;
        this.f131701c = radioButton2;
        this.f131702d = radioButton3;
        this.f131703e = radioGroup;
        this.f131704f = rangeSeekBar;
        this.f131705g = hbRangeTrendView;
    }

    @androidx.annotation.n0
    public static p1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.Da, new Class[]{View.class}, p1.class);
        if (patchProxyResultProxy.isSupported) {
            return (p1) patchProxyResultProxy.result;
        }
        int i10 = R.id.rb_0;
        RadioButton radioButton = (RadioButton) l3.d.a(view, i10);
        if (radioButton != null) {
            i10 = R.id.rb_1;
            RadioButton radioButton2 = (RadioButton) l3.d.a(view, i10);
            if (radioButton2 != null) {
                i10 = R.id.rb_2;
                RadioButton radioButton3 = (RadioButton) l3.d.a(view, i10);
                if (radioButton3 != null) {
                    i10 = R.id.rg_playState;
                    RadioGroup radioGroup = (RadioGroup) l3.d.a(view, i10);
                    if (radioGroup != null) {
                        i10 = R.id.rsb;
                        RangeSeekBar rangeSeekBar = (RangeSeekBar) l3.d.a(view, i10);
                        if (rangeSeekBar != null) {
                            i10 = R.id.trend_view;
                            HbRangeTrendView hbRangeTrendView = (HbRangeTrendView) l3.d.a(view, i10);
                            if (hbRangeTrendView != null) {
                                return new p1((ConstraintLayout) view, radioButton, radioButton2, radioButton3, radioGroup, rangeSeekBar, hbRangeTrendView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static p1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Ba, new Class[]{LayoutInflater.class}, p1.class);
        return patchProxyResultProxy.isSupported ? (p1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.Ca, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p1.class);
        if (patchProxyResultProxy.isSupported) {
            return (p1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_filter_slider_trend_with_switch, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131699a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Ea, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
