package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.FollowButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutLinkUserTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f114464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FollowButton f114466d;

    private p70(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 FollowButton followButton) {
        this.f114463a = linearLayout;
        this.f114464b = heyBoxAvatarView;
        this.f114465c = textView;
        this.f114466d = followButton;
    }

    @androidx.annotation.n0
    public static p70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20858, new Class[]{View.class}, p70.class);
        if (patchProxyResultProxy.isSupported) {
            return (p70) patchProxyResultProxy.result;
        }
        int i10 = R.id.title_avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.title_avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.title_name;
            TextView textView = (TextView) l3.d.a(view, R.id.title_name);
            if (textView != null) {
                i10 = R.id.v_follow_btn;
                FollowButton followButton = (FollowButton) l3.d.a(view, R.id.v_follow_btn);
                if (followButton != null) {
                    return new p70((LinearLayout) view, heyBoxAvatarView, textView, followButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static p70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20856, new Class[]{LayoutInflater.class}, p70.class);
        return patchProxyResultProxy.isSupported ? (p70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20857, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p70.class);
        if (patchProxyResultProxy.isSupported) {
            return (p70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_link_user_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114463a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20859, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
