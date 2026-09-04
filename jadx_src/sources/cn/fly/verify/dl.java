package cn.fly.verify;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dn f36102a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Object> f36104c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private dl f36106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36107f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedList<Object> f36103b = new LinkedList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, Class<?>> f36105d = new HashMap<>();

    public dl(HashMap<String, Object> map, dn dnVar) {
        this.f36102a = dnVar;
        this.f36104c = new HashMap<>(map);
    }

    public Object a() {
        return this.f36103b.pop();
    }

    public Object a(final Object obj, final boolean z10, Class<?>... clsArr) {
        return Proxy.newProxyInstance(getClass().getClassLoader(), clsArr, new InvocationHandler() { // from class: cn.fly.verify.dl.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                Throwable th2;
                ds dsVar;
                LinkedList<Object> linkedListB;
                try {
                    Object obj3 = obj;
                    if (obj3 != null) {
                        dsVar = obj3 instanceof ds ? (ds) obj3 : (ds) ((Map) obj3).get(method.getName());
                    } else {
                        dsVar = null;
                    }
                    if (dsVar != null) {
                        if (objArr == null) {
                            objArr = new Object[0];
                        }
                        if (z10) {
                            linkedListB = dsVar.b(objArr);
                        } else {
                            try {
                                linkedListB = dsVar.b(objArr);
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    throw th2;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (linkedListB.isEmpty()) {
                            return null;
                        }
                        return linkedListB.get(0);
                        th2 = null;
                    } else {
                        th2 = null;
                    }
                } catch (Throwable unused2) {
                }
                if (th2 == null) {
                    return null;
                }
                throw th2;
            }
        });
    }

    public Object a(String str) {
        for (dl dlVar = this; dlVar != null; dlVar = dlVar.f36106e) {
            if (dlVar.f36104c.containsKey(str)) {
                return dlVar.f36104c.get(str);
            }
        }
        throw new RuntimeException("Can not find \"" + str + "\"");
    }

    public void a(Object obj) {
        this.f36103b.push(obj);
    }

    public void a(String str, Class<?> cls) {
        this.f36105d.put(str, cls);
    }

    public void a(String str, Object obj) {
        if (!this.f36104c.containsKey(str)) {
            this.f36104c.put(str, obj);
            return;
        }
        throw new RuntimeException("\"" + str + "\" has defined");
    }

    public void a(Method method, int i10) throws Throwable {
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = a();
        }
        a(method, objArr);
    }

    public void a(Method method, Object[] objArr) throws Throwable {
        Object obj;
        if (Modifier.isStatic(method.getModifiers())) {
            obj = null;
        } else {
            if (objArr.length <= 0) {
                throw new RuntimeException("receiver not found");
            }
            obj = objArr[0];
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                objArr2[i10] = objArr[i11];
                i10 = i11;
            }
            objArr = objArr2;
        }
        method.setAccessible(true);
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (method.getParameterTypes()[i12].isInterface()) {
                Object obj2 = objArr[i12];
                if (obj2 instanceof ds) {
                    objArr[i12] = a(obj2, true, method.getParameterTypes()[i12]);
                }
            }
        }
        if (method.getReturnType() == Void.TYPE) {
            method.invoke(obj, objArr);
        } else {
            a(method.invoke(obj, objArr));
        }
    }

    public dl b() {
        dl dlVar = new dl(new HashMap(), this.f36102a);
        dlVar.f36106e = this;
        return dlVar;
    }

    public Class<?> b(String str) {
        for (dl dlVar = this; dlVar != null; dlVar = dlVar.f36106e) {
            if (dlVar.f36105d.containsKey(str)) {
                return dlVar.f36105d.get(str);
            }
        }
        throw new RuntimeException("Can not find class " + str);
    }

    public void b(String str, Object obj) {
        if (this.f36104c.containsKey(str)) {
            this.f36104c.put(str, obj);
            return;
        }
        dl dlVar = this.f36106e;
        if (dlVar != null) {
            dlVar.b(str, obj);
            return;
        }
        throw new RuntimeException("\"" + str + "\" has not defined");
    }

    public dl c() {
        return this.f36106e;
    }

    public int d() {
        return this.f36103b.size();
    }

    public void e() {
        this.f36107f = true;
    }

    public boolean f() {
        return this.f36107f;
    }

    public dn g() {
        return this.f36102a;
    }
}
