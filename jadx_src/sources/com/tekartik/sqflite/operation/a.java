package com.tekartik.sqflite.operation;

/* JADX INFO: compiled from: BaseOperation.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {
    @Override // com.tekartik.sqflite.operation.f
    public void error(String str, String str2, Object obj) {
        i().error(str, str2, obj);
    }

    @Override // com.tekartik.sqflite.operation.b
    protected abstract f i();

    @Override // com.tekartik.sqflite.operation.f
    public void success(Object obj) {
        i().success(obj);
    }
}
