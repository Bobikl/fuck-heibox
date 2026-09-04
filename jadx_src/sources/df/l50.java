package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFriendChatRoomThreeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112874d;

    private l50(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3) {
        this.f112871a = constraintLayout;
        this.f112872b = frameLayout;
        this.f112873c = frameLayout2;
        this.f112874d = frameLayout3;
    }

    @androidx.annotation.n0
    public static l50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20636, new Class[]{View.class}, l50.class);
        if (patchProxyResultProxy.isSupported) {
            return (l50) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_avatar1;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_avatar1);
        if (frameLayout != null) {
            i10 = R.id.vg_avatar2;
            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_avatar2);
            if (frameLayout2 != null) {
                i10 = R.id.vg_avatar3;
                FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_avatar3);
                if (frameLayout3 != null) {
                    return new l50((ConstraintLayout) view, frameLayout, frameLayout2, frameLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20634, new Class[]{LayoutInflater.class}, l50.class);
        return patchProxyResultProxy.isSupported ? (l50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20635, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l50.class);
        if (patchProxyResultProxy.isSupported) {
            return (l50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_friend_chat_room_three, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112871a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20637, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
