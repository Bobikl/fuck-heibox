package com.taobao.aranger.core.handler.invoc;

import android.os.Parcel;
import android.os.Parcelable;
import com.taobao.aranger.annotation.parameter.inout;
import com.taobao.aranger.annotation.parameter.out;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IDataFlow;
import com.taobao.aranger.logs.IPCLog;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IPCInvocationHandler implements InvocationHandler {
    private static final String TAG = IPCInvocationHandler.class.getName();

    IPCInvocationHandler() {
    }

    private Object processReply(Reply reply, Method method, Object[] objArr) throws IPCException {
        if (reply.getFlowParameterWrappers() != null && reply.getFlowParameterWrappers().length != 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int i10 = 0;
            for (int i11 = 0; i11 < objArr.length; i11++) {
                try {
                    if (TypeUtils.arrayContainsAnnotation(parameterAnnotations[i11], out.class) || TypeUtils.arrayContainsAnnotation(parameterAnnotations[i11], inout.class)) {
                        int i12 = i10 + 1;
                        Object data = reply.getFlowParameterWrappers()[i10].getData();
                        if (objArr[i11] == null) {
                            objArr[i11] = data;
                        } else if (parameterTypes[i11].isArray()) {
                            TypeUtils.convertObjectToArray(parameterTypes[i11].getName(), objArr[i11], data);
                        } else if (List.class.isAssignableFrom(parameterTypes[i11])) {
                            Collections.copy((List) objArr[i11], (List) data);
                        } else if (Map.class.isAssignableFrom(parameterTypes[i11])) {
                            Map map = (Map) data;
                            Map map2 = (Map) objArr[i11];
                            map2.clear();
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    map2.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else if (IDataFlow.class.isAssignableFrom(parameterTypes[i11])) {
                            ((IDataFlow) objArr[i11]).readFromObject(data);
                        } else if (Parcelable.class.isAssignableFrom(parameterTypes[i11])) {
                            Method declaredMethod = parameterTypes[i11].getDeclaredMethod("readFromParcel", Parcel.class);
                            declaredMethod.setAccessible(true);
                            Parcel parcelObtain = Parcel.obtain();
                            ((Parcelable) data).writeToParcel(parcelObtain, 0);
                            parcelObtain.setDataPosition(0);
                            declaredMethod.invoke(objArr[i11], parcelObtain);
                            parcelObtain.recycle();
                        }
                        i10 = i12;
                    }
                } catch (Exception e10) {
                    IPCLog.e(TAG, "[processReply]", e10, new Object[0]);
                    throw new IPCException(26, e10);
                }
            }
        }
        return reply.getResult();
    }

    abstract Reply internalInvoke(Method method, Object[] objArr) throws IPCException;

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws IPCException {
        if (method.getDeclaringClass() != Object.class) {
            return processReply(internalInvoke(method, objArr), method, objArr);
        }
        try {
            return method.invoke(this, objArr);
        } catch (Exception e10) {
            throw new IPCException(18, e10);
        }
    }
}
