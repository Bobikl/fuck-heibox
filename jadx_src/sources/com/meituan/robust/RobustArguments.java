package com.meituan.robust;

/* JADX INFO: loaded from: classes13.dex */
public class RobustArguments {
    public Object current;
    public boolean isStatic;
    public int methodNumber;
    public Object[] paramsArray;
    public Class[] paramsClassTypes;
    public Class returnType;

    public RobustArguments(Object[] objArr, Object obj, boolean z10, int i10, Class[] clsArr, Class cls) {
        this.paramsArray = objArr;
        this.current = obj;
        this.isStatic = z10;
        this.methodNumber = i10;
        this.paramsClassTypes = clsArr;
        this.returnType = cls;
    }
}
