package com.lzy.okgo.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.lzy.okgo.cookie.SerializableCookie;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CookieManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends a<SerializableCookie> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Context f64707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile d f64708f;

    private d() {
        super(new e(f64707e));
    }

    public static d K() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 510, new Class[0], d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        if (f64708f == null) {
            synchronized (d.class) {
                if (f64708f == null) {
                    f64708f = new d();
                }
            }
        }
        return f64708f;
    }

    public static void L(Context context) {
        f64707e = context;
    }

    @Override // com.lzy.okgo.db.a
    public void E() {
    }

    public ContentValues J(SerializableCookie serializableCookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{serializableCookie}, this, changeQuickRedirect, false, 512, new Class[]{SerializableCookie.class}, ContentValues.class);
        return patchProxyResultProxy.isSupported ? (ContentValues) patchProxyResultProxy.result : SerializableCookie.getContentValues(serializableCookie);
    }

    public SerializableCookie M(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, this, changeQuickRedirect, false, 511, new Class[]{Cursor.class}, SerializableCookie.class);
        return patchProxyResultProxy.isSupported ? (SerializableCookie) patchProxyResultProxy.result : SerializableCookie.parseCursorToBean(cursor);
    }

    @Override // com.lzy.okgo.db.a
    public /* bridge */ /* synthetic */ ContentValues g(SerializableCookie serializableCookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{serializableCookie}, this, changeQuickRedirect, false, 513, new Class[]{Object.class}, ContentValues.class);
        return patchProxyResultProxy.isSupported ? (ContentValues) patchProxyResultProxy.result : J(serializableCookie);
    }

    @Override // com.lzy.okgo.db.a
    public String h() {
        return "cookie";
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.lzy.okgo.cookie.SerializableCookie, java.lang.Object] */
    @Override // com.lzy.okgo.db.a
    public /* bridge */ /* synthetic */ SerializableCookie o(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, this, changeQuickRedirect, false, bb.c.b.U6, new Class[]{Cursor.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : M(cursor);
    }
}
