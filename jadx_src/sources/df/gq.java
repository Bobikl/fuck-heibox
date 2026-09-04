package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemManagerAccountBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f111075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111080g;

    private gq(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f111074a = constraintLayout;
        this.f111075b = heyBoxAvatarView;
        this.f111076c = oVar;
        this.f111077d = imageView;
        this.f111078e = textView;
        this.f111079f = textView2;
        this.f111080g = textView3;
    }

    @androidx.annotation.n0
    public static gq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19068, new Class[]{View.class}, gq.class);
        if (patchProxyResultProxy.isSupported) {
            return (gq) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                i10 = R.id.iv_selected;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_selected);
                if (imageView != null) {
                    i10 = R.id.tv_id;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_id);
                    if (textView != null) {
                        i10 = R.id.tv_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView2 != null) {
                            i10 = R.id.v_remove;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.v_remove);
                            if (textView3 != null) {
                                return new gq((ConstraintLayout) view, heyBoxAvatarView, oVarA, imageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static gq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19066, new Class[]{LayoutInflater.class}, gq.class);
        return patchProxyResultProxy.isSupported ? (gq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19067, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gq.class);
        if (patchProxyResultProxy.isSupported) {
            return (gq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_manager_account, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111074a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19069, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
