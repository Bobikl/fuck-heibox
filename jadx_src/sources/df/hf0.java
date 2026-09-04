package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroImageView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchResultView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2RecordBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2HeroImageView f111427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchResultView f111428g;

    private hf0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 Dota2HeroImageView dota2HeroImageView, @androidx.annotation.n0 Dota2MatchResultView dota2MatchResultView) {
        this.f111422a = relativeLayout;
        this.f111423b = imageView;
        this.f111424c = textView;
        this.f111425d = textView2;
        this.f111426e = textView3;
        this.f111427f = dota2HeroImageView;
        this.f111428g = dota2MatchResultView;
    }

    @androidx.annotation.n0
    public static hf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21650, new Class[]{View.class}, hf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_dan_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_dan_icon);
        if (imageView != null) {
            i10 = R.id.tv_dan_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_dan_name);
            if (textView != null) {
                i10 = R.id.tv_data;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_data);
                if (textView2 != null) {
                    i10 = R.id.tv_data_desc;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_data_desc);
                    if (textView3 != null) {
                        i10 = R.id.v_dota2_hero;
                        Dota2HeroImageView dota2HeroImageView = (Dota2HeroImageView) l3.d.a(view, R.id.v_dota2_hero);
                        if (dota2HeroImageView != null) {
                            i10 = R.id.v_match_result;
                            Dota2MatchResultView dota2MatchResultView = (Dota2MatchResultView) l3.d.a(view, R.id.v_match_result);
                            if (dota2MatchResultView != null) {
                                return new hf0((RelativeLayout) view, imageView, textView, textView2, textView3, dota2HeroImageView, dota2MatchResultView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static hf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21648, new Class[]{LayoutInflater.class}, hf0.class);
        return patchProxyResultProxy.isSupported ? (hf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21649, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_record, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111422a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21651, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
