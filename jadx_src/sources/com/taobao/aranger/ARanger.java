package com.taobao.aranger;

import android.app.ActivityThread;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.n0;
import com.taobao.aranger.core.adapter.MethodWrapperAdapter;
import com.taobao.aranger.core.adapter.impl.GetInstanceMethodWrapperAdapter;
import com.taobao.aranger.core.adapter.impl.NewInstanceWrapperAdapter;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.handler.invoc.MethodInvocationHandler;
import com.taobao.aranger.core.ipc.ChannelManager;
import com.taobao.aranger.core.wrapper.ObjectWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.ProcessStateListener;
import com.taobao.aranger.logs.IPCLog;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.IPCRecycle;
import com.taobao.aranger.utils.IPCUtils;
import com.taobao.aranger.utils.ParameterTransformer;
import com.taobao.aranger.utils.ReflectUtils;
import com.taobao.aranger.utils.TimeStampGenerator;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class ARanger {
    private static final String TAG = "ARanger";
    private static volatile Application sApplication;

    public static void connect(ComponentName componentName) throws IPCException {
        TypeUtils.validateComponentName(componentName);
        ChannelManager.getRemoteChannel(IPCUtils.queryContentAuthorityFromProvider(componentName)).connect();
    }

    public static <T> T create(ComponentName componentName, Class<T> cls, Object... objArr) throws IPCException {
        validate(componentName, cls);
        return (T) createProxy(componentName, cls, 0, new NewInstanceWrapperAdapter(), objArr);
    }

    private static <T> T createProxy(ComponentName componentName, Class<T> cls, int i10, MethodWrapperAdapter methodWrapperAdapter, Object... objArr) throws IPCException {
        Uri uriQueryContentAuthorityFromProvider = IPCUtils.queryContentAuthorityFromProvider(componentName);
        ObjectWrapper type = ObjectWrapper.obtain().setTimeStamp(TimeStampGenerator.getTimeStamp()).setObjectClass(cls).setType(i10);
        ParameterWrapper[] parameterWrapperArrWrapperParameters = ParameterTransformer.wrapperParameters(null, objArr);
        Call remoteProviderUri = Call.obtain().setObjectWrapper(type).setMethodWrapper(methodWrapperAdapter.wrapperMethod(parameterWrapperArrWrapperParameters)).setParameterWrappers(parameterWrapperArrWrapperParameters).setRemoteProviderUri(uriQueryContentAuthorityFromProvider);
        ChannelManager.getRemoteChannel(uriQueryContentAuthorityFromProvider).sendCall(remoteProviderUri);
        return (T) getProxy(remoteProviderUri);
    }

    private static <T> T createProxyByMethodName(ComponentName componentName, Class<T> cls, String str, Object... objArr) throws IPCException {
        validate(componentName, cls);
        return (T) createProxy(componentName, cls, 1, new GetInstanceMethodWrapperAdapter(str), objArr);
    }

    public static <T> T createSingleton(ComponentName componentName, Class<T> cls, String str, Object... objArr) throws IPCException {
        return (T) createProxyByMethodName(componentName, cls, str, objArr);
    }

    public static <T> T createSingleton(ComponentName componentName, Class<T> cls, Object... objArr) throws IPCException {
        return (T) createProxyByMethodName(componentName, cls, "getInstance", objArr);
    }

    public static void debug(boolean z10) {
        IPCLog.setUseTlog(!z10);
    }

    public static Context getContext() {
        if (sApplication == null) {
            synchronized (ARanger.class) {
                if (sApplication == null) {
                    try {
                        ActivityThread activityThreadCurrentActivityThread = ActivityThread.currentActivityThread();
                        if (activityThreadCurrentActivityThread != null) {
                            sApplication = activityThreadCurrentActivityThread.getApplication();
                        }
                    } catch (Exception e10) {
                        IPCLog.e(TAG, "[getContext][currentActivityThread]", e10, new Object[0]);
                    }
                    if (sApplication == null) {
                        try {
                            sApplication = (Application) ReflectUtils.getHideMethod(ActivityThread.class, "getApplication", new Class[0]).invoke(ReflectUtils.getHideMethod(ActivityThread.class, "currentActivityThread", new Class[0]).invoke(ActivityThread.class, new Object[0]), new Object[0]);
                        } catch (Exception e11) {
                            IPCLog.e(TAG, "[getContext][invoke]", e11, new Object[0]);
                        }
                    }
                    debug((sApplication.getApplicationInfo().flags & 2) != 0);
                }
            }
        }
        return sApplication;
    }

    private static <T> T getProxy(Call call) {
        ObjectWrapper objectWrapper = call.getObjectWrapper();
        Uri remoteProviderUri = call.getRemoteProviderUri();
        T t10 = (T) Proxy.newProxyInstance(objectWrapper.getObjectClass().getClassLoader(), new Class[]{objectWrapper.getObjectClass()}, new MethodInvocationHandler(objectWrapper, remoteProviderUri));
        IPCRecycle.getInstance().register(remoteProviderUri, t10, objectWrapper.getTimeStamp());
        return t10;
    }

    public static void init(@n0 Application application) {
        if (sApplication != null) {
            return;
        }
        sApplication = application;
        debug((sApplication.getApplicationInfo().flags & 2) != 0);
    }

    public static boolean isConnect(ComponentName componentName) {
        try {
            TypeUtils.validateComponentName(componentName);
            return IPCUtils.isProcessAlive(componentName);
        } catch (IPCException unused) {
            return false;
        }
    }

    public static void registerProcessStateListener(@n0 ProcessStateListener processStateListener) {
        CallbackManager.getInstance().registerProcessStateListener(processStateListener);
    }

    public static void unRegisterProcessStateListener(@n0 ProcessStateListener processStateListener) {
        CallbackManager.getInstance().unRegisterProcessStateListener(processStateListener);
    }

    private static void validate(ComponentName componentName, Class cls) throws IPCException {
        TypeUtils.validateServiceInterface(cls);
        TypeUtils.validateComponentName(componentName);
    }
}
