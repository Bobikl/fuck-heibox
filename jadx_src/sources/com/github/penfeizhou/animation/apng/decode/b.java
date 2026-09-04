package com.github.penfeizhou.animation.apng.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: APNGDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends FrameSeqDecoder<com.github.penfeizhou.animation.apng.io.a, com.github.penfeizhou.animation.apng.io.b> {
    private C0366b A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.github.penfeizhou.animation.apng.io.b f43189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f43190y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Paint f43191z;

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.apng.decode.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: APNGDecoder.java */
    public class C0366b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte f43192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Rect f43193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ByteBuffer f43194c;

        private C0366b() {
            this.f43193b = new Rect();
        }
    }

    public b(com.github.penfeizhou.animation.loader.d dVar, FrameSeqDecoder.i iVar) {
        super(dVar, iVar);
        Paint paint = new Paint();
        this.f43191z = paint;
        this.A = new C0366b();
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    protected void J() {
        this.A.f43194c = null;
        this.f43189x = null;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    protected void L(com.github.penfeizhou.animation.decode.a aVar) {
        if (aVar == null || this.f43257p == null) {
            return;
        }
        try {
            Bitmap bitmapF = F(this.f43257p.width() / this.f43252k, this.f43257p.height() / this.f43252k);
            Canvas canvas = this.f43255n.get(bitmapF);
            if (canvas == null) {
                canvas = new Canvas(bitmapF);
                this.f43255n.put(bitmapF, canvas);
            }
            Canvas canvas2 = canvas;
            if (aVar instanceof c) {
                this.f43256o.rewind();
                bitmapF.copyPixelsFromBuffer(this.f43256o);
                if (this.f43246e == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.A.f43193b);
                    C0366b c0366b = this.A;
                    byte b10 = c0366b.f43192a;
                    if (b10 == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b10 == 2) {
                        c0366b.f43194c.rewind();
                        bitmapF.copyPixelsFromBuffer(this.A.f43194c);
                    }
                    canvas2.restore();
                }
                if (((c) aVar).f43201h == 2) {
                    C0366b c0366b2 = this.A;
                    if (c0366b2.f43192a != 2) {
                        c0366b2.f43194c.rewind();
                        bitmapF.copyPixelsToBuffer(this.A.f43194c);
                    }
                }
                this.A.f43192a = ((c) aVar).f43201h;
                canvas2.save();
                if (((c) aVar).f43200g == 0) {
                    int i10 = aVar.f43277d;
                    int i11 = this.f43252k;
                    int i12 = aVar.f43278e;
                    canvas2.clipRect(i10 / i11, i12 / i11, (i10 + aVar.f43275b) / i11, (i12 + aVar.f43276c) / i11);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.A.f43193b;
                int i13 = aVar.f43277d;
                int i14 = this.f43252k;
                int i15 = aVar.f43278e;
                rect.set(i13 / i14, i15 / i14, (i13 + aVar.f43275b) / i14, (i15 + aVar.f43276c) / i14);
                canvas2.restore();
            }
            Bitmap bitmapF2 = F(aVar.f43275b, aVar.f43276c);
            I(aVar.a(canvas2, this.f43191z, this.f43252k, bitmapF2, z()));
            I(bitmapF2);
            this.f43256o.rewind();
            bitmapF.copyPixelsToBuffer(this.f43256o);
            I(bitmapF);
        } catch (Error | Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.apng.io.a x(com.github.penfeizhou.animation.io.e eVar) {
        return new com.github.penfeizhou.animation.apng.io.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.apng.io.b z() {
        if (this.f43189x == null) {
            this.f43189x = new com.github.penfeizhou.animation.apng.io.b();
        }
        return this.f43189x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Rect H(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        List<d> listE = APNGParser.e(aVar);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        c cVar = null;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        for (d dVar : listE) {
            if (dVar instanceof com.github.penfeizhou.animation.apng.decode.a) {
                this.f43190y = ((com.github.penfeizhou.animation.apng.decode.a) dVar).f43188f;
                z10 = true;
            } else if (dVar instanceof e) {
                cVar = new c(aVar, (e) dVar);
                cVar.f43204k = arrayList;
                cVar.f43202i = bArr;
                this.f43245d.add(cVar);
            } else if (dVar instanceof f) {
                if (cVar != null) {
                    cVar.f43203j.add(dVar);
                }
            } else if (dVar instanceof g) {
                if (!z10) {
                    j jVar = new j(aVar);
                    jVar.f43275b = i10;
                    jVar.f43276c = i11;
                    this.f43245d.add(jVar);
                    this.f43190y = 1;
                    break;
                }
                if (cVar != null) {
                    cVar.f43203j.add(dVar);
                }
            } else if (dVar instanceof i) {
                i iVar = (i) dVar;
                i10 = iVar.f43229e;
                i11 = iVar.f43230f;
                bArr = iVar.f43231g;
            } else if (!(dVar instanceof h)) {
                arrayList.add(dVar);
            }
        }
        int i12 = i10 * i11;
        int i13 = this.f43252k;
        this.f43256o = ByteBuffer.allocate(((i12 / (i13 * i13)) + 1) * 4);
        C0366b c0366b = this.A;
        int i14 = this.f43252k;
        c0366b.f43194c = ByteBuffer.allocate(((i12 / (i14 * i14)) + 1) * 4);
        return new Rect(0, 0, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    protected int u() {
        return this.f43190y;
    }
}
