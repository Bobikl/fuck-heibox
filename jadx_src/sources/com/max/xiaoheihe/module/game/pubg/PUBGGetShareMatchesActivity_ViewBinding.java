package com.max.xiaoheihe.module.game.pubg;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGGetShareMatchesActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGGetShareMatchesActivity f88123b;

    @i1
    public PUBGGetShareMatchesActivity_ViewBinding(PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity) {
        this(pUBGGetShareMatchesActivity, pUBGGetShareMatchesActivity.getWindow().getDecorView());
    }

    @i1
    public PUBGGetShareMatchesActivity_ViewBinding(PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity, View view) {
        this.f88123b = pUBGGetShareMatchesActivity;
        pUBGGetShareMatchesActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        pUBGGetShareMatchesActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38301, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGGetShareMatchesActivity pUBGGetShareMatchesActivity = this.f88123b;
        if (pUBGGetShareMatchesActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88123b = null;
        pUBGGetShareMatchesActivity.mRefreshLayout = null;
        pUBGGetShareMatchesActivity.mRecyclerView = null;
    }
}
