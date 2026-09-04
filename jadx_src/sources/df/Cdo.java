package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: renamed from: df.do, reason: invalid class name */
/* JADX INFO: compiled from: ItemHashtagChooseNewEntryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Cdo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109844f;

    private Cdo(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f109839a = constraintLayout;
        this.f109840b = imageView;
        this.f109841c = textView;
        this.f109842d = textView2;
        this.f109843e = textView3;
        this.f109844f = textView4;
    }

    @androidx.annotation.n0
    public static Cdo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18848, new Class[]{View.class}, Cdo.class);
        if (patchProxyResultProxy.isSupported) {
            return (Cdo) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_hashtag_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_hashtag_icon);
        if (imageView != null) {
            i10 = R.id.tv_desc_discuss;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc_discuss);
            if (textView != null) {
                i10 = R.id.tv_desc_participate;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc_participate);
                if (textView2 != null) {
                    i10 = R.id.tv_hashtag_name;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_hashtag_name);
                    if (textView3 != null) {
                        i10 = R.id.tv_tag;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_tag);
                        if (textView4 != null) {
                            return new Cdo((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static Cdo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18846, new Class[]{LayoutInflater.class}, Cdo.class);
        return patchProxyResultProxy.isSupported ? (Cdo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static Cdo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18847, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, Cdo.class);
        if (patchProxyResultProxy.isSupported) {
            return (Cdo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_hashtag_choose_new_entry, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109839a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18849, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
