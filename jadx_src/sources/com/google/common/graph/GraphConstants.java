package com.google.common.graph;

/* JADX INFO: loaded from: classes7.dex */
@t
public final class GraphConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f58308a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f58309b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f58310c = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final float f58311d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f58312e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f58313f = "Node %s is not an element of this graph.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f58314g = "Edge %s is not an element of this graph.";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f58315h = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f58316i = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f58317j = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f58318k = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f58319l = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f58320m = "Edge %s already exists in the graph.";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f58321n = "Mismatch: unordered endpoints cannot be used with directed graphs";

    public enum Presence {
        EDGE_EXISTS
    }

    private GraphConstants() {
    }
}
