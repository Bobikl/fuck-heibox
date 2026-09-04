package com.taobao.aranger.intf;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface IObjectProxy {
    void create(String str, Object... objArr) throws Exception;

    Object invoke(String str, Object[] objArr) throws Exception;
}
