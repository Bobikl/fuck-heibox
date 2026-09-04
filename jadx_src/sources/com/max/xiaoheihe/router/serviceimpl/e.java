package com.max.xiaoheihe.router.serviceimpl;

import androidx.annotation.n0;
import androidx.fragment.app.FragmentActivity;
import com.max.xiaoheihe.module.game.b0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.router.annotation.RouterService;

/* JADX INFO: compiled from: GameServiceImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.e.class}, key = {"game"})
public class e implements pb.e {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.e
    public void a(@n0 FragmentActivity fragmentActivity, @n0 String str) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, str}, this, changeQuickRedirect, false, 48357, new Class[]{FragmentActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        b0.f86512h.a(str).show(fragmentActivity.getSupportFragmentManager(), "GameExchangeDialogFragment");
    }
}
