// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            RC2

public static class <init> extends PBESecretKeyFactory
{

    public I()
    {
        super("PBEwithMD2andRC2", PKCSObjectIdentifiers.abo, true, 0, 5, 64, 64);
    }
}
