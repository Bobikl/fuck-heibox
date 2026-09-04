package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDota2MatchBanPickBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class s0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f131741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f131742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131748i;

    private s0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5) {
        this.f131740a = linearLayout;
        this.f131741b = qMUIRadiusImageView;
        this.f131742c = qMUIRadiusImageView2;
        this.f131743d = textView;
        this.f131744e = textView2;
        this.f131745f = linearLayout2;
        this.f131746g = linearLayout3;
        this.f131747h = linearLayout4;
        this.f131748i = linearLayout5;
    }

    @androidx.annotation.n0
    public static s0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.P8, new Class[]{View.class}, s0.class);
        if (patchProxyResultProxy.isSupported) {
            return (s0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_dire_team;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, i10);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_radiant_team;
            QMUIRadiusImageView qMUIRadiusImageView2 = (QMUIRadiusImageView) l3.d.a(view, i10);
            if (qMUIRadiusImageView2 != null) {
                i10 = R.id.tv_dire_team_name;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    i10 = R.id.tv_radiant_team_name;
                    TextView textView2 = (TextView) l3.d.a(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.vg_dire_ban;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                        if (linearLayout != null) {
                            i10 = R.id.vg_dire_pick;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                            if (linearLayout2 != null) {
                                i10 = R.id.vg_radiant_ban;
                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                if (linearLayout3 != null) {
                                    i10 = R.id.vg_radiant_pick;
                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, i10);
                                    if (linearLayout4 != null) {
                                        return new s0((LinearLayout) view, qMUIRadiusImageView, qMUIRadiusImageView2, textView, textView2, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static s0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.N8, new Class[]{LayoutInflater.class}, s0.class);
        return patchProxyResultProxy.isSupported ? (s0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.O8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s0.class);
        if (patchProxyResultProxy.isSupported) {
            return (s0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dota2_match_ban_pick, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131740a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Q8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
