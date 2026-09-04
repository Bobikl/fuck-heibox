package com.max.xiaoheihe.module.game.ow;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.f;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class OWPlayerAchievementsActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OWPlayerAchievementsActivity f87922b;

    @i1
    public OWPlayerAchievementsActivity_ViewBinding(OWPlayerAchievementsActivity oWPlayerAchievementsActivity) {
        this(oWPlayerAchievementsActivity, oWPlayerAchievementsActivity.getWindow().getDecorView());
    }

    @i1
    public OWPlayerAchievementsActivity_ViewBinding(OWPlayerAchievementsActivity oWPlayerAchievementsActivity, View view) {
        this.f87922b = oWPlayerAchievementsActivity;
        oWPlayerAchievementsActivity.mRvList = (RecyclerView) f.f(view, R.id.rv, "field 'mRvList'", RecyclerView.class);
        oWPlayerAchievementsActivity.mSmartRefreshLayout = (SmartRefreshLayout) f.f(view, R.id.srl, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38039, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        OWPlayerAchievementsActivity oWPlayerAchievementsActivity = this.f87922b;
        if (oWPlayerAchievementsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f87922b = null;
        oWPlayerAchievementsActivity.mRvList = null;
        oWPlayerAchievementsActivity.mSmartRefreshLayout = null;
    }
}
