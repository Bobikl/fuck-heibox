package com.tencent.thumbplayer.tcmedia.g.d;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.g.b.e;
import com.tencent.thumbplayer.tcmedia.g.b.f;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f102739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f102740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f102741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<f> f102742d = new CopyOnWriteArraySet<>();

    public b(int i10, String str) {
        this.f102740b = i10;
        this.f102741c = str;
    }

    private f a(f fVar, Iterator it) {
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (TextUtils.equals(fVar.m(), fVar2.m())) {
                return fVar2;
            }
        }
        return null;
    }

    private f b() {
        Iterator<f> it = this.f102742d.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    private final f b(e eVar) {
        for (f fVar : this.f102742d) {
            if (!fVar.f102692b && fVar.a(eVar) != com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_NO) {
                return fVar;
            }
            fVar.k();
            if (fVar.l()) {
                b(fVar);
            }
        }
        return null;
    }

    private f c(f fVar) {
        f fVarA;
        return (com.tencent.thumbplayer.tcmedia.g.a.a().d().f102776d != com.tencent.thumbplayer.tcmedia.g.f.b.a.SAME || (fVarA = a(fVar, this.f102742d.iterator())) == null) ? b() : fVarA;
    }

    public final f a(e eVar) {
        f fVarB = b(eVar);
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("CodecWrapperPool", "obtain codecWrapper:".concat(String.valueOf(fVarB)));
        }
        if (fVarB == null) {
            return null;
        }
        this.f102742d.remove(fVarB);
        return fVarB;
    }

    public final void a(f fVar) {
        if (a()) {
            b(c(fVar));
        }
        this.f102742d.add(fVar);
    }

    public final void a(c cVar) {
        this.f102739a = cVar;
    }

    public final boolean a() {
        return this.f102742d.size() == this.f102740b;
    }

    public final void b(f fVar) {
        if (this.f102742d.remove(fVar)) {
            c cVar = this.f102739a;
            if (cVar != null) {
                cVar.a(fVar);
                return;
            }
            return;
        }
        com.tencent.thumbplayer.tcmedia.g.h.b.d("CodecWrapperPool", "pool:" + this.f102741c + " remove " + fVar + " not found");
    }

    public final String toString() {
        return "size:" + this.f102742d.size() + " elements:" + this.f102742d;
    }
}
