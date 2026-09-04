package org.ahocorasick.trie;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: compiled from: Emit.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends org.ahocorasick.interval.a implements org.ahocorasick.interval.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f132787d;

    public a(int i10, int i11, String str) {
        super(i10, i11);
        this.f132787d = str;
    }

    public String c() {
        return this.f132787d;
    }

    @Override // org.ahocorasick.interval.a
    public String toString() {
        return super.toString() + ContainerUtils.KEY_VALUE_DELIMITER + this.f132787d;
    }
}
