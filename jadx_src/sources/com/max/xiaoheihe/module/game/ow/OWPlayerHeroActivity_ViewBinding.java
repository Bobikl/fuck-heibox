package com.max.xiaoheihe.module.game.ow;

import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.i;
import androidx.annotation.i1;
import butterknife.Unbinder;
import butterknife.internal.f;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class OWPlayerHeroActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OWPlayerHeroActivity f87959b;

    @i1
    public OWPlayerHeroActivity_ViewBinding(OWPlayerHeroActivity oWPlayerHeroActivity) {
        this(oWPlayerHeroActivity, oWPlayerHeroActivity.getWindow().getDecorView());
    }

    @i1
    public OWPlayerHeroActivity_ViewBinding(OWPlayerHeroActivity oWPlayerHeroActivity, View view) {
        this.f87959b = oWPlayerHeroActivity;
        oWPlayerHeroActivity.mRefreshLayout = (SmartRefreshLayout) f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        oWPlayerHeroActivity.mListView = (ListView) f.f(view, R.id.lv, "field 'mListView'", ListView.class);
        oWPlayerHeroActivity.mStickyLayoutHeaderView = (RelativeLayout) f.f(view, R.id.sticky_layout_header, "field 'mStickyLayoutHeaderView'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38066, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        OWPlayerHeroActivity oWPlayerHeroActivity = this.f87959b;
        if (oWPlayerHeroActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f87959b = null;
        oWPlayerHeroActivity.mRefreshLayout = null;
        oWPlayerHeroActivity.mListView = null;
        oWPlayerHeroActivity.mStickyLayoutHeaderView = null;
    }
}
