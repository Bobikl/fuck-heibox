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
public class PUBGWeaponsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGWeaponsFragment f88152b;

    @i1
    public PUBGWeaponsFragment_ViewBinding(PUBGWeaponsFragment pUBGWeaponsFragment, View view) {
        this.f88152b = pUBGWeaponsFragment;
        pUBGWeaponsFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        pUBGWeaponsFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38337, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGWeaponsFragment pUBGWeaponsFragment = this.f88152b;
        if (pUBGWeaponsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88152b = null;
        pUBGWeaponsFragment.mRefreshLayout = null;
        pUBGWeaponsFragment.mRecyclerView = null;
    }
}
