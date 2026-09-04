package com.jd.jdcache.match;

import com.jd.jdcache.match.base.JDCacheResourceMatcher;
import com.jd.jdcache.match.impl.HBMapResourceMatcher;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.io.File;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import yh.a;

/* JADX INFO: compiled from: ResourceMatcherManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nResourceMatcherManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceMatcherManager.kt\ncom/jd/jdcache/match/ResourceMatcherManager\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,68:1\n9#2,4:69\n9#2,4:73\n9#2,4:77\n9#2,4:82\n1855#3:81\n1856#3:86\n13579#4,2:87\n*S KotlinDebug\n*F\n+ 1 ResourceMatcherManager.kt\ncom/jd/jdcache/match/ResourceMatcherManager\n*L\n21#1:69,4\n26#1:73,4\n46#1:77,4\n57#1:82,4\n53#1:81\n53#1:86\n60#1:87,2\n*E\n"})
public final class ResourceMatcherManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final String f64145b = "ResourceMatcherManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final ResourceMatcherManager f64144a = new ResourceMatcherManager();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final z f64146c = b0.c(new a<LinkedList<Class<? extends JDCacheResourceMatcher>>>() { // from class: com.jd.jdcache.match.ResourceMatcherManager$defaultMatcherClassList$2
        @Override // yh.a
        @d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkedList<Class<? extends JDCacheResourceMatcher>> invoke() {
            return new LinkedList<>();
        }
    });

    private ResourceMatcherManager() {
    }

    private final List<Class<? extends JDCacheResourceMatcher>> d() {
        return (List) f64146c.getValue();
    }

    public final void a() {
        d().clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d
    public final LinkedList<JDCacheResourceMatcher> b(@e String[] strArr) {
        LinkedList<JDCacheResourceMatcher> linkedList = new LinkedList<>();
        Iterator<T> it = d().iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            try {
                linkedList.add(cls.newInstance());
            } catch (Throwable th2) {
                JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
                if (jDCacheLog.getCanLog()) {
                    jDCacheLog.e(f64145b, "Error in creating matcher instance for " + cls.getSimpleName(), th2);
                }
            }
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (str != null) {
                    linkedList.add(new HBMapResourceMatcher(str));
                    linkedList.add(new HBMapResourceMatcher(str + File.separator + str));
                }
            }
        }
        return linkedList;
    }

    @e
    public final JDCacheResourceMatcher c(@d Class<? extends JDCacheResourceMatcher> clazz) {
        f0.p(clazz, "clazz");
        try {
            return clazz.newInstance();
        } catch (Throwable th2) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(f64145b, "Error in creating matcher instance for " + clazz.getSimpleName(), th2);
            }
            return null;
        }
    }

    public final void e(@d Class<? extends JDCacheResourceMatcher> matcherClass) {
        f0.p(matcherClass, "matcherClass");
        int modifiers = matcherClass.getModifiers();
        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(f64145b, "Error in adding register matcher class. Cannot register abstract class.");
                return;
            }
            return;
        }
        if (!f0.g(matcherClass, n0.d(JDCacheResourceMatcher.class))) {
            d().add(matcherClass);
            return;
        }
        JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
        if (jDCacheLog2.getCanLog()) {
            jDCacheLog2.e(f64145b, "Error in adding register matcher class. Cannot add JDCacheResourceMatcher directly, you need to implement this class.");
        }
    }

    public final void f(@d Class<? extends JDCacheResourceMatcher> matcherClass) {
        f0.p(matcherClass, "matcherClass");
        d().remove(matcherClass);
    }
}
