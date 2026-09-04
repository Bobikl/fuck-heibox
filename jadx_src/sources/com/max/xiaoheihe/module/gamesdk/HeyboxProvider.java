package com.max.xiaoheihe.module.gamesdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcommon.utils.d;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.module.mall.SteamStoreLoginActivity;
import com.max.xiaoheihe.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class HeyboxProvider extends ContentProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UriMatcher f88588b;

    private SharedPreferences a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38447, new Class[0], SharedPreferences.class);
        return patchProxyResultProxy.isSupported ? (SharedPreferences) patchProxyResultProxy.result : getContext().getSharedPreferences("user", 0);
    }

    private User b() {
        User user;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38448, new Class[0], User.class);
        if (patchProxyResultProxy.isSupported) {
            return (User) patchProxyResultProxy.result;
        }
        String string = a().getString("user", "");
        return (TextUtils.isEmpty(string) || (user = (User) k.a(string, User.class)) == null) ? new User() : user;
    }

    @Override // android.content.ContentProvider
    public int delete(@n0 Uri uri, @p0 String str, @p0 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @p0
    public String getType(@n0 Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, 38446, new Class[]{Uri.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f88588b.match(uri) == 0) {
            return "vnd.android.cursor.item/vnd.com.max.xiaoheihe.statusprovider.login";
        }
        return null;
    }

    @Override // android.content.ContentProvider
    @p0
    public Uri insert(@n0 Uri uri, @p0 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38444, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        d.b("zzzzHeyboxProvider", "onCreate");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f88588b = uriMatcher;
        uriMatcher.addURI("com.max.xiaoheihe.statusprovider", SteamStoreLoginActivity.f89907b0, 0);
        return true;
    }

    @Override // android.content.ContentProvider
    @p0
    public Cursor query(@n0 Uri uri, @p0 String[] strArr, @p0 String str, @p0 String[] strArr2, @p0 String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, strArr, str, strArr2, str2}, this, changeQuickRedirect, false, 38445, new Class[]{Uri.class, String[].class, String.class, String[].class, String.class}, Cursor.class);
        if (patchProxyResultProxy.isSupported) {
            return (Cursor) patchProxyResultProxy.result;
        }
        d.b("zzzzHeyboxProvider", "query");
        User userB = b();
        if (this.f88588b.match(uri) != 0 || !userB.isLoginFlag()) {
            return null;
        }
        d.b("zzzzHeyboxProvider", "query  islogin");
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"heybox_id", "pkey", "device_id", "x_xhh_tokenid"});
        matrixCursor.addRow(new Object[]{userB.getAccount_detail().getUserid(), userB.getPkey(), com.max.xiaoheihe.utils.d.U(), h.f()});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@n0 Uri uri, @p0 ContentValues contentValues, @p0 String str, @p0 String[] strArr) {
        return 0;
    }
}
