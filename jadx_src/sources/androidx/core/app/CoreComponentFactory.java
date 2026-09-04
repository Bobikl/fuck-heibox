package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(api = 28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class CoreComponentFactory extends AppComponentFactory {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        Object a();
    }

    static <T> T a(T t10) {
        T t11;
        return (!(t10 instanceof a) || (t11 = (T) ((a) t10).a()) == null) ? t10 : t11;
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public Activity instantiateActivity(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public Application instantiateApplication(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public ContentProvider instantiateProvider(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public BroadcastReceiver instantiateReceiver(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.n0
    public Service instantiateService(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
