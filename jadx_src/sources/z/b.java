package z;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.s0;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    public static class a extends z.a<Uri, Boolean> {
        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d Uri input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            f0.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Boolean> b(@dl.d Context context, @dl.d Uri input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i10, @dl.e Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    /* JADX INFO: renamed from: z.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    @w0(19)
    public static class C1284b extends z.a<String, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final String f141808a;

        @kotlin.k(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @s0(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C1284b() {
            this("*/*");
        }

        public C1284b(@dl.d String mimeType) {
            f0.p(mimeType, "mimeType");
            this.f141808a = mimeType;
        }

        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d String input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f141808a).putExtra("android.intent.extra.TITLE", input);
            f0.o(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Uri> b(@dl.d Context context, @dl.d String input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @dl.e Intent intent) {
            if (!(i10 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class c extends z.a<String, Uri> {
        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d String input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            f0.o(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Uri> b(@dl.d Context context, @dl.d String input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @dl.e Intent intent) {
            if (!(i10 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @w0(18)
    public static class d extends z.a<String, List<Uri>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f141809a = new a(null);

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @w0(18)
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }

            @dl.d
            public final List<Uri> a(@dl.d Intent intent) {
                f0.p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return CollectionsKt__CollectionsKt.E();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i10 = 0; i10 < itemCount; i10++) {
                        Uri uri = clipData.getItemAt(i10).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }

        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d String input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            f0.o(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<List<Uri>> b(@dl.d Context context, @dl.d String input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @dl.e Intent intent) {
            List<Uri> listA;
            if (!(i10 == -1)) {
                intent = null;
            }
            return (intent == null || (listA = f141809a.a(intent)) == null) ? CollectionsKt__CollectionsKt.E() : listA;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    @w0(19)
    public static class e extends z.a<String[], Uri> {
        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d String[] input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            f0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Uri> b(@dl.d Context context, @dl.d String[] input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @dl.e Intent intent) {
            if (!(i10 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    @w0(21)
    public static class f extends z.a<Uri, Uri> {
        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.e Uri uri) {
            f0.p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Uri> b(@dl.d Context context, @dl.e Uri uri) {
            f0.p(context, "context");
            return null;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @dl.e Intent intent) {
            if (!(i10 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @w0(19)
    public static class g extends z.a<String[], List<Uri>> {
        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d String[] input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            f0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<List<Uri>> b(@dl.d Context context, @dl.d String[] input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @dl.e Intent intent) {
            List<Uri> listA;
            if (!(i10 == -1)) {
                intent = null;
            }
            return (intent == null || (listA = d.f141809a.a(intent)) == null) ? CollectionsKt__CollectionsKt.E() : listA;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static final class h extends z.a<Void, Uri> {
        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.e Void r10) {
            f0.p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            f0.o(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri c(int i10, @dl.e Intent intent) {
            if (!(i10 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @w0(19)
    public static class i extends z.a<androidx.activity.result.j, List<Uri>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final a f141810b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f141811a;

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int a() {
                if (j.f141812a.j()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }
        }

        public i() {
            this(0, 1, null);
        }

        public i(int i10) {
            this.f141811a = i10;
            if (!(i10 > 1)) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }

        public /* synthetic */ i(int i10, int i11, u uVar) {
            this((i11 & 1) != 0 ? f141810b.a() : i10);
        }

        @Override // z.a
        @androidx.annotation.i
        @dl.d
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d androidx.activity.result.j input) {
            f0.p(context, "context");
            f0.p(input, "input");
            j.a aVar = j.f141812a;
            if (aVar.j()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.e(input.a()));
                if (!(this.f141811a <= MediaStore.getPickImagesMaxLimit())) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f141811a);
                return intent;
            }
            if (aVar.i(context)) {
                ResolveInfo resolveInfoD = aVar.d(context);
                if (resolveInfoD == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = resolveInfoD.activityInfo;
                Intent intent2 = new Intent(j.f141813b);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(aVar.e(input.a()));
                intent2.putExtra(j.f141816e, this.f141811a);
                return intent2;
            }
            if (aVar.f(context)) {
                ResolveInfo resolveInfoC = aVar.c(context);
                if (resolveInfoC == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = resolveInfoC.activityInfo;
                Intent intent3 = new Intent(j.f141815d);
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra(j.f141816e, this.f141811a);
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(aVar.e(input.a()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() != null) {
                return intent4;
            }
            intent4.setType("*/*");
            intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{com.max.mediaselector.lib.config.h.f75165f, com.max.mediaselector.lib.config.h.f75166g});
            return intent4;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<List<Uri>> b(@dl.d Context context, @dl.d androidx.activity.result.j input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @dl.e Intent intent) {
            List<Uri> listA;
            if (!(i10 == -1)) {
                intent = null;
            }
            return (intent == null || (listA = d.f141809a.a(intent)) == null) ? CollectionsKt__CollectionsKt.E() : listA;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    @w0(19)
    public static class j extends z.a<androidx.activity.result.j, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f141812a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final String f141813b = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final String f141814c = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final String f141815d = "com.google.android.gms.provider.action.PICK_IMAGES";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        public static final String f141816e = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }

            public static /* synthetic */ void a() {
            }

            public static /* synthetic */ void b() {
            }

            @dl.e
            @xh.m
            public final ResolveInfo c(@dl.d Context context) {
                f0.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f141815d), 1114112);
            }

            @dl.e
            @xh.m
            public final ResolveInfo d(@dl.d Context context) {
                f0.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f141813b), 1114112);
            }

            @dl.e
            public final String e(@dl.d f input) {
                f0.p(input, "input");
                if (input instanceof c) {
                    return com.max.mediaselector.lib.config.h.f75165f;
                }
                if (input instanceof e) {
                    return com.max.mediaselector.lib.config.h.f75166g;
                }
                if (input instanceof d) {
                    return ((d) input).a();
                }
                if (input instanceof C1285b) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            @xh.m
            public final boolean f(@dl.d Context context) {
                f0.p(context, "context");
                return c(context) != null;
            }

            @kotlin.k(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @s0(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @xh.m
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean g() {
                return j();
            }

            @xh.m
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean h(@dl.d Context context) {
                f0.p(context, "context");
                return j() || i(context) || f(context);
            }

            @xh.m
            public final boolean i(@dl.d Context context) {
                f0.p(context, "context");
                return d(context) != null;
            }

            @xh.m
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean j() {
                int i10 = Build.VERSION.SDK_INT;
                return i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
            }
        }

        /* JADX INFO: renamed from: z.b$j$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class C1285b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final C1285b f141817a = new C1285b();

            private C1285b() {
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class c implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final c f141818a = new c();

            private c() {
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class d implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final String f141819a;

            public d(@dl.d String mimeType) {
                f0.p(mimeType, "mimeType");
                this.f141819a = mimeType;
            }

            @dl.d
            public final String a() {
                return this.f141819a;
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class e implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final e f141820a = new e();

            private e() {
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public interface f {
        }

        @dl.e
        @xh.m
        public static final ResolveInfo e(@dl.d Context context) {
            return f141812a.c(context);
        }

        @dl.e
        @xh.m
        public static final ResolveInfo g(@dl.d Context context) {
            return f141812a.d(context);
        }

        @xh.m
        public static final boolean h(@dl.d Context context) {
            return f141812a.f(context);
        }

        @kotlin.k(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @s0(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @xh.m
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean i() {
            return f141812a.g();
        }

        @xh.m
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean j(@dl.d Context context) {
            return f141812a.h(context);
        }

        @xh.m
        public static final boolean k(@dl.d Context context) {
            return f141812a.i(context);
        }

        @xh.m
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean l() {
            return f141812a.j();
        }

        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d androidx.activity.result.j input) {
            Intent intent;
            f0.p(context, "context");
            f0.p(input, "input");
            a aVar = f141812a;
            if (aVar.j()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(aVar.e(input.a()));
                return intent2;
            }
            if (aVar.i(context)) {
                ResolveInfo resolveInfoD = aVar.d(context);
                if (resolveInfoD == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = resolveInfoD.activityInfo;
                intent = new Intent(f141813b);
                intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setType(aVar.e(input.a()));
            } else {
                if (!aVar.f(context)) {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(aVar.e(input.a()));
                    if (intent3.getType() != null) {
                        return intent3;
                    }
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{com.max.mediaselector.lib.config.h.f75165f, com.max.mediaselector.lib.config.h.f75166g});
                    return intent3;
                }
                ResolveInfo resolveInfoC = aVar.c(context);
                if (resolveInfoC == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = resolveInfoC.activityInfo;
                intent = new Intent(f141815d);
                intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent.setType(aVar.e(input.a()));
            }
            return intent;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Uri> b(@dl.d Context context, @dl.d androidx.activity.result.j input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @dl.e Intent intent) {
            if (!(i10 == -1)) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) CollectionsKt___CollectionsKt.B2(d.f141809a.a(intent));
            }
            return data;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
    public static final class k extends z.a<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f141821a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final String f141822b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final String f141823c = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final String f141824d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }

            @dl.d
            public final Intent a(@dl.d String[] input) {
                f0.p(input, "input");
                Intent intentPutExtra = new Intent(k.f141822b).putExtra(k.f141823c, input);
                f0.o(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d String[] input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return f141821a.a(input);
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public z.a.C1283a<Map<String, Boolean>> b(@dl.d Context context, @dl.d String[] input) {
            f0.p(context, "context");
            f0.p(input, "input");
            boolean z10 = true;
            if (input.length == 0) {
                return new z.a.C1283a<>(kotlin.collections.s0.z());
            }
            for (String str : input) {
                if (!(androidx.core.content.d.a(context, str) == 0)) {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(input.length), 16));
            for (String str2 : input) {
                Pair pairA = c1.a(str2, Boolean.TRUE);
                linkedHashMap.put(pairA.e(), pairA.f());
            }
            return new z.a.C1283a<>(linkedHashMap);
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> c(int i10, @dl.e Intent intent) {
            if (i10 == -1 && intent != null) {
                String[] stringArrayExtra = intent.getStringArrayExtra(f141823c);
                int[] intArrayExtra = intent.getIntArrayExtra(f141824d);
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return kotlin.collections.s0.z();
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                return kotlin.collections.s0.B0(CollectionsKt___CollectionsKt.d6(ArraysKt___ArraysKt.ub(stringArrayExtra), arrayList));
            }
            return kotlin.collections.s0.z();
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12774#2,2:960\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n228#1:960,2\n*E\n"})
    public static final class l extends z.a<String, Boolean> {
        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d String input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return k.f141821a.a(new String[]{input});
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public z.a.C1283a<Boolean> b(@dl.d Context context, @dl.d String input) {
            f0.p(context, "context");
            f0.p(input, "input");
            if (androidx.core.content.d.a(context, input) == 0) {
                return new z.a.C1283a<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0026  */
        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean c(int i10, @dl.e Intent intent) {
            boolean z10;
            boolean z11;
            if (intent == null || i10 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(k.f141824d);
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        break;
                    }
                    if (intArrayExtra[i11] == 0) {
                        z11 = true;
                        break;
                    }
                    i11++;
                }
                z10 = z11;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    public static final class m extends z.a<Intent, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f141825a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final String f141826b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d Intent input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return input;
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, @dl.e Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    public static final class n extends z.a<IntentSenderRequest, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f141827a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final String f141828b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final String f141829c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final String f141830d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d IntentSenderRequest input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent intentPutExtra = new Intent(f141828b).putExtra(f141829c, input);
            f0.o(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, @dl.e Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    public static class o extends z.a<Uri, Boolean> {
        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d Uri input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            f0.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Boolean> b(@dl.d Context context, @dl.d Uri input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i10, @dl.e Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class p extends z.a<Void, Bitmap> {
        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.e Void r10) {
            f0.p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Bitmap> b(@dl.d Context context, @dl.e Void r10) {
            f0.p(context, "context");
            return null;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i10, @dl.e Intent intent) {
            if (!(i10 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @t0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    @kotlin.k(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class q extends z.a<Uri, Bitmap> {
        @Override // z.a
        @androidx.annotation.i
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@dl.d Context context, @dl.d Uri input) {
            f0.p(context, "context");
            f0.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            f0.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final z.a.C1283a<Bitmap> b(@dl.d Context context, @dl.d Uri input) {
            f0.p(context, "context");
            f0.p(input, "input");
            return null;
        }

        @Override // z.a
        @dl.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i10, @dl.e Intent intent) {
            if (!(i10 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private b() {
    }
}
