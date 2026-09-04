package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameDetailComment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ik implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameDetailComment f111823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameDetailComment f111824b;

    private ik(@androidx.annotation.n0 GameDetailComment gameDetailComment, @androidx.annotation.n0 GameDetailComment gameDetailComment2) {
        this.f111823a = gameDetailComment;
        this.f111824b = gameDetailComment2;
    }

    @androidx.annotation.n0
    public static ik a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18455, new Class[]{View.class}, ik.class);
        if (patchProxyResultProxy.isSupported) {
            return (ik) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameDetailComment gameDetailComment = (GameDetailComment) view;
        return new ik(gameDetailComment, gameDetailComment);
    }

    @androidx.annotation.n0
    public static ik c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18453, new Class[]{LayoutInflater.class}, ik.class);
        return patchProxyResultProxy.isSupported ? (ik) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ik d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18454, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ik.class);
        if (patchProxyResultProxy.isSupported) {
            return (ik) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameDetailComment b() {
        return this.f111823a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18456, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
