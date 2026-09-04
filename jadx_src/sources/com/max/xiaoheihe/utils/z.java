package com.max.xiaoheihe.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import android.webkit.WebView;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.apache.tools.ant.util.h1;

/* JADX INFO: compiled from: SettingProxy.java */
/* JADX INFO: loaded from: classes13.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f95789a = "halfman";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f95790b = "android.app.Application";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f95791c = "www.bungie.net";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f95792d = "help.steampowered.com";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f95793e = "www.bungie.net";

    private static Object a(Field field, Object obj) throws IllegalAccessException, IllegalArgumentException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{field, obj}, null, changeQuickRedirect, true, 48836, new Class[]{Field.class, Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        field.setAccessible(zIsAccessible);
        return obj2;
    }

    public static boolean b(WebView webView, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str}, null, changeQuickRedirect, true, 48829, new Class[]{WebView.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.hbcommon.utils.d.b(f95789a, "revertBackProxy");
        return e(webView, str);
    }

    private static boolean c(WebView webView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView}, null, changeQuickRedirect, true, 48831, new Class[]{WebView.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Log.d(f95789a, "Setting proxy with 4.0 API.");
            Method declaredMethod = Class.forName("android.webkit.JWebCoreJavaBridge").getDeclaredMethod("updateProxy", Class.forName("android.net.ProxyProperties"));
            Object objA = a(Class.forName("android.webkit.BrowserFrame").getDeclaredField("sJavaBridge"), a(Class.forName("android.webkit.WebViewCore").getDeclaredField("mBrowserFrame"), a(Class.forName("android.webkit.WebView").getDeclaredField("mWebViewCore"), webView)));
            Class.forName("android.net.ProxyProperties").getConstructor(String.class, Integer.TYPE, String.class);
            declaredMethod.invoke(objA, null);
            Log.d(f95789a, "Setting proxy with 4.0 API successful!");
            return true;
        } catch (Exception e10) {
            Log.e(f95789a, "failed to set HTTP proxy: " + e10);
            return false;
        }
    }

    private static boolean d(WebView webView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView}, null, changeQuickRedirect, true, 48833, new Class[]{WebView.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Log.d(f95789a, "revert proxy with 4.1 - 4.3 API.");
        try {
            Object objA = a(Class.forName("android.webkit.BrowserFrame").getDeclaredField("sJavaBridge"), a(Class.forName("android.webkit.WebViewCore").getDeclaredField("mBrowserFrame"), a(Class.forName("android.webkit.WebViewClassic").getDeclaredField("mWebViewCore"), Class.forName("android.webkit.WebViewClassic").getDeclaredMethod("fromWebView", Class.forName("android.webkit.WebView")).invoke(null, webView))));
            Class.forName("android.net.ProxyProperties").getConstructor(String.class, Integer.TYPE, String.class);
            Class.forName("android.webkit.JWebCoreJavaBridge").getDeclaredMethod("updateProxy", Class.forName("android.net.ProxyProperties")).invoke(objA, null);
            Log.d(f95789a, "revert proxy with 4.1 - 4.3 API successful!");
            return true;
        } catch (Exception e10) {
            Log.e(f95789a, "Setting proxy with >= 4.1 API failed with error: " + e10.getMessage());
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    private static boolean e(WebView webView, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str}, null, changeQuickRedirect, true, 48835, new Class[]{WebView.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Context applicationContext = webView.getContext().getApplicationContext();
        Properties properties = System.getProperties();
        properties.remove(h1.f136786c);
        properties.remove(h1.f136787d);
        properties.remove(h1.f136788e);
        properties.remove(h1.f136789f);
        properties.remove(h1.f136792i);
        properties.remove(h1.f136793j);
        try {
            Field field = Class.forName(str).getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationContext);
            Field declaredField = Class.forName("android.app.LoadedApk").getDeclaredField("mReceivers");
            declaredField.setAccessible(true);
            Iterator it = ((ArrayMap) declaredField.get(obj)).values().iterator();
            while (it.hasNext()) {
                for (Object obj2 : ((ArrayMap) it.next()).keySet()) {
                    Class<?> cls = obj2.getClass();
                    if (cls.getName().contains("ProxyChangeListener")) {
                        cls.getDeclaredMethod("onReceive", Context.class, Intent.class).invoke(obj2, applicationContext, new Intent("android.intent.action.PROXY_CHANGE"));
                    }
                }
            }
            Log.d(f95789a, "Revert proxy with >= 4.4 API successful!");
            return true;
        } catch (ClassNotFoundException e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            Log.v(f95789a, e10.getMessage());
            Log.v(f95789a, string);
            return false;
        } catch (IllegalAccessException e11) {
            StringWriter stringWriter2 = new StringWriter();
            e11.printStackTrace(new PrintWriter(stringWriter2));
            String string2 = stringWriter2.toString();
            Log.v(f95789a, e11.getMessage());
            Log.v(f95789a, string2);
            return false;
        } catch (IllegalArgumentException e12) {
            StringWriter stringWriter3 = new StringWriter();
            e12.printStackTrace(new PrintWriter(stringWriter3));
            String string3 = stringWriter3.toString();
            Log.v(f95789a, e12.getMessage());
            Log.v(f95789a, string3);
            return false;
        } catch (NoSuchFieldException e13) {
            StringWriter stringWriter4 = new StringWriter();
            e13.printStackTrace(new PrintWriter(stringWriter4));
            String string4 = stringWriter4.toString();
            Log.v(f95789a, e13.getMessage());
            Log.v(f95789a, string4);
            return false;
        } catch (NoSuchMethodException e14) {
            StringWriter stringWriter5 = new StringWriter();
            e14.printStackTrace(new PrintWriter(stringWriter5));
            String string5 = stringWriter5.toString();
            Log.v(f95789a, e14.getMessage());
            Log.v(f95789a, string5);
            return false;
        } catch (InvocationTargetException e15) {
            StringWriter stringWriter6 = new StringWriter();
            e15.printStackTrace(new PrintWriter(stringWriter6));
            String string6 = stringWriter6.toString();
            Log.v(f95789a, e15.getMessage());
            Log.v(f95789a, string6);
            return false;
        }
    }

    public static boolean f(WebView webView, String str, int i10, boolean z10, String str2) {
        Object[] objArr = {webView, str, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48828, new Class[]{WebView.class, String.class, Integer.TYPE, cls, String.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f95793e = z10 ? f95792d : f95791c;
        return i(webView, str, i10, str2);
    }

    private static boolean g(WebView webView, String str, int i10) {
        Object[] objArr = {webView, str, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class<?> cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48830, new Class[]{WebView.class, String.class, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Log.d(f95789a, "Setting proxy with 4.0 API.");
            Class.forName("android.webkit.JWebCoreJavaBridge").getDeclaredMethod("updateProxy", Class.forName("android.net.ProxyProperties")).invoke(a(Class.forName("android.webkit.BrowserFrame").getDeclaredField("sJavaBridge"), a(Class.forName("android.webkit.WebViewCore").getDeclaredField("mBrowserFrame"), a(Class.forName("android.webkit.WebView").getDeclaredField("mWebViewCore"), webView))), Class.forName("android.net.ProxyProperties").getConstructor(String.class, cls, String.class).newInstance(str, Integer.valueOf(i10), f95793e));
            Log.d(f95789a, "Setting proxy with 4.0 API successful!");
            return true;
        } catch (Exception e10) {
            Log.e(f95789a, "failed to set HTTP proxy: " + e10);
            return false;
        }
    }

    private static boolean h(WebView webView, String str, int i10) {
        Object[] objArr = {webView, str, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class<?> cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48832, new Class[]{WebView.class, String.class, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Log.d(f95789a, "Setting proxy with 4.1 - 4.3 API.");
        try {
            Class.forName("android.webkit.JWebCoreJavaBridge").getDeclaredMethod("updateProxy", Class.forName("android.net.ProxyProperties")).invoke(a(Class.forName("android.webkit.BrowserFrame").getDeclaredField("sJavaBridge"), a(Class.forName("android.webkit.WebViewCore").getDeclaredField("mBrowserFrame"), a(Class.forName("android.webkit.WebViewClassic").getDeclaredField("mWebViewCore"), Class.forName("android.webkit.WebViewClassic").getDeclaredMethod("fromWebView", Class.forName("android.webkit.WebView")).invoke(null, webView)))), Class.forName("android.net.ProxyProperties").getConstructor(String.class, cls, String.class).newInstance(str, Integer.valueOf(i10), f95793e));
            Log.d(f95789a, "Setting proxy with 4.1 - 4.3 API successful!");
            return true;
        } catch (Exception e10) {
            Log.e(f95789a, "Setting proxy with >= 4.1 API failed with error: " + e10.getMessage());
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    private static boolean i(WebView webView, String str, int i10, String str2) {
        int i11;
        char c10 = 1;
        int i12 = 2;
        int i13 = 3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str, new Integer(i10), str2}, null, changeQuickRedirect, true, 48834, new Class[]{WebView.class, String.class, Integer.TYPE, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Log.d(f95789a, "Setting proxy with >= 4.4 API.");
        ArrayList arrayList = new ArrayList();
        arrayList.add(f95793e);
        Context applicationContext = webView.getContext().getApplicationContext();
        System.setProperty(h1.f136788e, str);
        System.setProperty(h1.f136792i, f95793e);
        System.setProperty(h1.f136793j, f95793e);
        System.setProperty(h1.f136789f, i10 + "");
        System.setProperty(h1.f136786c, str);
        System.setProperty(h1.f136787d, i10 + "");
        try {
            Field field = Class.forName(str2).getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationContext);
            Field declaredField = Class.forName("android.app.LoadedApk").getDeclaredField("mReceivers");
            declaredField.setAccessible(true);
            Iterator it = ((ArrayMap) declaredField.get(obj)).values().iterator();
            while (it.hasNext()) {
                for (Object obj2 : ((ArrayMap) it.next()).keySet()) {
                    Class<?> cls = obj2.getClass();
                    if (cls.getName().contains("ProxyChangeListener")) {
                        Class<?>[] clsArr = new Class[i12];
                        clsArr[0] = Context.class;
                        clsArr[c10] = Intent.class;
                        Method declaredMethod = cls.getDeclaredMethod("onReceive", clsArr);
                        Intent intent = new Intent("android.intent.action.PROXY_CHANGE");
                        Class<?> cls2 = Class.forName("android.net.ProxyInfo");
                        Class<?>[] clsArr2 = new Class[i13];
                        clsArr2[0] = String.class;
                        clsArr2[1] = Integer.TYPE;
                        clsArr2[2] = List.class;
                        Method method = cls2.getMethod("buildDirectProxy", clsArr2);
                        Object[] objArr = new Object[i13];
                        objArr[0] = str;
                        objArr[1] = Integer.valueOf(i10);
                        i11 = 2;
                        objArr[2] = arrayList;
                        intent.putExtra(WebviewFragment.A4, (Parcelable) method.invoke(cls2, objArr));
                        declaredMethod.invoke(obj2, applicationContext, intent);
                    } else {
                        i11 = i12;
                    }
                    i12 = i11;
                    c10 = 1;
                    i13 = 3;
                }
            }
            Log.d(f95789a, "Setting proxy with >= 4.4 API successful!");
            return true;
        } catch (ClassNotFoundException e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            Log.v(f95789a, e10.getMessage());
            Log.v(f95789a, string);
            return false;
        } catch (IllegalAccessException e11) {
            StringWriter stringWriter2 = new StringWriter();
            e11.printStackTrace(new PrintWriter(stringWriter2));
            String string2 = stringWriter2.toString();
            Log.v(f95789a, e11.getMessage());
            Log.v(f95789a, string2);
            return false;
        } catch (IllegalArgumentException e12) {
            StringWriter stringWriter3 = new StringWriter();
            e12.printStackTrace(new PrintWriter(stringWriter3));
            String string3 = stringWriter3.toString();
            Log.v(f95789a, e12.getMessage());
            Log.v(f95789a, string3);
            return false;
        } catch (NoSuchFieldException e13) {
            StringWriter stringWriter4 = new StringWriter();
            e13.printStackTrace(new PrintWriter(stringWriter4));
            String string4 = stringWriter4.toString();
            Log.v(f95789a, e13.getMessage());
            Log.v(f95789a, string4);
            return false;
        } catch (NoSuchMethodException e14) {
            StringWriter stringWriter5 = new StringWriter();
            e14.printStackTrace(new PrintWriter(stringWriter5));
            String string5 = stringWriter5.toString();
            Log.v(f95789a, e14.getMessage());
            Log.v(f95789a, string5);
            return false;
        } catch (InvocationTargetException e15) {
            StringWriter stringWriter6 = new StringWriter();
            e15.printStackTrace(new PrintWriter(stringWriter6));
            String string6 = stringWriter6.toString();
            Log.v(f95789a, e15.getMessage());
            Log.v(f95789a, string6);
            return false;
        }
    }
}
