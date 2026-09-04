package okhttp3.internal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import mh.c;
import mh.d;

/* JADX INFO: compiled from: SuppressSignatureCheck.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@c(AnnotationRetention.BINARY)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/SuppressSignatureCheck;", "", "okhttp"}, k = 1, mv = {1, 4, 0})
@Documented
@Retention(RetentionPolicy.CLASS)
@d(allowedTargets = {AnnotationTarget.CONSTRUCTOR, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION})
public @interface SuppressSignatureCheck {
}
