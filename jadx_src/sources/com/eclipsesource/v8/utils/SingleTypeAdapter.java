package com.eclipsesource.v8.utils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SingleTypeAdapter implements TypeAdapter {
    private int typeToAdapt;

    public SingleTypeAdapter(int i10) {
        this.typeToAdapt = i10;
    }

    @Override // com.eclipsesource.v8.utils.TypeAdapter
    public Object adapt(int i10, Object obj) {
        return i10 == this.typeToAdapt ? adapt(obj) : TypeAdapter.DEFAULT;
    }

    public abstract Object adapt(Object obj);
}
