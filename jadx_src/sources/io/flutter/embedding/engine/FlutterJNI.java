package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.i1;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.util.Preconditions;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";

    @p0
    private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;

    @p0
    private static String vmServiceUri;

    @p0
    private AccessibilityDelegate accessibilityDelegate;

    @p0
    private DeferredComponentManager deferredComponentManager;

    @p0
    private LocalizationPlugin localizationPlugin;

    @p0
    private Long nativeShellHolderId;

    @p0
    private PlatformMessageHandler platformMessageHandler;

    @p0
    private PlatformViewsController platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    @n0
    private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();

    @n0
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();

    @n0
    private final Looper mainLooper = Looper.getMainLooper();

    public interface AccessibilityDelegate {
        void updateCustomAccessibilityActions(@n0 ByteBuffer byteBuffer, @n0 String[] strArr);

        void updateSemantics(@n0 ByteBuffer byteBuffer, @n0 String[] strArr, @n0 ByteBuffer[] byteBufferArr);
    }

    public interface AsyncWaitForVsyncDelegate {
        void asyncWaitForVsync(long j10);
    }

    public static class Factory {
        public FlutterJNI provideFlutterJNI() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j10) {
        AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate2 == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        asyncWaitForVsyncDelegate2.asyncWaitForVsync(j10);
    }

    @j1
    @p0
    public static Bitmap decodeImage(@n0 ByteBuffer byteBuffer, final long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.a
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j10, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e10) {
                Log.e(TAG, "Failed to decode image", e10);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @p0
    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    @p0
    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i10, ByteBuffer byteBuffer) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handlePlatformMessageResponse(i10, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j10, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j10, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(@n0 FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j10);

    private native void nativeDeferredComponentInstallFailure(int i10, @n0 String str, boolean z10);

    private native void nativeDestroy(long j10);

    private native void nativeDispatchEmptyPlatformMessage(long j10, @n0 String str, int i10);

    private native void nativeDispatchPlatformMessage(long j10, @n0 String str, @p0 ByteBuffer byteBuffer, int i10, int i11);

    private native void nativeDispatchPointerDataPacket(long j10, @n0 ByteBuffer byteBuffer, int i10);

    private native void nativeDispatchSemanticsAction(long j10, int i10, int i11, @p0 ByteBuffer byteBuffer, int i12);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i10);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i10);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i10);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i10);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i10);

    private native Bitmap nativeGetBitmap(long j10);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j10, int i10, int i11);

    private static native void nativeInit(@n0 Context context, @n0 String[] strArr, @p0 String str, @n0 String str2, @n0 String str3, long j10);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j10, int i10);

    private native void nativeInvokePlatformMessageResponseCallback(long j10, int i10, @p0 ByteBuffer byteBuffer, int i11);

    private native void nativeLoadDartDeferredLibrary(long j10, int i10, @n0 String[] strArr);

    @n0
    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j10);

    private native void nativeMarkTextureFrameAvailable(long j10, long j11);

    private native void nativeNotifyLowMemoryWarning(long j10);

    private native void nativeOnVsync(long j10, long j11, long j12);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j10, long j11, @n0 WeakReference<TextureRegistry.ImageConsumer> weakReference);

    private native void nativeRegisterTexture(long j10, long j11, @n0 WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j10, @n0 String str, @p0 String str2, @p0 String str3, @n0 AssetManager assetManager, @p0 List<String> list);

    private native void nativeScheduleFrame(long j10);

    private native void nativeSetAccessibilityFeatures(long j10, int i10);

    private native void nativeSetSemanticsEnabled(long j10, boolean z10);

    private native void nativeSetViewportMetrics(long j10, float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j10, @p0 String str, @p0 String str2, @p0 String str3, @p0 List<String> list);

    private native void nativeSurfaceChanged(long j10, int i10, int i11);

    private native void nativeSurfaceCreated(long j10, @n0 Surface surface);

    private native void nativeSurfaceDestroyed(long j10);

    private native void nativeSurfaceWindowChanged(long j10, @n0 Surface surface);

    private native void nativeUnregisterTexture(long j10, long j11);

    private native void nativeUpdateDisplayMetrics(long j10);

    private native void nativeUpdateJavaAssetManager(long j10, @n0 AssetManager assetManager, @n0 String str);

    private native void nativeUpdateRefreshRate(float f10);

    private void onPreEngineRestart() {
        Iterator<FlutterEngine.EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreEngineRestart();
        }
    }

    @i1
    private void updateCustomAccessibilityActions(@n0 ByteBuffer byteBuffer, @n0 String[] strArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    @i1
    private void updateSemantics(@n0 ByteBuffer byteBuffer, @n0 String[] strArr, @n0 ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    @i1
    public void addEngineLifecycleListener(@n0 FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    @i1
    public void addIsDisplayingFlutterUiListener(@n0 FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    @i1
    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j10) {
        nativeCleanupMessageData(j10);
    }

    @j1
    public String[] computePlatformResolvedLocale(@n0 String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10 += 3) {
            String str = strArr[i10 + 0];
            String str2 = strArr[i10 + 1];
            String str3 = strArr[i10 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale localeResolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
        return localeResolveNativeLocale == null ? new String[0] : new String[]{localeResolveNativeLocale.getLanguage(), localeResolveNativeLocale.getCountry(), localeResolveNativeLocale.getScript()};
    }

    @i1
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @i1
    public void deferredComponentInstallFailure(int i10, @n0 String str, boolean z10) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i10, str, z10);
    }

    @i1
    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController.destroyOverlaySurfaces();
    }

    @i1
    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    @i1
    public void dispatchEmptyPlatformMessage(@n0 String str, int i10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i10);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i10);
    }

    @i1
    public void dispatchPlatformMessage(@n0 String str, @p0 ByteBuffer byteBuffer, int i10, int i11) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i10, i11);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i11);
    }

    @i1
    public void dispatchPointerDataPacket(@n0 ByteBuffer byteBuffer, int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i10);
    }

    @i1
    public void dispatchSemanticsAction(int i10, int i11, @p0 ByteBuffer byteBuffer, int i12) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i10, i11, byteBuffer, i12);
    }

    public void dispatchSemanticsAction(int i10, @n0 AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i10, action, null);
    }

    public void dispatchSemanticsAction(int i10, @n0 AccessibilityBridge.Action action, @p0 Object obj) {
        ByteBuffer byteBufferEncodeMessage;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferEncodeMessage = StandardMessageCodec.INSTANCE.encodeMessage(obj);
            iPosition = byteBufferEncodeMessage.position();
        } else {
            byteBufferEncodeMessage = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i10, action.value, byteBufferEncodeMessage, iPosition);
    }

    @i1
    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    @i1
    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    @p0
    public float getScaledFontSize(float f10, int i10) {
        DisplayMetrics pastDisplayMetrics = SettingsChannel.getPastDisplayMetrics(i10);
        if (pastDisplayMetrics != null) {
            return TypedValue.applyDimension(2, f10, pastDisplayMetrics) / pastDisplayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i10) + ", which can't be found.");
        return -1.0f;
    }

    @j1
    public void handlePlatformMessage(@n0 String str, ByteBuffer byteBuffer, int i10, long j10) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handleMessageFromDart(str, byteBuffer, i10, j10);
        } else {
            nativeCleanupMessageData(j10);
        }
    }

    public void init(@n0 Context context, @n0 String[] strArr, @p0 String str, @n0 String str2, @n0 String str3, long j10) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j10);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i10) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i10);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i10);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i10, @n0 ByteBuffer byteBuffer, int i11) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i10, byteBuffer, i11);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i10);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i10) {
        return nativeFlutterTextUtilsIsEmoji(i10);
    }

    public boolean isCodePointEmojiModifier(int i10) {
        return nativeFlutterTextUtilsIsEmojiModifier(i10);
    }

    public boolean isCodePointEmojiModifierBase(int i10) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i10);
    }

    public boolean isCodePointRegionalIndicator(int i10) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i10);
    }

    public boolean isCodePointVariantSelector(int i10) {
        return nativeFlutterTextUtilsIsVariationSelector(i10);
    }

    @i1
    public void loadDartDeferredLibrary(int i10, @n0 String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i10, strArr);
    }

    public void loadLibrary() {
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        System.loadLibrary("flutter");
        loadLibraryCalled = true;
    }

    @i1
    public void markTextureFrameAvailable(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j10);
    }

    @i1
    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    @i1
    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        platformViewsController.onBeginFrame();
    }

    @i1
    public void onDisplayOverlaySurface(int i10, int i11, int i12, int i13, int i14) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        platformViewsController.onDisplayOverlaySurface(i10, i11, i12, i13, i14);
    }

    @i1
    public void onDisplayPlatformView(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        platformViewsController.onDisplayPlatformView(i10, i11, i12, i13, i14, i15, i16, flutterMutatorsStack);
    }

    @i1
    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        platformViewsController.onEndFrame();
    }

    @j1
    @i1
    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiDisplayed();
        }
    }

    @j1
    @i1
    void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiNoLongerDisplayed();
        }
    }

    @i1
    public void onSurfaceChanged(int i10, int i11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i10, i11);
    }

    @i1
    public void onSurfaceCreated(@n0 Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    @i1
    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    @i1
    public void onSurfaceWindowChanged(@n0 Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j10, long j11, long j12) {
        nativeOnVsync(j10, j11, j12);
    }

    @j1
    public long performNativeAttach(@n0 FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    @i1
    public void registerImageTexture(long j10, @n0 TextureRegistry.ImageConsumer imageConsumer) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j10, new WeakReference<>(imageConsumer));
    }

    @i1
    public void registerTexture(long j10, @n0 SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j10, new WeakReference<>(surfaceTextureWrapper));
    }

    @i1
    public void removeEngineLifecycleListener(@n0 FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    @i1
    public void removeIsDisplayingFlutterUiListener(@n0 FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    @i1
    public void requestDartDeferredLibrary(int i10) {
        DeferredComponentManager deferredComponentManager = this.deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.installDeferredComponent(i10, null);
        } else {
            Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    @i1
    public void runBundleAndSnapshotFromLibrary(@n0 String str, @p0 String str2, @p0 String str3, @n0 AssetManager assetManager, @p0 List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    @i1
    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    @i1
    public void setAccessibilityDelegate(@p0 AccessibilityDelegate accessibilityDelegate) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }

    @i1
    public void setAccessibilityFeatures(int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i10);
    }

    public void setAsyncWaitForVsyncDelegate(@p0 AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
        asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
    }

    @i1
    public void setDeferredComponentManager(@p0 DeferredComponentManager deferredComponentManager) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.setJNI(this);
        }
    }

    @i1
    public void setLocalizationPlugin(@p0 LocalizationPlugin localizationPlugin) {
        ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin;
    }

    @i1
    public void setPlatformMessageHandler(@p0 PlatformMessageHandler platformMessageHandler) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }

    @i1
    public void setPlatformViewsController(@n0 PlatformViewsController platformViewsController) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }

    public void setRefreshRateFPS(float f10) {
        refreshRateFPS = f10;
        updateRefreshRate();
    }

    @i1
    public void setSemanticsEnabled(boolean z10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z10);
    }

    @i1
    public void setViewportMetrics(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f10, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, iArr, iArr2, iArr3);
    }

    @n0
    @i1
    public FlutterJNI spawn(@p0 String str, @p0 String str2, @p0 String str3, @p0 List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l10 = flutterJNINativeSpawn.nativeShellHolderId;
        Preconditions.checkState((l10 == null || l10.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return flutterJNINativeSpawn;
    }

    @i1
    public void unregisterTexture(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j10);
    }

    public void updateDisplayMetrics(int i10, float f10, float f11, float f12) {
        displayWidth = f10;
        displayHeight = f11;
        displayDensity = f12;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    @i1
    public void updateJavaAssetManager(@n0 AssetManager assetManager, @n0 String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }
}
