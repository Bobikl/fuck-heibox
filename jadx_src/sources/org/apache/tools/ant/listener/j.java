package org.apache.tools.ant.listener;

import org.apache.tools.ant.y;

/* JADX INFO: compiled from: TimestampedLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f133556i = " - at ";

    @Override // org.apache.tools.ant.y
    protected String d() {
        return super.d() + f133556i + f();
    }

    @Override // org.apache.tools.ant.y
    protected String e() {
        return super.e() + f133556i + f();
    }
}
