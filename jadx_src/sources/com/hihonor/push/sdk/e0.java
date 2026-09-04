package com.hihonor.push.sdk;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class e0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f60018a;

    public e0(f0 f0Var) {
        this.f60018a = f0Var;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null || message.what != 1001) {
            return false;
        }
        this.f60018a.a(8002003);
        return true;
    }
}
