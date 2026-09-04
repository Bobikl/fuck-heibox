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

/* JADX INFO: compiled from: LayoutFriendChatRoomFourBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112023e;

    private j50(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 FrameLayout frameLayout4) {
        this.f112019a = constraintLayout;
        this.f112020b = frameLayout;
        this.f112021c = frameLayout2;
        this.f112022d = frameLayout3;
        this.f112023e = frameLayout4;
    }

    @androidx.annotation.n0
    public static j50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20628, new Class[]{View.class}, j50.class);
        if (patchProxyResultProxy.isSupported) {
            return (j50) patchProxyResultProxy.result;
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
                    i10 = R.id.vg_avatar4;
                    FrameLayout frameLayout4 = (FrameLayout) l3.d.a(view, R.id.vg_avatar4);
                    if (frameLayout4 != null) {
                        return new j50((ConstraintLayout) view, frameLayout, frameLayout2, frameLayout3, frameLayout4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static j50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20626, new Class[]{LayoutInflater.class}, j50.class);
        return patchProxyResultProxy.isSupported ? (j50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20627, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j50.class);
        if (patchProxyResultProxy.isSupported) {
            return (j50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_friend_chat_room_four, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112019a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20629, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
