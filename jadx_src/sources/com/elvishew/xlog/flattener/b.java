package com.elvishew.xlog.flattener;

/* JADX INFO: compiled from: DefaultFlattener.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements d, c {
    @Override // com.elvishew.xlog.flattener.c
    public CharSequence a(long j10, int i10, String str, String str2) {
        return Long.toString(j10) + '|' + com.elvishew.xlog.d.b(i10) + '|' + str + '|' + str2;
    }

    @Override // com.elvishew.xlog.flattener.d
    public CharSequence b(int i10, String str, String str2) {
        return a(System.currentTimeMillis(), i10, str, str2);
    }
}
