// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;


// Referenced classes of package org.spongycastle.crypto.tls:
//            AbstractTlsCredentials, TlsSignerCredentials, SignatureAndHashAlgorithm

public abstract class AbstractTlsSignerCredentials extends AbstractTlsCredentials
    implements TlsSignerCredentials
{

    public AbstractTlsSignerCredentials()
    {
    }

    public SignatureAndHashAlgorithm _mth050F()
    {
        throw new IllegalStateException("TlsSignerCredentials implementation does not support (D)TLS 1.2+");
    }
}
