package com.google.firebase;

import androidx.annotation.n0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class a implements e {
    @Override // com.google.android.gms.common.api.internal.e
    @n0
    public final Exception a(@n0 Status status) {
        return status.d() == 8 ? new FirebaseException(status.o()) : new FirebaseApiNotAvailableException(status.o());
    }
}
