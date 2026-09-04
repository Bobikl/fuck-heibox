package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DebugHandler implements Releasable {
    private static final String CHANGE_BREAK_POINT_CONDITION = "changeBreakPointCondition";
    private static final String CLEAR_BREAK_POINT = "clearBreakPoint";
    private static final String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
    public static String DEBUG_OBJECT_NAME = "__j2v8_Debug";
    private static final String DISABLE_ALL_BREAK_POINTS = "disableAllBreakPoints";
    private static final String DISABLE_SCRIPT_BREAK_POINT = "disableScriptBreakPoint";
    private static final String ENABLE_SCRIPT_BREAK_POINT = "enableScriptBreakPoint";
    private static final String FIND_SCRIPT_BREAK_POINT = "findScriptBreakPoint";
    private static final String NUMBER = "number";
    private static final String SCRIPT_BREAK_POINTS = "scriptBreakPoints";
    private static final String SET_BREAK_POINT = "setBreakPoint";
    private static final String SET_LISTENER = "setListener";
    private static final String SET_SCRIPT_BREAK_POINT_BY_NAME = "setScriptBreakPointByName";
    private static final String V8_DEBUG_OBJECT = "Debug";
    private List<BreakHandler> breakHandlers = new ArrayList();
    private V8Object debugObject;
    private V8 runtime;

    /* JADX INFO: renamed from: com.eclipsesource.v8.debug.DebugHandler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent;

        static {
            int[] iArr = new int[DebugEvent.values().length];
            $SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent = iArr;
            try {
                iArr[DebugEvent.Break.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[DebugEvent.BeforeCompile.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[DebugEvent.AfterCompile.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[DebugEvent.Exception.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class BreakpointHandler implements JavaVoidCallback {
        private BreakpointHandler() {
        }

        /* synthetic */ BreakpointHandler(DebugHandler debugHandler, AnonymousClass1 anonymousClass1) {
            this();
        }

        private EventData createDebugEvent(DebugEvent debugEvent, V8Object v8Object) {
            int i10 = AnonymousClass1.$SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[debugEvent.ordinal()];
            if (i10 == 1) {
                return new BreakEvent(v8Object);
            }
            if (i10 != 2 && i10 != 3) {
                return i10 != 4 ? new EventData(v8Object) : new ExceptionEvent(v8Object);
            }
            return new CompileEvent(v8Object);
        }

        private void invokeHandler(V8Array v8Array, int i10, BreakHandler breakHandler) throws Throwable {
            V8Object object;
            EventData eventData;
            V8Object object2;
            EventData eventData2;
            EventData eventData3;
            V8Object v8Object = null;
            EventData eventDataCreateDebugEvent = null;
            try {
                V8Object object3 = v8Array.getObject(1);
                try {
                    object2 = v8Array.getObject(2);
                    try {
                        object = v8Array.getObject(3);
                        try {
                            ExecutionState executionState = new ExecutionState(object3);
                            try {
                                DebugEvent debugEvent = DebugEvent.values()[i10];
                                eventDataCreateDebugEvent = createDebugEvent(debugEvent, object2);
                                breakHandler.onBreak(debugEvent, executionState, eventDataCreateDebugEvent, object);
                                safeRelease(object3);
                                safeRelease(object2);
                                safeRelease(object);
                                safeRelease(executionState);
                                safeRelease(eventDataCreateDebugEvent);
                            } catch (Throwable th2) {
                                th = th2;
                                eventData = eventDataCreateDebugEvent;
                                eventData3 = executionState;
                                v8Object = object3;
                                eventData2 = eventData3;
                                safeRelease(v8Object);
                                safeRelease(object2);
                                safeRelease(object);
                                safeRelease(eventData2);
                                safeRelease(eventData);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            eventData = null;
                            eventData3 = eventData;
                            v8Object = object3;
                            eventData2 = eventData3;
                            safeRelease(v8Object);
                            safeRelease(object2);
                            safeRelease(object);
                            safeRelease(eventData2);
                            safeRelease(eventData);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        object = null;
                        eventData = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    object = null;
                    eventData = null;
                    object2 = null;
                    eventData3 = null;
                }
            } catch (Throwable th6) {
                th = th6;
                object = null;
                eventData = null;
                object2 = null;
                eventData2 = null;
            }
        }

        private void safeRelease(Releasable releasable) {
            if (releasable != null) {
                releasable.release();
            }
        }

        @Override // com.eclipsesource.v8.JavaVoidCallback
        public void invoke(V8Object v8Object, V8Array v8Array) throws Throwable {
            if (v8Array == null || v8Array.isUndefined()) {
                return;
            }
            int integer = v8Array.getInteger(0);
            Iterator it = DebugHandler.this.breakHandlers.iterator();
            while (it.hasNext()) {
                invokeHandler(v8Array, integer, (BreakHandler) it.next());
            }
        }
    }

    public enum DebugEvent {
        Undefined(0),
        Break(1),
        Exception(2),
        NewFunction(3),
        BeforeCompile(4),
        AfterCompile(5),
        CompileError(6),
        PromiseError(7),
        AsyncTaskEvent(8);

        int index;

        DebugEvent(int i10) {
            this.index = i10;
        }
    }

    public DebugHandler(V8 v10) throws Throwable {
        this.runtime = v10;
        setupDebugObject(v10);
        setupBreakpointHandler();
    }

    private void setupBreakpointHandler() throws Throwable {
        V8Array v8Array;
        Throwable th2;
        V8Function v8Function;
        this.debugObject.registerJavaMethod(new BreakpointHandler(this, null), DEBUG_BREAK_HANDLER);
        try {
            v8Function = (V8Function) this.debugObject.getObject(DEBUG_BREAK_HANDLER);
            try {
                v8Array = new V8Array(this.runtime);
                try {
                    v8Array.push((V8Value) v8Function);
                    this.debugObject.executeFunction(SET_LISTENER, v8Array);
                    if (v8Function != null && !v8Function.isReleased()) {
                        v8Function.close();
                    }
                    if (v8Array.isReleased()) {
                        return;
                    }
                    v8Array.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    if (v8Function != null && !v8Function.isReleased()) {
                        v8Function.close();
                    }
                    if (v8Array != null && !v8Array.isReleased()) {
                        v8Array.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                v8Array = null;
                th2 = th4;
            }
        } catch (Throwable th5) {
            v8Array = null;
            th2 = th5;
            v8Function = null;
        }
    }

    private void setupDebugObject(V8 v10) {
        V8Object object = v10.getObject(DEBUG_OBJECT_NAME);
        try {
            this.debugObject = object.getObject(V8_DEBUG_OBJECT);
        } finally {
            object.close();
        }
    }

    public void addBreakHandler(BreakHandler breakHandler) {
        this.runtime.getLocker().checkThread();
        this.breakHandlers.add(breakHandler);
    }

    public void changeBreakPointCondition(int i10, String str) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i10);
        v8Array.push(str);
        try {
            this.debugObject.executeVoidFunction(CHANGE_BREAK_POINT_CONDITION, v8Array);
        } finally {
            v8Array.close();
        }
    }

    public void clearBreakPoint(int i10) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i10);
        try {
            this.debugObject.executeVoidFunction(CLEAR_BREAK_POINT, v8Array);
        } finally {
            v8Array.close();
        }
    }

    @Override // com.eclipsesource.v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.debugObject.close();
    }

    public void disableAllBreakPoints() {
        this.debugObject.executeVoidFunction(DISABLE_ALL_BREAK_POINTS, null);
    }

    public void disableScriptBreakPoint(int i10) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i10);
        try {
            this.debugObject.executeVoidFunction(DISABLE_SCRIPT_BREAK_POINT, v8Array);
        } finally {
            v8Array.close();
        }
    }

    public void enableScriptBreakPoint(int i10) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i10);
        try {
            this.debugObject.executeVoidFunction(ENABLE_SCRIPT_BREAK_POINT, v8Array);
        } finally {
            v8Array.close();
        }
    }

    public ScriptBreakPoint getScriptBreakPoint(int i10) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i10);
        v8Array.push(false);
        V8Object v8ObjectExecuteObjectFunction = null;
        try {
            v8ObjectExecuteObjectFunction = this.debugObject.executeObjectFunction(FIND_SCRIPT_BREAK_POINT, v8Array);
            return new ScriptBreakPoint(v8ObjectExecuteObjectFunction);
        } finally {
            v8Array.close();
            if (v8ObjectExecuteObjectFunction != null) {
                v8ObjectExecuteObjectFunction.close();
            }
        }
    }

    public int getScriptBreakPointCount() {
        V8Array v8ArrayExecuteArrayFunction = this.debugObject.executeArrayFunction(SCRIPT_BREAK_POINTS, null);
        try {
            return v8ArrayExecuteArrayFunction.length();
        } finally {
            v8ArrayExecuteArrayFunction.close();
        }
    }

    public int[] getScriptBreakPointIDs() {
        V8Array v8ArrayExecuteArrayFunction = this.debugObject.executeArrayFunction(SCRIPT_BREAK_POINTS, null);
        try {
            int[] iArr = new int[v8ArrayExecuteArrayFunction.length()];
            for (int i10 = 0; i10 < v8ArrayExecuteArrayFunction.length(); i10++) {
                V8Object object = v8ArrayExecuteArrayFunction.getObject(i10);
                try {
                    iArr[i10] = object.executeIntegerFunction(NUMBER, null);
                    object.close();
                } catch (Throwable th2) {
                    object.close();
                    throw th2;
                }
            }
            v8ArrayExecuteArrayFunction.close();
            return iArr;
        } catch (Throwable th3) {
            v8ArrayExecuteArrayFunction.close();
            throw th3;
        }
    }

    @Override // com.eclipsesource.v8.Releasable
    @Deprecated
    public void release() {
        close();
    }

    public void removeBreakHandler(BreakHandler breakHandler) {
        this.runtime.getLocker().checkThread();
        this.breakHandlers.remove(breakHandler);
    }

    public int setBreakpoint(V8Function v8Function) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push((V8Value) v8Function);
        try {
            return this.debugObject.executeIntegerFunction(SET_BREAK_POINT, v8Array);
        } finally {
            v8Array.close();
        }
    }

    public int setScriptBreakpoint(String str, int i10) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(str);
        v8Array.push(i10);
        try {
            return this.debugObject.executeIntegerFunction(SET_SCRIPT_BREAK_POINT_BY_NAME, v8Array);
        } finally {
            v8Array.close();
        }
    }
}
