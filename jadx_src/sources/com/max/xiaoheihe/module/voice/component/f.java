package com.max.xiaoheihe.module.voice.component;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ServiceUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f94113a = "Service";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d Messenger sender, @dl.d Bundle data, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{sender, data, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 46802, new Class[]{Messenger.class, Bundle.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sender, "sender");
        f0.p(data, "data");
        data.putBoolean("result", z10);
        Message message = new Message();
        message.setData(data);
        message.what = i10;
        try {
            sender.send(message);
        } catch (Exception e10) {
            g.f74531b.q("yjkdebug, reply, what = " + i10 + ", data = " + data + ", success = " + z10);
            e10.printStackTrace();
        }
    }
}
