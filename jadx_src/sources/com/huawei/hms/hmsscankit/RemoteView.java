package com.huawei.hms.hmsscankit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnLightCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteViewDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.p.y3;
import com.max.mediaselector.lib.config.h;

/* JADX INFO: loaded from: classes7.dex */
public class RemoteView extends FrameLayout {
    private static final int MAX_BITMAP_SIZE = 52428800;
    public static final int REQUEST_CODE_PHOTO = 4371;
    private static final String TAG = "ScanKitRemoteView";
    private static boolean flagForGallery = false;
    private static boolean isOnStop = true;
    private Context mContext;
    private boolean mContinuouslyScan;
    private OnErrorCallback mOnErrorCallback;
    private a mRemoteHelper;
    private boolean mReturnedBitmap;

    public static class Builder {
        Activity mContext;
        HmsScanAnalyzerOptions mFormat;
        Rect mRect;
        boolean mIsCustomed = true;
        boolean mContinuouslyScan = true;
        boolean mReturnedBitmap = false;

        public RemoteView build() {
            Activity activity = this.mContext;
            boolean z10 = this.mIsCustomed;
            HmsScanAnalyzerOptions hmsScanAnalyzerOptions = this.mFormat;
            return new RemoteView(activity, z10, hmsScanAnalyzerOptions == null ? 0 : hmsScanAnalyzerOptions.mode, this.mRect).setContinuouslyScan(this.mContinuouslyScan).enableReturnBitmap(this.mReturnedBitmap);
        }

        public Builder enableReturnBitmap() {
            this.mReturnedBitmap = true;
            return this;
        }

        public Builder setBoundingBox(Rect rect) {
            this.mRect = rect;
            return this;
        }

        public Builder setContext(Activity activity) {
            this.mContext = activity;
            return this;
        }

        public Builder setContinuouslyScan(boolean z10) {
            this.mContinuouslyScan = z10;
            return this;
        }

        public Builder setFormat(int i10, int... iArr) {
            this.mFormat = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(i10, iArr).create();
            return this;
        }
    }

    public class a extends DeferredLifecycleHelper<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewGroup f61069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f61070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private OnDelegateCreatedListener<b> f61071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IRemoteViewDelegate f61072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOnResultCallback f61073e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f61074f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f61075g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f61076h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private IOnLightCallback f61077i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Rect f61078j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Bundle f61079k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f61080l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f61081m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f61082n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f61083o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f61084p;

        /* JADX INFO: renamed from: com.huawei.hms.hmsscankit.RemoteView$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0508a implements View.OnClickListener {
            ViewOnClickListenerC0508a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a aVar = a.this;
                Activity activity = aVar.f61070b;
                if (activity != null) {
                    RemoteView.this.startPhotoCode(activity);
                }
            }
        }

        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a aVar = a.this;
                Activity activity = aVar.f61070b;
                if (activity != null) {
                    RemoteView.this.startPhotoCode(activity);
                }
            }
        }

        a(Activity activity, ViewGroup viewGroup, boolean z10, int i10, Rect rect) {
            this.f61069a = viewGroup;
            this.f61070b = activity;
            this.f61074f = z10;
            this.f61076h = i10;
            this.f61078j = rect;
        }

        a(Activity activity, ViewGroup viewGroup, boolean z10, int i10, Rect rect, int i11) {
            this.f61069a = viewGroup;
            this.f61070b = activity;
            this.f61074f = z10;
            this.f61076h = i10;
            this.f61078j = rect;
            this.f61082n = i11;
        }

        a(Activity activity, ViewGroup viewGroup, boolean z10, int i10, Rect rect, int i11, boolean z11, boolean z12) {
            this.f61069a = viewGroup;
            this.f61070b = activity;
            this.f61074f = z10;
            this.f61076h = i10;
            this.f61078j = rect;
            this.f61082n = i11;
            this.f61083o = z11;
            this.f61084p = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10, int i11, Intent intent) {
            HmsScan[] hmsScanArrA;
            if (i11 == -1 && intent != null && i10 == 4371) {
                try {
                    Bitmap bitmapA = w7.a(RemoteView.this.mContext, intent);
                    if (bitmapA == null || bitmapA.getWidth() * bitmapA.getHeight() > 52428800) {
                        if (bitmapA != null) {
                            o4.e("ScanUtil", "input image is too large:" + bitmapA.getWidth());
                        }
                        hmsScanArrA = new HmsScan[0];
                    } else {
                        hmsScanArrA = f.a(RemoteView.this.mContext, bitmapA, new HmsScanAnalyzerOptions.Creator().setPhotoMode(true).create(), this.f61076h);
                    }
                    IOnResultCallback iOnResultCallback = this.f61073e;
                    if (iOnResultCallback != null) {
                        iOnResultCallback.onResult(hmsScanArrA);
                    }
                } catch (RemoteException unused) {
                    o4.b(RemoteView.TAG, "RemoteException in remoteview");
                } catch (Error unused2) {
                    o4.b(RemoteView.TAG, "Exception in error");
                } catch (IllegalStateException unused3) {
                    o4.b(RemoteView.TAG, "IllegalStateException in remoteview");
                } catch (Exception unused4) {
                    o4.b(RemoteView.TAG, "Exception in remoteview");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Bundle bundle) {
            this.f61079k = bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(IOnErrorCallback iOnErrorCallback) {
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnErrorCallback(iOnErrorCallback);
                } catch (RemoteException unused) {
                    o4.b("exception", "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(IOnLightCallback iOnLightCallback) {
            this.f61077i = iOnLightCallback;
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnLightVisbleCallBack(iOnLightCallback);
                } catch (RemoteException unused) {
                    o4.b("exception", "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(IOnResultCallback iOnResultCallback) {
            this.f61073e = iOnResultCallback;
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnResultCallback(iOnResultCallback);
                } catch (RemoteException unused) {
                    o4.b("exception", "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z10) {
            this.f61075g = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (this.f61070b != null) {
                this.f61070b = null;
            }
            if (this.f61069a != null) {
                this.f61069a = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate == null) {
                return false;
            }
            try {
                return iRemoteViewDelegate.getLightStatus();
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.pauseContinuouslyScan();
                } catch (RemoteException unused) {
                    o4.b("exception", "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.resumeContinuouslyScan();
                } catch (RemoteException unused) {
                    o4.b("exception", "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate == null) {
                return false;
            }
            try {
                iRemoteViewDelegate.turnOffLight();
                return true;
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate == null) {
                return false;
            }
            try {
                iRemoteViewDelegate.turnOnLight();
                return true;
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
                return false;
            }
        }

        public void b(boolean z10) {
            this.f61080l = z10;
        }

        public void c(boolean z10) {
            this.f61081m = z10;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public void createDelegate(OnDelegateCreatedListener<b> onDelegateCreatedListener) {
            this.f61071c = onDelegateCreatedListener;
            if (onDelegateCreatedListener == null || getDelegate() != null) {
                return;
            }
            this.f61072d = null;
            try {
                Bundle bundle = new Bundle();
                boolean z10 = this.f61074f;
                if (!z10 && this.f61076h == 0 && this.f61078j == null) {
                    o4.d(RemoteView.TAG, "!mCustomed && mFormatValue == 0 && mRect == null");
                } else {
                    bundle.putBoolean(DetailRect.CUSTOMED_FLAG, z10);
                    bundle.putInt(DetailRect.FORMAT_FLAG, this.f61076h);
                    Rect rect = this.f61078j;
                    if (rect != null) {
                        bundle.putParcelable(DetailRect.RECT_FLAG, rect);
                    }
                }
                boolean z11 = this.f61080l;
                if (z11) {
                    bundle.putBoolean(DetailRect.SCAN_OFFSCEEN_FLAG, z11);
                }
                boolean z12 = this.f61075g;
                if (z12) {
                    bundle.putBoolean(DetailRect.DEEPLINK_JUMP_FLAG, z12);
                    bundle.putAll(this.f61079k);
                }
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putBoolean(DetailRect.RETURN_BITMAP, this.f61081m);
                bundle.putAll(y3.a(this.f61070b));
                bundle.putBoolean(DetailRect.SCAN_NEW_UI, true);
                bundle.putInt(DetailRect.SCAN_VIEWTYPE_FLAG, this.f61082n);
                bundle.putBoolean(DetailRect.SCAN_CAMERA_PERMISSION, this.f61083o);
                bundle.putBoolean(HmsScanBase.SCAN_GUIDE_FLAG, this.f61084p);
                IRemoteCreator iRemoteCreatorD = g.d(this.f61070b);
                if (iRemoteCreatorD == null) {
                    return;
                } else {
                    this.f61072d = iRemoteCreatorD.newRemoteViewDelegate(ObjectWrapper.wrap(this.f61070b), ObjectWrapper.wrap(bundle));
                }
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
            }
            IRemoteViewDelegate iRemoteViewDelegate = this.f61072d;
            if (iRemoteViewDelegate == null) {
                return;
            }
            try {
                IOnResultCallback iOnResultCallback = this.f61073e;
                if (iOnResultCallback != null) {
                    iRemoteViewDelegate.setOnResultCallback(iOnResultCallback);
                    this.f61072d.setOnClickListener(ObjectWrapper.wrap(new ViewOnClickListenerC0508a()));
                }
                this.f61072d.setOnClickListener(ObjectWrapper.wrap(new b()));
                IOnLightCallback iOnLightCallback = this.f61077i;
                if (iOnLightCallback != null) {
                    this.f61072d.setOnLightVisbleCallBack(iOnLightCallback);
                }
            } catch (RemoteException unused2) {
                o4.b("exception", "RemoteException");
            }
            this.f61071c.onDelegateCreated(new b(this.f61069a, this.f61072d));
        }
    }

    public static class b implements LifecycleDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewGroup f61088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f61089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IRemoteViewDelegate f61090c;

        b(ViewGroup viewGroup, IRemoteViewDelegate iRemoteViewDelegate) {
            this.f61088a = viewGroup;
            this.f61090c = iRemoteViewDelegate;
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onCreate(Bundle bundle) {
            try {
                this.f61090c.onCreate(bundle);
                this.f61089b = (View) ObjectWrapper.unwrap(this.f61090c.getView());
                this.f61088a.removeAllViews();
                this.f61088a.addView(this.f61089b);
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return new View(null);
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.f61090c.onDestroy();
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroyView() {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onLowMemory() {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.f61090c.onPause();
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                if (RemoteView.isOnStop || !RemoteView.flagForGallery) {
                    this.f61090c.onResume();
                } else {
                    this.f61090c.onStart();
                }
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle bundle) {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStart() {
            try {
                this.f61090c.onStart();
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStop() {
            try {
                this.f61090c.onStop();
            } catch (RemoteException unused) {
                o4.b("exception", "RemoteException");
            }
        }
    }

    RemoteView(Activity activity, boolean z10, int i10, Rect rect) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        this.mRemoteHelper = new a(activity, this, z10, i10, rect);
    }

    RemoteView(Activity activity, boolean z10, int i10, Rect rect, int i11) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        this.mRemoteHelper = new a(activity, this, z10, i10, rect, i11);
    }

    RemoteView(Activity activity, boolean z10, int i10, Rect rect, int i11, boolean z11, boolean z12) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        this.mRemoteHelper = new a(activity, this, z10, i10, rect, i11, z11, z12);
    }

    RemoteView(Activity activity, boolean z10, int i10, Rect rect, boolean z11) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        a aVar = new a(activity, this, z10, i10, rect);
        this.mRemoteHelper = aVar;
        aVar.b(z11);
    }

    RemoteView(Activity activity, boolean z10, Bundle bundle) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        a aVar = new a(activity, this, false, 0, null);
        this.mRemoteHelper = aVar;
        aVar.a(z10);
        this.mRemoteHelper.a(bundle);
    }

    private boolean checkPhotoPermission(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            return w7.b((Context) activity) || activity.checkPermission("android.permission.READ_MEDIA_IMAGES", Process.myPid(), Process.myUid()) == 0;
        }
        return w7.b((Context) activity) || activity.checkPermission("android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0;
    }

    private void requestPhotoPermission(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4371);
        } else {
            activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4371);
        }
    }

    private void startActivityForGallery(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if (w7.g(activity)) {
                if (w7.a(new Intent(), "com.android.gallery3d", activity) != null && w7.a("com.android.gallery3d", activity)) {
                    o4.d(TAG, "Start Gallery:com.android.gallery3d");
                    intent.setPackage("com.android.gallery3d");
                } else if (w7.a(new Intent(), "com.huawei.photos", activity) != null && w7.a("com.huawei.photos", activity)) {
                    intent.setPackage("com.huawei.photos");
                    o4.d(TAG, "Start Gallery:com.huawei.photos");
                }
            }
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, h.f75165f);
            flagForGallery = true;
            activity.startActivityForResult(intent, 4371);
        } catch (Exception unused) {
            o4.b(TAG, "startPhotoCode Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPhotoCode(Activity activity) {
        if (checkPhotoPermission(activity)) {
            startActivityForGallery(activity);
            return;
        }
        o4.d(TAG, "no photo permission");
        if (this.mOnErrorCallback == null) {
            requestPhotoPermission(activity);
        } else {
            o4.b(TAG, "no photo permission, report error2");
            this.mOnErrorCallback.onError(2);
        }
    }

    RemoteView enableReturnBitmap(boolean z10) {
        this.mReturnedBitmap = z10;
        this.mRemoteHelper.c(z10);
        return this;
    }

    public boolean getLightStatus() {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            return aVar.c();
        }
        return false;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        Log.i(TAG, "onActivityResult: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.a(i10, i11, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Log.i(TAG, "onCreate:");
        Context context = this.mContext;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.mContext).getWindow().setFlags(16777216, 16777216);
        }
        this.mRemoteHelper.onCreate(bundle);
    }

    public final void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.onDestroy();
            this.mRemoteHelper.b();
            this.mRemoteHelper = null;
        }
    }

    public final void onPause() {
        Log.i(TAG, "onPause: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.onPause();
        }
        a aVar2 = this.mRemoteHelper;
        if (aVar2 != null && flagForGallery) {
            aVar2.onStop();
        }
        isOnStop = false;
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr, Activity activity) {
        if (i10 == 4371 && iArr.length == 1 && iArr[0] == 0) {
            startPhotoCode(activity);
        }
    }

    public final void onResume() {
        Log.i(TAG, "onResume: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.onResume();
        }
        flagForGallery = false;
    }

    public final void onStart() {
        Log.i(TAG, "onStart: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.onStart();
        }
        flagForGallery = false;
    }

    public final void onStop() {
        Log.i(TAG, "onStop: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null && !flagForGallery) {
            aVar.onStop();
        }
        isOnStop = true;
    }

    public void pauseContinuouslyScan() {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void resumeContinuouslyScan() {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.e();
        }
    }

    public void selectPictureFromLocalFile() {
        startPhotoCode((Activity) this.mContext);
    }

    RemoteView setContinuouslyScan(boolean z10) {
        this.mContinuouslyScan = z10;
        return this;
    }

    public void setOnErrorCallback(OnErrorCallback onErrorCallback) {
        this.mOnErrorCallback = onErrorCallback;
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.a(new c(this.mOnErrorCallback));
        }
    }

    public void setOnLightVisibleCallback(OnLightVisibleCallBack onLightVisibleCallBack) {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.a(new d(onLightVisibleCallBack));
        }
    }

    public void setOnResultCallback(OnResultCallback onResultCallback) {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.a(new e(onResultCallback, this.mContinuouslyScan));
        }
    }

    public boolean switchLight() {
        if (this.mRemoteHelper != null) {
            return !getLightStatus() ? this.mRemoteHelper.g() : this.mRemoteHelper.f();
        }
        return false;
    }
}
