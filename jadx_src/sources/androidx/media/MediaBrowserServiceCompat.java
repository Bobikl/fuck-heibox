package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.app.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f24434i = "MBServiceCompat";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final boolean f24435j = Log.isLoggable(f24434i, 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f24436k = 1.0E-5f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f24437l = "android.media.browse.MediaBrowserService";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f24438m = "media_item";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f24439n = "search_results";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f24440o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f24441p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f24442q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f24443r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f24444s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f24445t = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f24446b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    f f24450f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    MediaSessionCompat.Token f24452h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f f24447c = new f(androidx.media.l.b.f24623b, -1, -1, null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayList<f> f24448d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.collection.a<IBinder, f> f24449e = new androidx.collection.a<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final o f24451g = new o();

    @w0(21)
    public class MediaBrowserServiceImplApi21 implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Bundle> f24453a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MediaBrowserService f24454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Messenger f24455c;

        @w0(21)
        public class MediaBrowserServiceApi21 extends MediaBrowserService {
            MediaBrowserServiceApi21(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                e eVarJ = MediaBrowserServiceImplApi21.this.j(str, i10, bundle == null ? null : new Bundle(bundle));
                if (eVarJ == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(eVarJ.f24493a, eVarJ.f24494b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                MediaBrowserServiceImplApi21.this.k(str, new k<>(result));
            }
        }

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f24458b;

            a(MediaSessionCompat.Token token) {
                this.f24458b = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaBrowserServiceImplApi21.this.l(this.f24458b);
            }
        }

        public class b extends j<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f24460f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, k kVar) {
                super(obj);
                this.f24460f = kVar;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.j
            public void b() {
                this.f24460f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.j
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(@p0 List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f24460f.c(arrayList);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24462b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24463c;

            c(String str, Bundle bundle) {
                this.f24462b = str;
                this.f24463c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = MediaBrowserServiceCompat.this.f24449e.keySet().iterator();
                while (it.hasNext()) {
                    MediaBrowserServiceImplApi21.this.h(MediaBrowserServiceCompat.this.f24449e.get(it.next()), this.f24462b, this.f24463c);
                }
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.media.l.b f24465b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24466c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f24467d;

            d(androidx.media.l.b bVar, String str, Bundle bundle) {
                this.f24465b = bVar;
                this.f24466c = str;
                this.f24467d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i10 = 0; i10 < MediaBrowserServiceCompat.this.f24449e.size(); i10++) {
                    f fVarK = MediaBrowserServiceCompat.this.f24449e.k(i10);
                    if (fVarK.f24498d.equals(this.f24465b)) {
                        MediaBrowserServiceImplApi21.this.h(fVarK, this.f24466c, this.f24467d);
                    }
                }
            }
        }

        MediaBrowserServiceImplApi21() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public androidx.media.l.b a() {
            f fVar = MediaBrowserServiceCompat.this.f24450f;
            if (fVar != null) {
                return fVar.f24498d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public Bundle b() {
            if (this.f24455c == null) {
                return null;
            }
            f fVar = MediaBrowserServiceCompat.this.f24450f;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (fVar.f24499e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.f24450f.f24499e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void c(String str, Bundle bundle) {
            i(str, bundle);
            g(str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void d(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f24451g.a(new a(token));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void e(androidx.media.l.b bVar, String str, Bundle bundle) {
            f(bVar, str, bundle);
        }

        void f(androidx.media.l.b bVar, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f24451g.post(new d(bVar, str, bundle));
        }

        void g(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f24451g.post(new c(str, bundle));
        }

        void h(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.k<IBinder, Bundle>> list = fVar.f24501g.get(str);
            if (list != null) {
                for (androidx.core.util.k<IBinder, Bundle> kVar : list) {
                    if (androidx.media.g.b(bundle, kVar.f21264b)) {
                        MediaBrowserServiceCompat.this.t(str, fVar, kVar.f21264b, bundle);
                    }
                }
            }
        }

        void i(String str, Bundle bundle) {
            this.f24454b.notifyChildrenChanged(str);
        }

        public e j(String str, int i10, Bundle bundle) {
            int i11;
            Bundle bundleC;
            if (bundle == null || bundle.getInt(androidx.media.h.f24607p, 0) == 0) {
                i11 = -1;
                bundleC = null;
            } else {
                bundle.remove(androidx.media.h.f24607p);
                this.f24455c = new Messenger(MediaBrowserServiceCompat.this.f24451g);
                bundleC = new Bundle();
                bundleC.putInt(androidx.media.h.f24609r, 2);
                r.b(bundleC, androidx.media.h.f24610s, this.f24455c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f24452h;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    r.b(bundleC, androidx.media.h.f24611t, extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.f24453a.add(bundleC);
                }
                int i12 = bundle.getInt(androidx.media.h.f24608q, -1);
                bundle.remove(androidx.media.h.f24608q);
                i11 = i12;
            }
            f fVar = MediaBrowserServiceCompat.this.new f(str, i11, i10, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f24450f = fVar;
            e eVarL = mediaBrowserServiceCompat.l(str, i10, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.f24450f = null;
            if (eVarL == null) {
                return null;
            }
            if (this.f24455c != null) {
                mediaBrowserServiceCompat2.f24448d.add(fVar);
            }
            if (bundleC == null) {
                bundleC = eVarL.c();
            } else if (eVarL.c() != null) {
                bundleC.putAll(eVarL.c());
            }
            return new e(eVarL.d(), bundleC);
        }

        public void k(String str, k<List<Parcel>> kVar) {
            b bVar = new b(str, kVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f24450f = mediaBrowserServiceCompat.f24447c;
            mediaBrowserServiceCompat.m(str, bVar);
            MediaBrowserServiceCompat.this.f24450f = null;
        }

        void l(MediaSessionCompat.Token token) {
            if (!this.f24453a.isEmpty()) {
                IMediaSession extraBinder = token.getExtraBinder();
                if (extraBinder != null) {
                    Iterator<Bundle> it = this.f24453a.iterator();
                    while (it.hasNext()) {
                        r.b(it.next(), androidx.media.h.f24611t, extraBinder.asBinder());
                    }
                }
                this.f24453a.clear();
            }
            this.f24454b.setSessionToken((MediaSession.Token) token.getToken());
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder onBind(Intent intent) {
            return this.f24454b.onBind(intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
            MediaBrowserServiceApi21 mediaBrowserServiceApi21 = new MediaBrowserServiceApi21(MediaBrowserServiceCompat.this);
            this.f24454b = mediaBrowserServiceApi21;
            mediaBrowserServiceApi21.onCreate();
        }
    }

    @w0(23)
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {

        public class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            MediaBrowserServiceApi23(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                MediaBrowserServiceImplApi23.this.m(str, new k<>(result));
            }
        }

        public class a extends j<MediaBrowserCompat.MediaItem> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f24471f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, k kVar) {
                super(obj);
                this.f24471f = kVar;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.j
            public void b() {
                this.f24471f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.j
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(@p0 MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f24471f.c(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                this.f24471f.c(parcelObtain);
            }
        }

        MediaBrowserServiceImplApi23() {
            super();
        }

        public void m(String str, k<Parcel> kVar) {
            a aVar = new a(str, kVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f24450f = mediaBrowserServiceCompat.f24447c;
            mediaBrowserServiceCompat.o(str, aVar);
            MediaBrowserServiceCompat.this.f24450f = null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
            this.f24454b = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }
    }

    @w0(26)
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {

        public class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            MediaBrowserServiceApi26(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = MediaBrowserServiceImplApi26.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f24450f = mediaBrowserServiceCompat.f24447c;
                mediaBrowserServiceImplApi26.n(str, new k<>(result), bundle);
                MediaBrowserServiceCompat.this.f24450f = null;
            }
        }

        public class a extends j<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f24475f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f24476g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, k kVar, Bundle bundle) {
                super(obj);
                this.f24475f = kVar;
                this.f24476g = bundle;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.j
            public void b() {
                this.f24475f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.j
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(@p0 List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f24475f.c(null);
                    return;
                }
                if ((c() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.b(list, this.f24476g);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
                this.f24475f.c(arrayList);
            }
        }

        MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.g
        public Bundle b() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            f fVar = mediaBrowserServiceCompat.f24450f;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (fVar == mediaBrowserServiceCompat.f24447c) {
                return this.f24454b.getBrowserRootHints();
            }
            if (fVar.f24499e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.f24450f.f24499e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        void i(String str, Bundle bundle) {
            if (bundle != null) {
                this.f24454b.notifyChildrenChanged(str, bundle);
            } else {
                super.i(str, bundle);
            }
        }

        public void n(String str, k<List<Parcel>> kVar, Bundle bundle) {
            a aVar = new a(str, kVar, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f24450f = mediaBrowserServiceCompat.f24447c;
            mediaBrowserServiceCompat.n(str, aVar, bundle);
            MediaBrowserServiceCompat.this.f24450f = null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.f24454b = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }
    }

    public class a extends j<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f24478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f24479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Bundle f24480h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f24481i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f24478f = fVar;
            this.f24479g = str;
            this.f24480h = bundle;
            this.f24481i = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(@p0 List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f24449e.get(this.f24478f.f24500f.asBinder()) != this.f24478f) {
                if (MediaBrowserServiceCompat.f24435j) {
                    Log.d(MediaBrowserServiceCompat.f24434i, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f24478f.f24495a + " id=" + this.f24479g);
                    return;
                }
                return;
            }
            if ((c() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.b(list, this.f24480h);
            }
            try {
                this.f24478f.f24500f.a(this.f24479g, list, this.f24480h, this.f24481i);
            } catch (RemoteException unused) {
                Log.w(MediaBrowserServiceCompat.f24434i, "Calling onLoadChildren() failed for id=" + this.f24479g + " package=" + this.f24478f.f24495a);
            }
        }
    }

    public class b extends j<MediaBrowserCompat.MediaItem> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f24483f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f24483f = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(@p0 MediaBrowserCompat.MediaItem mediaItem) {
            if ((c() & 2) != 0) {
                this.f24483f.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.f24438m, mediaItem);
            this.f24483f.send(0, bundle);
        }
    }

    public class c extends j<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f24485f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f24485f = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(@p0 List<MediaBrowserCompat.MediaItem> list) {
            if ((c() & 4) != 0 || list == null) {
                this.f24485f.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(MediaBrowserServiceCompat.f24439n, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f24485f.send(0, bundle);
        }
    }

    public class d extends j<Bundle> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f24487f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f24487f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.j
        void e(@p0 Bundle bundle) {
            this.f24487f.send(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.j
        void f(@p0 Bundle bundle) {
            this.f24487f.send(1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(@p0 Bundle bundle) {
            this.f24487f.send(0, bundle);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f24489c = "android.service.media.extra.RECENT";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f24490d = "android.service.media.extra.OFFLINE";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f24491e = "android.service.media.extra.SUGGESTED";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public static final String f24492f = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f24494b;

        public e(@n0 String str, @p0 Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f24493a = str;
            this.f24494b = bundle;
        }

        public Bundle c() {
            return this.f24494b;
        }

        public String d() {
            return this.f24493a;
        }
    }

    public class f implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media.l.b f24498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f24499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final m f24500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap<String, List<androidx.core.util.k<IBinder, Bundle>>> f24501g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public e f24502h;

        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                MediaBrowserServiceCompat.this.f24449e.remove(fVar.f24500f.asBinder());
            }
        }

        f(String str, int i10, int i11, Bundle bundle, m mVar) {
            this.f24495a = str;
            this.f24496b = i10;
            this.f24497c = i11;
            this.f24498d = new androidx.media.l.b(str, i10, i11);
            this.f24499e = bundle;
            this.f24500f = mVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f24451g.post(new a());
        }
    }

    public interface g {
        androidx.media.l.b a();

        Bundle b();

        void c(String str, Bundle bundle);

        void d(MediaSessionCompat.Token token);

        void e(androidx.media.l.b bVar, String str, Bundle bundle);

        IBinder onBind(Intent intent);

        void onCreate();
    }

    @w0(28)
    public class h extends MediaBrowserServiceImplApi26 {
        h() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.g
        public androidx.media.l.b a() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            f fVar = mediaBrowserServiceCompat.f24450f;
            if (fVar != null) {
                return fVar == mediaBrowserServiceCompat.f24447c ? new androidx.media.l.b(this.f24454b.getCurrentBrowserInfo()) : fVar.f24498d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    public class i implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Messenger f24506a;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f24508b;

            a(MediaSessionCompat.Token token) {
                this.f24508b = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<f> it = MediaBrowserServiceCompat.this.f24449e.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f24500f.c(next.f24502h.d(), this.f24508b, next.f24502h.c());
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserServiceCompat.f24434i, "Connection for " + next.f24495a + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24510b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24511c;

            b(String str, Bundle bundle) {
                this.f24510b = str;
                this.f24511c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = MediaBrowserServiceCompat.this.f24449e.keySet().iterator();
                while (it.hasNext()) {
                    i.this.f(MediaBrowserServiceCompat.this.f24449e.get(it.next()), this.f24510b, this.f24511c);
                }
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.media.l.b f24513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24514c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f24515d;

            c(androidx.media.l.b bVar, String str, Bundle bundle) {
                this.f24513b = bVar;
                this.f24514c = str;
                this.f24515d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i10 = 0; i10 < MediaBrowserServiceCompat.this.f24449e.size(); i10++) {
                    f fVarK = MediaBrowserServiceCompat.this.f24449e.k(i10);
                    if (fVarK.f24498d.equals(this.f24513b)) {
                        i.this.f(fVarK, this.f24514c, this.f24515d);
                        return;
                    }
                }
            }
        }

        i() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public androidx.media.l.b a() {
            f fVar = MediaBrowserServiceCompat.this.f24450f;
            if (fVar != null) {
                return fVar.f24498d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public Bundle b() {
            f fVar = MediaBrowserServiceCompat.this.f24450f;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (fVar.f24499e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.f24450f.f24499e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void c(@n0 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f24451g.post(new b(str, bundle));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void d(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f24451g.post(new a(token));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void e(@n0 androidx.media.l.b bVar, @n0 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f24451g.post(new c(bVar, str, bundle));
        }

        void f(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.k<IBinder, Bundle>> list = fVar.f24501g.get(str);
            if (list != null) {
                for (androidx.core.util.k<IBinder, Bundle> kVar : list) {
                    if (androidx.media.g.b(bundle, kVar.f21264b)) {
                        MediaBrowserServiceCompat.this.t(str, fVar, kVar.f21264b, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder onBind(Intent intent) {
            if (MediaBrowserServiceCompat.f24437l.equals(intent.getAction())) {
                return this.f24506a.getBinder();
            }
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
            this.f24506a = new Messenger(MediaBrowserServiceCompat.this.f24451g);
        }
    }

    public static class j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f24517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f24520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f24521e;

        j(Object obj) {
            this.f24517a = obj;
        }

        private void a(@p0 Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS)) {
                float f10 = bundle.getFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS);
                if (f10 < -1.0E-5f || f10 > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }

        public void b() {
            if (this.f24518b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f24517a);
            }
            if (this.f24519c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f24517a);
            }
            if (!this.f24520d) {
                this.f24518b = true;
                return;
            }
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f24517a);
        }

        int c() {
            return this.f24521e;
        }

        boolean d() {
            return this.f24518b || this.f24519c || this.f24520d;
        }

        void e(@p0 Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f24517a);
        }

        void f(@p0 Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f24517a);
        }

        void g(@p0 T t10) {
        }

        public void h(@p0 Bundle bundle) {
            if (!this.f24519c && !this.f24520d) {
                this.f24520d = true;
                e(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f24517a);
            }
        }

        public void i(@p0 Bundle bundle) {
            if (!this.f24519c && !this.f24520d) {
                a(bundle);
                f(bundle);
            } else {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f24517a);
            }
        }

        public void j(@p0 T t10) {
            if (!this.f24519c && !this.f24520d) {
                this.f24519c = true;
                g(t10);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f24517a);
            }
        }

        void k(int i10) {
            this.f24521e = i10;
        }
    }

    @w0(21)
    public static class k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f24522a;

        k(MediaBrowserService.Result result) {
            this.f24522a = result;
        }

        public void a() {
            this.f24522a.detach();
        }

        List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T t10) {
            if (t10 instanceof List) {
                this.f24522a.sendResult(b((List) t10));
                return;
            }
            if (!(t10 instanceof Parcel)) {
                this.f24522a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t10;
            parcel.setDataPosition(0);
            this.f24522a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    public class l {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24524b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24525c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f24526d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f24527e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f24528f;

            a(m mVar, String str, int i10, int i11, Bundle bundle) {
                this.f24524b = mVar;
                this.f24525c = str;
                this.f24526d = i10;
                this.f24527e = i11;
                this.f24528f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f24524b.asBinder();
                MediaBrowserServiceCompat.this.f24449e.remove(iBinderAsBinder);
                f fVar = MediaBrowserServiceCompat.this.new f(this.f24525c, this.f24526d, this.f24527e, this.f24528f, this.f24524b);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f24450f = fVar;
                e eVarL = mediaBrowserServiceCompat.l(this.f24525c, this.f24527e, this.f24528f);
                fVar.f24502h = eVarL;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f24450f = null;
                if (eVarL != null) {
                    try {
                        mediaBrowserServiceCompat2.f24449e.put(iBinderAsBinder, fVar);
                        iBinderAsBinder.linkToDeath(fVar, 0);
                        if (MediaBrowserServiceCompat.this.f24452h != null) {
                            this.f24524b.c(fVar.f24502h.d(), MediaBrowserServiceCompat.this.f24452h, fVar.f24502h.c());
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserServiceCompat.f24434i, "Calling onConnect() failed. Dropping client. pkg=" + this.f24525c);
                        MediaBrowserServiceCompat.this.f24449e.remove(iBinderAsBinder);
                        return;
                    }
                }
                Log.i(MediaBrowserServiceCompat.f24434i, "No root for client " + this.f24525c + " from service " + getClass().getName());
                try {
                    this.f24524b.b();
                } catch (RemoteException unused2) {
                    Log.w(MediaBrowserServiceCompat.f24434i, "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f24525c);
                }
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24530b;

            b(m mVar) {
                this.f24530b = mVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVarRemove = MediaBrowserServiceCompat.this.f24449e.remove(this.f24530b.asBinder());
                if (fVarRemove != null) {
                    fVarRemove.f24500f.asBinder().unlinkToDeath(fVarRemove, 0);
                }
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24532b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24533c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ IBinder f24534d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f24535e;

            c(m mVar, String str, IBinder iBinder, Bundle bundle) {
                this.f24532b = mVar;
                this.f24533c = str;
                this.f24534d = iBinder;
                this.f24535e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f24449e.get(this.f24532b.asBinder());
                if (fVar != null) {
                    MediaBrowserServiceCompat.this.a(this.f24533c, fVar, this.f24534d, this.f24535e);
                    return;
                }
                Log.w(MediaBrowserServiceCompat.f24434i, "addSubscription for callback that isn't registered id=" + this.f24533c);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24537b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24538c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ IBinder f24539d;

            d(m mVar, String str, IBinder iBinder) {
                this.f24537b = mVar;
                this.f24538c = str;
                this.f24539d = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f24449e.get(this.f24537b.asBinder());
                if (fVar == null) {
                    Log.w(MediaBrowserServiceCompat.f24434i, "removeSubscription for callback that isn't registered id=" + this.f24538c);
                    return;
                }
                if (MediaBrowserServiceCompat.this.w(this.f24538c, fVar, this.f24539d)) {
                    return;
                }
                Log.w(MediaBrowserServiceCompat.f24434i, "removeSubscription called for " + this.f24538c + " which is not subscribed");
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24541b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24542c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f24543d;

            e(m mVar, String str, ResultReceiver resultReceiver) {
                this.f24541b = mVar;
                this.f24542c = str;
                this.f24543d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f24449e.get(this.f24541b.asBinder());
                if (fVar != null) {
                    MediaBrowserServiceCompat.this.u(this.f24542c, fVar, this.f24543d);
                    return;
                }
                Log.w(MediaBrowserServiceCompat.f24434i, "getMediaItem for callback that isn't registered id=" + this.f24542c);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24545b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f24546c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f24547d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f24548e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f24549f;

            f(m mVar, int i10, String str, int i11, Bundle bundle) {
                this.f24545b = mVar;
                this.f24546c = i10;
                this.f24547d = str;
                this.f24548e = i11;
                this.f24549f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder iBinderAsBinder = this.f24545b.asBinder();
                MediaBrowserServiceCompat.this.f24449e.remove(iBinderAsBinder);
                Iterator<f> it = MediaBrowserServiceCompat.this.f24448d.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (next.f24497c == this.f24546c) {
                        fVar = (TextUtils.isEmpty(this.f24547d) || this.f24548e <= 0) ? MediaBrowserServiceCompat.this.new f(next.f24495a, next.f24496b, next.f24497c, this.f24549f, this.f24545b) : null;
                        it.remove();
                        break;
                    }
                }
                if (fVar == null) {
                    fVar = MediaBrowserServiceCompat.this.new f(this.f24547d, this.f24548e, this.f24546c, this.f24549f, this.f24545b);
                }
                MediaBrowserServiceCompat.this.f24449e.put(iBinderAsBinder, fVar);
                try {
                    iBinderAsBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w(MediaBrowserServiceCompat.f24434i, "IBinder is already dead.");
                }
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24551b;

            g(m mVar) {
                this.f24551b = mVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f24551b.asBinder();
                f fVarRemove = MediaBrowserServiceCompat.this.f24449e.remove(iBinderAsBinder);
                if (fVarRemove != null) {
                    iBinderAsBinder.unlinkToDeath(fVarRemove, 0);
                }
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24553b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24554c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f24555d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f24556e;

            h(m mVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f24553b = mVar;
                this.f24554c = str;
                this.f24555d = bundle;
                this.f24556e = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f24449e.get(this.f24553b.asBinder());
                if (fVar != null) {
                    MediaBrowserServiceCompat.this.v(this.f24554c, this.f24555d, fVar, this.f24556e);
                    return;
                }
                Log.w(MediaBrowserServiceCompat.f24434i, "search for callback that isn't registered query=" + this.f24554c);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24558b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24559c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f24560d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f24561e;

            i(m mVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f24558b = mVar;
                this.f24559c = str;
                this.f24560d = bundle;
                this.f24561e = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f24449e.get(this.f24558b.asBinder());
                if (fVar != null) {
                    MediaBrowserServiceCompat.this.s(this.f24559c, this.f24560d, fVar, this.f24561e);
                    return;
                }
                Log.w(MediaBrowserServiceCompat.f24434i, "sendCustomAction for callback that isn't registered action=" + this.f24559c + ", extras=" + this.f24560d);
            }
        }

        l() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, m mVar) {
            MediaBrowserServiceCompat.this.f24451g.a(new c(mVar, str, iBinder, bundle));
        }

        public void b(String str, int i10, int i11, Bundle bundle, m mVar) {
            if (MediaBrowserServiceCompat.this.g(str, i11)) {
                MediaBrowserServiceCompat.this.f24451g.a(new a(mVar, str, i10, i11, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i11 + " package=" + str);
        }

        public void c(m mVar) {
            MediaBrowserServiceCompat.this.f24451g.a(new b(mVar));
        }

        public void d(String str, ResultReceiver resultReceiver, m mVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f24451g.a(new e(mVar, str, resultReceiver));
        }

        public void e(m mVar, String str, int i10, int i11, Bundle bundle) {
            MediaBrowserServiceCompat.this.f24451g.a(new f(mVar, i11, str, i10, bundle));
        }

        public void f(String str, IBinder iBinder, m mVar) {
            MediaBrowserServiceCompat.this.f24451g.a(new d(mVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, m mVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f24451g.a(new h(mVar, str, bundle, resultReceiver));
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, m mVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f24451g.a(new i(mVar, str, bundle, resultReceiver));
        }

        public void i(m mVar) {
            MediaBrowserServiceCompat.this.f24451g.a(new g(mVar));
        }
    }

    public interface m {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    public static class n implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Messenger f24563a;

        n(Messenger messenger) {
            this.f24563a = messenger;
        }

        private void d(int i10, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i10;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f24563a.send(messageObtain);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString(androidx.media.h.f24595d, str);
            bundle3.putBundle(androidx.media.h.f24598g, bundle);
            bundle3.putBundle(androidx.media.h.f24599h, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(androidx.media.h.f24596e, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public IBinder asBinder() {
            return this.f24563a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public void b() throws RemoteException {
            d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(androidx.media.h.f24609r, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media.h.f24595d, str);
            bundle2.putParcelable(androidx.media.h.f24597f, token);
            bundle2.putBundle(androidx.media.h.f24602k, bundle);
            d(1, bundle2);
        }
    }

    public final class o extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f24564a;

        o() {
            this.f24564a = MediaBrowserServiceCompat.this.new l();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(androidx.media.h.f24602k);
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.f24564a.b(data.getString(androidx.media.h.f24600i), data.getInt(androidx.media.h.f24594c), data.getInt(androidx.media.h.f24593b), bundle, new n(message.replyTo));
                    break;
                case 2:
                    this.f24564a.c(new n(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle(androidx.media.h.f24598g);
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.f24564a.a(data.getString(androidx.media.h.f24595d), r.a(data, androidx.media.h.f24592a), bundle2, new n(message.replyTo));
                    break;
                case 4:
                    this.f24564a.f(data.getString(androidx.media.h.f24595d), r.a(data, androidx.media.h.f24592a), new n(message.replyTo));
                    break;
                case 5:
                    this.f24564a.d(data.getString(androidx.media.h.f24595d), (ResultReceiver) data.getParcelable(androidx.media.h.f24601j), new n(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle(androidx.media.h.f24602k);
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.f24564a.e(new n(message.replyTo), data.getString(androidx.media.h.f24600i), data.getInt(androidx.media.h.f24594c), data.getInt(androidx.media.h.f24593b), bundle3);
                    break;
                case 7:
                    this.f24564a.i(new n(message.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle(androidx.media.h.f24603l);
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.f24564a.g(data.getString(androidx.media.h.f24604m), bundle4, (ResultReceiver) data.getParcelable(androidx.media.h.f24601j), new n(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle(androidx.media.h.f24606o);
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.f24564a.h(data.getString(androidx.media.h.f24605n), bundle5, (ResultReceiver) data.getParcelable(androidx.media.h.f24601j), new n(message.replyTo));
                    break;
                default:
                    Log.w(MediaBrowserServiceCompat.f24434i, "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(androidx.media.h.f24593b, Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt(androidx.media.h.f24594c, callingPid);
            } else if (!data.containsKey(androidx.media.h.f24594c)) {
                data.putInt(androidx.media.h.f24594c, -1);
            }
            return super.sendMessageAtTime(message, j10);
        }
    }

    void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<androidx.core.util.k<IBinder, Bundle>> arrayList = fVar.f24501g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (androidx.core.util.k<IBinder, Bundle> kVar : arrayList) {
            if (iBinder == kVar.f21263a && androidx.media.g.a(bundle, kVar.f21264b)) {
                return;
            }
        }
        arrayList.add(new androidx.core.util.k<>(iBinder, bundle));
        fVar.f24501g.put(str, arrayList);
        t(str, fVar, bundle, null);
        this.f24450f = fVar;
        q(str, bundle);
        this.f24450f = null;
    }

    List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i10 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i11 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i10 == -1 && i11 == -1) {
            return list;
        }
        int i12 = i11 * i10;
        int size = i12 + i11;
        if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i12, size);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c(Context context) {
        attachBaseContext(context);
    }

    public final Bundle d() {
        return this.f24446b.b();
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @n0
    public final androidx.media.l.b e() {
        return this.f24446b.a();
    }

    @p0
    public MediaSessionCompat.Token f() {
        return this.f24452h;
    }

    boolean g(String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i10)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void h(@n0 androidx.media.l.b bVar, @n0 String str, @n0 Bundle bundle) {
        if (bVar == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f24446b.e(bVar, str, bundle);
    }

    public void i(@n0 String str) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.f24446b.c(str, null);
    }

    public void j(@n0 String str, @n0 Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f24446b.c(str, bundle);
    }

    public void k(@n0 String str, Bundle bundle, @n0 j<Bundle> jVar) {
        jVar.h(null);
    }

    @p0
    public abstract e l(@n0 String str, int i10, @p0 Bundle bundle);

    public abstract void m(@n0 String str, @n0 j<List<MediaBrowserCompat.MediaItem>> jVar);

    public void n(@n0 String str, @n0 j<List<MediaBrowserCompat.MediaItem>> jVar, @n0 Bundle bundle) {
        jVar.k(1);
        m(str, jVar);
    }

    public void o(String str, @n0 j<MediaBrowserCompat.MediaItem> jVar) {
        jVar.k(2);
        jVar.j(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f24446b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f24446b = new h();
        } else if (i10 >= 26) {
            this.f24446b = new MediaBrowserServiceImplApi26();
        } else {
            this.f24446b = new MediaBrowserServiceImplApi23();
        }
        this.f24446b.onCreate();
    }

    public void p(@n0 String str, Bundle bundle, @n0 j<List<MediaBrowserCompat.MediaItem>> jVar) {
        jVar.k(4);
        jVar.j(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void q(String str, Bundle bundle) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r(String str) {
    }

    void s(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        d dVar = new d(str, resultReceiver);
        this.f24450f = fVar;
        k(str, bundle, dVar);
        this.f24450f = null;
        if (dVar.d()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    void t(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f24450f = fVar;
        if (bundle == null) {
            m(str, aVar);
        } else {
            n(str, aVar, bundle);
        }
        this.f24450f = null;
        if (aVar.d()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f24495a + " id=" + str);
    }

    void u(String str, f fVar, ResultReceiver resultReceiver) {
        b bVar = new b(str, resultReceiver);
        this.f24450f = fVar;
        o(str, bVar);
        this.f24450f = null;
        if (bVar.d()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    void v(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        c cVar = new c(str, resultReceiver);
        this.f24450f = fVar;
        p(str, bundle, cVar);
        this.f24450f = null;
        if (cVar.d()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    boolean w(String str, f fVar, IBinder iBinder) {
        boolean z10 = false;
        try {
            if (iBinder == null) {
                boolean z11 = fVar.f24501g.remove(str) != null;
                this.f24450f = fVar;
                r(str);
                this.f24450f = null;
                return z11;
            }
            List<androidx.core.util.k<IBinder, Bundle>> list = fVar.f24501g.get(str);
            if (list != null) {
                Iterator<androidx.core.util.k<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f21263a) {
                        it.remove();
                        z10 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f24501g.remove(str);
                }
            }
            this.f24450f = fVar;
            r(str);
            this.f24450f = null;
            return z10;
        } catch (Throwable th2) {
            this.f24450f = fVar;
            r(str);
            this.f24450f = null;
            throw th2;
        }
    }

    public void x(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f24452h != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f24452h = token;
        this.f24446b.d(token);
    }
}
