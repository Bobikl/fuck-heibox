package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameStorePurchaseShareActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameStorePurchaseShareActivity f85110b;

    @androidx.annotation.i1
    public GameStorePurchaseShareActivity_ViewBinding(GameStorePurchaseShareActivity gameStorePurchaseShareActivity) {
        this(gameStorePurchaseShareActivity, gameStorePurchaseShareActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameStorePurchaseShareActivity_ViewBinding(GameStorePurchaseShareActivity gameStorePurchaseShareActivity, View view) {
        this.f85110b = gameStorePurchaseShareActivity;
        gameStorePurchaseShareActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameStorePurchaseShareActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        gameStorePurchaseShareActivity.mActivateTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_activate, "field 'mActivateTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34392, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameStorePurchaseShareActivity gameStorePurchaseShareActivity = this.f85110b;
        if (gameStorePurchaseShareActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85110b = null;
        gameStorePurchaseShareActivity.mRefreshLayout = null;
        gameStorePurchaseShareActivity.mRecyclerView = null;
        gameStorePurchaseShareActivity.mActivateTextView = null;
    }
}
