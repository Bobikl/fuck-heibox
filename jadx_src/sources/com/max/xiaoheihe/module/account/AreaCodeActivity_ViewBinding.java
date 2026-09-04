package com.max.xiaoheihe.module.account;

import android.view.View;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcustomview.indexbar.IndexBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class AreaCodeActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AreaCodeActivity f77487b;

    @i1
    public AreaCodeActivity_ViewBinding(AreaCodeActivity areaCodeActivity) {
        this(areaCodeActivity, areaCodeActivity.getWindow().getDecorView());
    }

    @i1
    public AreaCodeActivity_ViewBinding(AreaCodeActivity areaCodeActivity, View view) {
        this.f77487b = areaCodeActivity;
        areaCodeActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        areaCodeActivity.indexBar = (IndexBar) butterknife.internal.f.f(view, R.id.indexBar, "field 'indexBar'", IndexBar.class);
        areaCodeActivity.vMask = butterknife.internal.f.e(view, R.id.v_mask, "field 'vMask'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22413, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AreaCodeActivity areaCodeActivity = this.f77487b;
        if (areaCodeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77487b = null;
        areaCodeActivity.mRecyclerView = null;
        areaCodeActivity.indexBar = null;
        areaCodeActivity.vMask = null;
    }
}
