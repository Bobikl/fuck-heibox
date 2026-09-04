package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes6.dex */
public interface ContextValueFilter extends SerializeFilter {
    Object process(BeanContext beanContext, Object obj, String str, Object obj2);
}
