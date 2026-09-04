package com.max.hbcustomview.tickerview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: TickerColumnManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f69658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b[] f69659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<Character> f69660d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<c> f69657a = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<Character> f69661e = new HashSet();

    /* JADX INFO: compiled from: TickerColumnManager.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69662a;

        static {
            int[] iArr = new int[TickerUtils.TickerTimeFormat.valuesCustom().length];
            f69662a = iArr;
            try {
                iArr[TickerUtils.TickerTimeFormat.FORMAT_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69662a[TickerUtils.TickerTimeFormat.FORMAT_HMS_SEPARATE_BY_SEMICOLON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    d(e eVar) {
        this.f69658b = eVar;
    }

    private boolean a(char[] cArr) {
        char c10;
        if (cArr == null || cArr.length != 8 || ':' != cArr[2] || ':' != cArr[5] || cArr[3] >= '6' || cArr[6] >= '6') {
            return false;
        }
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if (i10 != 2 && i10 != 5 && ((c10 = cArr[i10]) < '0' || c10 > '9')) {
                return false;
            }
        }
        return true;
    }

    private c g(int i10, e eVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), eVar}, this, changeQuickRedirect, false, bb.c.f.qu, new Class[]{Integer.TYPE, e.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (i10 == 2 || i10 == 5) {
            return new c(new b[]{new b(":")}, eVar);
        }
        if (i10 == 3 || i10 == 6) {
            b[] bVarArr = new b[1];
            if (eVar.d() == TickerView.ScrollingDirection.DOWN) {
                bVarArr[0] = new b("543210");
            } else {
                bVarArr[0] = new b("012345");
            }
            return new c(bVarArr, eVar);
        }
        b[] bVarArr2 = new b[1];
        if (eVar.d() == TickerView.ScrollingDirection.DOWN) {
            bVarArr2[0] = new b("9876543210");
        } else {
            bVarArr2[0] = new b("0123456789");
        }
        return new c(bVarArr2, eVar);
    }

    private void k(char[] cArr) {
        if (PatchProxy.proxy(new Object[]{cArr}, this, changeQuickRedirect, false, bb.c.f.pu, new Class[]{char[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (!a(cArr)) {
            l(cArr);
            return;
        }
        List listAsList = Arrays.asList(':', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0');
        if (!this.f69661e.containsAll(listAsList)) {
            this.f69661e.addAll(listAsList);
        }
        int[] iArrB = com.max.hbcustomview.tickerview.a.b(d(), cArr, this.f69661e);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArrB.length; i12++) {
            int i13 = iArrB[i12];
            if (i13 == 0) {
                this.f69657a.get(i10).l(cArr[i11]);
                i10++;
                i11++;
            } else if (i13 == 1) {
                this.f69657a.add(i10, g(i10, this.f69658b));
                this.f69657a.get(i10).l(cArr[i11]);
                i10++;
                i11++;
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException("Unknown action: " + iArrB[i12]);
                }
                this.f69657a.get(i10).l((char) 0);
                i10++;
            }
        }
    }

    private void l(char[] cArr) {
        if (PatchProxy.proxy(new Object[]{cArr}, this, changeQuickRedirect, false, bb.c.f.ou, new Class[]{char[].class}, Void.TYPE).isSupported) {
            return;
        }
        int[] iArrB = com.max.hbcustomview.tickerview.a.b(d(), cArr, this.f69660d);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArrB.length; i12++) {
            int i13 = iArrB[i12];
            if (i13 == 0) {
                this.f69657a.get(i10).l(cArr[i11]);
                i10++;
                i11++;
            } else if (i13 == 1) {
                this.f69657a.add(i10, new c(this.f69659c, this.f69658b));
                this.f69657a.get(i10).l(cArr[i11]);
                i10++;
                i11++;
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException("Unknown action: " + iArrB[i12]);
                }
                this.f69657a.get(i10).l((char) 0);
                i10++;
            }
        }
    }

    void b(Canvas canvas, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, bb.c.f.wu, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        int size = this.f69657a.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.f69657a.get(i10);
            cVar.b(canvas, paint);
            canvas.translate(cVar.e(), 0.0f);
        }
    }

    b[] c() {
        return this.f69659c;
    }

    char[] d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.vu, new Class[0], char[].class);
        if (patchProxyResultProxy.isSupported) {
            return (char[]) patchProxyResultProxy.result;
        }
        int size = this.f69657a.size();
        char[] cArr = new char[size];
        for (int i10 = 0; i10 < size; i10++) {
            cArr[i10] = this.f69657a.get(i10).d();
        }
        return cArr;
    }

    float e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.uu, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float fE = 0.0f;
        int size = this.f69657a.size();
        for (int i10 = 0; i10 < size; i10++) {
            fE += this.f69657a.get(i10).e();
        }
        return fE;
    }

    float f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.tu, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float f10 = 0.0f;
        int size = this.f69657a.size();
        for (int i10 = 0; i10 < size; i10++) {
            f10 += this.f69657a.get(i10).f();
        }
        return f10;
    }

    void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ru, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int size = this.f69657a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f69657a.get(i10).h();
        }
    }

    void i(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.su, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int size = this.f69657a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f69657a.get(i10).i(f10);
        }
    }

    void j(String... strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.f.mu, new Class[]{String[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69659c = new b[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            this.f69659c[i10] = new b(strArr[i10]);
        }
        this.f69660d = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            this.f69660d.addAll(this.f69659c[i11].d());
        }
        Iterator<c> it = this.f69657a.iterator();
        while (it.hasNext()) {
            it.next().k(this.f69659c);
        }
    }

    void m(char[] cArr, @n0 TickerUtils.TickerTimeFormat tickerTimeFormat) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{cArr, tickerTimeFormat}, this, changeQuickRedirect, false, bb.c.f.nu, new Class[]{char[].class, TickerUtils.TickerTimeFormat.class}, Void.TYPE).isSupported) {
            return;
        }
        if (tickerTimeFormat == TickerUtils.TickerTimeFormat.FORMAT_ANY && this.f69659c == null) {
            throw new IllegalStateException("Need to call #setCharacterLists first.");
        }
        while (i10 < this.f69657a.size()) {
            if (this.f69657a.get(i10).e() > 0.0f) {
                i10++;
            } else {
                this.f69657a.remove(i10);
            }
        }
        int i11 = a.f69662a[tickerTimeFormat.ordinal()];
        if (i11 == 1) {
            l(cArr);
        } else if (i11 != 2) {
            Log.e("TickerColumnManager", "[setText] undefined method");
        } else {
            k(cArr);
        }
    }
}
