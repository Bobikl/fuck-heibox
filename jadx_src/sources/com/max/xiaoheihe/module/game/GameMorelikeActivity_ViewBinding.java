package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameMorelikeActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameMorelikeActivity f84566b;

    @androidx.annotation.i1
    public GameMorelikeActivity_ViewBinding(GameMorelikeActivity gameMorelikeActivity) {
        this(gameMorelikeActivity, gameMorelikeActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameMorelikeActivity_ViewBinding(GameMorelikeActivity gameMorelikeActivity, View view) {
        this.f84566b = gameMorelikeActivity;
        gameMorelikeActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameMorelikeActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33349, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameMorelikeActivity gameMorelikeActivity = this.f84566b;
        if (gameMorelikeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84566b = null;
        gameMorelikeActivity.mRefreshLayout = null;
        gameMorelikeActivity.mRecyclerView = null;
    }
}
