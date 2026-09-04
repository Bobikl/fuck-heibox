package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({})
@d
@mh.a
@Documented
@Retention(RetentionPolicy.RUNTIME)
@mh.d(allowedTargets = {AnnotationTarget.PROPERTY})
public @interface EncodeDefault {

    /* JADX INFO: compiled from: Annotations.kt */
    @d
    public enum Mode {
        ALWAYS,
        NEVER;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());

        @dl.d
        public static kotlin.enums.a<Mode> getEntries() {
            return $ENTRIES;
        }
    }

    Mode mode() default Mode.ALWAYS;
}
