package com.google.firebase;

import androidx.annotation.n0;
import com.google.android.gms.common.internal.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@n0 String str) {
        super(str);
        p.i(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@n0 String str, @n0 Throwable th2) {
        super(str, th2);
        p.i(str, "Detail message must not be empty");
    }
}
