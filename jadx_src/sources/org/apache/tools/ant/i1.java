package org.apache.tools.ant;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tools.ant.taskdefs.s4;

/* JADX INFO: compiled from: IntrospectionHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<String, i1> f133401h = new Hashtable();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f133402i = new HashMap(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f133403j = 20;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f133404k = "...";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final String f133405l = " doesn't support the nested \"";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final String f133406m = "\" element.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Class<?>> f133407a = new Hashtable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, p> f133408b = new Hashtable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Class<?>> f133409c = new Hashtable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, t> f133410d = new Hashtable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Method> f133411e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f133412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f133413g;

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class a extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f133414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Method f133415d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Method method, Class cls, Class cls2, Method method2) {
            super(method, cls);
            this.f133414c = cls2;
            this.f133415d = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, BuildException, InvocationTargetException {
            try {
                org.apache.tools.ant.types.w wVar = (org.apache.tools.ant.types.w) this.f133414c.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                wVar.g(str);
                this.f133415d.invoke(obj, wVar);
            } catch (InstantiationException | NoSuchMethodException e10) {
                throw new BuildException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class b extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f133417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f133418d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Method method, Class cls, Method method2, String str) {
            super(method, cls);
            this.f133417c = method2;
            this.f133418d = str;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, BuildException, InvocationTargetException {
            try {
                this.f133417c.invoke(obj, Long.valueOf(org.apache.tools.ant.util.j2.g(str)));
            } catch (IllegalAccessException e10) {
            } catch (NumberFormatException unused) {
                throw new BuildException("Can't assign non-numeric value '" + str + "' to attribute " + this.f133418d);
            } catch (InvocationTargetException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new BuildException(e12);
            }
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class c extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f133420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Constructor f133421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f133422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f133423f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Method method, Class cls, boolean z10, Constructor constructor, Method method2, String str) {
            super(method, cls);
            this.f133420c = z10;
            this.f133421d = constructor;
            this.f133422e = method2;
            this.f133423f = str;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, BuildException, InvocationTargetException {
            try {
                Object objNewInstance = this.f133421d.newInstance(this.f133420c ? new Object[]{project, str} : new Object[]{str});
                if (project != null) {
                    project.o1(objNewInstance);
                }
                this.f133422e.invoke(obj, objNewInstance);
            } catch (InstantiationException e10) {
                throw new BuildException(e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof IllegalArgumentException)) {
                    throw e11;
                }
                throw new BuildException("Can't assign value '" + str + "' to attribute " + this.f133423f + ", reason: " + cause.getClass() + " with message '" + cause.getMessage() + "'");
            }
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class d extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f133425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Method f133426d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Method method, Class cls, Class cls2, Method method2) {
            super(method, cls);
            this.f133425c = cls2;
            this.f133426d = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, BuildException, InvocationTargetException {
            try {
                this.f133426d.invoke(obj, Enum.valueOf(this.f133425c, str));
            } catch (IllegalArgumentException unused) {
                throw new BuildException("'" + str + "' is not a permitted value for " + this.f133425c.getName());
            }
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class e extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f133428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f133429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Method method, Object obj, Object obj2) {
            super(method);
            this.f133428b = obj;
            this.f133429c = obj2;
        }

        @Override // org.apache.tools.ant.i1.t
        Object b(Project project, Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            if (!c().getName().endsWith("Configured")) {
                c().invoke(obj, this.f133428b);
            }
            return this.f133429c;
        }

        @Override // org.apache.tools.ant.i1.t
        Object d() {
            return this.f133428b;
        }

        @Override // org.apache.tools.ant.i1.t
        void f(Object obj, Object obj2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            if (c().getName().endsWith("Configured")) {
                c().invoke(obj, this.f133428b);
            }
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class f extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f133431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Method method, Object obj) {
            super(method);
            this.f133431b = obj;
        }

        @Override // org.apache.tools.ant.i1.t
        Object b(Project project, Object obj, Object obj2) {
            return this.f133431b;
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class g extends p {
        g(Method method, Class cls) {
            super(method, cls);
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            throw new BuildException("Internal ant problem - this should not get called");
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class h extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f133434c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Method method, Class cls, Method method2) {
            super(method, cls);
            this.f133434c = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            this.f133434c.invoke(obj, str);
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class i extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f133436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Method f133437d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Method method, Class cls, String str, Method method2) {
            super(method, cls);
            this.f133436c = str;
            this.f133437d = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            if (!str.isEmpty()) {
                this.f133437d.invoke(obj, Character.valueOf(str.charAt(0)));
                return;
            }
            throw new BuildException("The value \"\" is not a legal value for attribute \"" + this.f133436c + "\"");
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class j extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f133439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Method method, Class cls, Method method2) {
            super(method, cls);
            this.f133439c = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            Method method = this.f133439c;
            Boolean[] boolArr = new Boolean[1];
            boolArr[0] = Project.t1(str) ? Boolean.TRUE : Boolean.FALSE;
            method.invoke(obj, boolArr);
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class k extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f133441c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Method method, Class cls, Method method2) {
            super(method, cls);
            this.f133441c = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, BuildException, InvocationTargetException {
            try {
                this.f133441c.invoke(obj, Class.forName(str));
            } catch (ClassNotFoundException e10) {
                throw new BuildException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class l extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f133443c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Method method, Class cls, Method method2) {
            super(method, cls);
            this.f133443c = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            this.f133443c.invoke(obj, project.W0(str));
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class m extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f133445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Method method, Class cls, Method method2) {
            super(method, cls);
            this.f133445c = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        public void c(Project project, Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            this.f133445c.invoke(obj, project.W0(str).toPath());
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public class n extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f133447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Method method, Class cls, Method method2) {
            super(method, cls);
            this.f133447c = method2;
        }

        @Override // org.apache.tools.ant.i1.p
        void c(Project project, Object obj, String str) throws IllegalAccessException, BuildException, InvocationTargetException {
            this.f133447c.invoke(obj, new org.apache.tools.ant.types.resources.z(project, project.W0(str)));
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public static class o extends t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f133449d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f133450e = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Constructor<?> f133451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f133452c;

        o(Method method, Constructor<?> constructor, int i10) {
            super(method);
            this.f133451b = constructor;
            this.f133452c = i10;
        }

        private void g(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            c().invoke(obj, obj2);
        }

        @Override // org.apache.tools.ant.i1.t
        Object b(Project project, Object obj, Object obj2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            if (obj2 == null) {
                Constructor<?> constructor = this.f133451b;
                obj2 = constructor.newInstance(constructor.getParameterTypes().length == 0 ? new Object[0] : new Object[]{project});
            }
            if (obj2 instanceof s4.a) {
                obj2 = ((s4.a) obj2).w(project);
            }
            if (this.f133452c == 1) {
                g(obj, obj2);
            }
            return obj2;
        }

        @Override // org.apache.tools.ant.i1.t
        boolean e() {
            return true;
        }

        @Override // org.apache.tools.ant.i1.t
        void f(Object obj, Object obj2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            if (this.f133452c == 2) {
                g(obj, obj2);
            }
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f133453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<?> f133454b;

        protected p(Method method, Class<?> cls) {
            this.f133453a = method;
            this.f133454b = cls;
        }

        abstract void c(Project project, Object obj, String str) throws IllegalAccessException, BuildException, InvocationTargetException;

        void d(Project project, Object obj, Object obj2) throws IllegalAccessException, BuildException, InvocationTargetException {
            Class<?> cls = this.f133454b;
            if (cls != null) {
                if (cls.isPrimitive()) {
                    if (obj2 == null) {
                        throw new BuildException("Attempt to set primitive " + i1.F(this.f133453a.getName(), "set") + " to null on " + obj);
                    }
                    cls = (Class) i1.f133402i.get(this.f133454b);
                }
                if (obj2 == null || cls.isInstance(obj2)) {
                    this.f133453a.invoke(obj, obj2);
                    return;
                }
            }
            c(project, obj, obj2.toString());
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public static class q extends t {
        q(Method method) {
            super(method);
        }

        @Override // org.apache.tools.ant.i1.t
        Object b(Project project, Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            return c().invoke(obj, new Object[0]);
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f133455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f133456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Project f133457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f133458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f133459e;

        private r(Project project, Object obj, t tVar) {
            this.f133457c = project;
            this.f133456b = obj;
            this.f133455a = tVar;
        }

        /* synthetic */ r(Project project, Object obj, t tVar, f fVar) {
            this(project, obj, tVar);
        }

        public Object a() {
            if (this.f133459e != null) {
                if (!this.f133455a.e()) {
                    throw new BuildException("Not allowed to use the polymorphic form for this element");
                }
                Object objL = u.y(this.f133457c).l(this.f133459e);
                this.f133458d = objL;
                if (objL == null) {
                    throw new BuildException("Unable to create object of type " + this.f133459e);
                }
            }
            try {
                Object objB = this.f133455a.b(this.f133457c, this.f133456b, this.f133458d);
                this.f133458d = objB;
                Project project = this.f133457c;
                if (project != null) {
                    project.o1(objB);
                }
                return this.f133458d;
            } catch (IllegalAccessException e10) {
                e = e10;
                throw new BuildException(e);
            } catch (IllegalArgumentException e11) {
                if (this.f133459e == null) {
                    throw e11;
                }
                throw new BuildException("Invalid type used " + this.f133459e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new BuildException(e);
            } catch (InvocationTargetException e13) {
                throw i1.m(e13);
            }
        }

        public Object b() {
            return this.f133455a.d();
        }

        public void c(String str) {
            this.f133459e = str;
        }

        public void d() {
            try {
                this.f133455a.f(this.f133456b, this.f133458d);
            } catch (IllegalAccessException e10) {
                e = e10;
                throw new BuildException(e);
            } catch (IllegalArgumentException e11) {
                if (this.f133459e == null) {
                    throw e11;
                }
                throw new BuildException("Invalid type used " + this.f133459e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new BuildException(e);
            } catch (InvocationTargetException e13) {
                throw i1.m(e13);
            }
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f133460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f133461b;

        public s(Method method, Object obj) {
            this.f133460a = method;
            this.f133461b = obj;
        }
    }

    /* JADX INFO: compiled from: IntrospectionHelper.java */
    public static abstract class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f133462a;

        protected t(Method method) {
            this.f133462a = method;
        }

        abstract Object b(Project project, Object obj, Object obj2) throws IllegalAccessException, InstantiationException, InvocationTargetException;

        Method c() {
            return this.f133462a;
        }

        Object d() {
            return null;
        }

        boolean e() {
            return false;
        }

        void f(Object obj, Object obj2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        }
    }

    static {
        Class<?>[] clsArr = {Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};
        Class<?>[] clsArr2 = {Boolean.class, Byte.class, Character.class, Short.class, Integer.class, Long.class, Float.class, Double.class};
        for (int i10 = 0; i10 < 8; i10++) {
            f133402i.put(clsArr[i10], clsArr2[i10]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0164  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bb  */
    private i1(Class<?> cls) throws NoSuchMethodException {
        Constructor<?> constructor;
        Constructor<?> constructor2;
        p pVarH;
        Class<?> cls2 = cls;
        this.f133413g = cls2;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        Method method = null;
        int i10 = 0;
        while (i10 < length) {
            Method method2 = methods[i10];
            String name = method2.getName();
            Class<?> returnType = method2.getReturnType();
            Class<?>[] parameterTypes = method2.getParameterTypes();
            if (parameterTypes.length == 1 && Void.TYPE.equals(returnType) && ("add".equals(name) || "addConfigured".equals(name))) {
                G(method2);
            } else {
                if ((!b2.class.isAssignableFrom(cls2) || parameterTypes.length != 1 || !J(name, parameterTypes[0])) && (!H() || parameterTypes.length != 1 || !"addTask".equals(name) || !u2.class.equals(parameterTypes[0]))) {
                    if ("addText".equals(name) && Void.TYPE.equals(returnType) && parameterTypes.length == 1 && String.class.equals(parameterTypes[0])) {
                        method = method2;
                    } else if (name.startsWith("set") && Void.TYPE.equals(returnType) && parameterTypes.length == 1) {
                        char c10 = 0;
                        if (!parameterTypes[0].isArray()) {
                            String strF = F(name, "set");
                            p pVar = this.f133408b.get(strF);
                            if (pVar == null) {
                                pVarH = h(method2, parameterTypes[c10], strF);
                                if (pVarH != null) {
                                    this.f133407a.put(strF, parameterTypes[c10]);
                                    this.f133408b.put(strF, pVarH);
                                }
                            } else if (!String.class.equals(parameterTypes[0])) {
                                if (!File.class.equals(parameterTypes[0]) || (!org.apache.tools.ant.types.s1.class.equals(pVar.f133454b) && !org.apache.tools.ant.types.resources.y.class.equals(pVar.f133454b))) {
                                    c10 = 0;
                                    pVarH = h(method2, parameterTypes[c10], strF);
                                    if (pVarH != null) {
                                        this.f133407a.put(strF, parameterTypes[c10]);
                                        this.f133408b.put(strF, pVarH);
                                    }
                                }
                            }
                        } else if (!name.startsWith(TopicHashtagWrapper.TYPE_CREATE)) {
                            if (!name.startsWith("addConfigured")) {
                                if (!name.startsWith("add")) {
                                }
                            } else if (!name.startsWith("add")) {
                            }
                        } else if (!name.startsWith("addConfigured")) {
                            if (!name.startsWith("add")) {
                            }
                        } else if (!name.startsWith("add")) {
                        }
                    } else if (!name.startsWith(TopicHashtagWrapper.TYPE_CREATE) && !returnType.isArray() && !returnType.isPrimitive() && parameterTypes.length == 0) {
                        String strF2 = F(name, TopicHashtagWrapper.TYPE_CREATE);
                        if (this.f133410d.get(strF2) == null) {
                            this.f133409c.put(strF2, returnType);
                            this.f133410d.put(strF2, new q(method2));
                        }
                    } else if (!name.startsWith("addConfigured") && Void.TYPE.equals(returnType) && parameterTypes.length == 1 && !String.class.equals(parameterTypes[0]) && !parameterTypes[0].isArray() && !parameterTypes[0].isPrimitive()) {
                        try {
                            constructor2 = parameterTypes[0].getConstructor(new Class[0]);
                        } catch (NoSuchMethodException unused) {
                            constructor2 = parameterTypes[0].getConstructor(Project.class);
                        }
                        try {
                            String strF3 = F(name, "addConfigured");
                            this.f133409c.put(strF3, parameterTypes[0]);
                            this.f133410d.put(strF3, new o(method2, constructor2, 2));
                        } catch (NoSuchMethodException unused2) {
                        }
                    } else if (!name.startsWith("add") && Void.TYPE.equals(returnType) && parameterTypes.length == 1) {
                        if (!String.class.equals(parameterTypes[0]) && !parameterTypes[0].isArray() && !parameterTypes[0].isPrimitive()) {
                            try {
                                try {
                                    constructor = parameterTypes[0].getConstructor(new Class[0]);
                                } catch (NoSuchMethodException unused3) {
                                    constructor = parameterTypes[0].getConstructor(Project.class);
                                }
                                String strF4 = F(name, "add");
                                if (this.f133409c.get(strF4) == null) {
                                    try {
                                        this.f133409c.put(strF4, parameterTypes[0]);
                                        this.f133410d.put(strF4, new o(method2, constructor, 1));
                                    } catch (NoSuchMethodException unused4) {
                                    }
                                }
                            } catch (NoSuchMethodException unused5) {
                            }
                        }
                    }
                }
                i10++;
                cls2 = cls;
            }
            i10++;
            cls2 = cls;
        }
        this.f133412f = method;
    }

    public static synchronized i1 A(Class<?> cls) {
        return B(null, cls);
    }

    public static synchronized i1 B(Project project, Class<?> cls) {
        i1 i1Var;
        Map<String, i1> map = f133401h;
        i1Var = map.get(cls.getName());
        if (i1Var == null || i1Var.f133413g != cls) {
            i1Var = new i1(cls);
            if (project != null) {
                map.put(cls.getName(), i1Var);
            }
        }
        return i1Var;
    }

    private t C(Project project, String str, Object obj, String str2, z2 z2Var) throws BuildException {
        String strK = e2.k(str2);
        String strJ = e2.j(str2);
        if (strK.equals(e2.f133119c)) {
            strK = "";
        }
        if (str.equals(e2.f133119c)) {
            str = "";
        }
        t fVar = (strK.equals(str) || strK.isEmpty()) ? this.f133410d.get(strJ.toLowerCase(Locale.ENGLISH)) : null;
        if (fVar == null) {
            fVar = g(project, obj, str2);
        }
        if (fVar == null && ((obj instanceof b1) || (obj instanceof a1))) {
            Object objI = i(obj, z2Var != null ? z2Var.o2() : "", strJ, z2Var == null ? strJ : z2Var.q2());
            if (objI != null) {
                fVar = new f(null, objI);
            }
        }
        if (fVar == null) {
            S(project, obj, str2);
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String F(String str, String str2) {
        return str.substring(str2.length()).toLowerCase(Locale.ENGLISH);
    }

    private void G(Method method) {
        Class<?> cls = method.getParameterTypes()[0];
        int size = this.f133411e.size();
        for (int i10 = 0; i10 < size; i10++) {
            Method method2 = this.f133411e.get(i10);
            if (method2.getParameterTypes()[0].equals(cls)) {
                if ("addConfigured".equals(method.getName())) {
                    this.f133411e.set(i10, method);
                    return;
                }
                return;
            } else {
                if (method2.getParameterTypes()[0].isAssignableFrom(cls)) {
                    this.f133411e.add(i10, method);
                    return;
                }
            }
        }
        this.f133411e.add(method);
    }

    private boolean J(String str, Class<?> cls) {
        return ("setLocation".equals(str) && Location.class.equals(cls)) || ("setTaskType".equals(str) && String.class.equals(cls));
    }

    public static synchronized void e() {
        f133401h.clear();
    }

    private String f(String str) {
        return str.length() <= 20 ? str : new StringBuffer(str).replace(8, str.length() - 8, f133404k).toString();
    }

    private t g(Project project, Object obj, String str) throws BuildException {
        if (this.f133411e.isEmpty()) {
            return null;
        }
        u uVarY = u.y(project);
        s sVarK = k(uVarY, str, this.f133411e);
        s sVarL = l(uVarY, str, this.f133411e);
        if (sVarK == null && sVarL == null) {
            return null;
        }
        if (sVarK != null && sVarL != null) {
            throw new BuildException("ambiguous: type and component definitions for " + str);
        }
        if (sVarK == null) {
            sVarK = sVarL;
        }
        Object objW = sVarK.f133461b;
        if (sVarK.f133461b instanceof s4.a) {
            objW = ((s4.a) sVarK.f133461b).w(project);
        }
        return new e(sVarK.f133460a, objW, sVarK.f133461b);
    }

    private p h(Method method, Class<?> cls, String str) throws NoSuchMethodException {
        boolean z10;
        Constructor<?> constructor;
        Class<?> cls2 = (Class) f133402i.getOrDefault(cls, cls);
        if (Object.class == cls2) {
            return new g(method, cls);
        }
        if (String.class.equals(cls2)) {
            return new h(method, cls, method);
        }
        if (Character.class.equals(cls2)) {
            return new i(method, cls, str, method);
        }
        if (Boolean.class.equals(cls2)) {
            return new j(method, cls, method);
        }
        if (Class.class.equals(cls2)) {
            return new k(method, cls, method);
        }
        if (File.class.equals(cls2)) {
            return new l(method, cls, method);
        }
        if (Path.class.equals(cls2)) {
            return new m(method, cls, method);
        }
        if (org.apache.tools.ant.types.s1.class.equals(cls2) || org.apache.tools.ant.types.resources.y.class.equals(cls2)) {
            return new n(method, cls, method);
        }
        if (org.apache.tools.ant.types.w.class.isAssignableFrom(cls2)) {
            return new a(method, cls, cls2, method);
        }
        p pVarY = y(cls2, method, cls);
        if (pVarY != null) {
            return pVarY;
        }
        if (Long.class.equals(cls2)) {
            return new b(method, cls, method, str);
        }
        try {
            try {
                constructor = cls2.getConstructor(Project.class, String.class);
                z10 = true;
            } catch (NoSuchMethodException unused) {
                Constructor<?> constructor2 = cls2.getConstructor(String.class);
                z10 = false;
                constructor = constructor2;
            }
            return new c(method, cls, z10, constructor, method, str);
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    private Object i(Object obj, String str, String str2, String str3) {
        Object objW = obj instanceof b1 ? ((b1) obj).w(str, str2, str3) : null;
        return (objW == null && (obj instanceof a1)) ? ((a1) obj).J0(str2.toLowerCase(Locale.ENGLISH)) : objW;
    }

    private s k(u uVar, String str, List<Method> list) {
        Project projectH = uVar.H();
        org.apache.tools.ant.h hVarO = o(uVar, str, list);
        if (hVarO == null) {
            return null;
        }
        Method methodN = n(hVarO.g(projectH), list);
        if (methodN == null) {
            throw new BuildException("Ant Internal Error - contract mismatch for " + str);
        }
        Object objB = hVarO.b(projectH);
        if (objB != null) {
            return new s(methodN, objB);
        }
        throw new BuildException("Failed to create object " + str + " of type " + hVarO.i(projectH));
    }

    private s l(u uVar, String str, List<Method> list) {
        Method methodN;
        Class<?> clsX = uVar.x(str);
        if (clsX == null || (methodN = n(clsX, this.f133411e)) == null) {
            return null;
        }
        return new s(methodN, uVar.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BuildException m(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        return targetException instanceof BuildException ? (BuildException) targetException : new BuildException(targetException);
    }

    private Method n(Class<?> cls, List<Method> list) {
        Method method = null;
        if (cls == null) {
            return null;
        }
        Class<?> cls2 = null;
        for (Method method2 : list) {
            Class<?> cls3 = method2.getParameterTypes()[0];
            if (cls3.isAssignableFrom(cls)) {
                if (cls2 == null) {
                    method = method2;
                    cls2 = cls3;
                } else if (!cls3.isAssignableFrom(cls2)) {
                    throw new BuildException("ambiguous: types " + cls2.getName() + " and " + cls3.getName() + " match " + cls.getName());
                }
            }
        }
        return method;
    }

    private org.apache.tools.ant.h o(u uVar, String str, List<Method> list) {
        List<org.apache.tools.ant.h> listJ = uVar.J(str);
        org.apache.tools.ant.h hVar = null;
        if (listJ == null) {
            return null;
        }
        synchronized (listJ) {
            Class<?> cls = null;
            for (org.apache.tools.ant.h hVar2 : listJ) {
                Class<?> clsG = hVar2.g(uVar.H());
                if (clsG != null && n(clsG, list) != null) {
                    if (cls != null) {
                        throw new BuildException("ambiguous: restricted definitions for " + str + " " + cls + " and " + clsG);
                    }
                    hVar = hVar2;
                    cls = clsG;
                }
            }
        }
        return hVar;
    }

    private String w(Project project, Object obj) {
        return project.k0(obj);
    }

    private p y(Class<?> cls, Method method, Class<?> cls2) {
        if (cls.isEnum()) {
            return new d(method, cls2, cls, method);
        }
        return null;
    }

    public Map<String, Class<?>> D() {
        return this.f133409c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f133409c);
    }

    public Enumeration<String> E() {
        return Collections.enumeration(this.f133409c.keySet());
    }

    public boolean H() {
        return x2.class.isAssignableFrom(this.f133413g);
    }

    public boolean I() {
        return a1.class.isAssignableFrom(this.f133413g) || b1.class.isAssignableFrom(this.f133413g);
    }

    public void K(Project project, Object obj, String str, Object obj2) throws BuildException {
        String str2;
        Map<String, p> map = this.f133408b;
        Locale locale = Locale.ENGLISH;
        p pVar = map.get(str.toLowerCase(locale));
        if (pVar != null || obj2 == null) {
            if (pVar != null) {
                try {
                    pVar.d(project, obj, obj2);
                    return;
                } catch (IllegalAccessException e10) {
                    throw new BuildException(e10);
                } catch (InvocationTargetException e11) {
                    throw m(e11);
                }
            }
            return;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            String strK = e2.k(e2.k(str));
            String strJ = e2.j(str);
            if (strK.isEmpty()) {
                str2 = strJ;
            } else {
                str2 = strK + ":" + strJ;
            }
            x0Var.a(strK, strJ, str2, obj2.toString());
            return;
        }
        if (obj instanceof c1) {
            ((c1) obj).a(str.toLowerCase(locale), obj2);
            return;
        }
        if (obj instanceof w0) {
            ((w0) obj).r0(str.toLowerCase(locale), obj2.toString());
            return;
        }
        if (str.contains(":")) {
            return;
        }
        throw new UnsupportedAttributeException(w(project, obj) + " doesn't support the \"" + str + "\" attribute.", str);
    }

    public void L(Project project, Object obj, String str, String str2) throws BuildException {
        K(project, obj, str, str2);
    }

    public void M(Project project, Object obj, Object obj2, String str) throws BuildException {
        t tVar;
        if (str == null || (tVar = this.f133410d.get(str.toLowerCase(Locale.ENGLISH))) == null) {
            return;
        }
        try {
            tVar.f(obj, obj2);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new BuildException(e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new BuildException(e);
        } catch (InvocationTargetException e12) {
            throw m(e12);
        }
    }

    public boolean N() {
        return this.f133412f != null;
    }

    public boolean O(String str) {
        return P("", str);
    }

    public boolean P(String str, String str2) {
        return I() || !this.f133411e.isEmpty() || R(str, str2);
    }

    public boolean Q(String str, String str2, Project project, Object obj) {
        return !(this.f133411e.isEmpty() || g(project, obj, str2) == null) || I() || R(str, str2);
    }

    public boolean R(String str, String str2) {
        if (!this.f133410d.containsKey(e2.j(str2).toLowerCase(Locale.ENGLISH))) {
            return false;
        }
        String strK = e2.k(str2);
        if (strK.equals(e2.f133119c) || strK.isEmpty()) {
            return true;
        }
        if (str.equals(e2.f133119c)) {
            str = "";
        }
        return strK.equals(str);
    }

    public void S(Project project, Object obj, String str) {
        throw new UnsupportedElementException(project.k0(obj) + f133405l + str + f133406m, str);
    }

    public void d(Project project, Object obj, String str) throws BuildException {
        Method method = this.f133412f;
        if (method != null) {
            try {
                method.invoke(obj, str);
                return;
            } catch (IllegalAccessException e10) {
                throw new BuildException(e10);
            } catch (InvocationTargetException e11) {
                throw m(e11);
            }
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return;
        }
        throw new BuildException(project.k0(obj) + " doesn't support nested text data (\"" + f(strTrim) + "\").");
    }

    @Deprecated
    public Object j(Project project, Object obj, String str) throws BuildException {
        try {
            Object objB = C(project, "", obj, str, null).b(project, obj, null);
            if (project != null) {
                project.o1(objB);
            }
            return objB;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new BuildException(e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new BuildException(e);
        } catch (InvocationTargetException e12) {
            throw m(e12);
        }
    }

    public Method p() throws BuildException {
        if (N()) {
            return this.f133412f;
        }
        throw new BuildException("Class " + this.f133413g.getName() + " doesn't support nested text data.");
    }

    public Map<String, Class<?>> q() {
        return this.f133407a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f133407a);
    }

    public Method r(String str) throws BuildException {
        p pVar = this.f133408b.get(str);
        if (pVar != null) {
            return pVar.f133453a;
        }
        throw new UnsupportedAttributeException("Class " + this.f133413g.getName() + " doesn't support the \"" + str + "\" attribute.", str);
    }

    public Class<?> s(String str) throws BuildException {
        Class<?> cls = this.f133407a.get(str);
        if (cls != null) {
            return cls;
        }
        throw new UnsupportedAttributeException("Class " + this.f133413g.getName() + " doesn't support the \"" + str + "\" attribute.", str);
    }

    public Enumeration<String> t() {
        return Collections.enumeration(this.f133408b.keySet());
    }

    public r u(Project project, String str, Object obj, String str2, z2 z2Var) {
        return new r(project, obj, C(project, str, obj, str2, z2Var), null);
    }

    public Method v(String str) throws BuildException {
        t tVar = this.f133410d.get(str);
        if (tVar != null) {
            return tVar.f133462a;
        }
        throw new UnsupportedElementException("Class " + this.f133413g.getName() + f133405l + str + f133406m, str);
    }

    public Class<?> x(String str) throws BuildException {
        Class<?> cls = this.f133409c.get(str);
        if (cls != null) {
            return cls;
        }
        throw new UnsupportedElementException("Class " + this.f133413g.getName() + f133405l + str + f133406m, str);
    }

    public List<Method> z() {
        return this.f133411e.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(this.f133411e);
    }
}
