package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J3\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J.\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010!¨\u0006%"}, d2 = {"Lkotlinx/coroutines/internal/n;", "", "Ljava/lang/Class;", "Lkotlinx/coroutines/internal/b0;", "baseClass", "", "serviceClass", ak.av, androidx.exifinterface.media.a.R4, "service", "Ljava/lang/ClassLoader;", "loader", "", ak.aF, "name", "b", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "f", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/util/jar/JarFile;Lyh/l;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "g", "d", "()Ljava/util/List;", "e", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/lang/String;", "PREFIX", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final n f130183a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final String PREFIX = "META-INF/services/";

    private n() {
    }

    private final b0 a(Class<b0> baseClass, String serviceClass) {
        try {
            return baseClass.cast(Class.forName(serviceClass, true, baseClass.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S b(String name, ClassLoader loader, Class<S> service) throws ClassNotFoundException {
        Class<?> cls = Class.forName(name, false, loader);
        if (service.isAssignableFrom(cls)) {
            return service.cast(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + service + ", but found " + cls).toString());
    }

    private final <S> List<S> c(Class<S> service, ClassLoader loader) {
        try {
            return e(service, loader);
        } catch (Throwable unused) {
            return CollectionsKt___CollectionsKt.Q5(ServiceLoader.load(service, loader));
        }
    }

    private final List<String> f(URL url) throws IllegalAccessException, InvocationTargetException {
        String string = url.toString();
        if (!kotlin.text.u.v2(string, "jar", false, 2, null)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> listG = f130183a.g(bufferedReader);
                kotlin.io.b.a(bufferedReader, null);
                return listG;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }
        String strX5 = StringsKt__StringsKt.x5(StringsKt__StringsKt.q5(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strQ5 = StringsKt__StringsKt.q5(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strX5, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strQ5)), "UTF-8"));
            try {
                List<String> listG2 = f130183a.g(bufferedReader2);
                kotlin.io.b.a(bufferedReader2, null);
                jarFile.close();
                return listG2;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    kotlin.io.b.a(bufferedReader2, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    jarFile.close();
                    throw th7;
                } catch (Throwable th8) {
                    kotlin.o.a(th6, th8);
                    throw th6;
                }
            }
        }
    }

    private final List<String> g(BufferedReader r10) throws IOException {
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = r10.readLine();
            if (line == null) {
                return CollectionsKt___CollectionsKt.Q5(linkedHashSet);
            }
            String string = StringsKt__StringsKt.F5(StringsKt__StringsKt.y5(line, "#", null, 2, null)).toString();
            int i10 = 0;
            while (true) {
                if (i10 >= string.length()) {
                    z10 = true;
                    break;
                }
                char cCharAt = string.charAt(i10);
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    private final <R> R h(JarFile jarFile, yh.l<? super JarFile, ? extends R> lVar) throws IllegalAccessException, InvocationTargetException {
        try {
            R rInvoke = lVar.invoke(jarFile);
            kotlin.jvm.internal.c0.d(1);
            jarFile.close();
            kotlin.jvm.internal.c0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.c0.d(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.c0.c(1);
                    throw th3;
                } catch (Throwable th4) {
                    kotlin.o.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    @dl.d
    public final List<b0> d() {
        b0 b0Var;
        if (!o.a()) {
            return c(b0.class, b0.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            b0 b0Var2 = null;
            try {
                b0Var = (b0) b0.class.cast(Class.forName("kotlinx.coroutines.android.a", true, b0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                b0Var = null;
            }
            if (b0Var != null) {
                arrayList.add(b0Var);
            }
            try {
                b0Var2 = (b0) b0.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, b0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (b0Var2 == null) {
                return arrayList;
            }
            arrayList.add(b0Var2);
            return arrayList;
        } catch (Throwable unused3) {
            return c(b0.class, b0.class.getClassLoader());
        }
    }

    @dl.d
    public final <S> List<S> e(@dl.d Class<S> service, @dl.d ClassLoader loader) {
        ArrayList list = Collections.list(loader.getResources(PREFIX + service.getName()));
        kotlin.jvm.internal.f0.o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.n0(arrayList, f130183a.f((URL) it.next()));
        }
        Set setV5 = CollectionsKt___CollectionsKt.V5(arrayList);
        if (!(!setV5.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(setV5, 10));
        Iterator it2 = setV5.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f130183a.b((String) it2.next(), loader, service));
        }
        return arrayList2;
    }
}
