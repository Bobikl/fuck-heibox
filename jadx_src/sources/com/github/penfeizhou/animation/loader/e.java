package com.github.penfeizhou.animation.loader;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ResourceStreamLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43320b;

    public e(Context context, int i10) {
        this.f43319a = context.getApplicationContext();
        this.f43320b = i10;
    }

    @Override // com.github.penfeizhou.animation.loader.f
    protected InputStream b() throws IOException {
        return this.f43319a.getResources().openRawResource(this.f43320b);
    }
}
