package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.meituan.robust.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: IntentSanitizer.java */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f20453p = "IntentSanitizer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.core.util.w<String> f20455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.core.util.w<Uri> f20456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.core.util.w<String> f20457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.core.util.w<String> f20458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.core.util.w<String> f20459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.core.util.w<ComponentName> f20460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, androidx.core.util.w<Object>> f20462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.core.util.w<Uri> f20464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.core.util.w<ClipData> f20465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20468o;

    /* JADX INFO: compiled from: IntentSanitizer.java */
    @androidx.annotation.w0(15)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static Intent a(Intent intent) {
            return intent.getSelector();
        }

        @androidx.annotation.u
        static void b(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    /* JADX INFO: compiled from: IntentSanitizer.java */
    @androidx.annotation.w0(16)
    public static class c {

        /* JADX INFO: compiled from: IntentSanitizer.java */
        @androidx.annotation.w0(31)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static void a(int i10, ClipData.Item item, androidx.core.util.d<String> dVar) {
                if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                    return;
                }
                dVar.accept("ClipData item at position " + i10 + " contains htmlText, textLinks or intent: " + item);
            }
        }

        private c() {
        }

        private static void a(int i10, ClipData.Item item, androidx.core.util.d<String> dVar) {
            if (item.getHtmlText() == null && item.getIntent() == null) {
                return;
            }
            dVar.accept("ClipData item at position " + i10 + " contains htmlText, textLinks or intent: " + item);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00bc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x00be  */
        /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
        @androidx.annotation.u
        static void b(@androidx.annotation.n0 Intent intent, Intent intent2, androidx.core.util.w<ClipData> wVar, boolean z10, androidx.core.util.w<Uri> wVar2, androidx.core.util.d<String> dVar) {
            CharSequence text;
            Uri uri;
            ClipData clipData = intent.getClipData();
            if (clipData == null) {
                return;
            }
            if (wVar != null && wVar.test(clipData)) {
                intent2.setClipData(clipData);
                return;
            }
            ClipData clipData2 = null;
            for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
                ClipData.Item itemAt = clipData.getItemAt(i10);
                if (Build.VERSION.SDK_INT >= 31) {
                    a.a(i10, itemAt, dVar);
                } else {
                    a(i10, itemAt, dVar);
                }
                if (z10) {
                    text = itemAt.getText();
                } else {
                    if (itemAt.getText() != null) {
                        dVar.accept("Item text cannot contain value. Item position: " + i10 + ". Text: " + ((Object) itemAt.getText()));
                    }
                    text = null;
                }
                if (wVar2 != null) {
                    if (itemAt.getUri() == null || wVar2.test(itemAt.getUri())) {
                        uri = itemAt.getUri();
                    } else {
                        dVar.accept("Item URI is not allowed. Item position: " + i10 + ". URI: " + itemAt.getUri());
                    }
                    if (text == null || uri != null) {
                        if (clipData2 == null) {
                            clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                        } else {
                            clipData2.addItem(new ClipData.Item(text, null, uri));
                        }
                    }
                } else if (itemAt.getUri() != null) {
                    dVar.accept("Item URI is not allowed. Item position: " + i10 + ". URI: " + itemAt.getUri());
                }
                uri = null;
                if (text == null) {
                    if (clipData2 == null) {
                        clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                    } else {
                        clipData2.addItem(new ClipData.Item(text, null, uri));
                    }
                } else if (clipData2 == null) {
                    clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                } else {
                    clipData2.addItem(new ClipData.Item(text, null, uri));
                }
            }
            if (clipData2 != null) {
                intent2.setClipData(clipData2);
            }
        }
    }

    /* JADX INFO: compiled from: IntentSanitizer.java */
    @androidx.annotation.w0(29)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static String a(Intent intent) {
            return intent.getIdentifier();
        }

        @androidx.annotation.u
        static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* JADX INFO: compiled from: IntentSanitizer.java */
    public static final class e {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f20469q = 2112614400;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f20470r = 2015363072;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f20471a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f20478h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f20479i;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f20484n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f20485o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f20486p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.core.util.w<String> f20472b = new androidx.core.util.w() { // from class: androidx.core.content.e0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return p.e.g0((String) obj);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.core.util.w<Uri> f20473c = new androidx.core.util.w() { // from class: androidx.core.content.f0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return p.e.h0((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.util.w<String> f20474d = new androidx.core.util.w() { // from class: androidx.core.content.g0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return p.e.i0((String) obj);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.util.w<String> f20475e = new androidx.core.util.w() { // from class: androidx.core.content.h0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return p.e.j0((String) obj);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.core.util.w<String> f20476f = new androidx.core.util.w() { // from class: androidx.core.content.i0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return p.e.k0((String) obj);
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.core.util.w<ComponentName> f20477g = new androidx.core.util.w() { // from class: androidx.core.content.j0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return p.e.l0((ComponentName) obj);
            }
        };

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map<String, androidx.core.util.w<Object>> f20480j = new HashMap();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f20481k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private androidx.core.util.w<Uri> f20482l = new androidx.core.util.w() { // from class: androidx.core.content.k0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return p.e.m0((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.util.w<ClipData> f20483m = new androidx.core.util.w() { // from class: androidx.core.content.l0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return p.e.n0((ClipData) obj);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean X(ComponentName componentName) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean Y(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean Z(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean b0(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean c0(Class cls, androidx.core.util.w wVar, Object obj) {
            return cls.isInstance(obj) && wVar.test(cls.cast(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean d0(Object obj) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean e0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean f0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean g0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean h0(Uri uri) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean i0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean j0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean k0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean l0(ComponentName componentName) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean m0(Uri uri) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean n0(ClipData clipData) {
            return false;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e A(@androidx.annotation.n0 final ComponentName componentName) {
            androidx.core.util.o.l(componentName);
            Objects.requireNonNull(componentName);
            return B(new androidx.core.util.w() { // from class: androidx.core.content.c0
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e B(@androidx.annotation.n0 androidx.core.util.w<ComponentName> wVar) {
            androidx.core.util.o.l(wVar);
            this.f20479i = true;
            this.f20477g = this.f20477g.b(wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e C(@androidx.annotation.n0 final String str) {
            androidx.core.util.o.l(str);
            return B(new androidx.core.util.w() { // from class: androidx.core.content.z
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return p.e.Z(str, (ComponentName) obj);
                }
            });
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e D(@androidx.annotation.n0 androidx.core.util.w<Uri> wVar) {
            androidx.core.util.o.l(wVar);
            this.f20473c = this.f20473c.b(wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e E(@androidx.annotation.n0 final String str) {
            androidx.core.util.o.l(str);
            D(new androidx.core.util.w() { // from class: androidx.core.content.a0
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return p.e.a0(str, (Uri) obj);
                }
            });
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e F(@androidx.annotation.n0 String str, @androidx.annotation.n0 androidx.core.util.w<Object> wVar) {
            androidx.core.util.o.l(str);
            androidx.core.util.o.l(wVar);
            androidx.core.util.w<Object> wVar2 = this.f20480j.get(str);
            if (wVar2 == null) {
                wVar2 = new androidx.core.util.w() { // from class: androidx.core.content.t
                    @Override // androidx.core.util.w
                    public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar3) {
                        return androidx.core.util.v.a(this, wVar3);
                    }

                    @Override // androidx.core.util.w
                    public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar3) {
                        return androidx.core.util.v.c(this, wVar3);
                    }

                    @Override // androidx.core.util.w
                    public /* synthetic */ androidx.core.util.w negate() {
                        return androidx.core.util.v.b(this);
                    }

                    @Override // androidx.core.util.w
                    public final boolean test(Object obj) {
                        return p.e.d0(obj);
                    }
                };
            }
            this.f20480j.put(str, wVar2.b(wVar));
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e G(@androidx.annotation.n0 String str, @androidx.annotation.n0 Class<?> cls) {
            return H(str, cls, new androidx.core.util.w() { // from class: androidx.core.content.d0
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return p.e.b0(obj);
                }
            });
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public <T> e H(@androidx.annotation.n0 String str, @androidx.annotation.n0 final Class<T> cls, @androidx.annotation.n0 final androidx.core.util.w<T> wVar) {
            androidx.core.util.o.l(str);
            androidx.core.util.o.l(cls);
            androidx.core.util.o.l(wVar);
            return F(str, new androidx.core.util.w() { // from class: androidx.core.content.y
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar2) {
                    return androidx.core.util.v.a(this, wVar2);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar2) {
                    return androidx.core.util.v.c(this, wVar2);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return p.e.c0(cls, wVar, obj);
                }
            });
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e I(@androidx.annotation.n0 androidx.core.util.w<Uri> wVar) {
            H("output", Uri.class, wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e J(@androidx.annotation.n0 final String str) {
            H("output", Uri.class, new androidx.core.util.w() { // from class: androidx.core.content.b0
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return p.e.e0(str, (Uri) obj);
                }
            });
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e K(@androidx.annotation.n0 androidx.core.util.w<Uri> wVar) {
            H("android.intent.extra.STREAM", Uri.class, wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e L(@androidx.annotation.n0 final String str) {
            androidx.core.util.o.l(str);
            H("android.intent.extra.STREAM", Uri.class, new androidx.core.util.w() { // from class: androidx.core.content.w
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return p.e.f0(str, (Uri) obj);
                }
            });
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e M(int i10) {
            this.f20471a = i10 | this.f20471a;
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e N() {
            this.f20471a |= f20469q;
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e O() {
            this.f20484n = true;
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e P(@androidx.annotation.n0 androidx.core.util.w<String> wVar) {
            androidx.core.util.o.l(wVar);
            this.f20476f = this.f20476f.b(wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e Q(@androidx.annotation.n0 String str) {
            androidx.core.util.o.l(str);
            Objects.requireNonNull(str);
            return P(new v(str));
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e R() {
            this.f20471a |= f20470r;
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e S() {
            this.f20485o = true;
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e T() {
            this.f20486p = true;
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e U(@androidx.annotation.n0 androidx.core.util.w<String> wVar) {
            androidx.core.util.o.l(wVar);
            this.f20474d = this.f20474d.b(wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e V(@androidx.annotation.n0 String str) {
            androidx.core.util.o.l(str);
            Objects.requireNonNull(str);
            return U(new v(str));
        }

        @androidx.annotation.n0
        @SuppressLint({"SyntheticAccessor"})
        public p W() {
            boolean z10 = this.f20478h;
            if ((z10 && this.f20479i) || (!z10 && !this.f20479i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            p pVar = new p();
            pVar.f20454a = this.f20471a;
            pVar.f20455b = this.f20472b;
            pVar.f20456c = this.f20473c;
            pVar.f20457d = this.f20474d;
            pVar.f20458e = this.f20475e;
            pVar.f20459f = this.f20476f;
            pVar.f20461h = this.f20478h;
            pVar.f20460g = this.f20477g;
            pVar.f20462i = this.f20480j;
            pVar.f20463j = this.f20481k;
            pVar.f20464k = this.f20482l;
            pVar.f20465l = this.f20483m;
            pVar.f20466m = this.f20484n;
            pVar.f20467n = this.f20485o;
            pVar.f20468o = this.f20486p;
            return pVar;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e r(@androidx.annotation.n0 androidx.core.util.w<String> wVar) {
            androidx.core.util.o.l(wVar);
            this.f20472b = this.f20472b.b(wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e s(@androidx.annotation.n0 String str) {
            androidx.core.util.o.l(str);
            Objects.requireNonNull(str);
            r(new v(str));
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e t() {
            this.f20478h = true;
            this.f20477g = new androidx.core.util.w() { // from class: androidx.core.content.x
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return p.e.X((ComponentName) obj);
                }
            };
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e u(@androidx.annotation.n0 androidx.core.util.w<String> wVar) {
            androidx.core.util.o.l(wVar);
            this.f20475e = this.f20475e.b(wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e v(@androidx.annotation.n0 String str) {
            androidx.core.util.o.l(str);
            Objects.requireNonNull(str);
            return u(new v(str));
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e w(@androidx.annotation.n0 androidx.core.util.w<ClipData> wVar) {
            androidx.core.util.o.l(wVar);
            this.f20483m = this.f20483m.b(wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e x() {
            this.f20481k = true;
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e y(@androidx.annotation.n0 androidx.core.util.w<Uri> wVar) {
            androidx.core.util.o.l(wVar);
            this.f20482l = this.f20482l.b(wVar);
            return this;
        }

        @androidx.annotation.n0
        @SuppressLint({"BuilderSetStyle"})
        public e z(@androidx.annotation.n0 final String str) {
            androidx.core.util.o.l(str);
            return y(new androidx.core.util.w() { // from class: androidx.core.content.u
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return p.e.Y(str, (Uri) obj);
                }
            });
        }
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(String str) {
        throw new SecurityException(str);
    }

    private void t(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else {
            if (obj instanceof Serializable) {
                intent.putExtra(str, (Serializable) obj);
                return;
            }
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @androidx.annotation.n0
    public Intent u(@androidx.annotation.n0 Intent intent, @androidx.annotation.n0 androidx.core.util.d<String> dVar) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f20461h && component == null) || this.f20460g.test(component)) {
            intent2.setComponent(component);
        } else {
            dVar.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", Constants.LANG_VOID));
        }
        String str = intent.getPackage();
        if (str == null || this.f20459f.test(str)) {
            intent2.setPackage(str);
        } else {
            dVar.accept("Package is not allowed: " + str);
        }
        int flags = this.f20454a | intent.getFlags();
        int i10 = this.f20454a;
        if (flags == i10) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i10);
            dVar.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f20454a)));
        }
        String action = intent.getAction();
        if (action == null || this.f20455b.test(action)) {
            intent2.setAction(action);
        } else {
            dVar.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.f20456c.test(data)) {
            intent2.setData(data);
        } else {
            dVar.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f20457d.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            dVar.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f20458e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    dVar.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f20454a & 1) == 0) {
                    dVar.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.f20454a) & 3) == 0) {
                    Object obj = extras.get(str3);
                    androidx.core.util.w<Object> wVar = this.f20462i.get(str3);
                    if (wVar == null || !wVar.test(obj)) {
                        dVar.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        t(intent2, str3, obj);
                    }
                } else {
                    dVar.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        c.b(intent, intent2, this.f20465l, this.f20463j, this.f20464k, dVar);
        if (i11 >= 29) {
            if (this.f20466m) {
                d.b(intent2, d.a(intent));
            } else if (d.a(intent) != null) {
                dVar.accept("Identifier is not allowed: " + d.a(intent));
            }
        }
        if (this.f20467n) {
            b.b(intent2, b.a(intent));
        } else if (b.a(intent) != null) {
            dVar.accept("Selector is not allowed: " + b.a(intent));
        }
        if (this.f20468o) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            dVar.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @androidx.annotation.n0
    public Intent v(@androidx.annotation.n0 Intent intent) {
        return u(intent, new androidx.core.util.d() { // from class: androidx.core.content.n
            @Override // androidx.core.util.d
            public final void accept(Object obj) {
                p.r((String) obj);
            }
        });
    }

    @androidx.annotation.n0
    public Intent w(@androidx.annotation.n0 Intent intent) {
        return u(intent, new androidx.core.util.d() { // from class: androidx.core.content.o
            @Override // androidx.core.util.d
            public final void accept(Object obj) {
                p.s((String) obj);
            }
        });
    }
}
