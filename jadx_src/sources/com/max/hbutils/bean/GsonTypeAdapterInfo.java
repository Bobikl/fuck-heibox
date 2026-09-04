package com.max.hbutils.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class GsonTypeAdapterInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Type type;
    private Object typeAdapter;

    public GsonTypeAdapterInfo(Type type, Object obj) {
        this.type = type;
        this.typeAdapter = obj;
    }

    public Type getType() {
        return this.type;
    }

    public Object getTypeAdapter() {
        return this.typeAdapter;
    }
}
