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
public class PUBGDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGDetailActivity f88014b;

    @i1
    public PUBGDetailActivity_ViewBinding(PUBGDetailActivity pUBGDetailActivity) {
        this(pUBGDetailActivity, pUBGDetailActivity.getWindow().getDecorView());
    }

    @i1
    public PUBGDetailActivity_ViewBinding(PUBGDetailActivity pUBGDetailActivity, View view) {
        this.f88014b = pUBGDetailActivity;
        pUBGDetailActivity.vpRegion = (ViewPager) butterknife.internal.f.f(view, R.id.vp_region, "field 'vpRegion'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38173, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGDetailActivity pUBGDetailActivity = this.f88014b;
        if (pUBGDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88014b = null;
        pUBGDetailActivity.vpRegion = null;
    }
}
