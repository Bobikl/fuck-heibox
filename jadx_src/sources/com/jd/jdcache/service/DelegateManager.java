package com.jd.jdcache.service;

import com.jd.jdcache.service.base.AbstractDelegate;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.b0;
import kotlin.c1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import yh.a;

/* JADX INFO: compiled from: DelegateManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nDelegateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegateManager.kt\ncom/jd/jdcache/service/DelegateManager\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,122:1\n9#2,4:123\n9#2,4:127\n9#2,4:131\n9#2,4:135\n9#2,4:139\n9#2,4:143\n9#2,4:147\n*S KotlinDebug\n*F\n+ 1 DelegateManager.kt\ncom/jd/jdcache/service/DelegateManager\n*L\n20#1:123,4\n26#1:127,4\n36#1:131,4\n90#1:135,4\n96#1:139,4\n114#1:143,4\n118#1:147,4\n*E\n"})
public final class DelegateManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final String f64179b = "DelegateManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final DelegateManager f64178a = new DelegateManager();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final z f64180c = b0.c(new a<HashMap<String, Pair<? extends Class<? extends AbstractDelegate>, ? extends AbstractDelegate>>>() { // from class: com.jd.jdcache.service.DelegateManager$delegateMap$2
        @Override // yh.a
        @d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<String, Pair<Class<? extends AbstractDelegate>, AbstractDelegate>> invoke() {
            return new HashMap<>();
        }
    });

    private DelegateManager() {
    }

    private final HashMap<String, Pair<Class<? extends AbstractDelegate>, AbstractDelegate>> d() {
        return (HashMap) f64180c.getValue();
    }

    public final void a(@d Class<? extends AbstractDelegate> delegateClass) {
        f0.p(delegateClass, "delegateClass");
        if (f0.g(delegateClass, AbstractDelegate.class)) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(f64179b, "Error in adding delegate class. Cannot add AbstractDelegate directly, you need to implement this class.");
                return;
            }
            return;
        }
        int modifiers = delegateClass.getModifiers();
        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
            if (jDCacheLog2.getCanLog()) {
                jDCacheLog2.e(f64179b, "Error in adding delegate class. Cannot add abstract class.");
                return;
            }
            return;
        }
        Class<? super Object> superclass = delegateClass.getSuperclass();
        if (superclass == null || !AbstractDelegate.class.isAssignableFrom(superclass)) {
            superclass = null;
        }
        Class<? extends AbstractDelegate> cls = delegateClass;
        while (superclass != null && !f0.g(superclass, AbstractDelegate.class)) {
            Class<? super Object> superclass2 = superclass.getSuperclass();
            if (superclass2 == null || !AbstractDelegate.class.isAssignableFrom(superclass2)) {
                superclass2 = null;
            }
            Class<? super Object> cls2 = superclass2;
            cls = superclass;
            superclass = cls2;
        }
        String name = cls.getName();
        if (name.length() == 0) {
            JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
            if (jDCacheLog3.getCanLog()) {
                jDCacheLog3.e(f64179b, "Error in adding delegate class. Cannot find valid delegate type for your class: " + delegateClass);
                return;
            }
            return;
        }
        JDCacheLog jDCacheLog4 = JDCacheLog.INSTANCE;
        if (jDCacheLog4.getCanLog()) {
            jDCacheLog4.d(f64179b, "Add delegate: " + name + " -> " + delegateClass.getName());
        }
        d().put(name, c1.a(delegateClass, null));
    }

    public final /* synthetic */ <T extends AbstractDelegate> T b() {
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return (T) c(AbstractDelegate.class);
    }

    @e
    public final <T extends AbstractDelegate> T c(@d Class<? extends AbstractDelegate> delegateType) {
        f0.p(delegateType, "delegateType");
        String name = delegateType.getName();
        if (name.length() == 0) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(f64179b, "Error in getting delegate instance. Delegate type (" + delegateType + ") is illegal.");
            }
            return null;
        }
        Pair<Class<? extends AbstractDelegate>, AbstractDelegate> pair = d().get(name);
        if (pair == null) {
            JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
            if (jDCacheLog2.getCanLog()) {
                jDCacheLog2.e(f64179b, "Error in getting delegate instance. Cannot find delegate for type " + name + ", you must register it first.");
            }
            return null;
        }
        Class<? extends AbstractDelegate> clsA = pair.a();
        T t10 = (T) pair.b();
        if (t10 == null) {
            try {
                t10 = (T) clsA.newInstance();
            } catch (Exception e10) {
                JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
                if (jDCacheLog3.getCanLog()) {
                    jDCacheLog3.e(f64179b, "Cannot create delegate's instance.", e10);
                }
            }
            d().put(name, c1.a(clsA, t10));
        }
        f0.n(t10, "null cannot be cast to non-null type T of com.jd.jdcache.service.DelegateManager.getDelegate");
        return t10;
    }
}
