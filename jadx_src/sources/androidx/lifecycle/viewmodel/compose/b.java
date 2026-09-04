package androidx.lifecycle.viewmodel.compose;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import mh.d;

/* JADX INFO: compiled from: SavedStateHandleSaveableApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@mh.c(AnnotationRetention.RUNTIME)
@RequiresOptIn(level = RequiresOptIn.Level.WARNING)
@Retention(RetentionPolicy.RUNTIME)
@d(allowedTargets = {AnnotationTarget.FUNCTION})
public @interface b {
}
