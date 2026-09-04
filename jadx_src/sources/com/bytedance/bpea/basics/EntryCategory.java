package com.bytedance.bpea.basics;

import kotlin.Metadata;

/* JADX INFO: compiled from: EntryCategory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bytedance/bpea/basics/EntryCategory;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "BPEA_ENTRY", "DIRECT_AUTH", "basics_release"}, k = 1, mv = {1, 1, 16})
public enum EntryCategory {
    BPEA_ENTRY(1),
    DIRECT_AUTH(2);

    private final int type;

    EntryCategory(int i10) {
        this.type = i10;
    }

    public final int getType() {
        return this.type;
    }
}
