package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGamecommentNoticeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SliceGradeView f114582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114585e;

    private pn(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SliceGradeView sliceGradeView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f114581a = linearLayout;
        this.f114582b = sliceGradeView;
        this.f114583c = textView;
        this.f114584d = frameLayout;
        this.f114585e = relativeLayout;
    }

    @androidx.annotation.n0
    public static pn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18792, new Class[]{View.class}, pn.class);
        if (patchProxyResultProxy.isSupported) {
            return (pn) patchProxyResultProxy.result;
        }
        int i10 = R.id.sgv;
        SliceGradeView sliceGradeView = (SliceGradeView) l3.d.a(view, R.id.sgv);
        if (sliceGradeView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.vg_close;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_close);
                if (frameLayout != null) {
                    i10 = R.id.vg_comment_notify;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_comment_notify);
                    if (relativeLayout != null) {
                        return new pn((LinearLayout) view, sliceGradeView, textView, frameLayout, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18790, new Class[]{LayoutInflater.class}, pn.class);
        return patchProxyResultProxy.isSupported ? (pn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18791, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pn.class);
        if (patchProxyResultProxy.isSupported) {
            return (pn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_gamecomment_notice, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114581a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18793, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
