package kotlinx.serialization;

import kotlin.r0;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@r0
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i10) {
        this("An unknown field for index " + i10);
    }

    public UnknownFieldException(@dl.e String str) {
        super(str);
    }
}
