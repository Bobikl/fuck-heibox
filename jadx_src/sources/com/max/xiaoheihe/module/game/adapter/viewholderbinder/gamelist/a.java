package com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameListMobileVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a extends e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86381g = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d d param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.e
    public void h(@dl.d s.e viewHolder, @dl.d GameObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36217, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        r1.E1(viewHolder, data, k());
    }
}
