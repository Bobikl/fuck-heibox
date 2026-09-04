package com.igexin.push.extension.distribution.basic.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.push.core.bean.PushTaskBean;

/* JADX INFO: loaded from: classes6.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.igexin.push.extension.distribution.basic.b.b f63912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PushTaskBean f63913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f63914c;

    f(e eVar, com.igexin.push.extension.distribution.basic.b.b bVar, PushTaskBean pushTaskBean) {
        this.f63914c = eVar;
        this.f63912a = bVar;
        this.f63913b = pushTaskBean;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = com.igexin.push.core.d.f63671e;
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(268435456);
            intent.addCategory("android.intent.category.HOME");
            context.startActivity(intent);
            if (TextUtils.isEmpty(this.f63912a.getDoActionId())) {
                return;
            }
            com.igexin.push.core.a.e.a().a(this.f63913b.getTaskId(), this.f63913b.getMessageId(), this.f63912a.getDoActionId());
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("StartHomeAction | " + th2.toString(), new Object[0]);
        }
    }
}
