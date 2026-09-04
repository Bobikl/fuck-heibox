package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class g implements DynamiteModule.a {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0412a interfaceC0412a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB = interfaceC0412a.b(context, str);
        bVar.f52697a = iB;
        if (iB != 0) {
            bVar.f52699c = -1;
        } else {
            int iA = interfaceC0412a.a(context, str, true);
            bVar.f52698b = iA;
            if (iA != 0) {
                bVar.f52699c = 1;
            }
        }
        return bVar;
    }
}
