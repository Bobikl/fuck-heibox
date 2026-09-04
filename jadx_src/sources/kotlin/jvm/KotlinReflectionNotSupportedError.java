package kotlin.jvm;

import dl.e;

/* JADX INFO: compiled from: KotlinReflectionNotSupportedError.kt */
/* JADX INFO: loaded from: classes5.dex */
public class KotlinReflectionNotSupportedError extends Error {
    public KotlinReflectionNotSupportedError() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public KotlinReflectionNotSupportedError(@e String str) {
        super(str);
    }

    public KotlinReflectionNotSupportedError(@e String str, @e Throwable th2) {
        super(str, th2);
    }

    public KotlinReflectionNotSupportedError(@e Throwable th2) {
        super(th2);
    }
}
