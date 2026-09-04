package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements DynamiteModule.a.InterfaceC0412a {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a.InterfaceC0412a
    public final int a(Context context, String str, boolean z10) throws DynamiteModule.LoadingException {
        return DynamiteModule.f(context, str, z10);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a.InterfaceC0412a
    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}
