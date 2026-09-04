package com.github.penfeizhou.animation.apng.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: APNGFrame.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends com.github.penfeizhou.animation.decode.a<com.github.penfeizhou.animation.apng.io.a, com.github.penfeizhou.animation.apng.io.b> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f43196l = {-119, 80, 78, 71, 13, 10, com.google.common.base.a.D, 10};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f43197m = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ThreadLocal<CRC32> f43198n = new ThreadLocal<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f43199o = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte f43200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f43201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    byte[] f43202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<d> f43203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<d> f43204k;

    public c(com.github.penfeizhou.animation.apng.io.a aVar, e eVar) {
        super(aVar);
        this.f43203j = new ArrayList();
        this.f43204k = new ArrayList();
        this.f43200g = eVar.f43223m;
        this.f43201h = eVar.f43222l;
        int i10 = eVar.f43220j * 1000;
        short s10 = eVar.f43221k;
        int i11 = i10 / (s10 == 0 ? (short) 100 : s10);
        this.f43279f = i11;
        if (i11 < 10) {
            this.f43279f = 100;
        }
        this.f43275b = eVar.f43216f;
        this.f43276c = eVar.f43217g;
        this.f43277d = eVar.f43218h;
        this.f43278e = eVar.f43219i;
    }

    private int c(com.github.penfeizhou.animation.apng.io.b bVar) throws IOException {
        int i10;
        Iterator<d> it = this.f43204k.iterator();
        int i11 = 33;
        while (it.hasNext()) {
            i11 += it.next().f43205a + 12;
        }
        for (d dVar : this.f43203j) {
            if (dVar instanceof g) {
                i10 = dVar.f43205a + 12;
            } else if (dVar instanceof f) {
                i10 = dVar.f43205a + 8;
            }
            i11 += i10;
        }
        int length = i11 + f43197m.length;
        bVar.f(length);
        bVar.e(f43196l);
        bVar.d(13);
        int iPosition = bVar.position();
        bVar.a(i.f43228h);
        bVar.d(this.f43275b);
        bVar.d(this.f43276c);
        bVar.e(this.f43202i);
        CRC32 crc32D = d();
        crc32D.reset();
        crc32D.update(bVar.k(), iPosition, 17);
        bVar.d((int) crc32D.getValue());
        for (d dVar2 : this.f43204k) {
            if (!(dVar2 instanceof h)) {
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).reset();
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).skip(dVar2.f43208d);
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).read(bVar.k(), bVar.position(), dVar2.f43205a + 12);
                bVar.c(dVar2.f43205a + 12);
            }
        }
        for (d dVar3 : this.f43203j) {
            if (dVar3 instanceof g) {
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).reset();
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).skip(dVar3.f43208d);
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).read(bVar.k(), bVar.position(), dVar3.f43205a + 12);
                bVar.c(dVar3.f43205a + 12);
            } else if (dVar3 instanceof f) {
                bVar.d(dVar3.f43205a - 4);
                int iPosition2 = bVar.position();
                bVar.a(g.f43226e);
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).reset();
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).skip(dVar3.f43208d + 4 + 4 + 4);
                ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).read(bVar.k(), bVar.position(), dVar3.f43205a - 4);
                bVar.c(dVar3.f43205a - 4);
                crc32D.reset();
                crc32D.update(bVar.k(), iPosition2, dVar3.f43205a);
                bVar.d((int) crc32D.getValue());
            }
        }
        bVar.e(f43197m);
        return length;
    }

    private CRC32 d() {
        CRC32 crc32 = f43198n.get();
        if (crc32 != null) {
            return crc32;
        }
        CRC32 crc33 = new CRC32();
        f43198n.set(crc33);
        return crc33;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap a(Canvas canvas, Paint paint, int i10, Bitmap bitmap, com.github.penfeizhou.animation.apng.io.b bVar) {
        try {
            int iC = c(bVar);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = i10;
            options.inMutable = true;
            options.inBitmap = bitmap;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bVar.k(), 0, iC, options);
            float f10 = i10;
            canvas.drawBitmap(bitmapDecodeByteArray, this.f43277d / f10, this.f43278e / f10, paint);
            return bitmapDecodeByteArray;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
