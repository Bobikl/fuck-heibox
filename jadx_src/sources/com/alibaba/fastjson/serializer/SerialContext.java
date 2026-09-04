package com.alibaba.fastjson.serializer;

import com.tencent.qcloud.core.util.IOUtils;
import kotlin.text.y;
import lg.a;

/* JADX INFO: loaded from: classes6.dex */
public class SerialContext {
    public final int features;
    public final Object fieldName;
    public final Object object;
    public final SerialContext parent;

    public SerialContext(SerialContext serialContext, Object obj, Object obj2, int i10, int i11) {
        this.parent = serialContext;
        this.object = obj;
        this.fieldName = obj2;
        this.features = i10;
    }

    public Object getFieldName() {
        return this.fieldName;
    }

    public Object getObject() {
        return this.object;
    }

    public SerialContext getParent() {
        return this.parent;
    }

    public String getPath() {
        return toString();
    }

    public String toString() {
        if (this.parent == null) {
            return "$";
        }
        StringBuilder sb2 = new StringBuilder();
        toString(sb2);
        return sb2.toString();
    }

    protected void toString(StringBuilder sb2) {
        SerialContext serialContext = this.parent;
        if (serialContext == null) {
            sb2.append(y.f128594c);
            return;
        }
        serialContext.toString(sb2);
        Object obj = this.fieldName;
        if (obj == null) {
            sb2.append(".null");
            return;
        }
        if (obj instanceof Integer) {
            sb2.append('[');
            sb2.append(((Integer) this.fieldName).intValue());
            sb2.append(']');
            return;
        }
        sb2.append(a.f131414g);
        String string = this.fieldName.toString();
        boolean z10 = false;
        for (int i10 = 0; i10 < string.length(); i10++) {
            char cCharAt = string.charAt(i10);
            if (cCharAt == '.' || cCharAt == '@' || cCharAt == '(' || cCharAt == '\\') {
                z10 = true;
            }
        }
        if (!z10) {
            sb2.append(string);
            return;
        }
        for (int i11 = 0; i11 < string.length(); i11++) {
            char cCharAt2 = string.charAt(i11);
            if (cCharAt2 == '.' || cCharAt2 == '@' || cCharAt2 == '(') {
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            } else if (cCharAt2 == '\\') {
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            }
            sb2.append(cCharAt2);
        }
    }
}
