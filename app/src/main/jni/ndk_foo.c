//
// Created by agamula on 31.08.15.
//

#include "ndk_foo.h"

#include <string.h>
#include <jni.h>

jstring Java_com_proggroup_ndktest_MainActivity_invokeNativeFunction(JNIEnv *env,
                                                                                 jobject javaThis) {
    return (*env)->NewStringUTF(env, "Hello from native code!");
}
