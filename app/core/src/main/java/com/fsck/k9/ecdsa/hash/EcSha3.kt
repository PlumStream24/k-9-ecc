package com.fsck.k9.ecdsa.hash

object EcSha3 : EcHasher {
    override fun hash(data: ByteArray): ByteArray {
        return Keccak.digest(data)
    }
}
