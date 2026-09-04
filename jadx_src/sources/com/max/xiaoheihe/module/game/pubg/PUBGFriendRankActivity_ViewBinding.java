package com.max.xiaoheihe.module.game.pubg;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGFriendRankActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGFriendRankActivity f88064b;

    @i1
    public PUBGFriendRankActivity_ViewBinding(PUBGFriendRankActivity pUBGFriendRankActivity) {
        this(pUBGFriendRankActivity, pUBGFriendRankActivity.getWindow().getDecorView());
    }

    @i1
    public PUBGFriendRankActivity_ViewBinding(PUBGFriendRankActivity pUBGFriendRankActivity, View view) {
        this.f88064b = pUBGFriendRankActivity;
        pUBGFriendRankActivity.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38244, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGFriendRankActivity pUBGFriendRankActivity = this.f88064b;
        if (pUBGFriendRankActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88064b = null;
        pUBGFriendRankActivity.mViewPager = null;
    }
}
