package com.alibaba.sdk.android.beacon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Beacon.Config> f37891a = new ArrayList();

    b(Beacon beacon) {
    }

    List<Beacon.Config> a() {
        return Collections.unmodifiableList(this.f37891a);
    }
}
