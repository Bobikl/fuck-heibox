package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.metadata.g;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.n0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47004d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47005e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f47006f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f47007g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f47008h = 255;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f47009a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f47010b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n0 f47011c;

    @Override // com.google.android.exoplayer2.metadata.g
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        n0 n0Var = this.f47011c;
        if (n0Var == null || dVar.f46819n != n0Var.e()) {
            n0 n0Var2 = new n0(dVar.f44490g);
            this.f47011c = n0Var2;
            n0Var2.a(dVar.f44490g - dVar.f46819n);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f47009a.Q(bArrArray, iLimit);
        this.f47010b.p(bArrArray, iLimit);
        this.f47010b.s(39);
        long jH = (((long) this.f47010b.h(1)) << 32) | ((long) this.f47010b.h(32));
        this.f47010b.s(20);
        int iH = this.f47010b.h(12);
        int iH2 = this.f47010b.h(8);
        Metadata.Entry spliceNullCommand = null;
        this.f47009a.T(14);
        if (iH2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iH2 == 255) {
            spliceNullCommand = PrivateCommand.a(this.f47009a, iH, jH);
        } else if (iH2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.a(this.f47009a);
        } else if (iH2 == 5) {
            spliceNullCommand = SpliceInsertCommand.a(this.f47009a, jH, this.f47011c);
        } else if (iH2 == 6) {
            spliceNullCommand = TimeSignalCommand.a(this.f47009a, jH, this.f47011c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
