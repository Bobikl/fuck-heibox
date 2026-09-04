package com.taobao.aranger.core.ipc.provider;

import android.os.Binder;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import androidx.annotation.n0;
import androidx.core.util.k;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IClientService;
import com.taobao.aranger.logs.IPCLog;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.IPCThreadCaller;
import com.taobao.aranger.utils.ParameterTransformer;
import com.taobao.aranger.utils.TypeCenter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ClientServiceProvider extends Binder implements IClientService {
    private static final String TAG = ClientServiceProvider.class.getSimpleName();
    private static volatile ClientServiceProvider sInstance;

    public static class CallbackRunnable implements Runnable {
        private final Object mCallback;
        private final CountDownLatch mCountDownLatch;
        private Exception mException;
        private final Method mMethod;
        private final Object[] mParameters;
        private Object mResult;

        CallbackRunnable(CountDownLatch countDownLatch, Method method, Object obj, Object[] objArr) {
            this.mCountDownLatch = countDownLatch;
            this.mMethod = method;
            this.mCallback = obj;
            this.mParameters = objArr;
        }

        Exception getException() {
            return this.mException;
        }

        Object getResult() {
            return this.mResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    this.mResult = this.mMethod.invoke(this.mCallback, this.mParameters);
                } catch (Exception e10) {
                    IPCLog.e(ClientServiceProvider.TAG, "[CallbackRunnable][run]", e10, new Object[0]);
                    this.mException = e10;
                }
            } finally {
                this.mCountDownLatch.countDown();
            }
        }
    }

    private ClientServiceProvider() {
        attachInterface(this, Constants.CLIENT_SERVICE_DESCRIPTOR);
    }

    public static ClientServiceProvider getClientService() {
        if (sInstance == null) {
            synchronized (ClientServiceProvider.class) {
                if (sInstance == null) {
                    sInstance = new ClientServiceProvider();
                }
            }
        }
        return sInstance;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i10, @n0 Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 3) {
            if (i10 == 4) {
                final ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                IPCThreadCaller.execute(new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ClientServiceProvider.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ClientServiceProvider.this.recycle(arrayListCreateStringArrayList);
                        } catch (Exception e10) {
                            IPCLog.e(ClientServiceProvider.TAG, "[onTransact][recycle]", e10, new Object[0]);
                        }
                    }
                });
            }
            return true;
        }
        final Callback callbackCreateFromParcel = Callback.CREATOR.createFromParcel(parcel);
        if (i11 == 1) {
            IPCThreadCaller.execute(new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ClientServiceProvider.1
                @Override // java.lang.Runnable
                public void run() throws IllegalAccessException, InvocationTargetException {
                    ClientServiceProvider.this.sendCallback(callbackCreateFromParcel);
                }
            });
        } else {
            try {
                Reply replySendCallback = sendCallback(callbackCreateFromParcel);
                if (!"void".equals(callbackCreateFromParcel.getMethodWrapper().getReturnType()) || replySendCallback.isError() || replySendCallback.getFlowParameterWrappers() != null) {
                    replySendCallback.writeToParcel(parcel2, 0);
                }
            } catch (Exception e10) {
                Reply.obtain().setErrorCode(8).setErrorMessage(e10.getMessage()).writeToParcel(parcel2, i11);
            }
        }
        return true;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            CallbackManager.getInstance().removeCallback(it.next());
        }
    }

    @Override // com.taobao.aranger.intf.IClientService
    public Reply sendCallback(Callback callback) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Object objInvoke;
        k<Boolean, Object> callback2 = CallbackManager.getInstance().getCallback(callback.getKey());
        if (callback2 == null || (obj = callback2.f21264b) == null) {
            return Reply.obtain().setErrorCode(6).setErrorMessage("can't find callback in current process");
        }
        boolean zBooleanValue = callback2.f21263a.booleanValue();
        try {
            ArrayList arrayList = new ArrayList();
            Method method = TypeCenter.getInstance().getMethod(obj.getClass(), callback.getMethodWrapper());
            Object[] objArrUnWrapperParameters = ParameterTransformer.unWrapperParameters(callback.getParameterWrappers(), arrayList);
            boolean z10 = Looper.getMainLooper() == Looper.myLooper();
            ParameterWrapper[] parameterWrapperArr = null;
            if (!(zBooleanValue ^ z10)) {
                try {
                    objInvoke = method.invoke(obj, objArrUnWrapperParameters);
                    e = null;
                } catch (Exception e10) {
                    e = e10;
                    objInvoke = null;
                }
                if (e != null) {
                    e.printStackTrace();
                    throw new IPCException(4, e);
                }
                if (!arrayList.isEmpty()) {
                    parameterWrapperArr = new ParameterWrapper[arrayList.size()];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        parameterWrapperArr[iIntValue] = ParameterWrapper.obtain().setData(objArrUnWrapperParameters[((Integer) arrayList.get(iIntValue)).intValue()]);
                    }
                }
                return Reply.obtain().setFlowParameterWrappers(parameterWrapperArr).setResult(objInvoke);
            }
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                CallbackRunnable callbackRunnable = new CallbackRunnable(countDownLatch, method, obj, objArrUnWrapperParameters);
                if (z10) {
                    IPCThreadCaller.execute(callbackRunnable);
                    countDownLatch.await(1L, TimeUnit.SECONDS);
                } else {
                    IPCThreadCaller.post(true, callbackRunnable);
                    countDownLatch.await();
                }
                if (callbackRunnable.getException() != null) {
                    return Reply.obtain().setErrorCode(4).setErrorMessage(callbackRunnable.getException().getMessage());
                }
                if (!arrayList.isEmpty()) {
                    parameterWrapperArr = new ParameterWrapper[arrayList.size()];
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = ((Integer) it2.next()).intValue();
                        parameterWrapperArr[iIntValue2] = ParameterWrapper.obtain().setData(objArrUnWrapperParameters[((Integer) arrayList.get(iIntValue2)).intValue()]);
                    }
                }
                return Reply.obtain().setFlowParameterWrappers(parameterWrapperArr).setResult(callbackRunnable.getResult());
            } catch (Exception e11) {
                return Reply.obtain().setErrorCode(7).setErrorMessage("callback invoke error: " + e11.getMessage());
            }
        } catch (IPCException e12) {
            IPCLog.e(TAG, "[sendCallback]", e12, new Object[0]);
            return Reply.obtain().setErrorCode(e12.getErrorCode()).setErrorMessage(e12.getMessage());
        }
    }
}
