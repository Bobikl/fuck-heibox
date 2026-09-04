package com.huawei.hms.ui;

import android.os.Bundle;
import com.huawei.hms.base.ui.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class SafeBundle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f62721a;

    public SafeBundle() {
        this(new Bundle());
    }

    public SafeBundle(Bundle bundle) {
        this.f62721a = bundle == null ? new Bundle() : bundle;
    }

    public boolean containsKey(String str) {
        try {
            return this.f62721a.containsKey(str);
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.f62721a.get(str);
        } catch (Exception e10) {
            LogUtil.e("SafeBundle", "get exception: " + e10.getMessage(), true);
            return null;
        }
    }

    public Bundle getBundle() {
        return this.f62721a;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int getInt(String str, int i10) {
        try {
            return this.f62721a.getInt(str, i10);
        } catch (Exception e10) {
            LogUtil.e("SafeBundle", "getInt exception: " + e10.getMessage(), true);
            return i10;
        }
    }

    public String getString(String str) {
        try {
            return this.f62721a.getString(str);
        } catch (Exception e10) {
            LogUtil.e("SafeBundle", "getString exception: " + e10.getMessage(), true);
            return "";
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f62721a.getString(str, str2);
        } catch (Exception e10) {
            LogUtil.e("SafeBundle", "getString exception: " + e10.getMessage(), true);
            return str2;
        }
    }

    public boolean isEmpty() {
        try {
            return this.f62721a.isEmpty();
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "isEmpty exception");
            return true;
        }
    }

    public int size() {
        try {
            return this.f62721a.size();
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "size exception");
            return 0;
        }
    }

    public String toString() {
        return this.f62721a.toString();
    }
}
