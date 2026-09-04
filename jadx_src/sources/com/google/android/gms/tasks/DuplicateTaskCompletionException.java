package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @androidx.annotation.p0 Throwable th2) {
        super(str, th2);
    }

    @androidx.annotation.n0
    public static IllegalStateException a(@androidx.annotation.n0 k<?> kVar) {
        String strConcat;
        if (!kVar.u()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excQ = kVar.q();
        if (excQ != null) {
            strConcat = "failure";
        } else if (kVar.v()) {
            strConcat = "result ".concat(String.valueOf(kVar.r()));
        } else {
            strConcat = kVar.t() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excQ);
    }
}
