package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.AvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserMedalHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AvatarView f115754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115760h;

    private t00(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 AvatarView avatarView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f115753a = constraintLayout;
        this.f115754b = avatarView;
        this.f115755c = imageView;
        this.f115756d = recyclerView;
        this.f115757e = textView;
        this.f115758f = textView2;
        this.f115759g = textView3;
        this.f115760h = frameLayout;
    }

    @androidx.annotation.n0
    public static t00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20152, new Class[]{View.class}, t00.class);
        if (patchProxyResultProxy.isSupported) {
            return (t00) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        AvatarView avatarView = (AvatarView) l3.d.a(view, R.id.avatar);
        if (avatarView != null) {
            i10 = R.id.iv_medal;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_medal);
            if (imageView != null) {
                i10 = R.id.rv_medals;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_medals);
                if (recyclerView != null) {
                    i10 = R.id.tv_medal_count;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_medal_count);
                    if (textView != null) {
                        i10 = R.id.tv_username;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_username);
                        if (textView2 != null) {
                            i10 = R.id.tv_wear_state;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_wear_state);
                            if (textView3 != null) {
                                i10 = R.id.vg_medal;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_medal);
                                if (frameLayout != null) {
                                    return new t00((ConstraintLayout) view, avatarView, imageView, recyclerView, textView, textView2, textView3, frameLayout);
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
    public static t00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20150, new Class[]{LayoutInflater.class}, t00.class);
        return patchProxyResultProxy.isSupported ? (t00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20151, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t00.class);
        if (patchProxyResultProxy.isSupported) {
            return (t00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_medal_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115753a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20153, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
