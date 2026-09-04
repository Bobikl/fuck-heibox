package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: VideoActionLikeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f117144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117146d;

    private wd0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f117143a = relativeLayout;
        this.f117144b = checkBox;
        this.f117145c = textView;
        this.f117146d = relativeLayout2;
    }

    @androidx.annotation.n0
    public static wd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21504, new Class[]{View.class}, wd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_like;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_like);
        if (checkBox != null) {
            i10 = R.id.tv_like;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_like);
            if (textView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new wd0(relativeLayout, checkBox, textView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21502, new Class[]{LayoutInflater.class}, wd0.class);
        return patchProxyResultProxy.isSupported ? (wd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21503, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.video_action_like, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117143a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21505, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
