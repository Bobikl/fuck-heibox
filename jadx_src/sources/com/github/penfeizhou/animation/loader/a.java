package com.github.penfeizhou.animation.loader;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: AssetStreamLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43316b;

    public a(Context context, String str) {
        this.f43315a = context.getApplicationContext();
        this.f43316b = str;
    }

    @Override // com.github.penfeizhou.animation.loader.f
    protected InputStream b() throws IOException {
        return this.f43315a.getAssets().open(this.f43316b);
    }
}
