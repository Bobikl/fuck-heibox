package org.apache.tools.ant.util;

import java.io.IOException;

/* JADX INFO: compiled from: RetryHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f136890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.tools.ant.u2 f136891b;

    public q1(int i10, org.apache.tools.ant.u2 u2Var) {
        this.f136890a = i10;
        this.f136891b = u2Var;
    }

    public void a(r1 r1Var, String str) throws IOException {
        int i10 = 0;
        while (true) {
            try {
                r1Var.execute();
                return;
            } catch (IOException e10) {
                i10++;
                if (i10 > this.f136890a && this.f136890a > -1) {
                    this.f136891b.x1("try #" + i10 + ": IO error (" + str + "), number of maximum retries reached (" + this.f136890a + "), giving up", 1);
                    throw e10;
                }
                this.f136891b.x1("try #" + i10 + ": IO error (" + str + "), retrying", 1);
            }
        }
    }
}
