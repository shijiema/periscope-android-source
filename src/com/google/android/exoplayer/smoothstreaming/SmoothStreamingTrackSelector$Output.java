// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.smoothstreaming;


// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//            SmoothStreamingTrackSelector, SmoothStreamingManifest

public static interface 
{

    public abstract void adaptiveTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int ai[]);

    public abstract void fixedTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int j);
}
