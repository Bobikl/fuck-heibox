package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserAchievementBadgeHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f112788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112792f;

    private l00(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f112787a = linearLayout;
        this.f112788b = heyBoxAvatarView;
        this.f112789c = relativeLayout;
        this.f112790d = textView;
        this.f112791e = textView2;
        this.f112792f = textView3;
    }

    @androidx.annotation.n0
    public static l00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20120, new Class[]{View.class}, l00.class);
        if (patchProxyResultProxy.isSupported) {
            return (l00) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.rl_medal_level;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
            if (relativeLayout != null) {
                i10 = R.id.tv_count;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
                if (textView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_user_name;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_user_name);
                        if (textView3 != null) {
                            return new l00((LinearLayout) view, heyBoxAvatarView, relativeLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20118, new Class[]{LayoutInflater.class}, l00.class);
        return patchProxyResultProxy.isSupported ? (l00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20119, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l00.class);
        if (patchProxyResultProxy.isSupported) {
            return (l00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_achievement_badge_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112787a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20121, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
