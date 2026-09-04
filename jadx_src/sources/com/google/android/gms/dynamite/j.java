package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements DynamiteModule.a {
    j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0412a interfaceC0412a) throws DynamiteModule.LoadingException {
        int iA;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB = interfaceC0412a.b(context, str);
        bVar.f52697a = iB;
        int i10 = 0;
        if (iB != 0) {
            iA = interfaceC0412a.a(context, str, false);
            bVar.f52698b = iA;
        } else {
            iA = interfaceC0412a.a(context, str, true);
            bVar.f52698b = iA;
        }
        int i11 = bVar.f52697a;
        if (i11 == 0) {
            if (iA == 0) {
                bVar.f52699c = 0;
            }
            return bVar;
        }
        i10 = i11;
        if (i10 >= iA) {
            bVar.f52699c = -1;
        } else {
            bVar.f52699c = 1;
        }
        return bVar;
    }
}
