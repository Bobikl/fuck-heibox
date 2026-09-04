package com.eclipsesource.v8;

import com.eclipsesource.v8.inspector.V8InspectorDelegate;
import com.eclipsesource.v8.utils.V8Executor;
import com.eclipsesource.v8.utils.V8Map;
import com.eclipsesource.v8.utils.V8Runnable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class V8 extends V8Object {
    private static boolean initialized = false;
    private static boolean nativeLibraryLoaded = false;
    private static Error nativeLoadError;
    private static Exception nativeLoadException;
    private static volatile int runtimeCounter;
    private static String v8Flags;
    private Map<String, Object> data;
    private V8Map<V8Executor> executors;
    private boolean forceTerminateExecutors;
    private Map<Long, MethodDescriptor> functionRegistry;
    private final V8Locker locker;
    private long objectReferences;
    private LinkedList<ReferenceHandler> referenceHandlers;
    private LinkedList<V8Runnable> releaseHandlers;
    private List<Releasable> resources;
    private SignatureProvider signatureProvider;
    private long v8RuntimePtr;
    protected Map<Long, V8Value> v8WeakReferences;
    private static Object lock = new Object();
    private static V8Value undefined = new V8Object.Undefined();
    private static Object invalid = new Object();

    public class MethodDescriptor {
        JavaCallback callback;
        boolean includeReceiver;
        Method method;
        Object object;
        JavaVoidCallback voidCallback;

        private MethodDescriptor() {
        }
    }

    protected V8() {
        this(null);
    }

    protected V8(String str) {
        super(null);
        this.v8WeakReferences = new HashMap();
        this.data = null;
        this.signatureProvider = null;
        this.objectReferences = 0L;
        this.v8RuntimePtr = 0L;
        this.resources = null;
        this.executors = null;
        this.forceTerminateExecutors = false;
        this.functionRegistry = new HashMap();
        this.referenceHandlers = new LinkedList<>();
        this.releaseHandlers = new LinkedList<>();
        this.released = false;
        this.v8RuntimePtr = _createIsolate(str);
        this.locker = new V8Locker(this);
        checkThread();
        this.objectHandle = _getGlobalObject(this.v8RuntimePtr);
    }

    private native void _acquireLock(long j10);

    private native void _add(long j10, long j11, String str, double d10);

    private native void _add(long j10, long j11, String str, int i10);

    private native void _add(long j10, long j11, String str, String str2);

    private native void _add(long j10, long j11, String str, boolean z10);

    private native void _addArrayBooleanItem(long j10, long j11, boolean z10);

    private native void _addArrayDoubleItem(long j10, long j11, double d10);

    private native void _addArrayIntItem(long j10, long j11, int i10);

    private native void _addArrayNullItem(long j10, long j11);

    private native void _addArrayObjectItem(long j10, long j11, long j12);

    private native void _addArrayStringItem(long j10, long j11, String str);

    private native void _addArrayUndefinedItem(long j10, long j11);

    private native void _addNull(long j10, long j11, String str);

    private native void _addObject(long j10, long j11, String str, long j12);

    private native void _addUndefined(long j10, long j11, String str);

    private native Object _arrayGet(long j10, int i10, long j11, int i11);

    private native boolean _arrayGetBoolean(long j10, long j11, int i10);

    private native int _arrayGetBooleans(long j10, long j11, int i10, int i11, boolean[] zArr);

    private native boolean[] _arrayGetBooleans(long j10, long j11, int i10, int i11);

    private native byte _arrayGetByte(long j10, long j11, int i10);

    private native int _arrayGetBytes(long j10, long j11, int i10, int i11, byte[] bArr);

    private native byte[] _arrayGetBytes(long j10, long j11, int i10, int i11);

    private native double _arrayGetDouble(long j10, long j11, int i10);

    private native int _arrayGetDoubles(long j10, long j11, int i10, int i11, double[] dArr);

    private native double[] _arrayGetDoubles(long j10, long j11, int i10, int i11);

    private native int _arrayGetInteger(long j10, long j11, int i10);

    private native int _arrayGetIntegers(long j10, long j11, int i10, int i11, int[] iArr);

    private native int[] _arrayGetIntegers(long j10, long j11, int i10, int i11);

    private native int _arrayGetSize(long j10, long j11);

    private native String _arrayGetString(long j10, long j11, int i10);

    private native int _arrayGetStrings(long j10, long j11, int i10, int i11, String[] strArr);

    private native String[] _arrayGetStrings(long j10, long j11, int i10, int i11);

    private native void _clearWeak(long j10, long j11);

    private native boolean _contains(long j10, long j11, String str);

    private native long _createInspector(long j10, V8InspectorDelegate v8InspectorDelegate, String str);

    private native long _createIsolate(String str);

    private native void _createTwin(long j10, long j11, long j12);

    private native ByteBuffer _createV8ArrayBufferBackingStore(long j10, long j11, int i10);

    private native void _dispatchProtocolMessage(long j10, long j11, String str);

    private native boolean _equals(long j10, long j11, long j12);

    private native boolean _executeBooleanFunction(long j10, long j11, String str, long j12);

    private native boolean _executeBooleanScript(long j10, String str, String str2, int i10);

    private native double _executeDoubleFunction(long j10, long j11, String str, long j12);

    private native double _executeDoubleScript(long j10, String str, String str2, int i10);

    private native Object _executeFunction(long j10, int i10, long j11, String str, long j12);

    private native Object _executeFunction(long j10, long j11, long j12, long j13);

    private native int _executeIntegerFunction(long j10, long j11, String str, long j12);

    private native int _executeIntegerScript(long j10, String str, String str2, int i10);

    private native Object _executeScript(long j10, int i10, String str, String str2, int i11);

    private native String _executeStringFunction(long j10, long j11, String str, long j12);

    private native String _executeStringScript(long j10, String str, String str2, int i10);

    private native void _executeVoidFunction(long j10, long j11, String str, long j12);

    private native void _executeVoidScript(long j10, String str, String str2, int i10);

    private native Object _get(long j10, int i10, long j11, String str);

    private native int _getArrayType(long j10, long j11);

    private native boolean _getBoolean(long j10, long j11, String str);

    private static native long _getBuildID();

    private native String _getConstructorName(long j10, long j11);

    private native double _getDouble(long j10, long j11, String str);

    private native long _getGlobalObject(long j10);

    private native int _getInteger(long j10, long j11, String str);

    private native String[] _getKeys(long j10, long j11);

    private native String _getString(long j10, long j11, String str);

    private native int _getType(long j10, long j11);

    private native int _getType(long j10, long j11, int i10);

    private native int _getType(long j10, long j11, int i10, int i11);

    private native int _getType(long j10, long j11, String str);

    private static native String _getVersion();

    private native int _identityHash(long j10, long j11);

    private native long _initEmptyContainer(long j10);

    private native long _initNewV8Array(long j10);

    private native long _initNewV8ArrayBuffer(long j10, int i10);

    private native long _initNewV8ArrayBuffer(long j10, ByteBuffer byteBuffer, int i10);

    private native long _initNewV8Float32Array(long j10, long j11, int i10, int i11);

    private native long _initNewV8Float64Array(long j10, long j11, int i10, int i11);

    private native long[] _initNewV8Function(long j10);

    private native long _initNewV8Int16Array(long j10, long j11, int i10, int i11);

    private native long _initNewV8Int32Array(long j10, long j11, int i10, int i11);

    private native long _initNewV8Int8Array(long j10, long j11, int i10, int i11);

    private native long _initNewV8Object(long j10);

    private native long _initNewV8UInt16Array(long j10, long j11, int i10, int i11);

    private native long _initNewV8UInt32Array(long j10, long j11, int i10, int i11);

    private native long _initNewV8UInt8Array(long j10, long j11, int i10, int i11);

    private native long _initNewV8UInt8ClampedArray(long j10, long j11, int i10, int i11);

    private static native boolean _isNodeCompatible();

    private static native boolean _isRunning(long j10);

    private native boolean _isWeak(long j10, long j11);

    private native void _lowMemoryNotification(long j10);

    private static native boolean _pumpMessageLoop(long j10);

    private native long _registerJavaMethod(long j10, long j11, String str, boolean z10);

    private native void _release(long j10, long j11);

    private native void _releaseLock(long j10);

    private native void _releaseMethodDescriptor(long j10, long j11);

    private native void _releaseRuntime(long j10);

    private native boolean _sameValue(long j10, long j11, long j12);

    private native void _schedulePauseOnNextStatement(long j10, long j11, String str);

    private static native void _setFlags(String str);

    private native void _setPrototype(long j10, long j11, long j12);

    private native void _setWeak(long j10, long j11);

    private static native void _startNodeJS(long j10, String str);

    private native boolean _strictEquals(long j10, long j11, long j12);

    private native void _terminateExecution(long j10);

    private native String _toString(long j10, long j11);

    private void checkArgs(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj == invalid) {
                throw new IllegalArgumentException("argument type mismatch");
            }
        }
    }

    private static void checkNativeLibraryLoaded() {
        if (nativeLibraryLoaded) {
            return;
        }
        String strComputeLibraryShortName = LibraryLoader.computeLibraryShortName(true);
        String str = "J2V8 native library not loaded (" + LibraryLoader.computeLibraryShortName(false) + "/" + strComputeLibraryShortName + ")";
        if (nativeLoadError != null) {
            throw new IllegalStateException(str, nativeLoadError);
        }
        if (nativeLoadException == null) {
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str, nativeLoadException);
    }

    private Object checkResult(Object obj) {
        if (obj == null) {
            return obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof V8Value) {
            if (((V8Value) obj).isReleased()) {
                throw new V8RuntimeException("V8Value already released");
            }
            return obj;
        }
        throw new V8RuntimeException("Unknown return type: " + obj.getClass());
    }

    static void checkScript(String str) {
        if (str == null) {
            throw new NullPointerException("Script is null");
        }
    }

    public static V8 createV8Runtime() {
        return createV8Runtime(null, null);
    }

    public static V8 createV8Runtime(String str) {
        return createV8Runtime(str, null);
    }

    public static V8 createV8Runtime(String str, String str2) {
        if (!nativeLibraryLoaded) {
            synchronized (lock) {
                if (!nativeLibraryLoaded) {
                    load(str2);
                }
            }
        }
        checkNativeLibraryLoaded();
        if (!initialized) {
            _setFlags(v8Flags);
            initialized = true;
        }
        V8 v10 = new V8(str);
        synchronized (lock) {
            runtimeCounter++;
        }
        return v10;
    }

    public static int getActiveRuntimes() {
        return runtimeCounter;
    }

    private Object[] getArgs(V8Object v8Object, MethodDescriptor methodDescriptor, V8Array v8Array, boolean z10) {
        int length = methodDescriptor.method.getParameterTypes().length;
        int i10 = z10 ? length - 1 : length;
        Object[] defaultValues = setDefaultValues(new Object[length], methodDescriptor.method.getParameterTypes(), v8Object, methodDescriptor.includeReceiver);
        ArrayList arrayList = new ArrayList();
        populateParamters(v8Array, i10, defaultValues, arrayList, methodDescriptor.includeReceiver);
        if (z10) {
            Object varArgContainer = getVarArgContainer(methodDescriptor.method.getParameterTypes(), arrayList.size());
            System.arraycopy(arrayList.toArray(), 0, varArgContainer, 0, arrayList.size());
            defaultValues[i10] = varArgContainer;
        }
        return defaultValues;
    }

    private Object getArrayItem(V8Array v8Array, int i10) {
        try {
            int type = v8Array.getType(i10);
            if (type == 10) {
                return v8Array.get(i10);
            }
            if (type == 99) {
                return getUndefined();
            }
            switch (type) {
                case 1:
                    return Integer.valueOf(v8Array.getInteger(i10));
                case 2:
                    return Double.valueOf(v8Array.getDouble(i10));
                case 3:
                    return Boolean.valueOf(v8Array.getBoolean(i10));
                case 4:
                    return v8Array.getString(i10);
                case 5:
                case 8:
                    return v8Array.getArray(i10);
                case 6:
                    return v8Array.getObject(i10);
                case 7:
                    return v8Array.getObject(i10);
                default:
                    return null;
            }
        } catch (V8ResultUndefined unused) {
            return null;
        }
    }

    public static long getBuildID() {
        return _getBuildID();
    }

    private Object getDefaultValue(Class<?> cls) {
        if (cls.equals(V8Object.class)) {
            return new V8Object.Undefined();
        }
        return cls.equals(V8Array.class) ? new V8Array.Undefined() : invalid;
    }

    public static String getSCMRevision() {
        return "Unknown revision ID";
    }

    public static V8Value getUndefined() {
        return undefined;
    }

    public static String getV8Version() {
        return _getVersion();
    }

    private Object getVarArgContainer(Class<?>[] clsArr, int i10) {
        Class<?> componentType = clsArr[clsArr.length - 1];
        if (componentType.isArray()) {
            componentType = componentType.getComponentType();
        }
        return Array.newInstance(componentType, i10);
    }

    public static boolean isLoaded() {
        return nativeLibraryLoaded;
    }

    public static boolean isNodeCompatible() {
        if (!nativeLibraryLoaded) {
            synchronized (lock) {
                if (!nativeLibraryLoaded) {
                    load(null);
                }
            }
        }
        return _isNodeCompatible();
    }

    private boolean isVoidMethod(Method method) {
        return method.getReturnType().equals(Void.TYPE);
    }

    private static synchronized void load(String str) {
        try {
            LibraryLoader.loadLibrary(str);
            nativeLibraryLoaded = true;
        } catch (Error e10) {
            nativeLoadError = e10;
        } catch (Exception e11) {
            nativeLoadException = e11;
        }
    }

    private void notifyReferenceCreated(V8Value v8Value) {
        Iterator<ReferenceHandler> it = this.referenceHandlers.iterator();
        while (it.hasNext()) {
            it.next().v8HandleCreated(v8Value);
        }
    }

    private void notifyReferenceDisposed(V8Value v8Value) {
        Iterator<ReferenceHandler> it = this.referenceHandlers.iterator();
        while (it.hasNext()) {
            it.next().v8HandleDisposed(v8Value);
        }
    }

    private void notifyReleaseHandlers(V8 v10) {
        Iterator<V8Runnable> it = this.releaseHandlers.iterator();
        while (it.hasNext()) {
            it.next().run(v10);
        }
    }

    private void populateParamters(V8Array v8Array, int i10, Object[] objArr, List<Object> list, boolean z10) {
        for (int i11 = z10 ? 1 : 0; i11 < v8Array.length() + (z10 ? 1 : 0); i11++) {
            if (i11 >= i10) {
                list.add(getArrayItem(v8Array, i11 - (z10 ? 1 : 0)));
            } else {
                objArr[i11] = getArrayItem(v8Array, i11 - (z10 ? 1 : 0));
            }
        }
    }

    private void releaseArguments(Object[] objArr, boolean z10) {
        if (z10 && objArr.length > 0 && (objArr[objArr.length - 1] instanceof Object[])) {
            for (Object obj : (Object[]) objArr[objArr.length - 1]) {
                if (obj instanceof V8Value) {
                    ((V8Value) obj).close();
                }
            }
        }
        for (Object obj2 : objArr) {
            if (obj2 instanceof V8Value) {
                ((V8Value) obj2).close();
            }
        }
    }

    private void releaseNativeMethodDescriptors() {
        Iterator<Long> it = this.functionRegistry.keySet().iterator();
        while (it.hasNext()) {
            releaseMethodDescriptor(this.v8RuntimePtr, it.next().longValue());
        }
    }

    private void releaseResources() {
        List<Releasable> list = this.resources;
        if (list != null) {
            Iterator<Releasable> it = list.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.resources.clear();
            this.resources = null;
        }
    }

    private Object[] setDefaultValues(Object[] objArr, Class<?>[] clsArr, V8Object v8Object, boolean z10) {
        int i10 = 0;
        if (z10) {
            objArr[0] = v8Object;
            i10 = 1;
        }
        while (i10 < objArr.length) {
            objArr[i10] = getDefaultValue(clsArr[i10]);
            i10++;
        }
        return objArr;
    }

    public static void setFlags(String str) {
        v8Flags = str;
        initialized = false;
    }

    protected void acquireLock(long j10) {
        _acquireLock(j10);
    }

    protected void add(long j10, long j11, String str, double d10) {
        _add(j10, j11, str, d10);
    }

    protected void add(long j10, long j11, String str, int i10) {
        _add(j10, j11, str, i10);
    }

    protected void add(long j10, long j11, String str, String str2) {
        _add(j10, j11, str, str2);
    }

    protected void add(long j10, long j11, String str, boolean z10) {
        _add(j10, j11, str, z10);
    }

    protected void addArrayBooleanItem(long j10, long j11, boolean z10) {
        _addArrayBooleanItem(j10, j11, z10);
    }

    protected void addArrayDoubleItem(long j10, long j11, double d10) {
        _addArrayDoubleItem(j10, j11, d10);
    }

    protected void addArrayIntItem(long j10, long j11, int i10) {
        _addArrayIntItem(j10, j11, i10);
    }

    protected void addArrayNullItem(long j10, long j11) {
        _addArrayNullItem(j10, j11);
    }

    protected void addArrayObjectItem(long j10, long j11, long j12) {
        _addArrayObjectItem(j10, j11, j12);
    }

    protected void addArrayStringItem(long j10, long j11, String str) {
        _addArrayStringItem(j10, j11, str);
    }

    protected void addArrayUndefinedItem(long j10, long j11) {
        _addArrayUndefinedItem(j10, j11);
    }

    protected void addNull(long j10, long j11, String str) {
        _addNull(j10, j11, str);
    }

    void addObjRef(V8Value v8Value) {
        this.objectReferences++;
        if (this.referenceHandlers.isEmpty()) {
            return;
        }
        notifyReferenceCreated(v8Value);
    }

    protected void addObject(long j10, long j11, String str, long j12) {
        _addObject(j10, j11, str, j12);
    }

    public void addReferenceHandler(ReferenceHandler referenceHandler) {
        this.referenceHandlers.add(0, referenceHandler);
    }

    public void addReleaseHandler(V8Runnable v8Runnable) {
        this.releaseHandlers.add(v8Runnable);
    }

    protected void addUndefined(long j10, long j11, String str) {
        _addUndefined(j10, j11, str);
    }

    protected Object arrayGet(long j10, int i10, long j11, int i11) {
        return _arrayGet(j10, i10, j11, i11);
    }

    protected boolean arrayGetBoolean(long j10, long j11, int i10) {
        return _arrayGetBoolean(j10, j11, i10);
    }

    protected int arrayGetBooleans(long j10, long j11, int i10, int i11, boolean[] zArr) {
        return _arrayGetBooleans(j10, j11, i10, i11, zArr);
    }

    protected boolean[] arrayGetBooleans(long j10, long j11, int i10, int i11) {
        return _arrayGetBooleans(j10, j11, i10, i11);
    }

    protected byte arrayGetByte(long j10, long j11, int i10) {
        return _arrayGetByte(j10, j11, i10);
    }

    protected int arrayGetBytes(long j10, long j11, int i10, int i11, byte[] bArr) {
        return _arrayGetBytes(j10, j11, i10, i11, bArr);
    }

    protected byte[] arrayGetBytes(long j10, long j11, int i10, int i11) {
        return _arrayGetBytes(j10, j11, i10, i11);
    }

    protected double arrayGetDouble(long j10, long j11, int i10) {
        return _arrayGetDouble(j10, j11, i10);
    }

    protected int arrayGetDoubles(long j10, long j11, int i10, int i11, double[] dArr) {
        return _arrayGetDoubles(j10, j11, i10, i11, dArr);
    }

    protected double[] arrayGetDoubles(long j10, long j11, int i10, int i11) {
        return _arrayGetDoubles(j10, j11, i10, i11);
    }

    protected int arrayGetInteger(long j10, long j11, int i10) {
        return _arrayGetInteger(j10, j11, i10);
    }

    protected int arrayGetIntegers(long j10, long j11, int i10, int i11, int[] iArr) {
        return _arrayGetIntegers(j10, j11, i10, i11, iArr);
    }

    protected int[] arrayGetIntegers(long j10, long j11, int i10, int i11) {
        return _arrayGetIntegers(j10, j11, i10, i11);
    }

    protected int arrayGetSize(long j10, long j11) {
        return _arrayGetSize(j10, j11);
    }

    protected String arrayGetString(long j10, long j11, int i10) {
        return _arrayGetString(j10, j11, i10);
    }

    protected int arrayGetStrings(long j10, long j11, int i10, int i11, String[] strArr) {
        return _arrayGetStrings(j10, j11, i10, i11, strArr);
    }

    protected String[] arrayGetStrings(long j10, long j11, int i10, int i11) {
        return _arrayGetStrings(j10, j11, i10, i11);
    }

    protected Object callObjectJavaMethod(long j10, V8Object v8Object, V8Array v8Array) throws Throwable {
        MethodDescriptor methodDescriptor = this.functionRegistry.get(Long.valueOf(j10));
        JavaCallback javaCallback = methodDescriptor.callback;
        if (javaCallback != null) {
            return checkResult(javaCallback.invoke(v8Object, v8Array));
        }
        boolean zIsVarArgs = methodDescriptor.method.isVarArgs();
        Object[] args = getArgs(v8Object, methodDescriptor, v8Array, zIsVarArgs);
        checkArgs(args);
        try {
            try {
                try {
                    try {
                        Object objCheckResult = checkResult(methodDescriptor.method.invoke(methodDescriptor.object, args));
                        releaseArguments(args, zIsVarArgs);
                        return objCheckResult;
                    } catch (InvocationTargetException e10) {
                        throw e10.getTargetException();
                    }
                } catch (IllegalAccessException e11) {
                    throw e11;
                }
            } catch (IllegalArgumentException e12) {
                throw e12;
            }
        } catch (Throwable th2) {
            releaseArguments(args, zIsVarArgs);
            throw th2;
        }
    }

    protected void callVoidJavaMethod(long j10, V8Object v8Object, V8Array v8Array) throws Throwable {
        MethodDescriptor methodDescriptor = this.functionRegistry.get(Long.valueOf(j10));
        JavaVoidCallback javaVoidCallback = methodDescriptor.voidCallback;
        if (javaVoidCallback != null) {
            javaVoidCallback.invoke(v8Object, v8Array);
            return;
        }
        boolean zIsVarArgs = methodDescriptor.method.isVarArgs();
        Object[] args = getArgs(v8Object, methodDescriptor, v8Array, zIsVarArgs);
        checkArgs(args);
        try {
            try {
                methodDescriptor.method.invoke(methodDescriptor.object, args);
                releaseArguments(args, zIsVarArgs);
            } catch (IllegalAccessException e10) {
                throw e10;
            } catch (IllegalArgumentException e11) {
                throw e11;
            } catch (InvocationTargetException e12) {
                throw e12.getTargetException();
            }
        } catch (Throwable th2) {
            releaseArguments(args, zIsVarArgs);
            throw th2;
        }
    }

    void checkRuntime(V8Value v8Value) {
        if (v8Value == null || v8Value.isUndefined()) {
            return;
        }
        V8 runtime = v8Value.getRuntime();
        if (runtime == null || runtime.isReleased() || runtime != this) {
            throw new Error("Invalid target runtime");
        }
    }

    void checkThread() {
        this.locker.checkThread();
        if (isReleased()) {
            throw new Error("Runtime disposed error");
        }
    }

    protected void clearWeak(long j10, long j11) {
        _clearWeak(j10, j11);
    }

    @Override // com.eclipsesource.v8.V8Value, com.eclipsesource.v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release(true);
    }

    protected boolean contains(long j10, long j11, String str) {
        return _contains(j10, j11, str);
    }

    void createAndRegisterMethodDescriptor(JavaCallback javaCallback, long j10) {
        MethodDescriptor methodDescriptor = new MethodDescriptor();
        methodDescriptor.callback = javaCallback;
        this.functionRegistry.put(Long.valueOf(j10), methodDescriptor);
    }

    public long createInspector(V8InspectorDelegate v8InspectorDelegate, String str) {
        return _createInspector(this.v8RuntimePtr, v8InspectorDelegate, str);
    }

    void createNodeRuntime(String str) {
        _startNodeJS(this.v8RuntimePtr, str);
    }

    protected void createTwin(long j10, long j11, long j12) {
        _createTwin(j10, j11, j12);
    }

    protected void createTwin(V8Value v8Value, V8Value v8Value2) {
        checkThread();
        createTwin(this.v8RuntimePtr, v8Value.getHandle(), v8Value2.getHandle());
    }

    protected ByteBuffer createV8ArrayBufferBackingStore(long j10, long j11, int i10) {
        return _createV8ArrayBufferBackingStore(j10, j11, i10);
    }

    public void dispatchProtocolMessage(long j10, String str) {
        checkThread();
        _dispatchProtocolMessage(this.v8RuntimePtr, j10, str);
    }

    protected void disposeMethodID(long j10) {
        this.functionRegistry.remove(Long.valueOf(j10));
    }

    protected boolean equals(long j10, long j11, long j12) {
        return _equals(j10, j11, j12);
    }

    public V8Array executeArrayScript(String str) {
        return executeArrayScript(str, null, 0);
    }

    public V8Array executeArrayScript(String str, String str2, int i10) {
        checkThread();
        Object objExecuteScript = executeScript(str, str2, i10);
        if (objExecuteScript instanceof V8Array) {
            return (V8Array) objExecuteScript;
        }
        throw new V8ResultUndefined();
    }

    protected boolean executeBooleanFunction(long j10, long j11, String str, long j12) {
        return _executeBooleanFunction(j10, j11, str, j12);
    }

    protected boolean executeBooleanScript(long j10, String str, String str2, int i10) {
        return _executeBooleanScript(j10, str, str2, i10);
    }

    public boolean executeBooleanScript(String str) {
        return executeBooleanScript(str, null, 0);
    }

    public boolean executeBooleanScript(String str, String str2, int i10) {
        checkThread();
        checkScript(str);
        return executeBooleanScript(this.v8RuntimePtr, str, str2, i10);
    }

    protected double executeDoubleFunction(long j10, long j11, String str, long j12) {
        return _executeDoubleFunction(j10, j11, str, j12);
    }

    protected double executeDoubleScript(long j10, String str, String str2, int i10) {
        return _executeDoubleScript(j10, str, str2, i10);
    }

    public double executeDoubleScript(String str) {
        return executeDoubleScript(str, null, 0);
    }

    public double executeDoubleScript(String str, String str2, int i10) {
        checkThread();
        checkScript(str);
        return executeDoubleScript(this.v8RuntimePtr, str, str2, i10);
    }

    protected Object executeFunction(long j10, int i10, long j11, String str, long j12) {
        return _executeFunction(j10, i10, j11, str, j12);
    }

    protected Object executeFunction(long j10, long j11, long j12, long j13) {
        return _executeFunction(j10, j11, j12, j13);
    }

    protected int executeIntegerFunction(long j10, long j11, String str, long j12) {
        return _executeIntegerFunction(j10, j11, str, j12);
    }

    protected int executeIntegerScript(long j10, String str, String str2, int i10) {
        return _executeIntegerScript(j10, str, str2, i10);
    }

    public int executeIntegerScript(String str) {
        return executeIntegerScript(str, null, 0);
    }

    public int executeIntegerScript(String str, String str2, int i10) {
        checkThread();
        checkScript(str);
        return executeIntegerScript(this.v8RuntimePtr, str, str2, i10);
    }

    public Object executeModule(String str, String str2, String str3, String str4) {
        checkThread();
        checkScript(str);
        return executeScript(getV8RuntimePtr(), 0, str2 + str + str3, str4, 0);
    }

    public V8Object executeObjectScript(String str) {
        return executeObjectScript(str, null, 0);
    }

    public V8Object executeObjectScript(String str, String str2, int i10) {
        checkThread();
        Object objExecuteScript = executeScript(str, str2, i10);
        if (objExecuteScript instanceof V8Object) {
            return (V8Object) objExecuteScript;
        }
        throw new V8ResultUndefined();
    }

    protected Object executeScript(long j10, int i10, String str, String str2, int i11) {
        return _executeScript(j10, i10, str, str2, i11);
    }

    public Object executeScript(String str) {
        return executeScript(str, null, 0);
    }

    public Object executeScript(String str, String str2) {
        checkThread();
        checkScript(str);
        return executeScript(getV8RuntimePtr(), 0, str, str2, 0);
    }

    public Object executeScript(String str, String str2, int i10) {
        checkThread();
        checkScript(str);
        return executeScript(getV8RuntimePtr(), 0, str, str2, i10);
    }

    protected String executeStringFunction(long j10, long j11, String str, long j12) {
        return _executeStringFunction(j10, j11, str, j12);
    }

    protected String executeStringScript(long j10, String str, String str2, int i10) {
        return _executeStringScript(j10, str, str2, i10);
    }

    public String executeStringScript(String str) {
        return executeStringScript(str, null, 0);
    }

    public String executeStringScript(String str, String str2, int i10) {
        checkThread();
        checkScript(str);
        return executeStringScript(this.v8RuntimePtr, str, str2, i10);
    }

    protected void executeVoidFunction(long j10, long j11, String str, long j12) {
        _executeVoidFunction(j10, j11, str, j12);
    }

    protected void executeVoidScript(long j10, String str, String str2, int i10) {
        _executeVoidScript(j10, str, str2, i10);
    }

    public void executeVoidScript(String str) {
        executeVoidScript(str, null, 0);
    }

    public void executeVoidScript(String str, String str2, int i10) {
        checkThread();
        checkScript(str);
        executeVoidScript(this.v8RuntimePtr, str, str2, i10);
    }

    protected Object get(long j10, int i10, long j11, String str) {
        return _get(j10, i10, j11, str);
    }

    protected int getArrayType(long j10, long j11) {
        return _getArrayType(j10, j11);
    }

    protected boolean getBoolean(long j10, long j11, String str) {
        return _getBoolean(j10, j11, str);
    }

    protected String getConstructorName(long j10, long j11) {
        return _getConstructorName(j10, j11);
    }

    public Object getData(String str) {
        Map<String, Object> map = this.data;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    protected double getDouble(long j10, long j11, String str) {
        return _getDouble(j10, j11, str);
    }

    public V8Executor getExecutor(V8Object v8Object) {
        checkThread();
        V8Map<V8Executor> v8Map = this.executors;
        if (v8Map == null) {
            return null;
        }
        return v8Map.get(v8Object);
    }

    protected int getInteger(long j10, long j11, String str) {
        return _getInteger(j10, j11, str);
    }

    protected String[] getKeys(long j10, long j11) {
        return _getKeys(j10, j11);
    }

    public V8Locker getLocker() {
        return this.locker;
    }

    public long getObjectReferenceCount() {
        return this.objectReferences - ((long) this.v8WeakReferences.size());
    }

    protected String getString(long j10, long j11, String str) {
        return _getString(j10, j11, str);
    }

    protected int getType(long j10, long j11) {
        return _getType(j10, j11);
    }

    protected int getType(long j10, long j11, int i10) {
        return _getType(j10, j11, i10);
    }

    protected int getType(long j10, long j11, int i10, int i11) {
        return _getType(j10, j11, i10, i11);
    }

    protected int getType(long j10, long j11, String str) {
        return _getType(j10, j11, str);
    }

    protected long getV8RuntimePtr() {
        return this.v8RuntimePtr;
    }

    protected int identityHash(long j10, long j11) {
        return _identityHash(j10, j11);
    }

    protected long initEmptyContainer(long j10) {
        return _initEmptyContainer(j10);
    }

    protected long initNewV8Array(long j10) {
        return _initNewV8Array(j10);
    }

    protected long initNewV8ArrayBuffer(long j10, int i10) {
        return _initNewV8ArrayBuffer(j10, i10);
    }

    protected long initNewV8ArrayBuffer(long j10, ByteBuffer byteBuffer, int i10) {
        return _initNewV8ArrayBuffer(j10, byteBuffer, i10);
    }

    public long initNewV8Float32Array(long j10, long j11, int i10, int i11) {
        return _initNewV8Float32Array(j10, j11, i10, i11);
    }

    public long initNewV8Float64Array(long j10, long j11, int i10, int i11) {
        return _initNewV8Float64Array(j10, j11, i10, i11);
    }

    protected long[] initNewV8Function(long j10) {
        checkThread();
        return _initNewV8Function(j10);
    }

    public long initNewV8Int16Array(long j10, long j11, int i10, int i11) {
        return _initNewV8Int16Array(j10, j11, i10, i11);
    }

    public long initNewV8Int32Array(long j10, long j11, int i10, int i11) {
        return _initNewV8Int32Array(j10, j11, i10, i11);
    }

    public long initNewV8Int8Array(long j10, long j11, int i10, int i11) {
        return _initNewV8Int8Array(j10, j11, i10, i11);
    }

    protected long initNewV8Object(long j10) {
        return _initNewV8Object(j10);
    }

    public long initNewV8UInt16Array(long j10, long j11, int i10, int i11) {
        return _initNewV8UInt16Array(j10, j11, i10, i11);
    }

    public long initNewV8UInt32Array(long j10, long j11, int i10, int i11) {
        return _initNewV8UInt32Array(j10, j11, i10, i11);
    }

    public long initNewV8UInt8Array(long j10, long j11, int i10, int i11) {
        return _initNewV8UInt8Array(j10, j11, i10, i11);
    }

    public long initNewV8UInt8ClampedArray(long j10, long j11, int i10, int i11) {
        return _initNewV8UInt8ClampedArray(j10, j11, i10, i11);
    }

    boolean isRunning() {
        return _isRunning(this.v8RuntimePtr);
    }

    protected boolean isWeak(long j10, long j11) {
        return _isWeak(j10, j11);
    }

    public void lowMemoryNotification() {
        checkThread();
        lowMemoryNotification(getV8RuntimePtr());
    }

    protected void lowMemoryNotification(long j10) {
        _lowMemoryNotification(j10);
    }

    boolean pumpMessageLoop() {
        return _pumpMessageLoop(this.v8RuntimePtr);
    }

    void registerCallback(JavaCallback javaCallback, long j10, String str) {
        createAndRegisterMethodDescriptor(javaCallback, registerJavaMethod(getV8RuntimePtr(), j10, str, false));
    }

    void registerCallback(Object obj, Method method, long j10, String str, boolean z10) {
        MethodDescriptor methodDescriptor = new MethodDescriptor();
        methodDescriptor.object = obj;
        methodDescriptor.method = method;
        methodDescriptor.includeReceiver = z10;
        this.functionRegistry.put(Long.valueOf(registerJavaMethod(getV8RuntimePtr(), j10, str, isVoidMethod(method))), methodDescriptor);
    }

    protected long registerJavaMethod(long j10, long j11, String str, boolean z10) {
        return _registerJavaMethod(j10, j11, str, z10);
    }

    public void registerResource(Releasable releasable) {
        checkThread();
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
        this.resources.add(releasable);
    }

    public void registerV8Executor(V8Object v8Object, V8Executor v8Executor) {
        checkThread();
        if (this.executors == null) {
            this.executors = new V8Map<>();
        }
        this.executors.put((V8Value) v8Object, v8Executor);
    }

    void registerVoidCallback(JavaVoidCallback javaVoidCallback, long j10, String str) {
        MethodDescriptor methodDescriptor = new MethodDescriptor();
        methodDescriptor.voidCallback = javaVoidCallback;
        this.functionRegistry.put(Long.valueOf(registerJavaMethod(getV8RuntimePtr(), j10, str, true)), methodDescriptor);
    }

    @Override // com.eclipsesource.v8.V8Value, com.eclipsesource.v8.Releasable
    @Deprecated
    public void release() {
        release(true);
    }

    protected void release(long j10, long j11) {
        _release(j10, j11);
    }

    public void release(boolean z10) {
        if (isReleased()) {
            return;
        }
        checkThread();
        try {
            notifyReleaseHandlers(this);
            releaseResources();
            shutdownExecutors(this.forceTerminateExecutors);
            V8Map<V8Executor> v8Map = this.executors;
            if (v8Map != null) {
                v8Map.clear();
            }
            releaseNativeMethodDescriptors();
            synchronized (lock) {
                runtimeCounter--;
            }
            _releaseRuntime(this.v8RuntimePtr);
            this.v8RuntimePtr = 0L;
            this.released = true;
            if (!z10 || getObjectReferenceCount() <= 0) {
                return;
            }
            throw new IllegalStateException(getObjectReferenceCount() + " Object(s) still exist in runtime");
        } catch (Throwable th2) {
            releaseResources();
            shutdownExecutors(this.forceTerminateExecutors);
            if (this.executors != null) {
                this.executors.clear();
            }
            releaseNativeMethodDescriptors();
            synchronized (lock) {
                runtimeCounter--;
                _releaseRuntime(this.v8RuntimePtr);
                this.v8RuntimePtr = 0L;
                this.released = true;
                if (!z10 || getObjectReferenceCount() <= 0) {
                    throw th2;
                }
                throw new IllegalStateException(getObjectReferenceCount() + " Object(s) still exist in runtime");
            }
        }
    }

    protected void releaseLock(long j10) {
        _releaseLock(j10);
    }

    protected void releaseMethodDescriptor(long j10, long j11) {
        _releaseMethodDescriptor(j10, j11);
    }

    void releaseObjRef(V8Value v8Value) {
        if (!this.referenceHandlers.isEmpty()) {
            notifyReferenceDisposed(v8Value);
        }
        this.objectReferences--;
    }

    public V8Executor removeExecutor(V8Object v8Object) {
        checkThread();
        V8Map<V8Executor> v8Map = this.executors;
        if (v8Map == null) {
            return null;
        }
        return v8Map.remove(v8Object);
    }

    public void removeReferenceHandler(ReferenceHandler referenceHandler) {
        this.referenceHandlers.remove(referenceHandler);
    }

    public void removeReleaseHandler(V8Runnable v8Runnable) {
        this.releaseHandlers.remove(v8Runnable);
    }

    protected boolean sameValue(long j10, long j11, long j12) {
        return _sameValue(j10, j11, j12);
    }

    public void schedulePauseOnNextStatement(long j10, String str) {
        checkThread();
        _schedulePauseOnNextStatement(this.v8RuntimePtr, j10, str);
    }

    public synchronized void setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
    }

    protected void setPrototype(long j10, long j11, long j12) {
        _setPrototype(j10, j11, j12);
    }

    public void setSignatureProvider(SignatureProvider signatureProvider) {
        this.signatureProvider = signatureProvider;
    }

    protected void setWeak(long j10, long j11) {
        _setWeak(j10, j11);
    }

    public void shutdownExecutors(boolean z10) {
        checkThread();
        V8Map<V8Executor> v8Map = this.executors;
        if (v8Map == null) {
            return;
        }
        for (V8Executor v8Executor : v8Map.values()) {
            if (z10) {
                v8Executor.forceTermination();
            } else {
                v8Executor.shutdown();
            }
        }
    }

    protected boolean strictEquals(long j10, long j11, long j12) {
        return _strictEquals(j10, j11, j12);
    }

    public void terminateExecution() {
        this.forceTerminateExecutors = true;
        terminateExecution(this.v8RuntimePtr);
    }

    protected void terminateExecution(long j10) {
        _terminateExecution(j10);
    }

    protected String toString(long j10, long j11) {
        return _toString(j10, j11);
    }

    protected void weakReferenceReleased(long j10) {
        V8Value v8Value = this.v8WeakReferences.get(Long.valueOf(j10));
        if (v8Value != null) {
            this.v8WeakReferences.remove(Long.valueOf(j10));
            try {
                v8Value.close();
            } catch (Exception unused) {
            }
        }
    }
}
