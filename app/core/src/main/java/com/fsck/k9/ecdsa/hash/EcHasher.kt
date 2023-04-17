package com.fsck.k9.ecdsa.hash

interface EcHasher {
    fun hash (data : ByteArray) : ByteArray
}
