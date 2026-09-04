package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il;

/* JADX INFO: loaded from: classes6.dex */
public final class l1111l111111Il implements l11l1111I1l {
    private static int l111l1111l1Il = 2000;
    private static float l111l1111lI1l = 0.0f;
    private static int l111l1111llIl = 1;
    private int l1111l111111Il;
    private final int l111l11111I1l;
    private final float l111l11111Il;
    private int l111l11111lIl;

    public l1111l111111Il() {
        this(2000, 1, 0.0f);
    }

    public l1111l111111Il(int i10, int i11, float f10) {
        this.l1111l111111Il = i10;
        this.l111l11111I1l = i11;
        this.l111l11111Il = f10;
    }

    private float l111l11111I1l() {
        return this.l111l11111Il;
    }

    private boolean l111l11111Il() {
        return this.l111l11111lIl <= this.l111l11111I1l;
    }

    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1l
    public final int l1111l111111Il() {
        return this.l1111l111111Il;
    }

    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1l
    public final void l1111l111111Il(l11l1111I1ll l11l1111i1ll) throws l11l1111I1ll {
        int i10 = this.l111l11111lIl + 1;
        this.l111l11111lIl = i10;
        int i11 = this.l1111l111111Il;
        this.l1111l111111Il = i11 + ((int) (i11 * this.l111l11111Il));
        if (!(i10 <= this.l111l11111I1l)) {
            throw l11l1111i1ll;
        }
    }

    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1l
    public final int l111l11111lIl() {
        return this.l111l11111lIl;
    }
}
