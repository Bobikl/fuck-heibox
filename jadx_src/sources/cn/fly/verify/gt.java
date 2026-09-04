package cn.fly.verify;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile gt f36851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gl f36852b;

    private gt() {
        if (this.f36852b == null) {
            gl glVar = new gl(ax.g());
            this.f36852b = glVar;
            glVar.a("dhp", 1, ec.a("016bMdd'aTbacdVd3dffhfbgifffdfchdfjfg"));
        }
    }

    public static gt a() {
        if (f36851a == null) {
            synchronized (gt.class) {
                if (f36851a == null) {
                    f36851a = new gt();
                }
            }
        }
        return f36851a;
    }

    public double a(String str, double d10) throws gf.b {
        return this.f36852b.a(str, d10);
    }

    public int a(String str, int i10) {
        return this.f36852b.b(str, i10);
    }

    public long a(String str, long j10) throws gf.b {
        return this.f36852b.b(str, j10);
    }

    public <T extends Parcelable> T a(String str, Class<T> cls) throws gf.b {
        return (T) this.f36852b.a(str, (Class) cls);
    }

    public <T> T a(String str, Class<T> cls, T t10) throws gf.b {
        return (T) this.f36852b.a(str, cls, t10);
    }

    public String a(String str) throws gf.b {
        return this.f36852b.b(str);
    }

    public <T extends Parcelable> List<T> a(String str, Class<T> cls, List<T> list) throws gf.b {
        return this.f36852b.a(str, (Class) cls, (List) list);
    }

    public <T extends Parcelable> Map<String, T> a(String str, Class<T> cls, Map<String, T> map) throws gf.b {
        return this.f36852b.a(str, (Class) cls, (Map) map);
    }

    public void a(String str, Parcelable parcelable) {
        this.f36852b.a(str, parcelable);
    }

    public void a(String str, Parcelable parcelable, long j10) {
        this.f36852b.a(str, parcelable, j10);
    }

    public void a(String str, Boolean bool) {
        this.f36852b.a(str, bool);
    }

    public void a(String str, Boolean bool, long j10) {
        this.f36852b.a(str, bool, j10);
    }

    public void a(String str, Double d10) {
        this.f36852b.a(str, d10);
    }

    public void a(String str, Double d10, long j10) {
        this.f36852b.a(str, d10, j10);
    }

    public void a(String str, Integer num) {
        this.f36852b.a(str, num);
    }

    public void a(String str, Integer num, long j10) {
        this.f36852b.a(str, num, j10);
    }

    public void a(String str, Long l10) {
        this.f36852b.a(str, l10);
    }

    public void a(String str, Long l10, long j10) {
        this.f36852b.a(str, l10, j10);
    }

    public void a(String str, Object obj) {
        this.f36852b.a(str, obj);
    }

    public void a(String str, Object obj, long j10) {
        this.f36852b.a(str, obj, j10);
    }

    public void a(String str, String str2) {
        this.f36852b.a(str, str2);
    }

    public void a(String str, String str2, long j10) {
        this.f36852b.a(str, str2, j10);
    }

    public <T extends Parcelable> void a(String str, List<T> list) {
        this.f36852b.a(str, (List) list);
    }

    public <T extends Parcelable> void a(String str, List<T> list, long j10) {
        this.f36852b.a(str, (List) list, j10);
    }

    public <T extends Parcelable> void a(String str, Map<String, T> map) {
        this.f36852b.a(str, (Map) map);
    }

    public <T extends Parcelable> void a(String str, Map<String, T> map, long j10) {
        this.f36852b.a(str, (Map) map, j10);
    }

    public <T extends Parcelable> void a(String str, T[] tArr) {
        this.f36852b.a(str, (Parcelable[]) tArr);
    }

    public <T extends Parcelable> void a(String str, T[] tArr, long j10) {
        this.f36852b.a(str, (Parcelable[]) tArr, j10);
    }

    public boolean a(String str, boolean z10) throws gf.b {
        return this.f36852b.b(str, z10);
    }

    public <T extends Parcelable> T[] a(String str, Class<T> cls, T[] tArr) throws gf.b {
        return (T[]) this.f36852b.a(str, (Class) cls, (Parcelable[]) tArr);
    }

    public int b(String str, int i10) throws gf.b {
        return this.f36852b.c(str, i10);
    }

    public Object b(String str, Object obj) throws gf.b {
        return this.f36852b.c(str, obj);
    }

    public String b(String str, String str2) throws gf.b {
        return this.f36852b.c(str, str2);
    }

    public <T extends Parcelable> Map<String, T> b(String str, Class<T> cls) throws gf.b {
        return this.f36852b.b(str, (Class) cls);
    }

    public boolean b(String str) throws gf.b {
        return this.f36852b.d(str);
    }

    public long c(String str) {
        return this.f36852b.e(str);
    }

    public <T extends Parcelable> List<T> c(String str, Class<T> cls) throws gf.b {
        return this.f36852b.c(str, (Class) cls);
    }

    public long d(String str) throws gf.b {
        return this.f36852b.f(str);
    }

    public <T extends Parcelable> T[] d(String str, Class<T> cls) throws gf.b {
        return (T[]) this.f36852b.d(str, cls);
    }

    public int e(String str) {
        return this.f36852b.g(str);
    }

    public double f(String str) throws gf.b {
        return this.f36852b.h(str);
    }

    public Object g(String str) throws gf.b {
        return this.f36852b.j(str);
    }

    public void h(String str) {
        this.f36852b.k(str);
    }
}
