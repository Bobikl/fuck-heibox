package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: InterTypeFieldDeclarationImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends i implements zj.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zj.c<?> f137640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Type f137641g;

    public j(zj.c<?> cVar, String str, int i10, String str2, zj.c<?> cVar2, Type type) {
        super(cVar, str, i10);
        this.f137639e = str2;
        this.f137640f = cVar2;
        this.f137641g = type;
    }

    public j(zj.c<?> cVar, zj.c<?> cVar2, Field field) {
        super(cVar, cVar2, field.getModifiers());
        this.f137639e = field.getName();
        this.f137640f = zj.d.a(field.getType());
        Type genericType = field.getGenericType();
        if (genericType instanceof Class) {
            this.f137641g = zj.d.a((Class) genericType);
        } else {
            this.f137641g = genericType;
        }
    }

    @Override // zj.p
    public Type d() {
        return this.f137641g;
    }

    @Override // zj.p
    public String getName() {
        return this.f137639e;
    }

    @Override // zj.p
    public zj.c<?> getType() {
        return this.f137640f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(getModifiers()));
        stringBuffer.append(" ");
        stringBuffer.append(getType().toString());
        stringBuffer.append(" ");
        stringBuffer.append(this.f137636b);
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }
}
