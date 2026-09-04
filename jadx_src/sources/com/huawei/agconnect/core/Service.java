package com.huawei.agconnect.core;

import com.huawei.agconnect.annotation.AutoCreated;
import com.huawei.agconnect.annotation.SharedInstance;
import com.huawei.agconnect.annotation.Singleton;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes7.dex */
public class Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f60153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f60154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f60155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f60157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60158f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Class<?> f60159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Class<?> f60160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f60161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f60162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f60163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f60164f;

        public Service build() {
            Class<?> cls = this.f60159a;
            if (cls == null) {
                throw new IllegalArgumentException("the interface parameter cannot be NULL");
            }
            Class<?> cls2 = this.f60160b;
            if (cls2 == null) {
                Object obj = this.f60161c;
                if (obj == null) {
                    throw new IllegalArgumentException("the clazz or object parameter must set one");
                }
                Service service = new Service(cls, obj);
                service.f60156d = this.f60162d;
                return service;
            }
            if (cls2.isInterface() || !Modifier.isPublic(this.f60160b.getModifiers())) {
                throw new IllegalArgumentException("the clazz parameter cant be interface type or not public");
            }
            Service service2 = new Service((Class) this.f60159a, (Class) this.f60160b);
            service2.f60156d = this.f60162d;
            service2.f60157e = this.f60163e;
            service2.f60158f = this.f60164f;
            return service2;
        }

        public Builder isAutoCreated(boolean z10) {
            this.f60164f = z10;
            return this;
        }

        public Builder isSharedInstance(boolean z10) {
            this.f60163e = z10;
            return this;
        }

        public Builder isSingleton(boolean z10) {
            this.f60162d = z10;
            return this;
        }

        public Builder setClass(Class<?> cls) {
            this.f60160b = cls;
            return this;
        }

        public Builder setInterface(Class<?> cls) {
            this.f60159a = cls;
            return this;
        }

        public Builder setObject(Object obj) {
            this.f60161c = obj;
            return this;
        }
    }

    private Service(Class<?> cls, Class<?> cls2) {
        this.f60153a = cls;
        this.f60154b = cls2;
        this.f60155c = null;
    }

    private Service(Class<?> cls, Object obj) {
        this.f60153a = cls;
        this.f60154b = null;
        this.f60155c = obj;
    }

    public static Builder builder(Class<?> cls) {
        return new Builder().setInterface(cls).setClass(cls).isSingleton(cls.isAnnotationPresent(Singleton.class)).isSharedInstance(cls.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls.isAnnotationPresent(AutoCreated.class));
    }

    public static Builder builder(Class<?> cls, Class<?> cls2) {
        return new Builder().setInterface(cls).setClass(cls2).isSingleton(cls2.isAnnotationPresent(Singleton.class)).isSharedInstance(cls2.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls2.isAnnotationPresent(AutoCreated.class));
    }

    public static Builder builder(Class<?> cls, Object obj) {
        return new Builder().setInterface(cls).setObject(obj).isSingleton(true).isSharedInstance(cls.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls.isAnnotationPresent(AutoCreated.class));
    }

    public Object getInstance() {
        return this.f60155c;
    }

    public Class<?> getInterface() {
        return this.f60153a;
    }

    public Class<?> getType() {
        return this.f60154b;
    }

    public boolean isAutoCreated() {
        return this.f60158f;
    }

    public boolean isSharedInstance() {
        return this.f60157e;
    }

    public boolean isSingleton() {
        return this.f60156d;
    }
}
