package r1;

import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.p0;

/* JADX INFO: compiled from: Preview.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@mh.c(AnnotationRetention.BINARY)
@mh.b
@mh.a
@Retention(RetentionPolicy.CLASS)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001Bx\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004R\u0011\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u0018"}, d2 = {"Lr1/c;", "", "", "name", "()Ljava/lang/String;", MallPurchaseDetailDialogFragment.f89681y1, "", "apiLevel", "()I", "widthDp", "heightDp", "locale", "", "fontScale", "()F", "", "showSystemUi", "()Z", "showBackground", "", com.google.android.exoplayer2.text.ttml.d.H, "()J", "uiMode", "device", "ui-tooling-preview_release"}, k = 1, mv = {1, 7, 1})
@Documented
@Repeatable(a.class)
@mh.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
public @interface c {

    /* JADX INFO: compiled from: Preview.kt */
    @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @mh.c(AnnotationRetention.BINARY)
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @p0
    @Retention(RetentionPolicy.CLASS)
    @mh.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
    public @interface a {
        c[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0;

    String device() default "";

    float fontScale() default 1.0f;

    String group() default "";

    int heightDp() default -1;

    String locale() default "";

    String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int widthDp() default -1;
}
