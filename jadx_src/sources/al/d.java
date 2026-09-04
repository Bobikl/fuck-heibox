package al;

import cl.e0;
import cl.f0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: BottomVal.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@cl.q
@e0({a.class, c.class, e.class, l.class, r.class, m.class, b.class, h.class, k.class, i.class, j.class})
@f0({TypeUseLocation.EXPLICIT_LOWER_BOUND, TypeUseLocation.EXPLICIT_UPPER_BOUND})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface d {
}
