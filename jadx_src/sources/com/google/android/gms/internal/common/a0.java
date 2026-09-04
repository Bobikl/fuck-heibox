package com.google.android.gms.internal.common;

import com.starlightc.ucropplus.ui.UCropPlusActivity;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ b0 f52706i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(b0 b0Var, e0 e0Var, CharSequence charSequence) {
        super(e0Var, charSequence);
        this.f52706i = b0Var;
    }

    @Override // com.google.android.gms.internal.common.d0
    final int c(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.common.d0
    final int d(int i10) {
        v vVar = this.f52706i.f52710a;
        CharSequence charSequence = this.f52713d;
        int length = charSequence.length();
        z.b(i10, length, UCropPlusActivity.ARG_INDEX);
        while (i10 < length) {
            if (vVar.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
