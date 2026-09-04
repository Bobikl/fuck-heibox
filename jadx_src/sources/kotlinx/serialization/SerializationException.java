package kotlinx.serialization;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class SerializationException extends IllegalArgumentException {
    public SerializationException() {
    }

    public SerializationException(@dl.e String str) {
        super(str);
    }

    public SerializationException(@dl.e String str, @dl.e Throwable th2) {
        super(str, th2);
    }

    public SerializationException(@dl.e Throwable th2) {
        super(th2);
    }
}
