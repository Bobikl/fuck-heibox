package com.igexin.push.a.a;

import android.os.Message;
import com.igexin.push.core.CoreConsts;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.igexin.push.f.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f63313a = 0;

    @Override // com.igexin.push.f.b.c
    public void a() {
        Message messageObtain = Message.obtain();
        messageObtain.what = CoreConsts.f63460j;
        com.igexin.push.core.c.a().a(messageObtain);
    }

    @Override // com.igexin.push.f.b.c
    public void a(long j10) {
        this.f63313a = j10;
    }

    @Override // com.igexin.push.f.b.c
    public boolean b() {
        return System.currentTimeMillis() - this.f63313a > 360000;
    }
}
