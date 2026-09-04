package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.m;
import kotlin.collections.z;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.q;
import kotlin.u0;
import org.apache.tools.ant.util.s0;
import xh.h;

/* JADX INFO: compiled from: KAnnotatedElements.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "KAnnotatedElements")
public final class b {
    @u0(version = "1.1")
    public static final /* synthetic */ <T extends Annotation> T a(kotlin.reflect.b bVar) {
        f0.p(bVar, "<this>");
        for (Object obj : bVar.getAnnotations()) {
            f0.y(3, androidx.exifinterface.media.a.f23244d5);
            if (((Annotation) obj) instanceof Annotation) {
                f0.y(1, "T?");
                return (T) obj;
            }
        }
        obj = null;
        f0.y(1, "T?");
        return (T) obj;
    }

    @u0(version = s0.f136932w)
    @e2(markerClass = {q.class})
    public static final /* synthetic */ <T extends Annotation> List<T> b(kotlin.reflect.b bVar) {
        f0.p(bVar, "<this>");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return c(bVar, n0.d(Annotation.class));
    }

    @u0(version = s0.f136932w)
    @dl.d
    @e2(markerClass = {q.class})
    public static final <T extends Annotation> List<T> c(@dl.d kotlin.reflect.b bVar, @dl.d kotlin.reflect.d<T> klass) throws IllegalAccessException, InvocationTargetException {
        Object next;
        f0.p(bVar, "<this>");
        f0.p(klass, "klass");
        List<T> listA1 = z.a1(bVar.getAnnotations(), xh.a.e(klass));
        if (!listA1.isEmpty()) {
            return listA1;
        }
        Class<? extends Annotation> clsB = a.f125063a.b(xh.a.e(klass));
        if (clsB != null) {
            Iterator<T> it = bVar.getAnnotations().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!f0.g(xh.a.e(xh.a.a((Annotation) next)), clsB));
            Annotation annotation = (Annotation) next;
            if (annotation != null) {
                Object objInvoke = annotation.getClass().getMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                f0.n(objInvoke, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.full.KAnnotatedElements.findAnnotations>");
                return m.t((Annotation[]) objInvoke);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    public static final /* synthetic */ <T extends Annotation> boolean d(kotlin.reflect.b bVar) {
        Object next;
        f0.p(bVar, "<this>");
        Iterator<T> it = bVar.getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f0.y(3, androidx.exifinterface.media.a.f23244d5);
        } while (!(((Annotation) next) instanceof Annotation));
        f0.y(1, "T?");
        return ((Annotation) next) != null;
    }
}
