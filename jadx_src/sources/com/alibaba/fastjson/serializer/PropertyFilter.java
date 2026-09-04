package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes6.dex */
public interface PropertyFilter extends SerializeFilter {
    boolean apply(Object obj, String str, Object obj2);
}
