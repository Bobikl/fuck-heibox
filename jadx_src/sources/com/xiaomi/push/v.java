package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class v extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f108053a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.f108053a = runnable;
    }

    @Override // com.xiaomi.push.u
    protected void a(Context context) {
        Runnable runnable = this.f108053a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
