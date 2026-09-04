package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private static final String f22940b = "emoji2.text.DefaultEmojiConfig";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private static final String f22941c = "androidx.content.action.LOAD_EMOJI_FONT";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        private static final String f22942d = "emojicompat-emoji-font";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f22943a;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public a(@p0 b bVar) {
            this.f22943a = bVar == null ? e() : bVar;
        }

        @p0
        private f.d a(@n0 Context context, @p0 androidx.core.provider.h hVar) {
            if (hVar == null) {
                return null;
            }
            return new l(context, hVar);
        }

        @n0
        private List<List<byte[]>> b(@n0 Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @n0
        private androidx.core.provider.h d(@n0 ProviderInfo providerInfo, @n0 PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new androidx.core.provider.h(str, str2, f22942d, b(this.f22943a.b(packageManager, str2)));
        }

        @n0
        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0165d() : new c();
        }

        private boolean f(@p0 ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @p0
        private ProviderInfo g(@n0 PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f22943a.c(packageManager, new Intent(f22941c), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoA = this.f22943a.a(it.next());
                if (f(providerInfoA)) {
                    return providerInfoA;
                }
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @p0
        public f.d c(@n0 Context context) {
            return a(context, h(context));
        }

        @j1
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @p0
        androidx.core.provider.h h(@n0 Context context) {
            PackageManager packageManager = context.getPackageManager();
            androidx.core.util.o.m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoG = g(packageManager);
            if (providerInfoG == null) {
                return null;
            }
            try {
                return d(providerInfoG, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf(f22940b, e10);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {
        @p0
        public ProviderInfo a(@n0 ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @n0
        public Signature[] b(@n0 PackageManager packageManager, @n0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @n0
        public List<ResolveInfo> c(@n0 PackageManager packageManager, @n0 Intent intent, int i10) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    @w0(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class c extends b {
        @Override // androidx.emoji2.text.d.b
        @p0
        public ProviderInfo a(@n0 ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.d.b
        @n0
        public List<ResolveInfo> c(@n0 PackageManager packageManager, @n0 Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    @w0(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class C0165d extends c {
        @Override // androidx.emoji2.text.d.b
        @n0
        public Signature[] b(@n0 PackageManager packageManager, @n0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    private d() {
    }

    @p0
    public static l a(@n0 Context context) {
        return (l) new a(null).c(context);
    }
}
