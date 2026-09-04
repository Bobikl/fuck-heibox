package com.taobao.aranger.core.adapter.impl;

import com.taobao.aranger.core.adapter.MethodWrapperAdapter;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.TypeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class NewInstanceWrapperAdapter implements MethodWrapperAdapter {
    @Override // com.taobao.aranger.core.adapter.MethodWrapperAdapter
    public MethodWrapper wrapperMethod(ParameterWrapper[] parameterWrapperArr) throws IPCException {
        return MethodWrapper.obtain().setParameterTypes(TypeUtils.convertParameterTypes(parameterWrapperArr));
    }
}
