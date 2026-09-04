package com.tekartik.sqflite.operation;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.tekartik.sqflite.g0;
import java.util.List;

/* JADX INFO: compiled from: BaseReadOperation.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements e {
    private Boolean h(String str) {
        Object objA = a(str);
        if (objA instanceof Boolean) {
            return (Boolean) objA;
        }
        return null;
    }

    private String j() {
        return (String) a(com.tekartik.sqflite.b.f98602u);
    }

    private List<Object> k() {
        return (List) a(com.tekartik.sqflite.b.f98603v);
    }

    @Override // com.tekartik.sqflite.operation.e
    public g0 c() {
        return new g0(j(), k());
    }

    @Override // com.tekartik.sqflite.operation.e
    public boolean d() {
        return b(com.tekartik.sqflite.b.f98598q) && getTransactionId() == null;
    }

    @Override // com.tekartik.sqflite.operation.e
    public Boolean e() {
        return h(com.tekartik.sqflite.b.f98597p);
    }

    @Override // com.tekartik.sqflite.operation.e
    public boolean f() {
        return Boolean.TRUE.equals(a(com.tekartik.sqflite.b.f98604w));
    }

    @Override // com.tekartik.sqflite.operation.e
    public boolean g() {
        return Boolean.TRUE.equals(a(com.tekartik.sqflite.b.f98605x));
    }

    @Override // com.tekartik.sqflite.operation.e
    @p0
    public Integer getTransactionId() {
        return (Integer) a(com.tekartik.sqflite.b.f98598q);
    }

    protected abstract f i();

    @n0
    public String toString() {
        return getMethod() + " " + j() + " " + k();
    }
}
