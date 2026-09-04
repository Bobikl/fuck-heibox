package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.j1;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.util.o;
import java.util.HashMap;

/* JADX INFO: compiled from: BitmapPreFiller.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f41249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f41250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DecodeFormat f41251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f41252d;

    public b(j jVar, e eVar, DecodeFormat decodeFormat) {
        this.f41249a = jVar;
        this.f41250b = eVar;
        this.f41251c = decodeFormat;
    }

    private static int b(d dVar) {
        return o.h(dVar.d(), dVar.b(), dVar.a());
    }

    @j1
    c a(d... dVarArr) {
        long maxSize = (this.f41249a.getMaxSize() - this.f41249a.d()) + this.f41250b.getMaxSize();
        int iC = 0;
        for (d dVar : dVarArr) {
            iC += dVar.c();
        }
        float f10 = maxSize / iC;
        HashMap map = new HashMap();
        for (d dVar2 : dVarArr) {
            map.put(dVar2, Integer.valueOf(Math.round(dVar2.c() * f10) / b(dVar2)));
        }
        return new c(map);
    }

    public void c(d.a... aVarArr) {
        a aVar = this.f41252d;
        if (aVar != null) {
            aVar.b();
        }
        d[] dVarArr = new d[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            d.a aVar2 = aVarArr[i10];
            if (aVar2.b() == null) {
                aVar2.c(this.f41251c == DecodeFormat.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            dVarArr[i10] = aVar2.a();
        }
        a aVar3 = new a(this.f41250b, this.f41249a, a(dVarArr));
        this.f41252d = aVar3;
        o.y(aVar3);
    }
}
