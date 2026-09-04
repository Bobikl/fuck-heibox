package com.taobao.aranger.core.adapter.impl;

import com.taobao.aranger.annotation.method.MethodName;
import com.taobao.aranger.core.adapter.MethodWrapperAdapter;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class InvokeMethodWrapperAdapter implements MethodWrapperAdapter {
    private Method mMethod;

    public InvokeMethodWrapperAdapter setMethod(Method method) {
        this.mMethod = method;
        return this;
    }

    @Override // com.taobao.aranger.core.adapter.MethodWrapperAdapter
    public MethodWrapper wrapperMethod(ParameterWrapper[] parameterWrapperArr) {
        MethodName methodName = (MethodName) this.mMethod.getAnnotation(MethodName.class);
        return MethodWrapper.obtain().setMethodName(methodName == null ? this.mMethod.getName() : methodName.value()).setParameterTypes(TypeUtils.convertParameterTypes(this.mMethod.getParameterTypes())).setReturnType(TypeUtils.getClassId(this.mMethod.getReturnType()));
    }
}
