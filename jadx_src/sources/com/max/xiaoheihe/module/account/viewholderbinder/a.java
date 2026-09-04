package com.max.xiaoheihe.module.account.viewholderbinder;

import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PushStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PushStateHeaderVHB.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class a extends cb.c<PushStateObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f79436b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private c f79437a;

    public a(@d c param) {
        f0.p(param, "param");
        this.f79437a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, PushStateObj pushStateObj) {
        if (PatchProxy.proxy(new Object[]{eVar, pushStateObj}, this, changeQuickRedirect, false, 25543, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, pushStateObj);
    }

    public void f(@d s.e viewHolder, @d PushStateObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 25541, new Class[]{s.e.class, PushStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        g(viewHolder, data);
    }

    public final void g(@d s.e viewHolder, @d PushStateObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 25542, new Class[]{s.e.class, PushStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        ((TextView) viewHolder.i(R.id.tv_title)).setText(data.getPush_type_desc());
    }

    @d
    public final c h() {
        return this.f79437a;
    }

    public final void i(@d c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 25540, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cVar, "<set-?>");
        this.f79437a = cVar;
    }
}
