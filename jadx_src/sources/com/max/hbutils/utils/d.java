package com.max.hbutils.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: HeyBoxParameterizedType.java */
/* JADX INFO: loaded from: classes13.dex */
public class d implements ParameterizedType {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type[] f73534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f73535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Type f73536d;

    public d(Type[] typeArr, Type type, Type type2) {
        this.f73534b = typeArr;
        this.f73535c = type;
        this.f73536d = type2;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Lo, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f73534b, dVar.f73534b)) {
            return false;
        }
        Type type = this.f73535c;
        if (type == null ? dVar.f73535c != null : !type.equals(dVar.f73535c)) {
            return false;
        }
        Type type2 = this.f73536d;
        Type type3 = dVar.f73536d;
        if (type2 != null) {
            return type2.equals(type3);
        }
        return type3 == null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f73534b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f73535c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f73536d;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Mo, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = Arrays.hashCode(this.f73534b) * 31;
        Type type = this.f73535c;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f73536d;
        return iHashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
