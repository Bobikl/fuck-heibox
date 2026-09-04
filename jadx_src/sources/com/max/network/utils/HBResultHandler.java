package com.max.network.utils;

import bb.c;
import com.max.hbcommon.network.a;
import com.max.network.interfaces.ResultHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HBResultHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nHBResultHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBResultHandler.kt\ncom/max/network/utils/HBResultHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
public final class HBResultHandler implements ResultHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.network.interfaces.ResultHandler
    public void handlingApiExceptions(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.f35180zg, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ResultHandler.DefaultImpls.handlingApiExceptions(this, str);
    }

    @Override // com.max.network.interfaces.ResultHandler
    public void handlingEmptyExceptions() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ag, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ResultHandler.DefaultImpls.handlingEmptyExceptions(this);
    }

    @Override // com.max.network.interfaces.ResultHandler
    public void handlingExceptions(@e Throwable th2) {
        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, c.m.f35158yg, new Class[]{Throwable.class}, Void.TYPE).isSupported || th2 == null) {
            return;
        }
        a.a(th2, true);
    }
}
