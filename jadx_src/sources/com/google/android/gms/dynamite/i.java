package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements DynamiteModule.a {
    i() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0412a interfaceC0412a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.f52697a = interfaceC0412a.b(context, str);
        int iA = interfaceC0412a.a(context, str, true);
        bVar.f52698b = iA;
        int i10 = bVar.f52697a;
        if (i10 != 0) {
            if (i10 >= iA) {
                bVar.f52699c = -1;
            } else {
                bVar.f52699c = 1;
            }
        } else if (iA == 0) {
            bVar.f52699c = 0;
        } else {
            i10 = 0;
            if (i10 >= iA) {
                bVar.f52699c = -1;
            } else {
                bVar.f52699c = 1;
            }
        }
        return bVar;
    }
}
