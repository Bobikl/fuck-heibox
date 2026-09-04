package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.b0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.emoji2.text.q;

/* JADX INFO: compiled from: EmojiEditableFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f23191a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("INSTANCE_LOCK")
    private static volatile Editable.Factory f23192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private static Class<?> f23193c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f23193c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f23192b == null) {
            synchronized (f23191a) {
                if (f23192b == null) {
                    f23192b = new b();
                }
            }
        }
        return f23192b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@n0 CharSequence charSequence) {
        Class<?> cls = f23193c;
        return cls != null ? q.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
