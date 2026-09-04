package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: AppComponentFactory.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(28)
public class n extends AppComponentFactory {
    @androidx.annotation.n0
    public Activity a(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @androidx.annotation.n0
    public Application b(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @androidx.annotation.n0
    public ContentProvider c(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @androidx.annotation.n0
    public BroadcastReceiver d(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @androidx.annotation.n0
    public Service e(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public final Activity instantiateActivity(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.a(a(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public final Application instantiateApplication(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) CoreComponentFactory.a(b(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public final ContentProvider instantiateProvider(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.a(c(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public final BroadcastReceiver instantiateReceiver(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.a(d(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public final Service instantiateService(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) CoreComponentFactory.a(e(classLoader, str, intent));
    }
}
