package com.meituan.robust;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class PatchProxy {
    private static CopyOnWriteArrayList<RobustExtension> registerExtensionList = new CopyOnWriteArrayList<>();
    private static ThreadLocal<RobustExtension> robustExtensionThreadLocal = new ThreadLocal<>();

    public static Object accessDispatch(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z10, int i10, Class[] clsArr, Class cls) {
        if (changeQuickRedirect != null) {
            String classMethod = getClassMethod(z10, i10);
            if (TextUtils.isEmpty(classMethod)) {
                return null;
            }
            notify(Constants.PATCH_EXECUTE);
            return changeQuickRedirect.accessDispatch(classMethod, getObjects(objArr, obj, z10));
        }
        RobustExtension robustExtension = robustExtensionThreadLocal.get();
        robustExtensionThreadLocal.remove();
        if (robustExtension == null) {
            return null;
        }
        notify(robustExtension.describeSelfFunction());
        return robustExtension.accessDispatch(new RobustArguments(objArr, obj, z10, i10, clsArr, cls));
    }

    public static void accessDispatchVoid(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z10, int i10, Class[] clsArr, Class cls) {
        if (changeQuickRedirect != null) {
            notify(Constants.PATCH_EXECUTE);
            String classMethod = getClassMethod(z10, i10);
            if (TextUtils.isEmpty(classMethod)) {
                return;
            }
            changeQuickRedirect.accessDispatch(classMethod, getObjects(objArr, obj, z10));
            return;
        }
        RobustExtension robustExtension = robustExtensionThreadLocal.get();
        robustExtensionThreadLocal.remove();
        if (robustExtension != null) {
            notify(robustExtension.describeSelfFunction());
            robustExtension.accessDispatch(new RobustArguments(objArr, obj, z10, i10, clsArr, cls));
        }
    }

    private static String getClassMethod(boolean z10, int i10) {
        try {
            return "::" + z10 + ":" + i10;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String[] getClassMethodName() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return new String[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName()};
    }

    private static Object[] getObjects(Object[] objArr, Object obj, boolean z10) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        Object[] objArr2 = z10 ? new Object[length] : new Object[length + 1];
        int i10 = 0;
        while (i10 < length) {
            objArr2[i10] = objArr[i10];
            i10++;
        }
        if (!z10) {
            objArr2[i10] = obj;
        }
        return objArr2;
    }

    public static boolean isSupport(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z10, int i10, Class[] clsArr, Class cls) {
        if (changeQuickRedirect != null) {
            String classMethod = getClassMethod(z10, i10);
            if (TextUtils.isEmpty(classMethod)) {
                return false;
            }
            try {
                return changeQuickRedirect.isSupport(classMethod, getObjects(objArr, obj, z10));
            } catch (Throwable unused) {
                return false;
            }
        }
        CopyOnWriteArrayList<RobustExtension> copyOnWriteArrayList = registerExtensionList;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            for (RobustExtension robustExtension : registerExtensionList) {
                if (robustExtension.isSupport(new RobustArguments(objArr, obj, z10, i10, clsArr, cls))) {
                    robustExtensionThreadLocal.set(robustExtension);
                    return true;
                }
            }
        }
        return false;
    }

    private static void notify(String str) {
        CopyOnWriteArrayList<RobustExtension> copyOnWriteArrayList = registerExtensionList;
        if (copyOnWriteArrayList == null) {
            return;
        }
        Iterator<RobustExtension> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().notifyListner(str);
        }
    }

    public static PatchProxyResult proxy(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z10, int i10, Class[] clsArr, Class cls) {
        PatchProxyResult patchProxyResult = new PatchProxyResult();
        if (isSupport(objArr, obj, changeQuickRedirect, z10, i10, clsArr, cls)) {
            patchProxyResult.isSupported = true;
            patchProxyResult.result = accessDispatch(objArr, obj, changeQuickRedirect, z10, i10, clsArr, cls);
        }
        return patchProxyResult;
    }

    public static synchronized boolean register(RobustExtension robustExtension) {
        if (registerExtensionList == null) {
            registerExtensionList = new CopyOnWriteArrayList<>();
        }
        return registerExtensionList.addIfAbsent(robustExtension);
    }

    public static void reset() {
        registerExtensionList = new CopyOnWriteArrayList<>();
        robustExtensionThreadLocal = new ThreadLocal<>();
    }

    public static synchronized boolean unregister(RobustExtension robustExtension) {
        CopyOnWriteArrayList<RobustExtension> copyOnWriteArrayList = registerExtensionList;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(robustExtension);
    }
}
