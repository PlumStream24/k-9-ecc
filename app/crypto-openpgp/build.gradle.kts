plugins {
    id(ThunderbirdPlugins.Library.android)
    id("org.jetbrains.kotlin.android")
}

dependencies {
    implementation(projects.app.core)
    implementation("androidx.core:core-ktx:1.10.0")
}

android {
    namespace = "com.fsck.k9.crypto.openpgp"
}
