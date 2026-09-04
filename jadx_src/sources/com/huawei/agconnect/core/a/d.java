package com.huawei.agconnect.core.a;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.Service;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Class<?>, Service> f60178a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Class<?>, Object> f60179b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Class<?>, Service> f60180c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<Class<?>, Object> f60181d = new HashMap();

    d(List<Service> list, Context context) {
        a(list, context);
    }

    private Object a(AGConnectInstance aGConnectInstance, Service service) {
        StringBuilder sb2;
        if (service.getInstance() != null) {
            return service.getInstance();
        }
        Class<?> type = service.getType();
        if (type == null) {
            return null;
        }
        try {
            Constructor constructorA = a(type, Context.class, AGConnectInstance.class);
            if (constructorA != null) {
                return constructorA.newInstance(aGConnectInstance.getContext(), aGConnectInstance);
            }
            Constructor constructorA2 = a(type, Context.class);
            return constructorA2 != null ? constructorA2.newInstance(aGConnectInstance.getContext()) : type.newInstance();
        } catch (IllegalAccessException e10) {
            e = e10;
            sb2 = new StringBuilder();
            sb2.append("Instantiate service exception ");
            sb2.append(e.getLocalizedMessage());
            Log.e("ServiceRepository", sb2.toString());
            return null;
        } catch (InstantiationException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("Instantiate service exception ");
            sb2.append(e.getLocalizedMessage());
            Log.e("ServiceRepository", sb2.toString());
            return null;
        } catch (InvocationTargetException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("Instantiate service exception ");
            sb2.append(e.getLocalizedMessage());
            Log.e("ServiceRepository", sb2.toString());
            return null;
        }
    }

    private static Constructor a(Class cls, Class... clsArr) {
        boolean z10 = false;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == clsArr.length) {
                for (int i10 = 0; i10 < clsArr.length; i10++) {
                    z10 = parameterTypes[i10] == clsArr[i10];
                }
                if (z10) {
                    return constructor;
                }
            }
        }
        return null;
    }

    private void a(String str, Exception exc) {
        Log.e("ServiceRepository", "Instantiate shared service " + str + exc.getLocalizedMessage());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cause message:");
        sb2.append(exc.getCause() != null ? exc.getCause().getMessage() : "");
        Log.e("ServiceRepository", sb2.toString());
    }

    public <T> T a(AGConnectInstance aGConnectInstance, Class<?> cls) {
        T t10;
        Service service = this.f60180c.get(cls);
        if (service == null && (service = f60178a.get(cls)) != null) {
            return (T) f60179b.get(cls);
        }
        if (service == null) {
            return null;
        }
        if (service.isSingleton() && (t10 = (T) this.f60181d.get(cls)) != null) {
            return t10;
        }
        T t11 = (T) a(aGConnectInstance, service);
        if (t11 != null && service.isSingleton()) {
            this.f60181d.put(cls, t11);
        }
        return t11;
    }

    public void a(List<Service> list, Context context) {
        Map<Class<?>, Service> map;
        String str;
        if (list == null) {
            return;
        }
        for (Service service : list) {
            if (service.isSharedInstance()) {
                if (!f60178a.containsKey(service.getInterface())) {
                    map = f60178a;
                }
                if (!service.isAutoCreated() && service.getType() != null && !f60179b.containsKey(service.getInterface())) {
                    try {
                        Constructor constructorA = a(service.getType(), Context.class);
                        f60179b.put(service.getInterface(), constructorA != null ? constructorA.newInstance(context) : service.getType().newInstance());
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        str = "AccessException";
                        a(str, e);
                    } catch (InstantiationException e11) {
                        e = e11;
                        str = "InstantiationException";
                        a(str, e);
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        str = "TargetException";
                        a(str, e);
                    }
                }
            } else {
                map = this.f60180c;
            }
            map.put(service.getInterface(), service);
            if (!service.isAutoCreated()) {
            }
        }
    }
}
