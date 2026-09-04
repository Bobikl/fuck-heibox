package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Map;

/* JADX INFO: compiled from: BaseGameDataFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class d extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f87247p = 0;

    public static /* synthetic */ d K4(d dVar, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 32265, new Class[]{d.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        if (obj == null) {
            return dVar.J4(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) == 0 ? str4 : null);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newLittleProgrameFragment");
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32264, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.A4();
    }

    public final void I4(@dl.d Context context, int i10) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 32266, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        if (context instanceof com.max.hbminiprogram.h) {
            Bundle bundle = new Bundle();
            bundle.putInt(com.max.xiaoheihe.module.search.b.f91614a.e(), i10);
            ((com.max.hbminiprogram.h) context).s0(lb.d.f131253t, bundle);
        } else {
            Activity mContext = this.mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.w0(mContext, i10).A();
        }
    }

    @dl.d
    public abstract d J4(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4);

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.e
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        String str;
        String str2;
        String str3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 32267, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        String str4 = "";
        if (map != null) {
            str4 = (String) map.get("player_id");
            str2 = (String) map.get("user_id");
            str3 = (String) map.get("nick_name");
            str = (String) map.get("real_name");
        } else {
            str = "";
            str2 = str;
            str3 = str2;
        }
        return J4(str4, str2, str3, str);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32263, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        if (getActivity() instanceof com.max.hbminiprogram.h) {
            this.mTitleBar.setTitle(R.string.data);
        }
    }
}
