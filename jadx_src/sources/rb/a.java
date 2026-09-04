package rb;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseStateKeeperFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
public class a extends com.max.hbcommon.base.d implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    private final void L3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32030tf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        String pageAdditional = getPageAdditional();
        JsonObject jsonObject = !(pageAdditional == null || pageAdditional.length() == 0) ? (JsonObject) k.a(getPageAdditional(), JsonObject.class) : new JsonObject();
        long j10 = 1024;
        jsonObject.addProperty("dalvikMax", Long.valueOf(jMaxMemory / j10));
        jsonObject.addProperty("dalvikUsed", Long.valueOf(jFreeMemory / j10));
        jsonObject.addProperty("dalvikTotal", Long.valueOf(runtime.totalMemory() / j10));
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType("1");
        pageEventObj.setPath("/kill" + getPagePath());
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        pageEventObj.setAddition(jsonObject);
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    @dl.e
    public Bundle M() {
        return null;
    }

    @dl.e
    public String W2() {
        return null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.e.f31962pf, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        d.f138868a.g(this, bundle);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32013sf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        boolean zIsFinishing = this.mContext.isFinishing();
        g.f74531b.q("BaseStateKeeperFragment(" + getClass().getSimpleName() + "), onDestroy, mContext.isFinishing = " + zIsFinishing);
        d.f138868a.a(this, zIsFinishing);
        if (zIsFinishing) {
            return;
        }
        L3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4371, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@dl.d Bundle outState) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        if (PatchProxy.proxy(new Object[]{outState}, this, changeQuickRedirect, false, bb.c.e.f31979qf, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BaseStateKeeperFragment, onSaveInstanceState ");
        FragmentActivity activity = getActivity();
        Lifecycle.State stateB = null;
        sb2.append((activity == null || (lifecycle2 = activity.getLifecycle()) == null) ? null : lifecycle2.b());
        aVar.q(sb2.toString());
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (lifecycle = activity2.getLifecycle()) != null) {
            stateB = lifecycle.b();
        }
        if (stateB == Lifecycle.State.CREATED) {
            d.f138868a.h(this, outState, M());
        }
    }

    public void p3(@dl.e Bundle bundle) {
    }
}
