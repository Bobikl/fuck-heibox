package com.lzy.okgo.cookie;

import android.content.ContentValues;
import android.database.Cursor;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import la.d;
import okhttp3.Cookie;

/* JADX INFO: loaded from: classes6.dex */
public class SerializableCookie implements Serializable {
    public static final String COOKIE = "cookie";
    public static final String DOMAIN = "domain";
    public static final String HOST = "host";
    public static final String NAME = "name";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6374381323722046732L;
    private transient Cookie clientCookie;
    private transient Cookie cookie;
    public String domain;
    public String host;
    public String name;

    public SerializableCookie(String str, Cookie cookie) {
        this.cookie = cookie;
        this.host = str;
        this.name = cookie.name();
        this.domain = cookie.domain();
    }

    private static String byteArrayToHexString(byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, c.b.f30901r5, new Class[]{byte[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 < 16) {
                sb2.append('0');
            }
            sb2.append(Integer.toHexString(i10));
        }
        return sb2.toString().toUpperCase(Locale.US);
    }

    public static Cookie bytesToCookie(byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, c.b.f30879q5, new Class[]{byte[].class}, Cookie.class);
        if (patchProxyResultProxy.isSupported) {
            return (Cookie) patchProxyResultProxy.result;
        }
        try {
            return ((SerializableCookie) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject()).getCookie();
        } catch (Exception e10) {
            d.i(e10);
            return null;
        }
    }

    public static byte[] cookieToBytes(String str, Cookie cookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cookie}, null, changeQuickRedirect, true, c.b.f30833o5, new Class[]{String.class, Cookie.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        SerializableCookie serializableCookie = new SerializableCookie(str, cookie);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(serializableCookie);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            d.i(e10);
            return null;
        }
    }

    public static Cookie decodeCookie(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.f30856p5, new Class[]{String.class}, Cookie.class);
        return patchProxyResultProxy.isSupported ? (Cookie) patchProxyResultProxy.result : bytesToCookie(hexStringToByteArray(str));
    }

    public static String encodeCookie(String str, Cookie cookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cookie}, null, changeQuickRedirect, true, c.b.f30810n5, new Class[]{String.class, Cookie.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (cookie == null) {
            return null;
        }
        return byteArrayToHexString(cookieToBytes(str, cookie));
    }

    public static ContentValues getContentValues(SerializableCookie serializableCookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{serializableCookie}, null, changeQuickRedirect, true, c.b.f30787m5, new Class[]{SerializableCookie.class}, ContentValues.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentValues) patchProxyResultProxy.result;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("host", serializableCookie.host);
        contentValues.put("name", serializableCookie.name);
        contentValues.put("domain", serializableCookie.domain);
        contentValues.put("cookie", cookieToBytes(serializableCookie.host, serializableCookie.getCookie()));
        return contentValues;
    }

    private static byte[] hexStringToByteArray(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.f30923s5, new Class[]{String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    public static SerializableCookie parseCursorToBean(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, c.b.f30764l5, new Class[]{Cursor.class}, SerializableCookie.class);
        return patchProxyResultProxy.isSupported ? (SerializableCookie) patchProxyResultProxy.result : new SerializableCookie(cursor.getString(cursor.getColumnIndex("host")), bytesToCookie(cursor.getBlob(cursor.getColumnIndex("cookie"))));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        if (PatchProxy.proxy(new Object[]{objectInputStream}, this, changeQuickRedirect, false, c.b.f30741k5, new Class[]{ObjectInputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        long j10 = objectInputStream.readLong();
        String str3 = (String) objectInputStream.readObject();
        String str4 = (String) objectInputStream.readObject();
        boolean z10 = objectInputStream.readBoolean();
        boolean z11 = objectInputStream.readBoolean();
        boolean z12 = objectInputStream.readBoolean();
        objectInputStream.readBoolean();
        Cookie.a aVarD = new Cookie.a().g(str).j(str2).d(j10);
        Cookie.a aVarH = (z12 ? aVarD.e(str3) : aVarD.b(str3)).h(str4);
        if (z10) {
            aVarH = aVarH.i();
        }
        if (z11) {
            aVarH = aVarH.f();
        }
        this.clientCookie = aVarH.a();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{objectOutputStream}, this, changeQuickRedirect, false, 425, new Class[]{ObjectOutputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.cookie.name());
        objectOutputStream.writeObject(this.cookie.value());
        objectOutputStream.writeLong(this.cookie.expiresAt());
        objectOutputStream.writeObject(this.cookie.domain());
        objectOutputStream.writeObject(this.cookie.path());
        objectOutputStream.writeBoolean(this.cookie.secure());
        objectOutputStream.writeBoolean(this.cookie.httpOnly());
        objectOutputStream.writeBoolean(this.cookie.hostOnly());
        objectOutputStream.writeBoolean(this.cookie.persistent());
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.f30945t5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SerializableCookie serializableCookie = (SerializableCookie) obj;
        String str = this.host;
        if (str == null ? serializableCookie.host != null : !str.equals(serializableCookie.host)) {
            return false;
        }
        String str2 = this.name;
        if (str2 == null ? serializableCookie.name != null : !str2.equals(serializableCookie.name)) {
            return false;
        }
        String str3 = this.domain;
        String str4 = serializableCookie.domain;
        if (str3 != null) {
            return str3.equals(str4);
        }
        return str4 == null;
    }

    public Cookie getCookie() {
        Cookie cookie = this.cookie;
        Cookie cookie2 = this.clientCookie;
        return cookie2 != null ? cookie2 : cookie;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30967u5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.host;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.domain;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
