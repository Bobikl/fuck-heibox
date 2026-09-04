package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameCompilationActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameCompilationActivity f84154b;

    @androidx.annotation.i1
    public GameCompilationActivity_ViewBinding(GameCompilationActivity gameCompilationActivity) {
        this(gameCompilationActivity, gameCompilationActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameCompilationActivity_ViewBinding(GameCompilationActivity gameCompilationActivity, View view) {
        this.f84154b = gameCompilationActivity;
        gameCompilationActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameCompilationActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32578, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameCompilationActivity gameCompilationActivity = this.f84154b;
        if (gameCompilationActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84154b = null;
        gameCompilationActivity.mRefreshLayout = null;
        gameCompilationActivity.mRecyclerView = null;
    }
}
