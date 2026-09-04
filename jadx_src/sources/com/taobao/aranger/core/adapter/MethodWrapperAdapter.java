package com.taobao.aranger.core.adapter;

import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;

/* JADX INFO: loaded from: classes4.dex */
public interface MethodWrapperAdapter {
    MethodWrapper wrapperMethod(ParameterWrapper[] parameterWrapperArr) throws IPCException;
}
