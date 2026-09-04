package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.V8Object;

/* JADX INFO: loaded from: classes6.dex */
public interface BreakHandler {
    void onBreak(DebugHandler.DebugEvent debugEvent, ExecutionState executionState, EventData eventData, V8Object v8Object);
}
