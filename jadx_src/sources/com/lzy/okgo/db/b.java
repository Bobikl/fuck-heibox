package com.lzy.okgo.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.lzy.okgo.cache.CacheEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: CacheManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends com.lzy.okgo.db.a<CacheEntity<?>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.lzy.okgo.db.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheManager.java */
    public static class C0523b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f64700a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0523b() {
        }
    }

    private b() {
        super(new e());
    }

    public static b O() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.F6, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : C0523b.f64700a;
    }

    @Override // com.lzy.okgo.db.a
    public void E() {
    }

    public boolean J() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 507, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : e();
    }

    public CacheEntity<?> K(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 502, new Class[]{String.class}, CacheEntity.class);
        if (patchProxyResultProxy.isSupported) {
            return (CacheEntity) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        List<CacheEntity<?>> listR = r("key=?", new String[]{str});
        if (listR.size() > 0) {
            return listR.get(0);
        }
        return null;
    }

    public <T> CacheEntity<T> L(String str, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cls}, this, changeQuickRedirect, false, 504, new Class[]{String.class, Class.class}, CacheEntity.class);
        return patchProxyResultProxy.isSupported ? (CacheEntity) patchProxyResultProxy.result : (CacheEntity<T>) K(str);
    }

    public List<CacheEntity<?>> M() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 505, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : t();
    }

    public ContentValues N(CacheEntity<?> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheEntity}, this, changeQuickRedirect, false, 501, new Class[]{CacheEntity.class}, ContentValues.class);
        return patchProxyResultProxy.isSupported ? (ContentValues) patchProxyResultProxy.result : CacheEntity.b(cacheEntity);
    }

    public CacheEntity<?> P(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, this, changeQuickRedirect, false, 500, new Class[]{Cursor.class}, CacheEntity.class);
        return patchProxyResultProxy.isSupported ? (CacheEntity) patchProxyResultProxy.result : CacheEntity.h(cursor);
    }

    public boolean Q(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 503, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return c("key=?", new String[]{str});
    }

    public <T> CacheEntity<T> R(String str, CacheEntity<T> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cacheEntity}, this, changeQuickRedirect, false, 506, new Class[]{String.class, CacheEntity.class}, CacheEntity.class);
        if (patchProxyResultProxy.isSupported) {
            return (CacheEntity) patchProxyResultProxy.result;
        }
        cacheEntity.k(str);
        B(cacheEntity);
        return cacheEntity;
    }

    @Override // com.lzy.okgo.db.a
    public /* bridge */ /* synthetic */ ContentValues g(CacheEntity<?> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheEntity}, this, changeQuickRedirect, false, 508, new Class[]{Object.class}, ContentValues.class);
        return patchProxyResultProxy.isSupported ? (ContentValues) patchProxyResultProxy.result : N(cacheEntity);
    }

    @Override // com.lzy.okgo.db.a
    public String h() {
        return "cache";
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.lzy.okgo.cache.CacheEntity<?>, java.lang.Object] */
    @Override // com.lzy.okgo.db.a
    public /* bridge */ /* synthetic */ CacheEntity<?> o(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, this, changeQuickRedirect, false, 509, new Class[]{Cursor.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : P(cursor);
    }
}
