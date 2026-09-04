package com.lzy.okgo.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.lzy.okgo.model.Progress;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: DownloadManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends com.lzy.okgo.db.a<Progress> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: DownloadManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f64720a = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }
    }

    private g() {
        super(new e());
    }

    public static g Q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.f30535b7, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : b.f64720a;
    }

    @Override // com.lzy.okgo.db.a
    public void E() {
    }

    public boolean J() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30766l7, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : e();
    }

    public void K(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.f30628f7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        c("tag=?", new String[]{str});
    }

    public Progress L(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.f30605e7, new Class[]{String.class}, Progress.class);
        return patchProxyResultProxy.isSupported ? (Progress) patchProxyResultProxy.result : w("tag=?", new String[]{str});
    }

    public List<Progress> M() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30697i7, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : s(null, null, null, null, null, "date ASC", null);
    }

    public ContentValues N(Progress progress) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30582d7, new Class[]{Progress.class}, ContentValues.class);
        return patchProxyResultProxy.isSupported ? (ContentValues) patchProxyResultProxy.result : Progress.b(progress);
    }

    public List<Progress> O() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30743k7, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : s(null, "status not in(?)", new String[]{"5"}, null, null, "date ASC", null);
    }

    public List<Progress> P() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30720j7, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : s(null, "status=?", new String[]{"5"}, null, null, "date ASC", null);
    }

    public Progress R(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, this, changeQuickRedirect, false, bb.c.b.f30558c7, new Class[]{Cursor.class}, Progress.class);
        return patchProxyResultProxy.isSupported ? (Progress) patchProxyResultProxy.result : Progress.g(cursor);
    }

    public boolean S(ContentValues contentValues, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{contentValues, str}, this, changeQuickRedirect, false, bb.c.b.f30674h7, new Class[]{ContentValues.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : H(contentValues, "tag=?", new String[]{str});
    }

    public boolean T(Progress progress) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30651g7, new Class[]{Progress.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : I(progress, "tag=?", new String[]{progress.f64776b});
    }

    @Override // com.lzy.okgo.db.a
    public /* bridge */ /* synthetic */ ContentValues g(Progress progress) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30789m7, new Class[]{Object.class}, ContentValues.class);
        return patchProxyResultProxy.isSupported ? (ContentValues) patchProxyResultProxy.result : N(progress);
    }

    @Override // com.lzy.okgo.db.a
    public String h() {
        return ChannelsDetailActivity.f79595e4;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.lzy.okgo.model.Progress, java.lang.Object] */
    @Override // com.lzy.okgo.db.a
    public /* bridge */ /* synthetic */ Progress o(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, this, changeQuickRedirect, false, bb.c.b.f30812n7, new Class[]{Cursor.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : R(cursor);
    }
}
