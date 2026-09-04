package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements DynamiteModule.a {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0412a interfaceC0412a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iA = interfaceC0412a.a(context, str, false);
        bVar.f52698b = iA;
        if (iA == 0) {
            bVar.f52699c = 0;
        } else {
            bVar.f52699c = 1;
        }
        return bVar;
    }
}
