package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemAuthorInfoFloatingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f112559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Layer f112560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112564g;

    private kd(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 Layer layer, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f112558a = constraintLayout;
        this.f112559b = heyBoxAvatarView;
        this.f112560c = layer;
        this.f112561d = relativeLayout;
        this.f112562e = textView;
        this.f112563f = textView2;
        this.f112564g = textView3;
    }

    @androidx.annotation.n0
    public static kd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17736, new Class[]{View.class}, kd.class);
        if (patchProxyResultProxy.isSupported) {
            return (kd) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.layer_author;
            Layer layer = (Layer) l3.d.a(view, R.id.layer_author);
            if (layer != null) {
                i10 = R.id.rl_medal_level;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
                if (relativeLayout != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView2 != null) {
                            i10 = R.id.tv_subscribe;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_subscribe);
                            if (textView3 != null) {
                                return new kd((ConstraintLayout) view, heyBoxAvatarView, layer, relativeLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17734, new Class[]{LayoutInflater.class}, kd.class);
        return patchProxyResultProxy.isSupported ? (kd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17735, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kd.class);
        if (patchProxyResultProxy.isSupported) {
            return (kd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_author_info_floating, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112558a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17737, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
